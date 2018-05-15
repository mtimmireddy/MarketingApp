package com.app.marketingapp.web.resource;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.utils.Constants;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/marketingapp")
@Consumes({ APPLICATION_JSON })
@Produces({ APPLICATION_JSON })
@Api(value = "marketingapp", description = "Supports operations for the marketing app")
public interface MarketingAppResource {

	@GET
	@Path("/marketingapp/{customerId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR) })

	public List<Contact> getCustomerDetails(@QueryParam("customerId") String customerId);

	@GET
	@Path("/marketingapp/{accountId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR) })

	public List<Account> getAccountDetails(@QueryParam("accountId") String accountId);

	@PUT
	@Path("/marketingapp/{customerId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR) })
	public Boolean updateCustomerDetails(@QueryParam("customerId") String customerId,
			List<Contact> customerDetailsList);

	@PUT
	@Path("/marketingapp/{accountId}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR) })
	public Boolean updateAccountDetails(@QueryParam("accountId") String accountId, List<Account> accountDetailsList);

	@POST
	@Path("/marketingapp")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR),
			@ApiResponse(code = 201, message = Constants.CREATED) })

	public Boolean createCustomerDetails(List<Contact> customerDetailsList);

	@POST
	@Path("/marketingapp")
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.SUCCESS),
			@ApiResponse(code = 401, message = Constants.AUTHORIZATION_FAILED),
			@ApiResponse(code = 400, message = Constants.INVALID_INPUT),
			@ApiResponse(code = 500, message = Constants.INTERNAL_SERVER_ERROR),
			@ApiResponse(code = 201, message = Constants.CREATED) })

	public Boolean createAccountDetails(List<Account> accountDetailsList);

}
