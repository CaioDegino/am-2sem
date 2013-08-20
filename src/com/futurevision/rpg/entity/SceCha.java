package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SCE_CHA database table.
 * 
 */
@Entity
@Table(name="SCE_CHA")
public class SceCha implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SceChaPK id;

	private BigDecimal quantity;

	//bi-directional many-to-one association to Character
	@ManyToOne
	private Character character;

	//bi-directional many-to-one association to Scenario
	@ManyToOne
	private Scenario scenario;

	public SceCha() {
	}

	public SceChaPK getId() {
		return this.id;
	}

	public void setId(SceChaPK id) {
		this.id = id;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Character getCharacter() {
		return this.character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Scenario getScenario() {
		return this.scenario;
	}

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

}