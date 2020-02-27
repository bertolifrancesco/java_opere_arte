package eu.isisdavinci.quartainfoa;

import java.util.ArrayList;
import java.util.List;

public class CollezioneOpereArte implements iOpereArte {
	List<OperaArte> collezioneOpereArte;
	private String nome;

	public CollezioneOpereArte(String nome) {
		collezioneOpereArte = new ArrayList<OperaArte>();
		this.nome = nome;
	}

	@Override
	public void inserimento(OperaArte o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean eliminazione(String titolo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OperaArte ricerca(String titolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void stampaPerArtista(String artista) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stampaIngombro(OperaArte o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serializable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deserializable() {
		// TODO Auto-generated method stub
		
	}

	
}