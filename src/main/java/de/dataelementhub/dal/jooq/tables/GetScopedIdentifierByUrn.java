/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.tables.records.GetScopedIdentifierByUrnRecord;

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
public class GetScopedIdentifierByUrn extends TableImpl<GetScopedIdentifierByUrnRecord> {

    private static final long serialVersionUID = 1255827746;

    /**
     * The reference instance of <code>public.get_scoped_identifier_by_urn</code>
     */
    public static final GetScopedIdentifierByUrn GET_SCOPED_IDENTIFIER_BY_URN = new GetScopedIdentifierByUrn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetScopedIdentifierByUrnRecord> getRecordType() {
        return GetScopedIdentifierByUrnRecord.class;
    }

    /**
     * The column <code>public.get_scoped_identifier_by_urn.id</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('scoped_identifier_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.element_type</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, ElementType> ELEMENT_TYPE = createField(DSL.name("element_type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(de.dataelementhub.dal.jooq.enums.ElementType.class), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.version</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> VERSION = createField(DSL.name("version"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.identifier</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> IDENTIFIER = createField(DSL.name("identifier"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.url</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, String> URL = createField(DSL.name("url"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.created_by</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.status</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Status> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(de.dataelementhub.dal.jooq.enums.Status.class), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.element_id</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> ELEMENT_ID = createField(DSL.name("element_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.namespace_id</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> NAMESPACE_ID = createField(DSL.name("namespace_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.uuid</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, UUID> UUID = createField(DSL.name("uuid"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * Create a <code>public.get_scoped_identifier_by_urn</code> table reference
     */
    public GetScopedIdentifierByUrn() {
        this(DSL.name("get_scoped_identifier_by_urn"), null);
    }

    /**
     * Create an aliased <code>public.get_scoped_identifier_by_urn</code> table reference
     */
    public GetScopedIdentifierByUrn(String alias) {
        this(DSL.name(alias), GET_SCOPED_IDENTIFIER_BY_URN);
    }

    /**
     * Create an aliased <code>public.get_scoped_identifier_by_urn</code> table reference
     */
    public GetScopedIdentifierByUrn(Name alias) {
        this(alias, GET_SCOPED_IDENTIFIER_BY_URN);
    }

    private GetScopedIdentifierByUrn(Name alias, Table<GetScopedIdentifierByUrnRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private GetScopedIdentifierByUrn(Name alias, Table<GetScopedIdentifierByUrnRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public <O extends Record> GetScopedIdentifierByUrn(Table<O> child, ForeignKey<O, GetScopedIdentifierByUrnRecord> key) {
        super(child, key, GET_SCOPED_IDENTIFIER_BY_URN);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<GetScopedIdentifierByUrnRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GET_SCOPED_IDENTIFIER_BY_URN;
    }

    @Override
    public GetScopedIdentifierByUrn as(String alias) {
        return new GetScopedIdentifierByUrn(DSL.name(alias), this, parameters);
    }

    @Override
    public GetScopedIdentifierByUrn as(Name alias) {
        return new GetScopedIdentifierByUrn(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetScopedIdentifierByUrn rename(String name) {
        return new GetScopedIdentifierByUrn(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetScopedIdentifierByUrn rename(Name name) {
        return new GetScopedIdentifierByUrn(name, null, parameters);
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
    public GetScopedIdentifierByUrn call(String urn) {
        return new GetScopedIdentifierByUrn(DSL.name(getName()), null, new Field[] { 
              DSL.val(urn, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public GetScopedIdentifierByUrn call(Field<String> urn) {
        return new GetScopedIdentifierByUrn(DSL.name(getName()), null, new Field[] { 
              urn
        });
    }
}
