# MarketingApp

## Assumptions and Approach

* Customer account relationship - assuming that a single customer could possess multiple accounts - To retrieve accounts a customer has - using a hashmap to store data with the key being the customer id and the value - a list of all the accounts under that customer.

* Please refer the documentation sent along to get documentation on approaches for GET/PUT/POST calls for both account and contact endpoints.

## Devops Work
### Local Testing (Docker approach)

* Run command - mvn clean install to create a jar/war executable for the code.
* initial testing - since the artifacts do not exist in nexus/artifactory as there have been no releases yet, use mvn deploy to get the war files into the repositories being used.
* Create DockerFile (sample as shown in the repo).
* Create a docker-compose file to create the base tomcat images with the war files included as the container is built as per the steps listed in the docker file, also for the DB - creating a empty instance of the preferred db(mysql in the case of the sample) and mounting the sql dump as an external volume. 
* Once the containers have been created for the initial run- the following steps can be followed to reduce redundancy of creating new images each time we run the docker-compose command - images can be pulled from either nexus or artifactory or dockyard(whichever repository is being used to host the docker images) as shown in the second docker-compose file. 
    
    - command to create and start initial docker containers - docker-compose -f docker-compose.yml up 
    - Once this runs successfull do a docker ps to see the available containers which are running 
    - then perform a docker commit to save the image
      Syntax - docker commit container-id repopath/imagename:tag no. 
    - Check if the image has been committed by using the command - docker images
    - Now push the image to the repository where it can stored and pulled from as and when needed. 
      Syntax - docker push repopath/imagename:tag no
      
 * Once the new images are added to the docker-compose.yml file, they can be pulled from the referred repository whenever we bring up the local docker setup for our testing. 
 * Everytime we have new code changes going in we could ssh into the docker container and update the war files in the tomcat instance as shown below:
    - docker exec -it containerid /bin/bash
      perform a docker copy as follows to copy the newly generated war/jar on to the container
      C:\workspaces\MarketingApp\target\app-ws.war 48ff5f044119:/usr/local/tomcat/webapps/app-ws.war. Once the containers have the new war, testing could be done by hitting the endpoints via postman. 
      Similar approach can be applied for UI testing as well.
      
### AWS Infrastructure Checklist
* Work with AWS infrastructure team to secure the following details to build the AWS infrastructure
   - VPC the application is to be hosted on.
   - Network Architecture Diagram showing the flow of traffic through the applications
   - Required Security groups , subnets for allowing data/traffic flow through via both HTTPS/TCP
   - Dockerfile to create docker images - docker build scripts for both pre-prod and prod with credentials like app id and app secret if any
   - Jenkinsfile for CICD pipelines
   - Webhook configurations via GitHub or the repository being used
   - Parameter files to bring the AWS ECS infrastructure(Cloud formation templates or Terraform files)
   - Task Definitions to deploy docker images on ECS
 


## Performance Testing
* The endpoints can be mocked using either Parasoft or Mountebank so that we avoid bombarding the QA endpoints with high traffic inflow during performance testing
* Tools like Jmeter and AppDynamics could be used to Performance Test, monitor results and document them to confirm app stability under high traffic conditions


## Production Readiness Checklist
* Unit testing, E2E testing, Integration, regression and performance testing are done
* Design review board meeting has approved the app for production
* AWS security review done -  Security groups, subnets and other network information is obtained 
* Parameter files are ready to bring up AWS infrastructure
* Jenkins pipeline in place
* High availability configuration is in place for the application to be resilient in many availability zones - with active/active or active/passive availability and route 53 mechanism in place to route traffic in case of an outage.
