public class App {
	public static void main(String[] args)
	{
		Medienbibliothek bib = new Medienbibliothek();
		
		Film wolf = new Film("Scorsecci", "120min", false, true, "The Wolf of Wall Street", "Drama", "Ist gut", "2002")
		bib.alleMedienAusgeben();
		
		System.out.println("");
		System.out.println("--- alle VHS in der Liste ---");
		for(VHS vhs : bib.alleVHSalsListe())
		{
			vhs.anzeigen();
		}
	}
}
