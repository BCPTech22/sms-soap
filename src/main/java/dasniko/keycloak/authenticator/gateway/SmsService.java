package dasniko.keycloak.authenticator.gateway;

/**
 * @author Niko Köbler, https://www.n-k.de, @dasniko
 */
public interface SmsService {

	void send(String phoneNumber, String message);
	//void sendSMS(String username,String password, String to, String message, String id, String from, String hdsend, int binary, String operator);

}
