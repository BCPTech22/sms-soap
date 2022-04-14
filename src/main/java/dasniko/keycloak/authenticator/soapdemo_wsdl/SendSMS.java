
package dasniko.keycloak.authenticator.soapdemo_wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SendSMS complex type.
 *
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="SendSMS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdsend" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="binary" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendSMS", propOrder = {
    "username",
    "password",
    "to",
    "message",
    "id",
    "from",
    "hdsend",
    "binary",
    "operator"
})
public class SendSMS {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String to;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String from;
    @XmlElement(required = true)
    protected String hdsend;
    protected int binary;
    @XmlElement(required = true)
    protected String operator;

    /**
     * Obtient la valeur de la propri�t� username.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * D�finit la valeur de la propri�t� username.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Obtient la valeur de la propri�t� password.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * D�finit la valeur de la propri�t� password.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtient la valeur de la propri�t� to.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTo() {
        return to;
    }

    /**
     * D�finit la valeur de la propri�t� to.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Obtient la valeur de la propri�t� message.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessage() {
        return message;
    }

    /**
     * D�finit la valeur de la propri�t� message.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� from.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrom() {
        return from;
    }

    /**
     * D�finit la valeur de la propri�t� from.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Obtient la valeur de la propri�t� hdsend.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHdsend() {
        return hdsend;
    }

    /**
     * D�finit la valeur de la propri�t� hdsend.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHdsend(String value) {
        this.hdsend = value;
    }

    /**
     * Obtient la valeur de la propri�t� binary.
     *
     */
    public int getBinary() {
        return binary;
    }

    /**
     * D�finit la valeur de la propri�t� binary.
     *
     */
    public void setBinary(int value) {
        this.binary = value;
    }

    /**
     * Obtient la valeur de la propri�t� operator.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperator() {
        return operator;
    }

    /**
     * D�finit la valeur de la propri�t� operator.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperator(String value) {
        this.operator = value;
    }

}
