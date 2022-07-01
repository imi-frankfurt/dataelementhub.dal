/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.records;


import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.tables.GetValueDomainScopedIdentifierByDataelementUrn;

import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetValueDomainScopedIdentifierByDataelementUrnRecord extends TableRecordImpl<GetValueDomainScopedIdentifierByDataelementUrnRecord> implements Record10<Integer, ElementType, Integer, Integer, String, Integer, Status, Integer, Integer, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.element_type</code>.
     */
    public void setElementType(ElementType value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.element_type</code>.
     */
    public ElementType getElementType() {
        return (ElementType) get(1);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.version</code>.
     */
    public void setVersion(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.identifier</code>.
     */
    public void setIdentifier(Integer value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.identifier</code>.
     */
    public Integer getIdentifier() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.url</code>.
     */
    public void setUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.url</code>.
     */
    public String getUrl() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.created_by</code>.
     */
    public void setCreatedBy(Integer value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(5);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.status</code>.
     */
    public void setStatus(Status value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.status</code>.
     */
    public Status getStatus() {
        return (Status) get(6);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.element_id</code>.
     */
    public void setElementId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.element_id</code>.
     */
    public Integer getElementId() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.namespace_id</code>.
     */
    public void setNamespaceId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.namespace_id</code>.
     */
    public Integer getNamespaceId() {
        return (Integer) get(8);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.uuid</code>.
     */
    public void setUuid(UUID value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.uuid</code>.
     */
    public UUID getUuid() {
        return (UUID) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, ElementType, Integer, Integer, String, Integer, Status, Integer, Integer, UUID> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, ElementType, Integer, Integer, String, Integer, Status, Integer, Integer, UUID> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.ID;
    }

    @Override
    public Field<ElementType> field2() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.ELEMENT_TYPE;
    }

    @Override
    public Field<Integer> field3() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.VERSION;
    }

    @Override
    public Field<Integer> field4() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.IDENTIFIER;
    }

    @Override
    public Field<String> field5() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.URL;
    }

    @Override
    public Field<Integer> field6() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.CREATED_BY;
    }

    @Override
    public Field<Status> field7() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.STATUS;
    }

    @Override
    public Field<Integer> field8() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.ELEMENT_ID;
    }

    @Override
    public Field<Integer> field9() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.NAMESPACE_ID;
    }

    @Override
    public Field<UUID> field10() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.UUID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public ElementType component2() {
        return getElementType();
    }

    @Override
    public Integer component3() {
        return getVersion();
    }

    @Override
    public Integer component4() {
        return getIdentifier();
    }

    @Override
    public String component5() {
        return getUrl();
    }

    @Override
    public Integer component6() {
        return getCreatedBy();
    }

    @Override
    public Status component7() {
        return getStatus();
    }

    @Override
    public Integer component8() {
        return getElementId();
    }

    @Override
    public Integer component9() {
        return getNamespaceId();
    }

    @Override
    public UUID component10() {
        return getUuid();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public ElementType value2() {
        return getElementType();
    }

    @Override
    public Integer value3() {
        return getVersion();
    }

    @Override
    public Integer value4() {
        return getIdentifier();
    }

    @Override
    public String value5() {
        return getUrl();
    }

    @Override
    public Integer value6() {
        return getCreatedBy();
    }

    @Override
    public Status value7() {
        return getStatus();
    }

    @Override
    public Integer value8() {
        return getElementId();
    }

    @Override
    public Integer value9() {
        return getNamespaceId();
    }

    @Override
    public UUID value10() {
        return getUuid();
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value2(ElementType value) {
        setElementType(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value3(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value4(Integer value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value5(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value6(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value7(Status value) {
        setStatus(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value8(Integer value) {
        setElementId(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value9(Integer value) {
        setNamespaceId(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value10(UUID value) {
        setUuid(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord values(Integer value1, ElementType value2, Integer value3, Integer value4, String value5, Integer value6, Status value7, Integer value8, Integer value9, UUID value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetValueDomainScopedIdentifierByDataelementUrnRecord
     */
    public GetValueDomainScopedIdentifierByDataelementUrnRecord() {
        super(GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN);
    }

    /**
     * Create a detached, initialised
     * GetValueDomainScopedIdentifierByDataelementUrnRecord
     */
    public GetValueDomainScopedIdentifierByDataelementUrnRecord(Integer id, ElementType elementType, Integer version, Integer identifier, String url, Integer createdBy, Status status, Integer elementId, Integer namespaceId, UUID uuid) {
        super(GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN);

        setId(id);
        setElementType(elementType);
        setVersion(version);
        setIdentifier(identifier);
        setUrl(url);
        setCreatedBy(createdBy);
        setStatus(status);
        setElementId(elementId);
        setNamespaceId(namespaceId);
        setUuid(uuid);
    }

    /**
     * Create a detached, initialised
     * GetValueDomainScopedIdentifierByDataelementUrnRecord
     */
    public GetValueDomainScopedIdentifierByDataelementUrnRecord(de.dataelementhub.dal.jooq.tables.pojos.GetValueDomainScopedIdentifierByDataelementUrn value) {
        super(GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN);

        if (value != null) {
            setId(value.getId());
            setElementType(value.getElementType());
            setVersion(value.getVersion());
            setIdentifier(value.getIdentifier());
            setUrl(value.getUrl());
            setCreatedBy(value.getCreatedBy());
            setStatus(value.getStatus());
            setElementId(value.getElementId());
            setNamespaceId(value.getNamespaceId());
            setUuid(value.getUuid());
        }
    }
}
