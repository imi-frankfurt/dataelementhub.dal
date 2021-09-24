/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.daos;


import de.dataelementhub.dal.jooq.tables.ScopedIdentifierHierarchy;
import de.dataelementhub.dal.jooq.tables.records.ScopedIdentifierHierarchyRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScopedIdentifierHierarchyDao extends DAOImpl<ScopedIdentifierHierarchyRecord, de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy, Record2<Integer, Integer>> {

    /**
     * Create a new ScopedIdentifierHierarchyDao without any configuration
     */
    public ScopedIdentifierHierarchyDao() {
        super(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY, de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy.class);
    }

    /**
     * Create a new ScopedIdentifierHierarchyDao with an attached configuration
     */
    public ScopedIdentifierHierarchyDao(Configuration configuration) {
        super(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY, de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy.class, configuration);
    }

    @Override
    public Record2<Integer, Integer> getId(de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy object) {
        return compositeKeyRecord(object.getSuperId(), object.getSubId());
    }

    /**
     * Fetch records that have <code>super_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy> fetchRangeOfSuperId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUPER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>super_id IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy> fetchBySuperId(Integer... values) {
        return fetch(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUPER_ID, values);
    }

    /**
     * Fetch records that have <code>sub_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy> fetchRangeOfSubId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUB_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>sub_id IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy> fetchBySubId(Integer... values) {
        return fetch(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUB_ID, values);
    }

    /**
     * Fetch records that have <code>order BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy> fetchRangeOfOrder(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.ORDER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>order IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy> fetchByOrder(Integer... values) {
        return fetch(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.ORDER, values);
    }
}
