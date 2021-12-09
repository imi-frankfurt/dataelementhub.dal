/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Indexes;
import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.ValidationType;
import de.dataelementhub.dal.jooq.tables.records.ElementRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Element extends TableImpl<ElementRecord> {

    private static final long serialVersionUID = -760251841;

    /**
     * The reference instance of <code>public.element</code>
     */
    public static final Element ELEMENT = new Element();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ElementRecord> getRecordType() {
        return ElementRecord.class;
    }

    /**
     * The column <code>public.element.id</code>.
     */
    public final TableField<ElementRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('element_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.element.element_type</code>.
     */
    public final TableField<ElementRecord, ElementType> ELEMENT_TYPE = createField(DSL.name("element_type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(de.dataelementhub.dal.jooq.enums.ElementType.class), this, "");

    /**
     * The column <code>public.element.hidden</code>.
     */
    public final TableField<ElementRecord, Boolean> HIDDEN = createField(DSL.name("hidden"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.element.created_by</code>.
     */
    public final TableField<ElementRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.element.element_id</code>.
     */
    public final TableField<ElementRecord, Integer> ELEMENT_ID = createField(DSL.name("element_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.element.scoped_identifier_id</code>.
     */
    public final TableField<ElementRecord, Integer> SCOPED_IDENTIFIER_ID = createField(DSL.name("scoped_identifier_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.element.code</code>.
     */
    public final TableField<ElementRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.element.is_valid</code>.
     */
    public final TableField<ElementRecord, Boolean> IS_VALID = createField(DSL.name("is_valid"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.element.format</code>.
     */
    public final TableField<ElementRecord, String> FORMAT = createField(DSL.name("format"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.element.datatype</code>.
     */
    public final TableField<ElementRecord, String> DATATYPE = createField(DSL.name("datatype"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.element.unit_of_measure</code>.
     */
    public final TableField<ElementRecord, String> UNIT_OF_MEASURE = createField(DSL.name("unit_of_measure"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.element.maximum_characters</code>.
     */
    public final TableField<ElementRecord, Integer> MAXIMUM_CHARACTERS = createField(DSL.name("maximum_characters"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.element.description</code>.
     */
    public final TableField<ElementRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.element.validation_type</code>.
     */
    public final TableField<ElementRecord, ValidationType> VALIDATION_TYPE = createField(DSL.name("validation_type"), org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.ValidationType.class), this, "");

    /**
     * The column <code>public.element.validation_data</code>.
     */
    public final TableField<ElementRecord, String> VALIDATION_DATA = createField(DSL.name("validation_data"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.element.permitted_value</code>.
     */
    public final TableField<ElementRecord, String> PERMITTED_VALUE = createField(DSL.name("permitted_value"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.element.data</code>.
     */
    public final TableField<ElementRecord, JSON> DATA = createField(DSL.name("data"), org.jooq.impl.SQLDataType.JSON.defaultValue(org.jooq.impl.DSL.field("'{}'::json", org.jooq.impl.SQLDataType.JSON)), this, "");

    /**
     * The column <code>public.element.uuid</code>.
     */
    public final TableField<ElementRecord, UUID> UUID = createField(DSL.name("uuid"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.element.external_id</code>.
     */
    public final TableField<ElementRecord, String> EXTERNAL_ID = createField(DSL.name("external_id"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.element</code> table reference
     */
    public Element() {
        this(DSL.name("element"), null);
    }

    /**
     * Create an aliased <code>public.element</code> table reference
     */
    public Element(String alias) {
        this(DSL.name(alias), ELEMENT);
    }

    /**
     * Create an aliased <code>public.element</code> table reference
     */
    public Element(Name alias) {
        this(alias, ELEMENT);
    }

    private Element(Name alias, Table<ElementRecord> aliased) {
        this(alias, aliased, null);
    }

    private Element(Name alias, Table<ElementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Element(Table<O> child, ForeignKey<O, ElementRecord> key) {
        super(child, key, ELEMENT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ELEMENT_CREATED_BY_IDX, Indexes.ELEMENT_ELEMENT_ID_IDX, Indexes.ELEMENT_ELEMENT_TYPE_IDX, Indexes.ELEMENT_ID_ELEMENT_TYPE_IDX);
    }

    @Override
    public Identity<ElementRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ELEMENT;
    }

    @Override
    public UniqueKey<ElementRecord> getPrimaryKey() {
        return Keys.ELEMENT_PKEY;
    }

    @Override
    public List<UniqueKey<ElementRecord>> getKeys() {
        return Arrays.<UniqueKey<ElementRecord>>asList(Keys.ELEMENT_PKEY);
    }

    @Override
    public List<ForeignKey<ElementRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ElementRecord, ?>>asList(Keys.ELEMENT__ELEMENT_CREATED_BY_FKEY, Keys.ELEMENT__ELEMENT_ELEMENT_ID_FKEY, Keys.ELEMENT__ELEMENT_SCOPED_IDENTIFIER_ID_FKEY);
    }

    public DehubUser dehubUser() {
        return new DehubUser(this, Keys.ELEMENT__ELEMENT_CREATED_BY_FKEY);
    }

    public Element element() {
        return new Element(this, Keys.ELEMENT__ELEMENT_ELEMENT_ID_FKEY);
    }

    public ScopedIdentifier scopedIdentifier() {
        return new ScopedIdentifier(this, Keys.ELEMENT__ELEMENT_SCOPED_IDENTIFIER_ID_FKEY);
    }

    @Override
    public List<Check<ElementRecord>> getChecks() {
        return Arrays.<Check<ElementRecord>>asList(
              Internal.createCheck(this, DSL.name("catalog_check"), "(((element_type <> 'CATALOG_VALUE_DOMAIN'::element_type) OR ((format IS NOT NULL) AND (datatype IS NOT NULL) AND (maximum_characters IS NOT NULL) AND (scoped_identifier_id IS NOT NULL))))", true)
            , Internal.createCheck(this, DSL.name("code_check"), "(((element_type <> 'CODE'::element_type) OR ((code IS NOT NULL) AND (is_valid IS NOT NULL) AND (element_id IS NOT NULL))))", true)
            , Internal.createCheck(this, DSL.name("de_check"), "(((element_type <> 'DATAELEMENT'::element_type) OR (element_id IS NOT NULL)))", true)
            , Internal.createCheck(this, DSL.name("desc_check"), "(((element_type <> 'DESCRIBED_VALUE_DOMAIN'::element_type) OR ((format IS NOT NULL) AND (datatype IS NOT NULL) AND (maximum_characters IS NOT NULL) AND (validation_type IS NOT NULL))))", true)
            , Internal.createCheck(this, DSL.name("enu_check"), "(((element_type <> 'ENUMERATED_VALUE_DOMAIN'::element_type) OR ((format IS NOT NULL) AND (datatype IS NOT NULL) AND (maximum_characters IS NOT NULL))))", true)
        );
    }

    @Override
    public Element as(String alias) {
        return new Element(DSL.name(alias), this);
    }

    @Override
    public Element as(Name alias) {
        return new Element(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Element rename(String name) {
        return new Element(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Element rename(Name name) {
        return new Element(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Integer, ElementType, Boolean, Integer, Integer, Integer, String, Boolean, String, String, String, Integer, String, ValidationType, String, String, JSON, UUID, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
