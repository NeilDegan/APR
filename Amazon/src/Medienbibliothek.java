
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