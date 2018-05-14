package com.app.marketingapp.web.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.AccountDetails;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.model.CustomerDetails;
import com.app.marketingapp.utils.Constants;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiResponses;
import com.wordnik.swagger.annotations.ApiResponse;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;

@Path("/marketingapp")
@Consumes({ APPLICATION_JSON })
@Produces({ APPLICATION_JSON })
@Api(value = "marketingapp", description = "Supports operations for the marketing app")
public interface MarketingAppResource {

	@GET
	@Path("/marketingapp/{customerId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED) })

	public CustomerDetails getCustomerDetails(@QueryParam("customerId") String customerId);

	@GET
	@Path("/marketingapp/{accountId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED) })

	public AccountDetails getAccountDetails(@QueryParam("accountId") String accountId);

	@PUT
	@Path("/marketingapp/{customerId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED) })
	public CustomerDetails updateCustomerDetails(@QueryParam("customerId") String customerId,
			List<Contact> customerDetailsList);

	@PUT
	@Path("/marketingapp/{accountId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED) })
	public AccountDetails updateAccountDetails(@QueryParam("accountId") String accountId,
			List<Account> accountDetailsList);

	@POST
	@Path("/marketingapp")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED) })

	public CustomerDetails createCustomerDetails(List<Contact> customerDetailsList);

	@POST
	@Path("/marketingapp")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED) })
	public AccountDetails createAccountDetails(List<Account> accountDetailsList);

}
