package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the ATTRIBUTE_TYPE database table.
 * 
 */
@Entity
@Table(name="ATTRIBUTE_TYPE")
@SequenceGenerator(name="ATTRIBUTE_TYPE_ID_GENERATOR", sequenceName="SEQ_ATTRIBUTE_TYPE")
public class AttributeType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ATTRIBUTE_TYPE_ID_GENERATOR")
	@Column(name="COD_ATT_TYP")
	private long id;

	@Lob
	@Column(name="AUDIO_DESCRIPTION")
	private byte[] audioDescription;

	@Lob
	@Column(name="AUDIO_NAME")
	private byte[] audioName;

	private String description;

	private String nome;

	@OneToMany(mappedBy="attributeType")
	private List<ItemEffect> itemEffects;

	public AttributeType() {
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

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Attribute> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public List<ItemEffect> getItemEffects() {
		return this.itemEffects;
	}

	public void setItemEffects(List<ItemEffect> itemEffects) {
		this.itemEffects = itemEffects;
	}

}