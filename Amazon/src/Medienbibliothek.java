
import java.util.ArrayList;

public class Medienbibliothek {
	
	private ArrayList<Medium> medienliste;

	public Medienbibliothek() {
		this.medienliste = new ArrayList<>();
	}
	
	public void mediumHinzufügen(Medium m)
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
	
	public String suchen(String such)
	{
            for (Medium medium : medienliste) {
                if (medium.getTitel().toLowerCase().equals(such.toLowerCase())) {
                medium.anzeigen();
                }
            }
	
	}
}