package dasniko.keycloak.authenticator.gateway;
import dasniko.keycloak.authenticator.gateway.AwsSmsService;
import org.jboss.logging.Logger;

import java.util.Map;

/**
 * @author Niko Köbler, https://www.n-k.de, @dasniko
 */
public class SmsServiceFactory {

	private static final Logger LOG = Logger.getLogger(SmsServiceFactory.class);

	public static SmsService get(Map<String, String> config) {
		/*if (Boolean.parseBoolean(config.getOrDefault("simulation", "false"))) {
			return (phoneNumber, message) ->
				LOG.warn(String.format("***** SIMULATION MODE ***** Would send SMS to %s with text: %s", phoneNumber, message));
		} else {*/
			//AwsSmsService myClient = new AwsSmsService();
			//myClient.send("+212613488905","Mebrok 3lik");
			//return (myClient) ;
		Clientsms clientsms = new Clientsms();
		clientsms.send("+212613488905","BCP ADMIN");
		return (clientsms);

	}

}

