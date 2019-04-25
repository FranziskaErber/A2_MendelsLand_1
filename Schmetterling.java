package mendelsLand;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Schmetterling
{
	private String muster;
	private String farbe;
	private String form;
	private static Scanner scanner = new Scanner(System.in);

	/*
	 * Konstruktor, um einen Mutter- oder Vaterschmetterling zu erzeugen
	 */
	public Schmetterling(String mu, String fa, String fo)
	{
		this.muster = mu;
		this.farbe = fa;
		this.form = fo;
	}
	
	Random rand = new Random();
	
	/*
	 * Konstruktor, um ein Kindschmetterling zu erzeugen
	 */
	public Schmetterling(Schmetterling mutter, Schmetterling vater)
	{
		if (rand.nextInt(2) == 0)
		{
			this.muster = mutter.getMuster();
		}
		else
		{
			this.muster = vater.getMuster();
		}

		if (rand.nextInt(2) == 0)
		{
			this.farbe = mutter.getFarbe();
		}
		else
		{
			this.farbe = vater.getFarbe();
		}
		
		if (rand.nextInt(2) == 0)
		{
			this.form = mutter.getForm();
		}
		else
		{
			this.form = vater.getForm();
		}

	}
	
	public String getMuster()
	{
		return muster;
	}
	
	public String getFarbe()
	{
		return farbe;
	}
	
	public String getForm()
	{
		return form;
	}
	
	/*
	 * Methode, mit welcher aus den Eingaben Eltern-Schmetterlinge erzeugt werden können
	 */
	public static Schmetterling erzeugeEltern()
	{
		try
		{
			String input = scanner.nextLine();
			String[] ling = input.split(",");
			
			Schmetterling eltern = new Schmetterling(ling[0], ling[1], ling[2]);
			return eltern;
		}
		catch (Exception e)
		{
			System.out.println("Da stimmt mit der Form der eingegebenen Merkmale etwas nicht, versuch es doch noch einmal! Einfach an die Vorgabe halten." + e.getMessage());
//hier wird der eingelesene Schmetterling aber nicht überschrieben!? o.O :
			Schmetterling eltern = new Schmetterling(null, null, null);
			return eltern;
		}
	}
	
	/*
	 * mit dieser Methode sollen 1000-2000 Kinder mit zufälligen Merkmalen von Mutter oder Vater erzeugt werden
	 */
	public static ArrayList<Schmetterling> naechsteGeneration(Schmetterling mutter, Schmetterling vater)
	{
		ArrayList< Schmetterling > kinder = new ArrayList<>();
		int k = anzKinder();
		
		for ( int i = 0; i < k; i++ )
		{
			Schmetterling s = new Schmetterling(mutter, vater);
			kinder.add(s);
		}
		
		return kinder;
	}
	
	/*
	 * mit dieser Methode wir zufällig bestimmt, wie viele Kinder es in der nächsten Generation gibt
	 */
	public static int anzKinder()
	{
		return (int)( Math.random() * 1001 ) + 1000;
	}
	
	@Override
	public String toString()
	{
		String details = "Muster: " + this.muster
				+ "; Farbe: " + this.farbe
				+ "; Form: " + this.form;
		return details;
	}
	
/*	public Schmetterling erzeugeKind(String[] merkmale)
	{
		scanner.next
		Schmetterling kind = new Schmetterling(muster, farbe, form);
		return kind;
	}
	
	uni, rot, gekrümmt
*/	
	
}
