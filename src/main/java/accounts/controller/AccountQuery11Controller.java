package accounts.controller;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
 
import accounts.model.BalanceInquiryResponse; 
 
 
    
import accounts.model.BalanceInquiryRequest; 
import accounts.service.AccountQuery11Service;
import com.rb.core.rest.ConfigIdentifier;
import com.rb.core.rest.GenericApi;

@Path("/api/v1/accounts")
public class AccountQuery11Controller {

    public static final Logger logger = LoggerFactory.getLogger(AccountQuery11Controller.class);
	@Inject
	AccountQuery11Service service;

            
        @IntegrationApi
        @ConfigIdentifier("CRM")
        @Path("/crm")    
		public BalanceInquiryResponse CRM
        (BalanceInquiryRequest  request) { 
            
             return service.CRM(request);
             
        }
    
   

    
        

}

