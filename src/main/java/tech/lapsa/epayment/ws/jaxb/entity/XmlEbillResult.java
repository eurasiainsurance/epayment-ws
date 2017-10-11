package tech.lapsa.epayment.ws.jaxb.entity;

import java.io.Serializable;
import java.time.Instant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.lapsa.validation.NotNullValue;

@XmlRootElement(name = "ebillResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlEbillResult implements Serializable {
    private static final long serialVersionUID = 1L;

    @XmlAttribute
    @NotNullValue
    protected EbillMethodType type;

    @XmlAttribute
    @NotNullValue
    protected String paymentReference;

    @XmlAttribute
    @NotNullValue
    protected Instant paymentTimestamp;

    public XmlEbillResult() {
    }

    public XmlEbillResult(EbillMethodType type, String paymentReference, Instant paymentTimestamp) {
	this.type = type;
	this.paymentReference = paymentReference;
	this.paymentTimestamp = paymentTimestamp;
    }

    @Override
    public String toString() {
	return ToStringBuilder.reflectionToString(this, Constants.DEFAULT_TO_STRING_STYLE);
    }

    public EbillMethodType getType() {
	return type;
    }

    public void setType(EbillMethodType type) {
	this.type = type;
    }

    public String getPaymentReference() {
	return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
	this.paymentReference = paymentReference;
    }

    public Instant getPaymentTimestamp() {
	return paymentTimestamp;
    }

    public void setPaymentTimestamp(Instant paymentTimestamp) {
	this.paymentTimestamp = paymentTimestamp;
    }
}
