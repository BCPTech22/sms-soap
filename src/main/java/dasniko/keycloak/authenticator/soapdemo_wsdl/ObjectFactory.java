
package dasniko.keycloak.authenticator.soapdemo_wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the soapdemo_wsdl package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendSMSResponse_QNAME = new QName("soapdemo_wsdl", "SendSMSResponse");
    private final static QName _SendSMS_QNAME = new QName("soapdemo_wsdl", "SendSMS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapdemo_wsdl
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendSMSResponse }
     *
     */
    public SendSMSResponse createSendSMSResponse() {
        return new SendSMSResponse();
    }

    /**
     * Create an instance of {@link SendSMS }
     *
     */
    public SendSMS createSendSMS() {
        return new SendSMS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMSResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "soapdemo_wsdl", name = "SendSMSResponse")
    public JAXBElement<SendSMSResponse> createSendSMSResponse(SendSMSResponse value) {
        return new JAXBElement<SendSMSResponse>(_SendSMSResponse_QNAME, SendSMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMS }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "soapdemo_wsdl", name = "SendSMS")
    public JAXBElement<SendSMS> createSendSMS(SendSMS value) {
        return new JAXBElement<SendSMS>(_SendSMS_QNAME, SendSMS.class, null, value);
    }

}
