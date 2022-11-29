/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.enums.RelationType;
import de.dataelementhub.dal.jooq.tables.records.ConceptElementAssociationRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConceptElementAssociation extends TableImpl<ConceptElementAssociationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.concept_element_association</code>
     */
    public static final ConceptElementAssociation CONCEPT_ELEMENT_ASSOCIATION = new ConceptElementAssociation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConceptElementAssociationRecord> getRecordType() {
        return ConceptElementAssociationRecord.class;
    }

    /**
     * The column <code>public.concept_element_association.concept_id</code>.
     */
    public final TableField<ConceptElementAssociationRecord, Integer> CONCEPT_ID = createField(DSL.name("concept_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>public.concept_element_association.scopedidentifier_id</code>.
     */
    public final TableField<ConceptElementAssociationRecord, Integer> SCOPEDIDENTIFIER_ID = createField(DSL.name("scopedidentifier_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.concept_element_association.linktype</code>.
     */
    public final TableField<ConceptElementAssociationRecord, RelationType> LINKTYPE = createField(DSL.name("linktype"), SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.RelationType.class), this, "");

    /**
     * The column <code>public.concept_element_association.created_by</code>.
     */
    public final TableField<ConceptElementAssociationRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.concept_element_association.created_at</code>.
     */
    public final TableField<ConceptElementAssociationRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private ConceptElementAssociation(Name alias, Table<ConceptElementAssociationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConceptElementAssociation(Name alias, Table<ConceptElementAssociationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.concept_element_association</code> table
     * reference
     */
    public ConceptElementAssociation(String alias) {
        this(DSL.name(alias), CONCEPT_ELEMENT_ASSOCIATION);
    }

    /**
     * Create an aliased <code>public.concept_element_association</code> table
     * reference
     */
    public ConceptElementAssociation(Name alias) {
        this(alias, CONCEPT_ELEMENT_ASSOCIATION);
    }

    /**
     * Create a <code>public.concept_element_association</code> table reference
     */
    public ConceptElementAssociation() {
        this(DSL.name("concept_element_association"), null);
    }

    public <O extends Record> ConceptElementAssociation(Table<O> child, ForeignKey<O, ConceptElementAssociationRecord> key) {
        super(child, key, CONCEPT_ELEMENT_ASSOCIATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<ConceptElementAssociationRecord> getPrimaryKey() {
        return Keys.CONCEPT_ELEMENT_ASSOCIATIONS_PKEY;
    }

    @Override
    public List<ForeignKey<ConceptElementAssociationRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CONCEPT_ELEMENT_ASSOCIATION__CONCEPT_ID_FKEY, Keys.CONCEPT_ELEMENT_ASSOCIATION__SCOPEDIDENTIFIER_ID_FKEY, Keys.CONCEPT_ELEMENT_ASSOCIATION__CONCEPT_ELEMENT_ASSOCIATION_CREATED_BY_FKEY);
    }

    private transient Concept _concept;
    private transient ScopedIdentifier _scopedIdentifier;
    private transient DehubUser _dehubUser;

    /**
     * Get the implicit join path to the <code>public.concept</code> table.
     */
    public Concept concept() {
        if (_concept == null)
            _concept = new Concept(this, Keys.CONCEPT_ELEMENT_ASSOCIATION__CONCEPT_ID_FKEY);

        return _concept;
    }

    /**
     * Get the implicit join path to the <code>public.scoped_identifier</code>
     * table.
     */
    public ScopedIdentifier scopedIdentifier() {
        if (_scopedIdentifier == null)
            _scopedIdentifier = new ScopedIdentifier(this, Keys.CONCEPT_ELEMENT_ASSOCIATION__SCOPEDIDENTIFIER_ID_FKEY);

        return _scopedIdentifier;
    }

    /**
     * Get the implicit join path to the <code>public.dehub_user</code> table.
     */
    public DehubUser dehubUser() {
        if (_dehubUser == null)
            _dehubUser = new DehubUser(this, Keys.CONCEPT_ELEMENT_ASSOCIATION__CONCEPT_ELEMENT_ASSOCIATION_CREATED_BY_FKEY);

        return _dehubUser;
    }

    @Override
    public ConceptElementAssociation as(String alias) {
        return new ConceptElementAssociation(DSL.name(alias), this);
    }

    @Override
    public ConceptElementAssociation as(Name alias) {
        return new ConceptElementAssociation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConceptElementAssociation rename(String name) {
        return new ConceptElementAssociation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConceptElementAssociation rename(Name name) {
        return new ConceptElementAssociation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, RelationType, Integer, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
