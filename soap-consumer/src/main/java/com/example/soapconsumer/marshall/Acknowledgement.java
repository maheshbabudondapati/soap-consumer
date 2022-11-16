
package com.example.soapconsumer.marshall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultcode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resultcode"
})
@XmlRootElement(name = "Acknowledgement")
public class Acknowledgement {

    protected int resultcode;

    /**
     * Gets the value of the resultcode property.
     * 
     */
    public int getResultcode() {
        return resultcode;
    }

    /**
     * Sets the value of the resultcode property.
     * 
     */
    public void setResultcode(int value) {
        this.resultcode = value;
    }

}
