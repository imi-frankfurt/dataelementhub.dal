/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.tables.records.GetValueDomainScopedIdentifierByDataelementUrnRecord;

import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetValueDomainScopedIdentifierByDataelementUrn extends TableImpl<GetValueDomainScopedIdentifierByDataelementUrnRecord> {

    private static final long serialVersionUID = 668358747;

    /**
     * The reference instance of <code>public.get_value_domain_scoped_identifier_by_dataelement_urn</code>
     */
    public static final GetValueDomainScopedIdentifierByDataelementUrn GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN = new GetValueDomainScopedIdentifierByDataelementUrn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetValueDomainScopedIdentifierByDataelementUrnRecord> getRecordType() {
        return GetValueDomainScopedIdentifierByDataelementUrnRecord.class;
    }

    /**
     * The column <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.id</code>.
     */
    public final TableField<GetValueDomainScopedIdentifierByDataelementUrnRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('scoped_identifier_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.element_type</code>.
     */
    public final TableField<GetValueDomainScopedIdentifierByDataelementUrnRecord, ElementType> ELEMENT_TYPE = createField(DSL.name("element_type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(de.dataelementhub.dal.jooq.enums.ElementType.class), this, "");

    /**
     * The column <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.version</code>.
     */
    public final TableField<GetValueDomainScopedIdentifierByDataelementUrnRecord, Integer> VERSION = createField(DSL.name("version"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.identifier</code>.
     */
    public final TableField<GetValueDomainScopedIdentifierByDataelementUrnRecord, Integer> IDENTIFIER = createField(DSL.name("identifier"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.url</code>.
     */
    public final TableField<GetValueDomainScopedIdentifierByDataelementUrnRecord, String> URL = createField(DSL.name("url"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.created_by</code>.
     */
    public final TableField<GetValueDomainScopedIdentifierByDataelementUrnRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.status</code>.
     */
    public final TableField<GetValueDomainScopedIdentifierByDataelementUrnRecord, Status> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(de.dataelementhub.dal.jooq.enums.Status.class), this, "");

    /**
     * The column <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.element_id</code>.
     */
    public final TableField<GetValueDomainScopedIdentifierByDataelementUrnRecord, Integer> ELEMENT_ID = createField(DSL.name("element_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.namespace_id</code>.
     */
    public final TableField<GetValueDomainScopedIdentifierByDataelementUrnRecord, Integer> NAMESPACE_ID = createField(DSL.name("namespace_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.uuid</code>.
     */
    public final TableField<GetValueDomainScopedIdentifierByDataelementUrnRecord, UUID> UUID = createField(DSL.name("uuid"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * Create a <code>public.get_value_domain_scoped_identifier_by_dataelement_urn</code> table reference
     */
    public GetValueDomainScopedIdentifierByDataelementUrn() {
        this(DSL.name("get_value_domain_scoped_identifier_by_dataelement_urn"), null);
    }

    /**
     * Create an aliased <code>public.get_value_domain_scoped_identifier_by_dataelement_urn</code> table reference
     */
    public GetValueDomainScopedIdentifierByDataelementUrn(String alias) {
        this(DSL.name(alias), GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN);
    }

    /**
     * Create an aliased <code>public.get_value_domain_scoped_identifier_by_dataelement_urn</code> table reference
     */
    public GetValueDomainScopedIdentifierByDataelementUrn(Name alias) {
        this(alias, GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN);
    }

    private GetValueDomainScopedIdentifierByDataelementUrn(Name alias, Table<GetValueDomainScopedIdentifierByDataelementUrnRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private GetValueDomainScopedIdentifierByDataelementUrn(Name alias, Table<GetValueDomainScopedIdentifierByDataelementUrnRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public <O extends Record> GetValueDomainScopedIdentifierByDataelementUrn(Table<O> child, ForeignKey<O, GetValueDomainScopedIdentifierByDataelementUrnRecord> key) {
        super(child, key, GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<GetValueDomainScopedIdentifierByDataelementUrnRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrn as(String alias) {
        return new GetValueDomainScopedIdentifierByDataelementUrn(DSL.name(alias), this, parameters);
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrn as(Name alias) {
        return new GetValueDomainScopedIdentifierByDataelementUrn(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetValueDomainScopedIdentifierByDataelementUrn rename(String name) {
        return new GetValueDomainScopedIdentifierByDataelementUrn(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetValueDomainScopedIdentifierByDataelementUrn rename(Name name) {
        return new GetValueDomainScopedIdentifierByDataelementUrn(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, ElementType, Integer, Integer, String, Integer, Status, Integer, Integer, UUID> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GetValueDomainScopedIdentifierByDataelementUrn call(String urn) {
        return new GetValueDomainScopedIdentifierByDataelementUrn(DSL.name(getName()), null, new Field[] { 
              DSL.val(urn, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public GetValueDomainScopedIdentifierByDataelementUrn call(Field<String> urn) {
        return new GetValueDomainScopedIdentifierByDataelementUrn(DSL.name(getName()), null, new Field[] { 
              urn
        });
    }
}
