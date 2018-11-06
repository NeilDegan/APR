
public class Medium {
	private String titel;
	private String genre;
	private String kommentar;
	private String erscheinungsdatum;

	public Medium(String titel, String genre, String kommentar, String erscheinungsdatum) {
		this.titel = titel;
		this.genre = genre;
		this.kommentar = kommentar;
		this.erscheinungsdatum = erscheinungsdatum;
	}
	
	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getKommentar() {
		return kommentar;
	}

	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}
	
	public String getErscheinungsdatum() {
		return erscheinungsdatum;
	}

	public void setErscheinungsdatum(String erscheinungsdatum) {
		this.erscheinungsdatum = erscheinungsdatum;
	}

	public void anzeigen()
	{
		System.out.println("Medium: Titel -> " + this.getTitel() + " Genre -> " + this.getGenre() + " Erscheinungsdatum -> " + this.getErscheinungsdatum() + " Kommentar -> " + this.getKommentar());
	}
}
