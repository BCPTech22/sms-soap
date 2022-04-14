package dasniko.keycloak.authenticator.gateway;

import dasniko.keycloak.authenticator.ma.gbp.digital.smsgateway.service.SmsCanaryServiceService;
import dasniko.keycloak.authenticator.ma.gbp.digital.smsgateway.service.SoapdemoWsdlPortType;

public class Clientsms implements SmsService {
	@Override
	public void send(String phoneNumber, String message) {
		SoapdemoWsdlPortType stub = new SmsCanaryServiceService().getSmsCanaryServicePort();
		Integer sms = stub.sendSMS("wallet", "wallet123*123", phoneNumber, message, "1", "BCP", " ", 0, "A");
		System.out.println(sms);
	}


}
