//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.29 at 02:08:31 PM CET 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicSignature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EncryptionAlgoUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KeyLengthUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DigestAlgoUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaskGenerationFunctionUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignatureIntact" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SignatureValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicSignature", propOrder = {
    "encryptionAlgoUsedToSignThisToken",
    "keyLengthUsedToSignThisToken",
    "digestAlgoUsedToSignThisToken",
    "maskGenerationFunctionUsedToSignThisToken",
    "signatureIntact",
    "signatureValid"
})
public class XmlBasicSignature implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EncryptionAlgoUsedToSignThisToken")
    protected String encryptionAlgoUsedToSignThisToken;
    @XmlElement(name = "KeyLengthUsedToSignThisToken")
    protected String keyLengthUsedToSignThisToken;
    @XmlElement(name = "DigestAlgoUsedToSignThisToken")
    protected String digestAlgoUsedToSignThisToken;
    @XmlElement(name = "MaskGenerationFunctionUsedToSignThisToken")
    protected String maskGenerationFunctionUsedToSignThisToken;
    @XmlElement(name = "SignatureIntact")
    protected boolean signatureIntact;
    @XmlElement(name = "SignatureValid")
    protected boolean signatureValid;

    /**
     * Gets the value of the encryptionAlgoUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionAlgoUsedToSignThisToken() {
        return encryptionAlgoUsedToSignThisToken;
    }

    /**
     * Sets the value of the encryptionAlgoUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionAlgoUsedToSignThisToken(String value) {
        this.encryptionAlgoUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the keyLengthUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyLengthUsedToSignThisToken() {
        return keyLengthUsedToSignThisToken;
    }

    /**
     * Sets the value of the keyLengthUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyLengthUsedToSignThisToken(String value) {
        this.keyLengthUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the digestAlgoUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestAlgoUsedToSignThisToken() {
        return digestAlgoUsedToSignThisToken;
    }

    /**
     * Sets the value of the digestAlgoUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestAlgoUsedToSignThisToken(String value) {
        this.digestAlgoUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the maskGenerationFunctionUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskGenerationFunctionUsedToSignThisToken() {
        return maskGenerationFunctionUsedToSignThisToken;
    }

    /**
     * Sets the value of the maskGenerationFunctionUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskGenerationFunctionUsedToSignThisToken(String value) {
        this.maskGenerationFunctionUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the signatureIntact property.
     * 
     */
    public boolean isSignatureIntact() {
        return signatureIntact;
    }

    /**
     * Sets the value of the signatureIntact property.
     * 
     */
    public void setSignatureIntact(boolean value) {
        this.signatureIntact = value;
    }

    /**
     * Gets the value of the signatureValid property.
     * 
     */
    public boolean isSignatureValid() {
        return signatureValid;
    }

    /**
     * Sets the value of the signatureValid property.
     * 
     */
    public void setSignatureValid(boolean value) {
        this.signatureValid = value;
    }

}
