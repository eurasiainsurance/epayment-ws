package tech.lapsa.epayment.ws.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;

import tech.lapsa.javax.validation.NotEmptyString;
import tech.lapsa.javax.validation.NotNullValue;

@XmlRootElement(name = "httpFormParam")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlHttpFormParam implements Serializable {
    private static final long serialVersionUID = 1L;

    @XmlAttribute
    @NotNullValue
    @NotEmptyString
    protected String name;

    @XmlAttribute
    @NotNullValue
    @NotEmptyString
    protected String value;

    @Override
    public String toString() {
	return ToStringBuilder.reflectionToString(this, XmlConstants.DEFAULT_TO_STRING_STYLE);
    }

    public XmlHttpFormParam() {
    }

    public XmlHttpFormParam(final String name, final String value) {
	this.name = name;
	this.value = value;
    }

    public String getName() {
	return name;
    }

    public void setName(final String name) {
	this.name = name;
    }

    public String getValue() {
	return value;
    }

    public void setValue(final String value) {
	this.value = value;
    }
}
