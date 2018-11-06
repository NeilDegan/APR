import java.util.Scanner;

public class App {

	public static void main(String[] args)
	{
		Medienbibliothek bib = new Medienbibliothek();
		
		Filme wolf = new Filme("Scorsecci", "120min", false, true, "The Wolf of Wall Street", "Drama", "Ist gut", "2002");
		Filme star = new Filme("Lucas", "200min", false, false, "Star Wars VI", "Si-Fi", "Ist sehr gut", "1966");
		
		bib.mediumHinzufügen(wolf);
		bib.mediumHinzufügen(star);
		bib.alleMedienAusgeben();
		
		Scanner scan = new Scanner;
		String s = scan.nextLine();
		bib.suchen(s);
	}
}