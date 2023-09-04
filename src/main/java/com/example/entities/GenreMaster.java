package com.example.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class GenreMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long genreId;

	private String genreDesc;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "languageId")
	private LanguageMaster language;

	public Long getGenreId() {
		return genreId;
	}

	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}

	public String getGenreDesc() {
		return genreDesc;
	}

	public void setGenreDesc(String genreDesc) {
		this.genreDesc = genreDesc;
	}

	public LanguageMaster getLanguage() {
		return language;
	}

	public void setLanguage(LanguageMaster language) {
		this.language = language;
	}

}
