/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.records;


import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.enums.ValidationType;
import de.dataelementhub.dal.jooq.tables.IdentifiedElement;

import java.util.UUID;

import org.jooq.JSON;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IdentifiedElementRecord extends TableRecordImpl<IdentifiedElementRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.identified_element.si_id</code>.
     */
    public void setSiId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.identified_element.si_id</code>.
     */
    public Integer getSiId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.identified_element.si_identifier</code>.
     */
    public void setSiIdentifier(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.identified_element.si_identifier</code>.
     */
    public Integer getSiIdentifier() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.identified_element.si_version</code>.
     */
    public void setSiVersion(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.identified_element.si_version</code>.
     */
    public Integer getSiVersion() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.identified_element.si_status</code>.
     */
    public void setSiStatus(Status value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.identified_element.si_status</code>.
     */
    public Status getSiStatus() {
        return (Status) get(3);
    }

    /**
     * Setter for <code>public.identified_element.si_namespace_id</code>.
     */
    public void setSiNamespaceId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.identified_element.si_namespace_id</code>.
     */
    public Integer getSiNamespaceId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.identified_element.id</code>.
     */
    public void setId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.identified_element.id</code>.
     */
    public Integer getId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.identified_element.element_type</code>.
     */
    public void setElementType(ElementType value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.identified_element.element_type</code>.
     */
    public ElementType getElementType() {
        return (ElementType) get(6);
    }

    /**
     * Setter for <code>public.identified_element.hidden</code>.
     */
    public void setHidden(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.identified_element.hidden</code>.
     */
    public Boolean getHidden() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>public.identified_element.created_by</code>.
     */
    public void setCreatedBy(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.identified_element.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.identified_element.element_id</code>.
     */
    public void setElementId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.identified_element.element_id</code>.
     */
    public Integer getElementId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.identified_element.scoped_identifier_id</code>.
     */
    public void setScopedIdentifierId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.identified_element.scoped_identifier_id</code>.
     */
    public Integer getScopedIdentifierId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.identified_element.code</code>.
     */
    public void setCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.identified_element.code</code>.
     */
    public String getCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.identified_element.is_valid</code>.
     */
    public void setIsValid(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.identified_element.is_valid</code>.
     */
    public Boolean getIsValid() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.identified_element.format</code>.
     */
    public void setFormat(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.identified_element.format</code>.
     */
    public String getFormat() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.identified_element.datatype</code>.
     */
    public void setDatatype(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.identified_element.datatype</code>.
     */
    public String getDatatype() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.identified_element.unit_of_measure</code>.
     */
    public void setUnitOfMeasure(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.identified_element.unit_of_measure</code>.
     */
    public String getUnitOfMeasure() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.identified_element.maximum_characters</code>.
     */
    public void setMaximumCharacters(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.identified_element.maximum_characters</code>.
     */
    public Integer getMaximumCharacters() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>public.identified_element.description</code>.
     */
    public void setDescription(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.identified_element.description</code>.
     */
    public String getDescription() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.identified_element.validation_type</code>.
     */
    public void setValidationType(ValidationType value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.identified_element.validation_type</code>.
     */
    public ValidationType getValidationType() {
        return (ValidationType) get(18);
    }

    /**
     * Setter for <code>public.identified_element.validation_data</code>.
     */
    public void setValidationData(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.identified_element.validation_data</code>.
     */
    public String getValidationData() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.identified_element.permitted_value</code>.
     */
    public void setPermittedValue(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.identified_element.permitted_value</code>.
     */
    public String getPermittedValue() {
        return (String) get(20);
    }

    /**
     * Setter for <code>public.identified_element.data</code>.
     */
    public void setData(JSON value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.identified_element.data</code>.
     */
    public JSON getData() {
        return (JSON) get(21);
    }

    /**
     * Setter for <code>public.identified_element.uuid</code>.
     */
    public void setUuid(UUID value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.identified_element.uuid</code>.
     */
    public UUID getUuid() {
        return (UUID) get(22);
    }

    /**
     * Setter for <code>public.identified_element.external_id</code>.
     */
    public void setExternalId(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.identified_element.external_id</code>.
     */
    public String getExternalId() {
        return (String) get(23);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IdentifiedElementRecord
     */
    public IdentifiedElementRecord() {
        super(IdentifiedElement.IDENTIFIED_ELEMENT);
    }

    /**
     * Create a detached, initialised IdentifiedElementRecord
     */
    public IdentifiedElementRecord(Integer siId, Integer siIdentifier, Integer siVersion, Status siStatus, Integer siNamespaceId, Integer id, ElementType elementType, Boolean hidden, Integer createdBy, Integer elementId, Integer scopedIdentifierId, String code, Boolean isValid, String format, String datatype, String unitOfMeasure, Integer maximumCharacters, String description, ValidationType validationType, String validationData, String permittedValue, JSON data, UUID uuid, String externalId) {
        super(IdentifiedElement.IDENTIFIED_ELEMENT);

        setSiId(siId);
        setSiIdentifier(siIdentifier);
        setSiVersion(siVersion);
        setSiStatus(siStatus);
        setSiNamespaceId(siNamespaceId);
        setId(id);
        setElementType(elementType);
        setHidden(hidden);
        setCreatedBy(createdBy);
        setElementId(elementId);
        setScopedIdentifierId(scopedIdentifierId);
        setCode(code);
        setIsValid(isValid);
        setFormat(format);
        setDatatype(datatype);
        setUnitOfMeasure(unitOfMeasure);
        setMaximumCharacters(maximumCharacters);
        setDescription(description);
        setValidationType(validationType);
        setValidationData(validationData);
        setPermittedValue(permittedValue);
        setData(data);
        setUuid(uuid);
        setExternalId(externalId);
    }

    /**
     * Create a detached, initialised IdentifiedElementRecord
     */
    public IdentifiedElementRecord(de.dataelementhub.dal.jooq.tables.pojos.IdentifiedElement value) {
        super(IdentifiedElement.IDENTIFIED_ELEMENT);

        if (value != null) {
            setSiId(value.getSiId());
            setSiIdentifier(value.getSiIdentifier());
            setSiVersion(value.getSiVersion());
            setSiStatus(value.getSiStatus());
            setSiNamespaceId(value.getSiNamespaceId());
            setId(value.getId());
            setElementType(value.getElementType());
            setHidden(value.getHidden());
            setCreatedBy(value.getCreatedBy());
            setElementId(value.getElementId());
            setScopedIdentifierId(value.getScopedIdentifierId());
            setCode(value.getCode());
            setIsValid(value.getIsValid());
            setFormat(value.getFormat());
            setDatatype(value.getDatatype());
            setUnitOfMeasure(value.getUnitOfMeasure());
            setMaximumCharacters(value.getMaximumCharacters());
            setDescription(value.getDescription());
            setValidationType(value.getValidationType());
            setValidationData(value.getValidationData());
            setPermittedValue(value.getPermittedValue());
            setData(value.getData());
            setUuid(value.getUuid());
            setExternalId(value.getExternalId());
        }
    }
}
