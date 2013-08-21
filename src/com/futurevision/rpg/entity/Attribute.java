package com.futurevision.rpg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 * The persistent class for the ATTRIBUTE database table.
 * 
 */
@Entity
@SequenceGenerator(name = "ATTRIBUTE_ID_GENERATOR", sequenceName = "SEQ_ATTRIBUTE")
public class Attribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ATTRIBUTE_ID_GENERATOR")
	@Column(name = "COD_ATT")
	private Long id;

	@Column(name = "ATT_VALUE")
	private Long value;

	private Long total;

	@ManyToOne
	@JoinColumn(name = "COD_ATT_TYP")
	private AttributeType attributeType;

	public Attribute() {
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public AttributeType getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(AttributeType attributeType) {
		this.attributeType = attributeType;
	}

	public Long getId() {
		return id;
	}

}