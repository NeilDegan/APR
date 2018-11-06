public class Filme extends Medium {

    private String regisseur;
    private String spielzeit;
    private boolean uhd;
    private boolean hd;

    public boolean isHd() {
        return hd;
    }

    public void setHd(boolean hd) {
        this.hd = hd;
    }

    public boolean isUhd() {
        return uhd;
    }

    public void setUhd(boolean uhd) {
        this.uhd = uhd;
    }

    public String getSpielzeit() {
        return spielzeit;
    }

    public void setSpielzeit(String spielzeit) {
        this.spielzeit = spielzeit;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }
    
    public void anzeigen()
	{
		super.anzeigen();
		System.out.println("Wer ist der Regisseur -> " + this.getRegisseur() + " Was ist die laufzeit -> " + this.getSpielzeit() + " Ist  UHD verfügbar -> " + this.isUhd() + " Ist  HD verfügbar -> " + this.isHd());
	}
}