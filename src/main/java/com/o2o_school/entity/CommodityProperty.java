package com.o2o_school.entity;

public class CommodityProperty {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_property.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_property.commodity_id
     *
     * @mbggenerated
     */
    private Integer commodityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_property.property_id
     *
     * @mbggenerated
     */
    private Integer propertyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_property.property_value
     *
     * @mbggenerated
     */
    private String propertyValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_property.quantity
     *
     * @mbggenerated
     */
    private Integer quantity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_property.id
     *
     * @return the value of commodity_property.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_property.id
     *
     * @param id the value for commodity_property.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_property.commodity_id
     *
     * @return the value of commodity_property.commodity_id
     *
     * @mbggenerated
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_property.commodity_id
     *
     * @param commodityId the value for commodity_property.commodity_id
     *
     * @mbggenerated
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_property.property_id
     *
     * @return the value of commodity_property.property_id
     *
     * @mbggenerated
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_property.property_id
     *
     * @param propertyId the value for commodity_property.property_id
     *
     * @mbggenerated
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_property.property_value
     *
     * @return the value of commodity_property.property_value
     *
     * @mbggenerated
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_property.property_value
     *
     * @param propertyValue the value for commodity_property.property_value
     *
     * @mbggenerated
     */
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue == null ? null : propertyValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_property.quantity
     *
     * @return the value of commodity_property.quantity
     *
     * @mbggenerated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_property.quantity
     *
     * @param quantity the value for commodity_property.quantity
     *
     * @mbggenerated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}