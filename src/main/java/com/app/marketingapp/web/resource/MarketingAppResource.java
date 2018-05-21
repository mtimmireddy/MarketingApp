package com.app.marketingapp.web.resource;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.RestController;

import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.model.IncomingAccountInfoPayload;
import com.app.marketingapp.model.IncomingCustomerContactPayload;
import com.app.marketingapp.service.impl.MarketingAppServiceImpl;
import com.app.marketingapp.utils.Constants;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@RestController

@Path("/")
@Consumes({ APPLICATION_JSON })
@Produces({ APPLICATION_JSON })
@Api(value = "marketingapp", description = "Supports operations for the marketing app")
public class MarketingAppResource {
	
	@Inject
	MarketingAppServiceImpl marketingAppServiceImpl;

	@GET
	@Path("/marketingapp/{customerId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR) })

	public List<Contact> getCustomerDetails(@QueryParam("customerId") String id){
		List<Contact> customersList = new ArrayList<Contact>();
		customersList = marketingAppServiceImpl.getCustomerDetails(id);
		
		return customersList;
	}

	@GET
	@Path("/marketingapp/{accountId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR) })

	public List<Account> getAccountDetails(@QueryParam("accountId") String id){
		List<Account> accountList = new ArrayList<Account>();
		accountList = marketingAppServiceImpl.getAccountDetailsByCustomerId(id);
		return accountList;
	}

	@PUT
	@Path("/marketingapp/{customerId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR) })
	public Boolean updateCustomerDetails(@QueryParam("customerId") String id,
			IncomingCustomerContactPayload incomingCustomerPayload) {
		Boolean isUpdateCustomerDetailsSuccess = true;
		isUpdateCustomerDetailsSuccess = marketingAppServiceImpl.updateCustomerDetails(id, incomingCustomerPayload);
		return isUpdateCustomerDetailsSuccess;
	}

	@PUT
	@Path("/marketingapp/{accountId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR) })
	public Boolean updateAccountDetails(@QueryParam("accountId") String companyName, IncomingAccountInfoPayload incomingAccountInfoPayload) {
		Boolean isUpdateAccountDetailsSuccess = true ;
		isUpdateAccountDetailsSuccess = marketingAppServiceImpl.updateAccountDetails(companyName, incomingAccountInfoPayload);
		return isUpdateAccountDetailsSuccess;
	}

	@POST
	@Path("/marketingapp/createCustomer")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR),
			@ApiResponse(code = 201, message = Constants.CREATED) })

	public Boolean createCustomerDetails(IncomingCustomerContactPayload incomingCustomerPayload) {
		Boolean isCreateCustomerDetailsSuccess = true;
		isCreateCustomerDetailsSuccess =  marketingAppServiceImpl.createCustomerDetails(incomingCustomerPayload);
		return isCreateCustomerDetailsSuccess;
		
	}

	@POST
	@Path("/marketingapp/createAccount")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR),
			@ApiResponse(code = 201, message = Constants.CREATED) })

	public Boolean createAccountDetails(IncomingAccountInfoPayload incomingAccountInfoPayload){
		Boolean isCreateAccountDetailsSuccess = true;
		isCreateAccountDetailsSuccess = marketingAppServiceImpl.createAccountDetails(incomingAccountInfoPayload);
		return isCreateAccountDetailsSuccess;
	}

}

