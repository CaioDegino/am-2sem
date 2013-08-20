package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ITEM database table.
 * 
 */
@Entity
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEM_ID_GENERATOR", sequenceName="SEQ_ITEM")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEM_ID_GENERATOR")
	@Column(name="COD_ITEM")
	private long id;

	@Lob
	@Column(name="AUDIO_DESCRIPTION")
	private byte[] audioDescription;

	@Lob
	@Column(name="AUDIO_NAME")
	private byte[] audioName;

	private String description;

	private String handle;

	@Lob
	private byte[] img;

	private String name;

	//bi-directional many-to-one association to ChaIte
	@OneToMany(mappedBy="item")
	private List<ChaIte> chaItes;

	//bi-directional many-to-many association to ItemEffect
	@ManyToMany(mappedBy="items")
	private List<ItemEffect> itemEffects;

	//bi-directional many-to-many association to Scenario
	@ManyToMany(mappedBy="items")
	private List<Scenario> scenarios;

	public Item() {
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

	public byte[] getAudioName() {
		return this.audioName;
	}

	public void setAudioName(byte[] audioName) {
		this.audioName = audioName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHandle() {
		return this.handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public byte[] getImg() {
		return this.img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ChaIte> getChaItes() {
		return this.chaItes;
	}

	public void setChaItes(List<ChaIte> chaItes) {
		this.chaItes = chaItes;
	}

	public List<ItemEffect> getItemEffects() {
		return this.itemEffects;
	}

	public void setItemEffects(List<ItemEffect> itemEffects) {
		this.itemEffects = itemEffects;
	}

	public List<Scenario> getScenarios() {
		return this.scenarios;
	}

	public void setScenarios(List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}

}