/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.ValidationType;
import de.dataelementhub.dal.jooq.tables.records.GetValueDomainByUrnRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function19;
import org.jooq.Identity;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetValueDomainByUrn extends TableImpl<GetValueDomainByUrnRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.get_value_domain_by_urn</code>
     */
    public static final GetValueDomainByUrn GET_VALUE_DOMAIN_BY_URN = new GetValueDomainByUrn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetValueDomainByUrnRecord> getRecordType() {
        return GetValueDomainByUrnRecord.class;
    }

    /**
     * The column <code>public.get_value_domain_by_urn.id</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true).defaultValue(DSL.field("nextval('element_id_seq'::regclass)", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.element_type</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, ElementType> ELEMENT_TYPE = createField(DSL.name("element_type"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(de.dataelementhub.dal.jooq.enums.ElementType.class), this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.hidden</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Boolean> HIDDEN = createField(DSL.name("hidden"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.created_by</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.element_id</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Integer> ELEMENT_ID = createField(DSL.name("element_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>public.get_value_domain_by_urn.scoped_identifier_id</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Integer> SCOPED_IDENTIFIER_ID = createField(DSL.name("scoped_identifier_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.code</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> CODE = createField(DSL.name("code"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.is_valid</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Boolean> IS_VALID = createField(DSL.name("is_valid"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.format</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> FORMAT = createField(DSL.name("format"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.datatype</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> DATATYPE = createField(DSL.name("datatype"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.unit_of_measure</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> UNIT_OF_MEASURE = createField(DSL.name("unit_of_measure"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>public.get_value_domain_by_urn.maximum_characters</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Integer> MAXIMUM_CHARACTERS = createField(DSL.name("maximum_characters"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.description</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.validation_type</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, ValidationType> VALIDATION_TYPE = createField(DSL.name("validation_type"), SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.ValidationType.class), this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.validation_data</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> VALIDATION_DATA = createField(DSL.name("validation_data"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.permitted_value</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> PERMITTED_VALUE = createField(DSL.name("permitted_value"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.data</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, JSON> DATA = createField(DSL.name("data"), SQLDataType.JSON.defaultValue(DSL.field("'{}'::json", SQLDataType.JSON)), this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.uuid</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, java.util.UUID> UUID = createField(DSL.name("uuid"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.external_id</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> EXTERNAL_ID = createField(DSL.name("external_id"), SQLDataType.CLOB, this, "");

    private GetValueDomainByUrn(Name alias, Table<GetValueDomainByUrnRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private GetValueDomainByUrn(Name alias, Table<GetValueDomainByUrnRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>public.get_value_domain_by_urn</code> table
     * reference
     */
    public GetValueDomainByUrn(String alias) {
        this(DSL.name(alias), GET_VALUE_DOMAIN_BY_URN);
    }

    /**
     * Create an aliased <code>public.get_value_domain_by_urn</code> table
     * reference
     */
    public GetValueDomainByUrn(Name alias) {
        this(alias, GET_VALUE_DOMAIN_BY_URN);
    }

    /**
     * Create a <code>public.get_value_domain_by_urn</code> table reference
     */
    public GetValueDomainByUrn() {
        this(DSL.name("get_value_domain_by_urn"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<GetValueDomainByUrnRecord, Integer> getIdentity() {
        return (Identity<GetValueDomainByUrnRecord, Integer>) super.getIdentity();
    }

    @Override
    public GetValueDomainByUrn as(String alias) {
        return new GetValueDomainByUrn(DSL.name(alias), this, parameters);
    }

    @Override
    public GetValueDomainByUrn as(Name alias) {
        return new GetValueDomainByUrn(alias, this, parameters);
    }

    @Override
    public GetValueDomainByUrn as(Table<?> alias) {
        return new GetValueDomainByUrn(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetValueDomainByUrn rename(String name) {
        return new GetValueDomainByUrn(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetValueDomainByUrn rename(Name name) {
        return new GetValueDomainByUrn(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetValueDomainByUrn rename(Table<?> name) {
        return new GetValueDomainByUrn(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Integer, ElementType, Boolean, Integer, Integer, Integer, String, Boolean, String, String, String, Integer, String, ValidationType, String, String, JSON, java.util.UUID, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GetValueDomainByUrn call(
          String urn
    ) {
        GetValueDomainByUrn result = new GetValueDomainByUrn(DSL.name("get_value_domain_by_urn"), null, new Field[] {
            DSL.val(urn, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public GetValueDomainByUrn call(
          Field<String> urn
    ) {
        GetValueDomainByUrn result = new GetValueDomainByUrn(DSL.name("get_value_domain_by_urn"), null, new Field[] {
            urn
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function19<? super Integer, ? super ElementType, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super ValidationType, ? super String, ? super String, ? super JSON, ? super java.util.UUID, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function19<? super Integer, ? super ElementType, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super ValidationType, ? super String, ? super String, ? super JSON, ? super java.util.UUID, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
