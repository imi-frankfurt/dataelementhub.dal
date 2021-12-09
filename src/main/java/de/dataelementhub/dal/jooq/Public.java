/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq;


import de.dataelementhub.dal.jooq.tables.ConceptElementAssociations;
import de.dataelementhub.dal.jooq.tables.Concepts;
import de.dataelementhub.dal.jooq.tables.Config;
import de.dataelementhub.dal.jooq.tables.Definition;
import de.dataelementhub.dal.jooq.tables.DehubUser;
import de.dataelementhub.dal.jooq.tables.Element;
import de.dataelementhub.dal.jooq.tables.ElementRelation;
import de.dataelementhub.dal.jooq.tables.GetDefinitionByUrn;
import de.dataelementhub.dal.jooq.tables.GetScopedIdentifierByUrn;
import de.dataelementhub.dal.jooq.tables.GetSlotByUrn;
import de.dataelementhub.dal.jooq.tables.GetValueDomainByUrn;
import de.dataelementhub.dal.jooq.tables.GetValueDomainScopedIdentifierByDataelementUrn;
import de.dataelementhub.dal.jooq.tables.Hierarchy;
import de.dataelementhub.dal.jooq.tables.IdentifiedElement;
import de.dataelementhub.dal.jooq.tables.Import;
import de.dataelementhub.dal.jooq.tables.ListviewElement;
import de.dataelementhub.dal.jooq.tables.PermissibleCode;
import de.dataelementhub.dal.jooq.tables.ScopedIdentifier;
import de.dataelementhub.dal.jooq.tables.ScopedIdentifierHierarchy;
import de.dataelementhub.dal.jooq.tables.Slot;
import de.dataelementhub.dal.jooq.tables.Source;
import de.dataelementhub.dal.jooq.tables.Staging;
import de.dataelementhub.dal.jooq.tables.UserNamespaceGrants;
import de.dataelementhub.dal.jooq.tables.UserSourceCredentials;
import de.dataelementhub.dal.jooq.tables.ValueDomainPermissibleValue;
import de.dataelementhub.dal.jooq.tables.records.GetDefinitionByUrnRecord;
import de.dataelementhub.dal.jooq.tables.records.GetScopedIdentifierByUrnRecord;
import de.dataelementhub.dal.jooq.tables.records.GetSlotByUrnRecord;
import de.dataelementhub.dal.jooq.tables.records.GetValueDomainByUrnRecord;
import de.dataelementhub.dal.jooq.tables.records.GetValueDomainScopedIdentifierByDataelementUrnRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -874939376;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.concept_element_associations</code>.
     */
    public final ConceptElementAssociations CONCEPT_ELEMENT_ASSOCIATIONS = ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS;

    /**
     * The table <code>public.concepts</code>.
     */
    public final Concepts CONCEPTS = Concepts.CONCEPTS;

    /**
     * The table <code>public.config</code>.
     */
    public final Config CONFIG = Config.CONFIG;

    /**
     * The table <code>public.definition</code>.
     */
    public final Definition DEFINITION = Definition.DEFINITION;

    /**
     * The table <code>public.dehub_user</code>.
     */
    public final DehubUser DEHUB_USER = DehubUser.DEHUB_USER;

    /**
     * The table <code>public.element</code>.
     */
    public final Element ELEMENT = Element.ELEMENT;

    /**
     * The table <code>public.element_relation</code>.
     */
    public final ElementRelation ELEMENT_RELATION = ElementRelation.ELEMENT_RELATION;

    /**
     * The table <code>public.get_definition_by_urn</code>.
     */
    public final GetDefinitionByUrn GET_DEFINITION_BY_URN = GetDefinitionByUrn.GET_DEFINITION_BY_URN;

    /**
     * Call <code>public.get_definition_by_urn</code>.
     */
    public static Result<GetDefinitionByUrnRecord> GET_DEFINITION_BY_URN(Configuration configuration, String urn) {
        return configuration.dsl().selectFrom(de.dataelementhub.dal.jooq.tables.GetDefinitionByUrn.GET_DEFINITION_BY_URN.call(urn)).fetch();
    }

    /**
     * Get <code>public.get_definition_by_urn</code> as a table.
     */
    public static GetDefinitionByUrn GET_DEFINITION_BY_URN(String urn) {
        return de.dataelementhub.dal.jooq.tables.GetDefinitionByUrn.GET_DEFINITION_BY_URN.call(urn);
    }

    /**
     * Get <code>public.get_definition_by_urn</code> as a table.
     */
    public static GetDefinitionByUrn GET_DEFINITION_BY_URN(Field<String> urn) {
        return de.dataelementhub.dal.jooq.tables.GetDefinitionByUrn.GET_DEFINITION_BY_URN.call(urn);
    }

    /**
     * The table <code>public.get_scoped_identifier_by_urn</code>.
     */
    public final GetScopedIdentifierByUrn GET_SCOPED_IDENTIFIER_BY_URN = GetScopedIdentifierByUrn.GET_SCOPED_IDENTIFIER_BY_URN;

    /**
     * Call <code>public.get_scoped_identifier_by_urn</code>.
     */
    public static Result<GetScopedIdentifierByUrnRecord> GET_SCOPED_IDENTIFIER_BY_URN(Configuration configuration, String urn) {
        return configuration.dsl().selectFrom(de.dataelementhub.dal.jooq.tables.GetScopedIdentifierByUrn.GET_SCOPED_IDENTIFIER_BY_URN.call(urn)).fetch();
    }

    /**
     * Get <code>public.get_scoped_identifier_by_urn</code> as a table.
     */
    public static GetScopedIdentifierByUrn GET_SCOPED_IDENTIFIER_BY_URN(String urn) {
        return de.dataelementhub.dal.jooq.tables.GetScopedIdentifierByUrn.GET_SCOPED_IDENTIFIER_BY_URN.call(urn);
    }

    /**
     * Get <code>public.get_scoped_identifier_by_urn</code> as a table.
     */
    public static GetScopedIdentifierByUrn GET_SCOPED_IDENTIFIER_BY_URN(Field<String> urn) {
        return de.dataelementhub.dal.jooq.tables.GetScopedIdentifierByUrn.GET_SCOPED_IDENTIFIER_BY_URN.call(urn);
    }

    /**
     * The table <code>public.get_slot_by_urn</code>.
     */
    public final GetSlotByUrn GET_SLOT_BY_URN = GetSlotByUrn.GET_SLOT_BY_URN;

    /**
     * Call <code>public.get_slot_by_urn</code>.
     */
    public static Result<GetSlotByUrnRecord> GET_SLOT_BY_URN(Configuration configuration, String urn) {
        return configuration.dsl().selectFrom(de.dataelementhub.dal.jooq.tables.GetSlotByUrn.GET_SLOT_BY_URN.call(urn)).fetch();
    }

    /**
     * Get <code>public.get_slot_by_urn</code> as a table.
     */
    public static GetSlotByUrn GET_SLOT_BY_URN(String urn) {
        return de.dataelementhub.dal.jooq.tables.GetSlotByUrn.GET_SLOT_BY_URN.call(urn);
    }

    /**
     * Get <code>public.get_slot_by_urn</code> as a table.
     */
    public static GetSlotByUrn GET_SLOT_BY_URN(Field<String> urn) {
        return de.dataelementhub.dal.jooq.tables.GetSlotByUrn.GET_SLOT_BY_URN.call(urn);
    }

    /**
     * The table <code>public.get_value_domain_by_urn</code>.
     */
    public final GetValueDomainByUrn GET_VALUE_DOMAIN_BY_URN = GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN;

    /**
     * Call <code>public.get_value_domain_by_urn</code>.
     */
    public static Result<GetValueDomainByUrnRecord> GET_VALUE_DOMAIN_BY_URN(Configuration configuration, String urn) {
        return configuration.dsl().selectFrom(de.dataelementhub.dal.jooq.tables.GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN.call(urn)).fetch();
    }

    /**
     * Get <code>public.get_value_domain_by_urn</code> as a table.
     */
    public static GetValueDomainByUrn GET_VALUE_DOMAIN_BY_URN(String urn) {
        return de.dataelementhub.dal.jooq.tables.GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN.call(urn);
    }

    /**
     * Get <code>public.get_value_domain_by_urn</code> as a table.
     */
    public static GetValueDomainByUrn GET_VALUE_DOMAIN_BY_URN(Field<String> urn) {
        return de.dataelementhub.dal.jooq.tables.GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN.call(urn);
    }

    /**
     * The table <code>public.get_value_domain_scoped_identifier_by_dataelement_urn</code>.
     */
    public final GetValueDomainScopedIdentifierByDataelementUrn GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN = GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN;

    /**
     * Call <code>public.get_value_domain_scoped_identifier_by_dataelement_urn</code>.
     */
    public static Result<GetValueDomainScopedIdentifierByDataelementUrnRecord> GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN(Configuration configuration, String urn) {
        return configuration.dsl().selectFrom(de.dataelementhub.dal.jooq.tables.GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.call(urn)).fetch();
    }

    /**
     * Get <code>public.get_value_domain_scoped_identifier_by_dataelement_urn</code> as a table.
     */
    public static GetValueDomainScopedIdentifierByDataelementUrn GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN(String urn) {
        return de.dataelementhub.dal.jooq.tables.GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.call(urn);
    }

    /**
     * Get <code>public.get_value_domain_scoped_identifier_by_dataelement_urn</code> as a table.
     */
    public static GetValueDomainScopedIdentifierByDataelementUrn GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN(Field<String> urn) {
        return de.dataelementhub.dal.jooq.tables.GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.call(urn);
    }

    /**
     * The table <code>public.hierarchy</code>.
     */
    public final Hierarchy HIERARCHY = Hierarchy.HIERARCHY;

    /**
     * The table <code>public.identified_element</code>.
     */
    public final IdentifiedElement IDENTIFIED_ELEMENT = IdentifiedElement.IDENTIFIED_ELEMENT;

    /**
     * The table <code>public.import</code>.
     */
    public final Import IMPORT = Import.IMPORT;

    /**
     * The table <code>public.listview_element</code>.
     */
    public final ListviewElement LISTVIEW_ELEMENT = ListviewElement.LISTVIEW_ELEMENT;

    /**
     * The table <code>public.permissible_code</code>.
     */
    public final PermissibleCode PERMISSIBLE_CODE = PermissibleCode.PERMISSIBLE_CODE;

    /**
     * The table <code>public.scoped_identifier</code>.
     */
    public final ScopedIdentifier SCOPED_IDENTIFIER = ScopedIdentifier.SCOPED_IDENTIFIER;

    /**
     * The table <code>public.scoped_identifier_hierarchy</code>.
     */
    public final ScopedIdentifierHierarchy SCOPED_IDENTIFIER_HIERARCHY = ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY;

    /**
     * The table <code>public.slot</code>.
     */
    public final Slot SLOT = Slot.SLOT;

    /**
     * The table <code>public.source</code>.
     */
    public final Source SOURCE = Source.SOURCE;

    /**
     * The table <code>public.staging</code>.
     */
    public final Staging STAGING = Staging.STAGING;

    /**
     * The table <code>public.user_namespace_grants</code>.
     */
    public final UserNamespaceGrants USER_NAMESPACE_GRANTS = UserNamespaceGrants.USER_NAMESPACE_GRANTS;

    /**
     * The table <code>public.user_source_credentials</code>.
     */
    public final UserSourceCredentials USER_SOURCE_CREDENTIALS = UserSourceCredentials.USER_SOURCE_CREDENTIALS;

    /**
     * The table <code>public.value_domain_permissible_value</code>.
     */
    public final ValueDomainPermissibleValue VALUE_DOMAIN_PERMISSIBLE_VALUE = ValueDomainPermissibleValue.VALUE_DOMAIN_PERMISSIBLE_VALUE;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.<Sequence<?>>asList(
            Sequences.CONCEPTS_ID_SEQ,
            Sequences.CONFIG_ID_SEQ,
            Sequences.DEFINITION_ID_SEQ,
            Sequences.DEHUB_USER_ID_SEQ,
            Sequences.ELEMENT_ID_SEQ,
            Sequences.IMPORT_ID_SEQ,
            Sequences.SCOPED_IDENTIFIER_ID_SEQ,
            Sequences.SLOT_ID_SEQ,
            Sequences.SOURCE_ID_SEQ,
            Sequences.STAGING_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS,
            Concepts.CONCEPTS,
            Config.CONFIG,
            Definition.DEFINITION,
            DehubUser.DEHUB_USER,
            Element.ELEMENT,
            ElementRelation.ELEMENT_RELATION,
            GetDefinitionByUrn.GET_DEFINITION_BY_URN,
            GetScopedIdentifierByUrn.GET_SCOPED_IDENTIFIER_BY_URN,
            GetSlotByUrn.GET_SLOT_BY_URN,
            GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN,
            GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN,
            Hierarchy.HIERARCHY,
            IdentifiedElement.IDENTIFIED_ELEMENT,
            Import.IMPORT,
            ListviewElement.LISTVIEW_ELEMENT,
            PermissibleCode.PERMISSIBLE_CODE,
            ScopedIdentifier.SCOPED_IDENTIFIER,
            ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY,
            Slot.SLOT,
            Source.SOURCE,
            Staging.STAGING,
            UserNamespaceGrants.USER_NAMESPACE_GRANTS,
            UserSourceCredentials.USER_SOURCE_CREDENTIALS,
            ValueDomainPermissibleValue.VALUE_DOMAIN_PERMISSIBLE_VALUE);
    }
}
