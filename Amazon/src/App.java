public class App {
	public static void main(String[] args)
	{
		Medienbibliothek bib = new Medienbibliothek();
		
		Filme wolf = new Filme("Scorsecci", "120min", false, true, "The Wolf of Wall Street", "Drama", "Ist gut", "2002")
		bib.mediumHinzuf�gen(wolf);
		
		for(Medien m:medienliste) {
			m.anzeigen();
		}
	}
}
