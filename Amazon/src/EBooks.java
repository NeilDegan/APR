
public class EBooks extends Medium {
	
	private String autor;
	private int isbn;
	private int seitenanzahl;
	private int auflage;
	
	public EBooks(String autor, int isbn, int seitenanzahl, int auflage, String titel, String genre, String kommentar, String erscheinungsdatum) {
        super(titel, genre, kommentar, erscheinungsdatum);
        this.autor = autor;
        this.isbn = isbn;
        this.seitenanzahl = seitenanzahl;
        this.auflage = auflage;
    }

		public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public int getIsbn() {
	        return isbn;
	    }

	    public void setIsbn(int isbn) {
	        this.isbn = isbn;
	    }

	    public int getSeitenanzahl() {
	        return seitenanzahl;
	    }

	    public void setSeitenanzahl(int seitenanzahl) {
	        this.seitenanzahl = seitenanzahl;
	    }

	    public int getAuflage() {
	        return auflage;
	    }

	    public void setAuflage(int auflage) {
	        this.auflage = auflage;
	    }
	
	    @Override
	    public void anzeigen()
		{
			System.out.println("EBook: Titel -> " + this.getTitel() + " Autor -> " + this.getAutor() + " Genre -> " + this.getGenre() + " Erscheinungsdatum -> " + this.getErscheinungsdatum() + " ISBN -> " + this.getIsbn() + " Seitenanzahl -> " + this.getSeitenanzahl() + " Auflage -> " + this.getAuflage() + " Kommentar -> " + this.getKommentar());
		}
	
}
