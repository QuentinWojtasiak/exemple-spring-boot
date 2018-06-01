package dev.exemple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXEMPLE")
public class Exemple {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	public Exemple() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChamp1() {
		return champ1;
	}

	public void setChamp1(String champ1) {
		this.champ1 = champ1;
	}

	public String getChamp2() {
		return champ2;
	}

	public void setChamp2(String champ2) {
		this.champ2 = champ2;
	}

	@Column(name = "CHAMP_1")
	private String champ1;

	@Column(name = "CHAMP_2")
	private String champ2;

}