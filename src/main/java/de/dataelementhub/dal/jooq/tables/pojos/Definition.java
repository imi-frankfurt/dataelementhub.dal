/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Definition implements Serializable {

    private static final long serialVersionUID = -2095765354;

    private Integer id;
    private Integer scopedIdentifierId;
    private String  designation;
    private String  definition;
    private String  language;
    private Integer elementId;

    public Definition() {}

    public Definition(Definition value) {
        this.id = value.id;
        this.scopedIdentifierId = value.scopedIdentifierId;
        this.designation = value.designation;
        this.definition = value.definition;
        this.language = value.language;
        this.elementId = value.elementId;
    }

    public Definition(
        Integer id,
        Integer scopedIdentifierId,
        String  designation,
        String  definition,
        String  language,
        Integer elementId
    ) {
        this.id = id;
        this.scopedIdentifierId = scopedIdentifierId;
        this.designation = designation;
        this.definition = definition;
        this.language = language;
        this.elementId = elementId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScopedIdentifierId() {
        return this.scopedIdentifierId;
    }

    public void setScopedIdentifierId(Integer scopedIdentifierId) {
        this.scopedIdentifierId = scopedIdentifierId;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDefinition() {
        return this.definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getElementId() {
        return this.elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Definition (");

        sb.append(id);
        sb.append(", ").append(scopedIdentifierId);
        sb.append(", ").append(designation);
        sb.append(", ").append(definition);
        sb.append(", ").append(language);
        sb.append(", ").append(elementId);

        sb.append(")");
        return sb.toString();
    }
}
