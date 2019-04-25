package mendelsLand;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Hier in Mendel's Land sind viele Schmetterlinge zuhause. Diese haben verschiedene Merkmale:\n"
				+ "Muster: kein Muster, schwarze Punkte, schwarze Streifen\n"
				+ "Flügelfarbe: rot, gelb, gruen, blau\n"
				+ "Flügelform: gerade, gekruemmt\n");
		Scanner c = new Scanner(System.in);
		List< Schmetterling > kinder = new ArrayList<Schmetterling>();
		
		do
		{
			System.out.println("Bitte eingeben: Wie sieht die Mutter aus?\nin folgender Schreibweise:\nMuster, Farbe, Form");
			Schmetterling mutter = Schmetterling.erzeugeEltern();
			//System.out.println(mutter.toString());
			
			System.out.println("Bitte nun ebenfalls eingeben: Wie sieht der Vater aus?\nauch in folgender Schreibweise:\nMuster, Farbe, Form");
			Schmetterling vater = Schmetterling.erzeugeEltern();
			//System.out.println(vater.toString());
			
			kinder = Schmetterling.naechsteGeneration(mutter, vater);
			
			/*for (Schmetterling e:kinder)
			{
				System.out.println(e);
			}*/
			
			System.out.println("In dieser Generation gibt es: " + kinder.size() + " neue Schmetterlinge.");
			
			Statistik allg = new Statistik(kinder);
			allg.allgStatistik(kinder, mutter, vater);
			
			System.out.println("Willst du nochmal neue Eltern eingeben?");
			//boolean x = c.nextBoolean();
		} 
		while (c.nextBoolean());
		
		System.out.println("Welches Merkmal haben alle Schmetterlinge, die du einsammeln möchtest?");
		String input = c.next();

// HMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
		if(merkmalMutter.checkMerkmal(input) || merkmalVater.checkMerkmal(input)) {
			Statistik verblM = new Statistik(kinder);
			Map<String, Integer> sonstM = verblM.verbliebeneMerkmale(kinder, input);
			verblM.outVerbliebeneMerkmale(sonstM);
		}
		else {
			System.out.println("Bitte ein gültiges Merkmal eingeben.");
		}
		
		
		
		
		
		
		//simuliere
		//Mutter und Vater erfragen - erledigt
		//soll erste Statistik ausgegeben werden ja/nein
		//soll nach einem Merkmal gefiltert werden ja/nein
		
		c.close();
	}
	

}
