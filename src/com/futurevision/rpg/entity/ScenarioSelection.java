package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SCENARIO_SELECTION database table.
 * 
 */
@Entity
@Table(name="SCENARIO_SELECTION")
public class ScenarioSelection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SCENARIO_SELECTION_DI_GENERATOR", sequenceName="SEQ_SCENARIO_SELECTION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SCENARIO_SELECTION_DI_GENERATOR")
	@Column(name="COD_SCE_SEL")
	private long di;

	@Lob
	@Column(name="AUDIO_DESCRIPTION")
	private byte[] audioDescription;

	private String description;

	//bi-directional many-to-one association to Scenario
	@ManyToOne
	@JoinColumn(name="COD_SCE")
	private Scenario scenario;

	//bi-directional many-to-many association to Scenario
	@ManyToMany
	@JoinTable(
		name="SCE_SCE_SEL"
		, joinColumns={
			@JoinColumn(name="SCENARIO_SELECTION_COD_SCE_SEL")
			}
		, inverseJoinColumns={
			@JoinColumn(name="SCENARIO_COD_SCE")
			}
		)
	private List<Scenario> scenarios;

	public ScenarioSelection() {
	}

	public long getDi() {
		return this.di;
	}

	public void setDi(long di) {
		this.di = di;
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

	public Scenario getScenario() {
		return this.scenario;
	}

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	public List<Scenario> getScenarios() {
		return this.scenarios;
	}

	public void setScenarios(List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}

}