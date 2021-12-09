/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.enums.ValidationType;
import de.dataelementhub.dal.jooq.tables.records.ListviewElementRecord;

import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Record;
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
public class ListviewElement extends TableImpl<ListviewElementRecord> {

    private static final long serialVersionUID = 1530857732;

    /**
     * The reference instance of <code>public.listview_element</code>
     */
    public static final ListviewElement LISTVIEW_ELEMENT = new ListviewElement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ListviewElementRecord> getRecordType() {
        return ListviewElementRecord.class;
    }

    /**
     * The column <code>public.listview_element.si_id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> SI_ID = createField(DSL.name("si_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.si_identifier</code>.
     */
    public final TableField<ListviewElementRecord, Integer> SI_IDENTIFIER = createField(DSL.name("si_identifier"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.si_version</code>.
     */
    public final TableField<ListviewElementRecord, Integer> SI_VERSION = createField(DSL.name("si_version"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.si_status</code>.
     */
    public final TableField<ListviewElementRecord, Status> SI_STATUS = createField(DSL.name("si_status"), org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.Status.class), this, "");

    /**
     * The column <code>public.listview_element.si_namespace_id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> SI_NAMESPACE_ID = createField(DSL.name("si_namespace_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.vd_datatype</code>.
     */
    public final TableField<ListviewElementRecord, String> VD_DATATYPE = createField(DSL.name("vd_datatype"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.element_type</code>.
     */
    public final TableField<ListviewElementRecord, ElementType> ELEMENT_TYPE = createField(DSL.name("element_type"), org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.ElementType.class), this, "");

    /**
     * The column <code>public.listview_element.hidden</code>.
     */
    public final TableField<ListviewElementRecord, Boolean> HIDDEN = createField(DSL.name("hidden"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.listview_element.created_by</code>.
     */
    public final TableField<ListviewElementRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.element_id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> ELEMENT_ID = createField(DSL.name("element_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.scoped_identifier_id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> SCOPED_IDENTIFIER_ID = createField(DSL.name("scoped_identifier_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.code</code>.
     */
    public final TableField<ListviewElementRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.is_valid</code>.
     */
    public final TableField<ListviewElementRecord, Boolean> IS_VALID = createField(DSL.name("is_valid"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.listview_element.format</code>.
     */
    public final TableField<ListviewElementRecord, String> FORMAT = createField(DSL.name("format"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.datatype</code>.
     */
    public final TableField<ListviewElementRecord, String> DATATYPE = createField(DSL.name("datatype"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.unit_of_measure</code>.
     */
    public final TableField<ListviewElementRecord, String> UNIT_OF_MEASURE = createField(DSL.name("unit_of_measure"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.maximum_characters</code>.
     */
    public final TableField<ListviewElementRecord, Integer> MAXIMUM_CHARACTERS = createField(DSL.name("maximum_characters"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.description</code>.
     */
    public final TableField<ListviewElementRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.validation_type</code>.
     */
    public final TableField<ListviewElementRecord, ValidationType> VALIDATION_TYPE = createField(DSL.name("validation_type"), org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.ValidationType.class), this, "");

    /**
     * The column <code>public.listview_element.validation_data</code>.
     */
    public final TableField<ListviewElementRecord, String> VALIDATION_DATA = createField(DSL.name("validation_data"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.permitted_value</code>.
     */
    public final TableField<ListviewElementRecord, String> PERMITTED_VALUE = createField(DSL.name("permitted_value"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.data</code>.
     */
    public final TableField<ListviewElementRecord, JSON> DATA = createField(DSL.name("data"), org.jooq.impl.SQLDataType.JSON, this, "");

    /**
     * The column <code>public.listview_element.uuid</code>.
     */
    public final TableField<ListviewElementRecord, UUID> UUID = createField(DSL.name("uuid"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>public.listview_element.external_id</code>.
     */
    public final TableField<ListviewElementRecord, String> EXTERNAL_ID = createField(DSL.name("external_id"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.listview_element</code> table reference
     */
    public ListviewElement() {
        this(DSL.name("listview_element"), null);
    }

    /**
     * Create an aliased <code>public.listview_element</code> table reference
     */
    public ListviewElement(String alias) {
        this(DSL.name(alias), LISTVIEW_ELEMENT);
    }

    /**
     * Create an aliased <code>public.listview_element</code> table reference
     */
    public ListviewElement(Name alias) {
        this(alias, LISTVIEW_ELEMENT);
    }

    private ListviewElement(Name alias, Table<ListviewElementRecord> aliased) {
        this(alias, aliased, null);
    }

    private ListviewElement(Name alias, Table<ListviewElementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"listview_element\" as  SELECT si.id AS si_id,\n    si.identifier AS si_identifier,\n    si.version AS si_version,\n    si.status AS si_status,\n    si.namespace_id AS si_namespace_id,\n    vd.datatype AS vd_datatype,\n    e.id,\n    e.element_type,\n    e.hidden,\n    e.created_by,\n    e.element_id,\n    e.scoped_identifier_id,\n    e.code,\n    e.is_valid,\n    e.format,\n    e.datatype,\n    e.unit_of_measure,\n    e.maximum_characters,\n    e.description,\n    e.validation_type,\n    e.validation_data,\n    e.permitted_value,\n    e.data,\n    e.uuid,\n    e.external_id\n   FROM (((scoped_identifier si\n     LEFT JOIN element ns ON ((si.namespace_id = ns.id)))\n     LEFT JOIN element e ON ((e.id = si.element_id)))\n     LEFT JOIN element vd ON ((e.element_id = vd.id)));"));
    }

    public <O extends Record> ListviewElement(Table<O> child, ForeignKey<O, ListviewElementRecord> key) {
        super(child, key, LISTVIEW_ELEMENT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public ListviewElement as(String alias) {
        return new ListviewElement(DSL.name(alias), this);
    }

    @Override
    public ListviewElement as(Name alias) {
        return new ListviewElement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ListviewElement rename(String name) {
        return new ListviewElement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ListviewElement rename(Name name) {
        return new ListviewElement(name, null);
    }
}
