//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.16 at 02:45:28 PM EDT 
//


package edu.harvard.i2b2.crc.datavo.setfinder.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patient_set_collectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patient_set_collectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patient_set_coll_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}patient_set_coll_idType"/>
 *         &lt;element name="result_instance_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}result_instance_idType"/>
 *         &lt;element name="set_index" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}set_indexType"/>
 *         &lt;element name="patient_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}patient_numType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patient_set_collectionType", propOrder = {
    "patientSetCollId",
    "resultInstanceId",
    "setIndex",
    "patientId"
})
public class PatientSetCollectionType {

    @XmlElement(name = "patient_set_coll_id", required = true)
    protected String patientSetCollId;
    @XmlElement(name = "result_instance_id", required = true)
    protected String resultInstanceId;
    @XmlElement(name = "set_index")
    protected int setIndex;
    @XmlElement(name = "patient_id", required = true)
    protected String patientId;

    /**
     * Gets the value of the patientSetCollId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientSetCollId() {
        return patientSetCollId;
    }

    /**
     * Sets the value of the patientSetCollId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientSetCollId(String value) {
        this.patientSetCollId = value;
    }

    /**
     * Gets the value of the resultInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultInstanceId() {
        return resultInstanceId;
    }

    /**
     * Sets the value of the resultInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultInstanceId(String value) {
        this.resultInstanceId = value;
    }

    /**
     * Gets the value of the setIndex property.
     * 
     */
    public int getSetIndex() {
        return setIndex;
    }

    /**
     * Sets the value of the setIndex property.
     * 
     */
    public void setSetIndex(int value) {
        this.setIndex = value;
    }

    /**
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientId(String value) {
        this.patientId = value;
    }

}
