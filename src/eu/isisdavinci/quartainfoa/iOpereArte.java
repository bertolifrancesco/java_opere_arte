package eu.isisdavinci.quartainfoa;

public interface iOpereArte {
	public void inserimento(OperaArte o);
	public boolean eliminazione(String titolo);
	public OperaArte ricerca(String titolo);
	public void stampaPerArtista(String artista);
	public void stampaIngombro(OperaArte o);
	public void serializable();
	public void deserializable();
}
