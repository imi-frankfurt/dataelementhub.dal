/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.records;


import de.dataelementhub.dal.jooq.enums.RelationType;
import de.dataelementhub.dal.jooq.tables.ConceptElementAssociations;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConceptElementAssociationsRecord extends UpdatableRecordImpl<ConceptElementAssociationsRecord> implements Record5<Integer, Integer, RelationType, Integer, LocalDateTime> {

    private static final long serialVersionUID = -799303865;

    /**
     * Setter for <code>public.concept_element_associations.concept_id</code>.
     */
    public void setConceptId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.concept_element_associations.concept_id</code>.
     */
    public Integer getConceptId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.concept_element_associations.scopedidentifier_id</code>.
     */
    public void setScopedidentifierId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.concept_element_associations.scopedidentifier_id</code>.
     */
    public Integer getScopedidentifierId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.concept_element_associations.linktype</code>.
     */
    public void setLinktype(RelationType value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.concept_element_associations.linktype</code>.
     */
    public RelationType getLinktype() {
        return (RelationType) get(2);
    }

    /**
     * Setter for <code>public.concept_element_associations.created_by</code>.
     */
    public void setCreatedBy(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.concept_element_associations.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.concept_element_associations.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.concept_element_associations.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, RelationType, Integer, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, RelationType, Integer, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS.CONCEPT_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS.SCOPEDIDENTIFIER_ID;
    }

    @Override
    public Field<RelationType> field3() {
        return ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS.LINKTYPE;
    }

    @Override
    public Field<Integer> field4() {
        return ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS.CREATED_AT;
    }

    @Override
    public Integer component1() {
        return getConceptId();
    }

    @Override
    public Integer component2() {
        return getScopedidentifierId();
    }

    @Override
    public RelationType component3() {
        return getLinktype();
    }

    @Override
    public Integer component4() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedAt();
    }

    @Override
    public Integer value1() {
        return getConceptId();
    }

    @Override
    public Integer value2() {
        return getScopedidentifierId();
    }

    @Override
    public RelationType value3() {
        return getLinktype();
    }

    @Override
    public Integer value4() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedAt();
    }

    @Override
    public ConceptElementAssociationsRecord value1(Integer value) {
        setConceptId(value);
        return this;
    }

    @Override
    public ConceptElementAssociationsRecord value2(Integer value) {
        setScopedidentifierId(value);
        return this;
    }

    @Override
    public ConceptElementAssociationsRecord value3(RelationType value) {
        setLinktype(value);
        return this;
    }

    @Override
    public ConceptElementAssociationsRecord value4(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public ConceptElementAssociationsRecord value5(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public ConceptElementAssociationsRecord values(Integer value1, Integer value2, RelationType value3, Integer value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConceptElementAssociationsRecord
     */
    public ConceptElementAssociationsRecord() {
        super(ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS);
    }

    /**
     * Create a detached, initialised ConceptElementAssociationsRecord
     */
    public ConceptElementAssociationsRecord(Integer conceptId, Integer scopedidentifierId, RelationType linktype, Integer createdBy, LocalDateTime createdAt) {
        super(ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS);

        set(0, conceptId);
        set(1, scopedidentifierId);
        set(2, linktype);
        set(3, createdBy);
        set(4, createdAt);
    }
}
