package com.o2o_school.entity;

import java.util.List;

import net.sf.json.JSONObject;

public class CategoryParent {
    private Integer id;
    private String name;
    private String description;
    private List<Category> categorys;
    private List<Commodity> comoditys;
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_parent.id
     *
     * @param id the value for category_parent.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_parent.name
     *
     * @return the value of category_parent.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_parent.name
     *
     * @param name the value for category_parent.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_parent.description
     *
     * @return the value of category_parent.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_parent.description
     *
     * @param description the value for category_parent.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	public List<Category> getCategorys() {
		return categorys;
	}

	public void setCategorys(List<Category> categorys) {
		this.categorys = categorys;
	}

	public List<Commodity> getComoditys() {
		return comoditys;
	}

	public void setComoditys(List<Commodity> comoditys) {
		this.comoditys = comoditys;
	}

	@Override
	public String toString() {
		String str = JSONObject.fromObject(this).toString();
		return str;
	}
	
	
    
}