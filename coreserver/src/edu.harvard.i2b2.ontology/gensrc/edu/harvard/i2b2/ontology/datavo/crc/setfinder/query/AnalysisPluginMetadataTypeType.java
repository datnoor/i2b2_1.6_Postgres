//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.16 at 02:46:43 PM EDT 
//


package edu.harvard.i2b2.ontology.datavo.crc.setfinder.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for analysis_plugin_metadata_typeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="analysis_plugin_metadata_typeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plugin_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plugin_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parameter_info" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}analysis_parameter_xmlType"/>
 *         &lt;element name="parameter_info_xsd" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}analysis_parameter_xmlType"/>
 *         &lt;element name="status_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="command_line" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="working_folder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commandoption_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="create_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="update_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "analysis_plugin_metadata_typeType", propOrder = {
    "pluginId",
    "pluginName",
    "description",
    "versionCd",
    "parameterInfo",
    "parameterInfoXsd",
    "statusCd",
    "commandLine",
    "workingFolder",
    "commandoptionCd",
    "userId",
    "groupId",
    "createDate",
    "updateDate"
})
public class AnalysisPluginMetadataTypeType {

    @XmlElement(name = "plugin_id", required = true)
    protected String pluginId;
    @XmlElement(name = "plugin_name", required = true)
    protected String pluginName;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "version_cd", required = true)
    protected String versionCd;
    @XmlElement(name = "parameter_info", required = true)
    protected AnalysisParameterXmlType parameterInfo;
    @XmlElement(name = "parameter_info_xsd", required = true)
    protected AnalysisParameterXmlType parameterInfoXsd;
    @XmlElement(name = "status_cd", required = true)
    protected String statusCd;
    @XmlElement(name = "command_line", required = true)
    protected String commandLine;
    @XmlElement(name = "working_folder", required = true)
    protected String workingFolder;
    @XmlElement(name = "commandoption_cd", required = true)
    protected String commandoptionCd;
    @XmlElement(name = "user_id", required = true)
    protected String userId;
    @XmlElement(name = "group_id", required = true)
    protected String groupId;
    @XmlElement(name = "create_date", required = true)
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "update_date", required = true)
    protected XMLGregorianCalendar updateDate;

    /**
     * Gets the value of the pluginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * Sets the value of the pluginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginId(String value) {
        this.pluginId = value;
    }

    /**
     * Gets the value of the pluginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * Sets the value of the pluginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginName(String value) {
        this.pluginName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the versionCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionCd() {
        return versionCd;
    }

    /**
     * Sets the value of the versionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionCd(String value) {
        this.versionCd = value;
    }

    /**
     * Gets the value of the parameterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisParameterXmlType }
     *     
     */
    public AnalysisParameterXmlType getParameterInfo() {
        return parameterInfo;
    }

    /**
     * Sets the value of the parameterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisParameterXmlType }
     *     
     */
    public void setParameterInfo(AnalysisParameterXmlType value) {
        this.parameterInfo = value;
    }

    /**
     * Gets the value of the parameterInfoXsd property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisParameterXmlType }
     *     
     */
    public AnalysisParameterXmlType getParameterInfoXsd() {
        return parameterInfoXsd;
    }

    /**
     * Sets the value of the parameterInfoXsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisParameterXmlType }
     *     
     */
    public void setParameterInfoXsd(AnalysisParameterXmlType value) {
        this.parameterInfoXsd = value;
    }

    /**
     * Gets the value of the statusCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCd() {
        return statusCd;
    }

    /**
     * Sets the value of the statusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCd(String value) {
        this.statusCd = value;
    }

    /**
     * Gets the value of the commandLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandLine() {
        return commandLine;
    }

    /**
     * Sets the value of the commandLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandLine(String value) {
        this.commandLine = value;
    }

    /**
     * Gets the value of the workingFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingFolder() {
        return workingFolder;
    }

    /**
     * Sets the value of the workingFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingFolder(String value) {
        this.workingFolder = value;
    }

    /**
     * Gets the value of the commandoptionCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandoptionCd() {
        return commandoptionCd;
    }

    /**
     * Sets the value of the commandoptionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandoptionCd(String value) {
        this.commandoptionCd = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

}
