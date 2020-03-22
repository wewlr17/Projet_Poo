package com.b2.mysql.beans;

public class Joue {
	private Film m_film;
	private Acteur m_acteur;
	private String m_role;

	public Joue(Film film, Acteur acteur, String role) {
		m_film = film;
		m_acteur = acteur;
		m_role = role;

	}
	
	public Film getFilm() {
		return m_film;
	}
	
	public Acteur getActeur() {
		return m_acteur;
	}
	
	public String getRole() {
		return m_role;
	}

	public String toString() {
		String titre=m_role;
		return "["+m_acteur+"]"+" "+m_film+" "+""+titre+"";
	}
	
	
}