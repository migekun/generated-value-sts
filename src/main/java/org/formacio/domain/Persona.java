package org.formacio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PERSONES")
public class Persona {

	/*
	 * Definicio d'una sequencia:
	 * @SequenceGenerator(name="sequencia_persones", sequenceName="SEQ_PER")
	 * 
	 * Us de l'estrategia sequencia per generar claus primaries: 
	 * @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequencia_persones")
	 * 
	 * Us de l'estrategia identity
	 * @GeneratedValue(strategy=GenerationType.IDENTITY)
	 * 
	 * Us de l'estrategia "tria la base de dades"
	 * @GeneratedValue(strategy=GenerationType.AUTO)
	 */
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PER_ID")
	private Long id;
	
	@Column(name="PER_NOM")
	private String nom;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nom=" + nom + "]";
	}
	
	
}
