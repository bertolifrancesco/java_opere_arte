package eu.isisdavinci.quartainfoa;

import java.io.Serializable;

public class Quadro extends OperaArte implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float altezza;
	private float larghezza;

	public Quadro(String titolo, String artista, float altezza, float larghezza) {
		super(titolo, artista);
		this.altezza = altezza;
		this.larghezza = larghezza;
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

	public float ingombro(){
		return this.altezza * this.larghezza;
	}

}