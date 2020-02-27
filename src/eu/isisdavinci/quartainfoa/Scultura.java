package eu.isisdavinci.quartainfoa;

import java.io.Serializable;

public class Scultura extends OperaArte implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float altezza;
	private float larghezza;
	private float profondita;

	public Scultura(String titolo, String artista, float altezza, float larghezza, float profondita) {
		super(titolo, artista);
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
	}

	public float getAltezza() {
		return altezza;
	}

	public float getLarghezza() {
		return larghezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public void setLarghezza(float larghezza) {
		this.larghezza = larghezza;
	}

	public float getProfondita() {
		return profondita;
	}

	public void setProfondita(float profondita) {
		this.profondita = profondita;
	}

	public float ingombro() {
		return this.altezza * this.larghezza * this.profondita;
	}

}