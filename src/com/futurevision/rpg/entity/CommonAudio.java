package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COMMON_AUDIO database table.
 * 
 */
@Entity
@Table(name="COMMON_AUDIO")
public class CommonAudio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMMON_AUDIO_ID_GENERATOR", sequenceName="SEQ_COMMON_AUDIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMMON_AUDIO_ID_GENERATOR")
	@Column(name="COD_COM_AUD")
	private long id;

	@Lob
	private byte[] audio;

	private String description;

	private String name;

	public CommonAudio() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public byte[] getAudio() {
		return this.audio;
	}

	public void setAudio(byte[] audio) {
		this.audio = audio;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}