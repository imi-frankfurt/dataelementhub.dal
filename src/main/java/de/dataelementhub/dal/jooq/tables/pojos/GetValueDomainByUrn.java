/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.pojos;


import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.ValidationType;

import java.io.Serializable;
import java.util.UUID;

import org.jooq.JSON;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetValueDomainByUrn implements Serializable {

    private static final long serialVersionUID = -1977362263;

    private Integer        id;
    private ElementType    elementType;
    private Boolean        hidden;
    private Integer        createdBy;
    private Integer        elementId;
    private Integer        scopedIdentifierId;
    private String         code;
    private Boolean        isValid;
    private String         format;
    private String         datatype;
    private String         unitOfMeasure;
    private Integer        maximumCharacters;
    private String         description;
    private ValidationType validationType;
    private String         validationData;
    private String         permittedValue;
    private JSON           data;
    private UUID           uuid;
    private String         externalId;

    public GetValueDomainByUrn() {}

    public GetValueDomainByUrn(GetValueDomainByUrn value) {
        this.id = value.id;
        this.elementType = value.elementType;
        this.hidden = value.hidden;
        this.createdBy = value.createdBy;
        this.elementId = value.elementId;
        this.scopedIdentifierId = value.scopedIdentifierId;
        this.code = value.code;
        this.isValid = value.isValid;
        this.format = value.format;
        this.datatype = value.datatype;
        this.unitOfMeasure = value.unitOfMeasure;
        this.maximumCharacters = value.maximumCharacters;
        this.description = value.description;
        this.validationType = value.validationType;
        this.validationData = value.validationData;
        this.permittedValue = value.permittedValue;
        this.data = value.data;
        this.uuid = value.uuid;
        this.externalId = value.externalId;
    }

    public GetValueDomainByUrn(
        Integer        id,
        ElementType    elementType,
        Boolean        hidden,
        Integer        createdBy,
        Integer        elementId,
        Integer        scopedIdentifierId,
        String         code,
        Boolean        isValid,
        String         format,
        String         datatype,
        String         unitOfMeasure,
        Integer        maximumCharacters,
        String         description,
        ValidationType validationType,
        String         validationData,
        String         permittedValue,
        JSON           data,
        UUID           uuid,
        String         externalId
    ) {
        this.id = id;
        this.elementType = elementType;
        this.hidden = hidden;
        this.createdBy = createdBy;
        this.elementId = elementId;
        this.scopedIdentifierId = scopedIdentifierId;
        this.code = code;
        this.isValid = isValid;
        this.format = format;
        this.datatype = datatype;
        this.unitOfMeasure = unitOfMeasure;
        this.maximumCharacters = maximumCharacters;
        this.description = description;
        this.validationType = validationType;
        this.validationData = validationData;
        this.permittedValue = permittedValue;
        this.data = data;
        this.uuid = uuid;
        this.externalId = externalId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ElementType getElementType() {
        return this.elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }

    public Boolean getHidden() {
        return this.hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getElementId() {
        return this.elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public Integer getScopedIdentifierId() {
        return this.scopedIdentifierId;
    }

    public void setScopedIdentifierId(Integer scopedIdentifierId) {
        this.scopedIdentifierId = scopedIdentifierId;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getIsValid() {
        return this.isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDatatype() {
        return this.datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Integer getMaximumCharacters() {
        return this.maximumCharacters;
    }

    public void setMaximumCharacters(Integer maximumCharacters) {
        this.maximumCharacters = maximumCharacters;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ValidationType getValidationType() {
        return this.validationType;
    }

    public void setValidationType(ValidationType validationType) {
        this.validationType = validationType;
    }

    public String getValidationData() {
        return this.validationData;
    }

    public void setValidationData(String validationData) {
        this.validationData = validationData;
    }

    public String getPermittedValue() {
        return this.permittedValue;
    }

    public void setPermittedValue(String permittedValue) {
        this.permittedValue = permittedValue;
    }

    public JSON getData() {
        return this.data;
    }

    public void setData(JSON data) {
        this.data = data;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GetValueDomainByUrn (");

        sb.append(id);
        sb.append(", ").append(elementType);
        sb.append(", ").append(hidden);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(elementId);
        sb.append(", ").append(scopedIdentifierId);
        sb.append(", ").append(code);
        sb.append(", ").append(isValid);
        sb.append(", ").append(format);
        sb.append(", ").append(datatype);
        sb.append(", ").append(unitOfMeasure);
        sb.append(", ").append(maximumCharacters);
        sb.append(", ").append(description);
        sb.append(", ").append(validationType);
        sb.append(", ").append(validationData);
        sb.append(", ").append(permittedValue);
        sb.append(", ").append(data);
        sb.append(", ").append(uuid);
        sb.append(", ").append(externalId);

        sb.append(")");
        return sb.toString();
    }
}
