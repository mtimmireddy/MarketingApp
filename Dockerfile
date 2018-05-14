FROM tomcat:8.0-jre8 AS teptomcatimage

ADD repopath/com/app/MarketingApp/app-ws.war-version no.
ADD local.properties lib/
ADD server.xml /usr/local/tomcat/conf/server.xml
ADD .keystore /root/.keystore
