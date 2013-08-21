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
	private Long id;

	@Column(name = "ALLOW_PROVISION")
	private Boolean allowProvision;

	private Boolean flee;

	@Column(name = "LUCK_TEST")
	private Boolean luckTest;

	@Lob
	@Column(name = "AUDIO_AMBIENCE")
	private Byte[] audioAmbience;

	@Lob
	@Column(name = "AUDIO_DESCRIPTION")
	private Byte[] audioDescription;

	private String description;

	@ManyToOne
	@JoinColumn(name = "COD_CAM")
	private Campaign campaign;

	@OneToMany
	private List<ScenarioSelection> scenarioSelections;

	@JoinColumn(name = "COD_SCE_ITE")
	private List<SceCha> sceChas;

	@OneToMany
	@JoinColumn(name = "COD_SCE_ITE")
	private List<SceIte> sceItes;

	public Scenario() {
	}

	public Byte[] getAudioAmbience() {
		return audioAmbience;
	}

	public void setAudioAmbience(Byte[] audioAmbience) {
		this.audioAmbience = audioAmbience;
	}

	public Byte[] getAudioDescription() {
		return audioDescription;
	}

	public void setAudioDescription(Byte[] audioDescription) {
		this.audioDescription = audioDescription;
	}

	public Long getId() {
		return id;
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

	public List<SceCha> getSceChas() {
		return this.sceChas;
	}

	public void setSceChas(List<SceCha> sceChas) {
		this.sceChas = sceChas;
	}

	public List<ScenarioSelection> getScenarioSelections() {
		return scenarioSelections;
	}

	public void setScenarioSelections(List<ScenarioSelection> scenarioSelections) {
		this.scenarioSelections = scenarioSelections;
	}

	public List<SceIte> getSceItes() {
		return sceItes;
	}

	public void setSceItes(List<SceIte> sceItes) {
		this.sceItes = sceItes;
	}

}