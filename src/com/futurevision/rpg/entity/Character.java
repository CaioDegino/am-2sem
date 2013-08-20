package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the "CHARACTER" database table.
 * 
 */
@Entity
@Table(name = "GAME_CHARACTER")
@SequenceGenerator(name = "GAME_CHARACTER_ID_GENERATOR", sequenceName = "SEQ_GAME_CHARACTER")
public class Character implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GAME_CHARACTER_ID_GENERATOR")
	@Column(name = "COD_CHA")
	private long id;

	@Lob
	@Column(name = "AUDIO_NAME")
	private byte[] audioName;

	@Lob
	private byte[] img;

	private String name;

	private Long xp;

	@OneToMany()
	@JoinColumn(name = "COD_ATT")
	private List<Attribute> attributes;

	@ManyToOne
	@JoinColumn(name = "COD_GAM_USE")
	private GameUser gameUser;

	@OneToMany
	@JoinColumn(name = "COD_CHA_ITE")
	private List<ChaIte> chaItes;

	public Character() {
	}

	public long getId() {
		return this.id;
	}

	public Long getXp() {
		return xp;
	}

	public void setXp(Long xp) {
		this.xp = xp;
	}

	public byte[] getAudioName() {
		return this.audioName;
	}

	public void setAudioName(byte[] audioName) {
		this.audioName = audioName;
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

	public List<Attribute> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public GameUser getGameUser() {
		return this.gameUser;
	}

	public void setGameUser(GameUser gameUser) {
		this.gameUser = gameUser;
	}

	public List<ChaIte> getChaItes() {
		return this.chaItes;
	}

	public void setChaItes(List<ChaIte> chaItes) {
		this.chaItes = chaItes;
	}

}