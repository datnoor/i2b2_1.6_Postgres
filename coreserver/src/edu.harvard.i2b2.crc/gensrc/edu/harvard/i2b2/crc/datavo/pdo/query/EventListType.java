//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.16 at 02:45:28 PM EDT 
//


package edu.harvard.i2b2.crc.datavo.pdo.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for event_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="event_listType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}rangeType">
 *       &lt;choice>
 *         &lt;element name="entire_event_set" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="patient_event_coll_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="event_id" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event_listType", propOrder = {
    "entireEventSet",
    "patientEventCollId",
    "eventId"
})
public class EventListType
    extends RangeType
{

    @XmlElement(name = "entire_event_set")
    protected Object entireEventSet;
    @XmlElement(name = "patient_event_coll_id")
    protected String patientEventCollId;
    @XmlElement(name = "event_id")
    protected List<EventListType.EventId> eventId;

    /**
     * Gets the value of the entireEventSet property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEntireEventSet() {
        return entireEventSet;
    }

    /**
     * Sets the value of the entireEventSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEntireEventSet(Object value) {
        this.entireEventSet = value;
    }

    /**
     * Gets the value of the patientEventCollId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientEventCollId() {
        return patientEventCollId;
    }

    /**
     * Sets the value of the patientEventCollId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientEventCollId(String value) {
        this.patientEventCollId = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventListType.EventId }
     * 
     * 
     */
    public List<EventListType.EventId> getEventId() {
        if (eventId == null) {
            eventId = new ArrayList<EventListType.EventId>();
        }
        return this.eventId;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EventId {

        @XmlValue
        protected String value;
        @XmlAttribute(required = true)
        protected int index;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the index property.
         * 
         */
        public int getIndex() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         */
        public void setIndex(int value) {
            this.index = value;
        }

    }

}
