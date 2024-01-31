package accounts.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import accounts.model.BalanceInquiryRequest;
import com.rb.core.rest.AssociatedWith;
import com.rb.core.rest.RegisterForDiscovery;
import com.rb.core.validators.RequestValidator;


@RegisterForDiscovery
@AssociatedWith("CRM")
public class CRMValidator implements RequestValidator<BalanceInquiryRequest> {

	public static final Logger logger = LoggerFactory.getLogger(CRMValidator.class);

	@Override
	public void validate(BalanceInquiryRequest message) {
		
	}

}
