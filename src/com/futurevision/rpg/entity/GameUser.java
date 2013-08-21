package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the GAME_USER database table.
 * 
 */
@Entity
@Table(name = "GAME_USER")
@SequenceGenerator(name = "GAME_USER_ID_GENERATOR", sequenceName = "SEQ_GAME_USER")
public class GameUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GAME_USER_ID_GENERATOR")
	@Column(name = "COD_GAM_USE")
	private Long id;

	@Lob
	@Column(name = "AUDIO_USERNAME")
	private Byte[] audioUsername;

	private String email;

	private String name;

	private String password;

	private String username;

	@OneToMany(mappedBy = "gameUser")
	private List<Character> characters;

	public GameUser() {
	}

	public Byte[] getAudioUsername() {
		return audioUsername;
	}

	public void setAudioUsername(Byte[] audioUsername) {
		this.audioUsername = audioUsername;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Character> getCharacters() {
		return this.characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

}