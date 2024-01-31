package accounts.user.log;

import accounts.model.BalanceInquiryRequest;
import accounts.model.BalanceInquiryResponse;
import com.rb.core.rest.AssociatedWith;
import com.rb.core.rest.RegisterForDiscovery;
import com.rb.integration.user.log.UserLogHandler;
import com.rb.integration.user.log.UserLogRecord;

@RegisterForDiscovery
@AssociatedWith("CRM")
public class CRMUserLogHandler implements UserLogHandler<BalanceInquiryRequest, BalanceInquiryResponse> {

	@Override
	public void prepareLogRecord(UserLogRecord record, BalanceInquiryRequest req, BalanceInquiryResponse resp) {
		
	}

}