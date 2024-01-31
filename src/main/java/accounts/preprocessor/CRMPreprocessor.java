package accounts.preprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import accounts.model.BalanceInquiryRequest;
import com.rb.core.rest.AssociatedWith;
import com.rb.core.rest.RegisterForDiscovery;
import com.rb.core.rest.RequestPreProcessor;


@RegisterForDiscovery
@AssociatedWith("CRM")
public class CRMPreprocessor implements RequestPreProcessor<BalanceInquiryRequest> {
	
	public static final Logger logger = LoggerFactory.getLogger(CRMPreprocessor.class);
	@Override
	public void prepareRequest(BalanceInquiryRequest message) {
		
	}

}
