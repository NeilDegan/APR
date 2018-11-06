
import java.util.ArrayList;

public class Medienbibliothek {
	
	private ArrayList<Medium> medienliste;

	public Medienbibliothek() {
		this.medienliste = new ArrayList<>();
	}
	
	public void mediumHinzuf�gen(Medium m)
	{
		this.medienliste.add(m);
	}
	
	public void alleMedienAusgeben()
	{
		for(Medium m : medienliste)
		{
			System.out.println("+++++++++++++++++++");
			m.anzeigen();
		}
	}
	
	public void suchen(String s)
	{
            for (Medium medium : medienliste) {
                if (medium.getTitel().toLowerCase().equals(s.toLowerCase())) {
                medium.anzeigen();
                }
            }
	
	}
}