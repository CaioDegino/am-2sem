package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ITEM_EFFECT database table.
 * 
 */
@Entity
@Table(name="ITEM_EFFECT")
@SequenceGenerator(name="ITEM_EFFECT_CODITEEFF_GENERATOR", sequenceName="SEQ_ITEM_EFFECT")
public class ItemEffect implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEM_EFFECT_CODITEEFF_GENERATOR")
	@Column(name="COD_ITE_EFF")
	private long id;

	@Column(name="ITE_EFF_VALUE")
	private Long value;

	@ManyToOne
	@JoinColumn(name="ATTRIBUTE_TYPE_COD_ATT_TYP")
	private AttributeType attributeType;

	//bi-directional many-to-many association to Item
	@ManyToMany
	@JoinTable(
		name="ITE_ITE_EFF"
		, joinColumns={
			@JoinColumn(name="ITEM_EFFECT_COD_ITE_EFF")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ITEM_COD_ITEM")
			}
		)
	private List<Item> items;

	public ItemEffect() {
	}

	public long getCodIteEff() {
		return this.codIteEff;
	}

	public void setCodIteEff(long codIteEff) {
		this.codIteEff = codIteEff;
	}

	public BigDecimal getIteEffValue() {
		return this.iteEffValue;
	}

	public void setIteEffValue(BigDecimal iteEffValue) {
		this.iteEffValue = iteEffValue;
	}

	public AttributeType getAttributeType() {
		return this.attributeType;
	}

	public void setAttributeType(AttributeType attributeType) {
		this.attributeType = attributeType;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}