package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;

/**
 * The persistent class for the SCENARIO database table.
 * 
 */
@Entity
@SequenceGenerator(name = "SCENARIO_CODSCE_GENERATOR", sequenceName = "SEQ_SCENARIO")
public class Scenario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SCENARIO_CODSCE_GENERATOR")
	@Column(name = "COD_SCE")
	private long codSce;

	@Column(name = "ALLOW_PROVISION")
	private Boolean allowProvision;

	@Lob
	@Column(name = "AUDIO_AMBIENCE")
	private byte[] audioAmbience;

	@Lob
	@Column(name = "AUDIO_DESCRIPTION")
	private byte[] audioDescription;

	private String description;

	private Boolean flee;

	@Column(name = "LUCK_TEST")
	private Boolean luckTest;

	@ManyToOne
	@JoinColumn(name = "COD_CAM")
	private Campaign campaign;

	@OneToMany
	private List<ScenarioSelection> scenarioSelections;

	@OneToMany
	private List<SceCha> sceChas;

	@OneToMany
	@JoinColumn(name = "COD_SCE_ITE")
	private List<SceIte> sceItes;


	public Scenario() {
	}

	public long getCodSce() {
		return this.codSce;
	}

	public void setCodSce(long codSce) {
		this.codSce = codSce;
	}


	public byte[] getAudioAmbience() {
		return this.audioAmbience;
	}

	public void setAudioAmbience(byte[] audioAmbience) {
		this.audioAmbience = audioAmbience;
	}

	public byte[] getAudioDescription() {
		return this.audioDescription;
	}

	public void setAudioDescription(byte[] audioDescription) {
		this.audioDescription = audioDescription;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getAllowProvision() {
		return allowProvision;
	}

	public void setAllowProvision(Boolean allowProvision) {
		this.allowProvision = allowProvision;
	}

	public Boolean getFlee() {
		return flee;
	}

	public void setFlee(Boolean flee) {
		this.flee = flee;
	}

	public Boolean getLuckTest() {
		return luckTest;
	}

	public void setLuckTest(Boolean luckTest) {
		this.luckTest = luckTest;
	}

	public Campaign getCampaign() {
		return this.campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public List<ScenarioSelection> getScenarioSelections1() {
		return this.scenarioSelections1;
	}

	public void setScenarioSelections1(
			List<ScenarioSelection> scenarioSelections1) {
		this.scenarioSelections1 = scenarioSelections1;
	}

	public List<SceCha> getSceChas() {
		return this.sceChas;
	}

	public void setSceChas(List<SceCha> sceChas) {
		this.sceChas = sceChas;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<ScenarioSelection> getScenarioSelections2() {
		return this.scenarioSelections2;
	}

	public void setScenarioSelections2(
			List<ScenarioSelection> scenarioSelections2) {
		this.scenarioSelections2 = scenarioSelections2;
	}

}