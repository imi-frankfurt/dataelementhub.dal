/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.pojos;


import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.enums.ValidationDatatypeType;
import de.dataelementhub.dal.jooq.enums.ValidationSubtypeType;

import java.io.Serializable;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ListviewElement implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                siId;
    private Integer                siIdentifier;
    private Integer                siVersion;
    private Status                 siStatus;
    private Integer                siNamespaceId;
    private Integer                eId;
    private ElementType            eElementType;
    private Integer                eCreatedBy;
    private Integer                eElementId;
    private String                 ePermittedValue;
    private UUID                   eUuid;
    private String                 eExternalId;
    private Integer                vId;
    private Integer                vElementId;
    private ValidationDatatypeType vDatatype;
    private ValidationSubtypeType  vSubtype;
    private String                 vFormat;
    private String                 vUnitOfMeasure;
    private Integer                vMaximumCharacters;

    public ListviewElement() {}

    public ListviewElement(ListviewElement value) {
        this.siId = value.siId;
        this.siIdentifier = value.siIdentifier;
        this.siVersion = value.siVersion;
        this.siStatus = value.siStatus;
        this.siNamespaceId = value.siNamespaceId;
        this.eId = value.eId;
        this.eElementType = value.eElementType;
        this.eCreatedBy = value.eCreatedBy;
        this.eElementId = value.eElementId;
        this.ePermittedValue = value.ePermittedValue;
        this.eUuid = value.eUuid;
        this.eExternalId = value.eExternalId;
        this.vId = value.vId;
        this.vElementId = value.vElementId;
        this.vDatatype = value.vDatatype;
        this.vSubtype = value.vSubtype;
        this.vFormat = value.vFormat;
        this.vUnitOfMeasure = value.vUnitOfMeasure;
        this.vMaximumCharacters = value.vMaximumCharacters;
    }

    public ListviewElement(
        Integer                siId,
        Integer                siIdentifier,
        Integer                siVersion,
        Status                 siStatus,
        Integer                siNamespaceId,
        Integer                eId,
        ElementType            eElementType,
        Integer                eCreatedBy,
        Integer                eElementId,
        String                 ePermittedValue,
        UUID                   eUuid,
        String                 eExternalId,
        Integer                vId,
        Integer                vElementId,
        ValidationDatatypeType vDatatype,
        ValidationSubtypeType  vSubtype,
        String                 vFormat,
        String                 vUnitOfMeasure,
        Integer                vMaximumCharacters
    ) {
        this.siId = siId;
        this.siIdentifier = siIdentifier;
        this.siVersion = siVersion;
        this.siStatus = siStatus;
        this.siNamespaceId = siNamespaceId;
        this.eId = eId;
        this.eElementType = eElementType;
        this.eCreatedBy = eCreatedBy;
        this.eElementId = eElementId;
        this.ePermittedValue = ePermittedValue;
        this.eUuid = eUuid;
        this.eExternalId = eExternalId;
        this.vId = vId;
        this.vElementId = vElementId;
        this.vDatatype = vDatatype;
        this.vSubtype = vSubtype;
        this.vFormat = vFormat;
        this.vUnitOfMeasure = vUnitOfMeasure;
        this.vMaximumCharacters = vMaximumCharacters;
    }

    /**
     * Getter for <code>public.listview_element.si_id</code>.
     */
    public Integer getSiId() {
        return this.siId;
    }

    /**
     * Setter for <code>public.listview_element.si_id</code>.
     */
    public void setSiId(Integer siId) {
        this.siId = siId;
    }

    /**
     * Getter for <code>public.listview_element.si_identifier</code>.
     */
    public Integer getSiIdentifier() {
        return this.siIdentifier;
    }

    /**
     * Setter for <code>public.listview_element.si_identifier</code>.
     */
    public void setSiIdentifier(Integer siIdentifier) {
        this.siIdentifier = siIdentifier;
    }

    /**
     * Getter for <code>public.listview_element.si_version</code>.
     */
    public Integer getSiVersion() {
        return this.siVersion;
    }

    /**
     * Setter for <code>public.listview_element.si_version</code>.
     */
    public void setSiVersion(Integer siVersion) {
        this.siVersion = siVersion;
    }

    /**
     * Getter for <code>public.listview_element.si_status</code>.
     */
    public Status getSiStatus() {
        return this.siStatus;
    }

    /**
     * Setter for <code>public.listview_element.si_status</code>.
     */
    public void setSiStatus(Status siStatus) {
        this.siStatus = siStatus;
    }

    /**
     * Getter for <code>public.listview_element.si_namespace_id</code>.
     */
    public Integer getSiNamespaceId() {
        return this.siNamespaceId;
    }

    /**
     * Setter for <code>public.listview_element.si_namespace_id</code>.
     */
    public void setSiNamespaceId(Integer siNamespaceId) {
        this.siNamespaceId = siNamespaceId;
    }

    /**
     * Getter for <code>public.listview_element.e_id</code>.
     */
    public Integer getEId() {
        return this.eId;
    }

    /**
     * Setter for <code>public.listview_element.e_id</code>.
     */
    public void setEId(Integer eId) {
        this.eId = eId;
    }

    /**
     * Getter for <code>public.listview_element.e_element_type</code>.
     */
    public ElementType getEElementType() {
        return this.eElementType;
    }

    /**
     * Setter for <code>public.listview_element.e_element_type</code>.
     */
    public void setEElementType(ElementType eElementType) {
        this.eElementType = eElementType;
    }

    /**
     * Getter for <code>public.listview_element.e_created_by</code>.
     */
    public Integer getECreatedBy() {
        return this.eCreatedBy;
    }

    /**
     * Setter for <code>public.listview_element.e_created_by</code>.
     */
    public void setECreatedBy(Integer eCreatedBy) {
        this.eCreatedBy = eCreatedBy;
    }

    /**
     * Getter for <code>public.listview_element.e_element_id</code>.
     */
    public Integer getEElementId() {
        return this.eElementId;
    }

    /**
     * Setter for <code>public.listview_element.e_element_id</code>.
     */
    public void setEElementId(Integer eElementId) {
        this.eElementId = eElementId;
    }

    /**
     * Getter for <code>public.listview_element.e_permitted_value</code>.
     */
    public String getEPermittedValue() {
        return this.ePermittedValue;
    }

    /**
     * Setter for <code>public.listview_element.e_permitted_value</code>.
     */
    public void setEPermittedValue(String ePermittedValue) {
        this.ePermittedValue = ePermittedValue;
    }

    /**
     * Getter for <code>public.listview_element.e_uuid</code>.
     */
    public UUID getEUuid() {
        return this.eUuid;
    }

    /**
     * Setter for <code>public.listview_element.e_uuid</code>.
     */
    public void setEUuid(UUID eUuid) {
        this.eUuid = eUuid;
    }

    /**
     * Getter for <code>public.listview_element.e_external_id</code>.
     */
    public String getEExternalId() {
        return this.eExternalId;
    }

    /**
     * Setter for <code>public.listview_element.e_external_id</code>.
     */
    public void setEExternalId(String eExternalId) {
        this.eExternalId = eExternalId;
    }

    /**
     * Getter for <code>public.listview_element.v_id</code>.
     */
    public Integer getVId() {
        return this.vId;
    }

    /**
     * Setter for <code>public.listview_element.v_id</code>.
     */
    public void setVId(Integer vId) {
        this.vId = vId;
    }

    /**
     * Getter for <code>public.listview_element.v_element_id</code>.
     */
    public Integer getVElementId() {
        return this.vElementId;
    }

    /**
     * Setter for <code>public.listview_element.v_element_id</code>.
     */
    public void setVElementId(Integer vElementId) {
        this.vElementId = vElementId;
    }

    /**
     * Getter for <code>public.listview_element.v_datatype</code>.
     */
    public ValidationDatatypeType getVDatatype() {
        return this.vDatatype;
    }

    /**
     * Setter for <code>public.listview_element.v_datatype</code>.
     */
    public void setVDatatype(ValidationDatatypeType vDatatype) {
        this.vDatatype = vDatatype;
    }

    /**
     * Getter for <code>public.listview_element.v_subtype</code>.
     */
    public ValidationSubtypeType getVSubtype() {
        return this.vSubtype;
    }

    /**
     * Setter for <code>public.listview_element.v_subtype</code>.
     */
    public void setVSubtype(ValidationSubtypeType vSubtype) {
        this.vSubtype = vSubtype;
    }

    /**
     * Getter for <code>public.listview_element.v_format</code>.
     */
    public String getVFormat() {
        return this.vFormat;
    }

    /**
     * Setter for <code>public.listview_element.v_format</code>.
     */
    public void setVFormat(String vFormat) {
        this.vFormat = vFormat;
    }

    /**
     * Getter for <code>public.listview_element.v_unit_of_measure</code>.
     */
    public String getVUnitOfMeasure() {
        return this.vUnitOfMeasure;
    }

    /**
     * Setter for <code>public.listview_element.v_unit_of_measure</code>.
     */
    public void setVUnitOfMeasure(String vUnitOfMeasure) {
        this.vUnitOfMeasure = vUnitOfMeasure;
    }

    /**
     * Getter for <code>public.listview_element.v_maximum_characters</code>.
     */
    public Integer getVMaximumCharacters() {
        return this.vMaximumCharacters;
    }

    /**
     * Setter for <code>public.listview_element.v_maximum_characters</code>.
     */
    public void setVMaximumCharacters(Integer vMaximumCharacters) {
        this.vMaximumCharacters = vMaximumCharacters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ListviewElement (");

        sb.append(siId);
        sb.append(", ").append(siIdentifier);
        sb.append(", ").append(siVersion);
        sb.append(", ").append(siStatus);
        sb.append(", ").append(siNamespaceId);
        sb.append(", ").append(eId);
        sb.append(", ").append(eElementType);
        sb.append(", ").append(eCreatedBy);
        sb.append(", ").append(eElementId);
        sb.append(", ").append(ePermittedValue);
        sb.append(", ").append(eUuid);
        sb.append(", ").append(eExternalId);
        sb.append(", ").append(vId);
        sb.append(", ").append(vElementId);
        sb.append(", ").append(vDatatype);
        sb.append(", ").append(vSubtype);
        sb.append(", ").append(vFormat);
        sb.append(", ").append(vUnitOfMeasure);
        sb.append(", ").append(vMaximumCharacters);

        sb.append(")");
        return sb.toString();
    }
}
