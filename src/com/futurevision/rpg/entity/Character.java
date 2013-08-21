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
	private Long id;

	@Lob
	@Column(name = "AUDIO_NAME")
	private Byte[] audioName;

	@Lob
	private Byte[] img;

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

	public Byte[] getAudioName() {
		return audioName;
	}

	public void setAudioName(Byte[] audioName) {
		this.audioName = audioName;
	}

	public Byte[] getImg() {
		return img;
	}

	public void setImg(Byte[] img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getXp() {
		return xp;
	}

	public void setXp(Long xp) {
		this.xp = xp;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public GameUser getGameUser() {
		return gameUser;
	}

	public void setGameUser(GameUser gameUser) {
		this.gameUser = gameUser;
	}

	public List<ChaIte> getChaItes() {
		return chaItes;
	}

	public void setChaItes(List<ChaIte> chaItes) {
		this.chaItes = chaItes;
	}

	public Long getId() {
		return id;
	}

}