package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CAMPAIGN database table.
 * 
 */
@Entity
public class Campaign implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CAMPAIGN_ID_GENERATOR", sequenceName="SEQ_CAMPAIGN")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CAMPAIGN_ID_GENERATOR")
	@Column(name="COD_CAM")
	private long id;

	@Lob
	@Column(name="AUDIO_DESCRIPTION")
	private byte[] audioDescription;

	@Lob
	@Column(name="AUDIO_TITLE")
	private byte[] audioTitle;

	private String description;

	@Lob
	private byte[] img;

	private String title;

	//bi-directional many-to-one association to Scenario
	@OneToMany(mappedBy="campaign")
	private List<Scenario> scenarios;

	public Campaign() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public byte[] getAudioDescription() {
		return this.audioDescription;
	}

	public void setAudioDescription(byte[] audioDescription) {
		this.audioDescription = audioDescription;
	}

	public byte[] getAudioTitle() {
		return this.audioTitle;
	}

	public void setAudioTitle(byte[] audioTitle) {
		this.audioTitle = audioTitle;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getImg() {
		return this.img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Scenario> getScenarios() {
		return this.scenarios;
	}

	public void setScenarios(List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}

}