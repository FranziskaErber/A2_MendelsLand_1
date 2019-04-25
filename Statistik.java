package mendelsLand;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Statistik
{
	private List<Schmetterling> kinder = new ArrayList<Schmetterling>();
	private Map<String, Integer> sammelTrommel = new HashMap<String, Integer>();
	//Map mStat = new HashMap();
	
	public Statistik(List<Schmetterling> kinder){
		this.kinder = kinder;
	}
	
	public void allgStatistik(List< Schmetterling > lingsKinder, Schmetterling ma, Schmetterling pa){
		ArrayList< Schmetterling > ABC = new ArrayList<Schmetterling>();
		ArrayList< Schmetterling > ABc = new ArrayList<Schmetterling>();
		ArrayList< Schmetterling > AbC = new ArrayList<Schmetterling>();
		ArrayList< Schmetterling > Abc = new ArrayList<Schmetterling>();
		ArrayList< Schmetterling > aBC = new ArrayList<Schmetterling>();
		ArrayList< Schmetterling > aBc = new ArrayList<Schmetterling>();
		ArrayList< Schmetterling > abC = new ArrayList<Schmetterling>();
		ArrayList< Schmetterling > abc = new ArrayList<Schmetterling>();
		 //Merkmal n = new Merkmal() ;
		 //n.getFarbe(1);
		for(Schmetterling s : lingsKinder){
			if(s.getMuster() == ma.getMuster()){
				if(s.getFarbe() == ma.getFarbe()){
					if(s.getForm() == ma.getForm()){
						ABC.add(s);
					}
					else{
						ABc.add(s);
					}
				}
				else{
					if(s.getForm() == ma.getForm()){
						AbC.add(s);
					}
					else{
						Abc.add(s);
					}
				}
			}
			else{
				if(s.getFarbe() == ma.getFarbe()){
					if(s.getForm() == ma.getForm()){
						aBC.add(s);
					}
					else{
						aBc.add(s);
					}
				}
				else{
					if(s.getForm() == ma.getForm()){
						abC.add(s);
					}
					else{
						abc.add(s);
					}
				}
			}
		}
		
		String aStatistik = "Die Kombination: " + ma.getMuster() + ", " + ma.getFarbe() + ", " + ma.getForm() + " gibt es: " + ABC.size() + " Mal.\n"
		+ "Die Komination: " + ma.getMuster() + ", " + ma.getFarbe() + ", " + pa.getForm() + " gibt es: " + ABc.size() + " Mal.\n"
		+ "Die Komination: " + ma.getMuster() + ", " + pa.getFarbe() + ", " + ma.getForm() + " gibt es: " + AbC.size() + " Mal.\n"
		+ "Die Komination: " + ma.getMuster() + ", " + pa.getFarbe() + ", " + pa.getForm() + " gibt es: " + Abc.size() + " Mal.\n"
		+ "Die Komination: " + pa.getMuster() + ", " + ma.getFarbe() + ", " + ma.getForm() + " gibt es: " + aBC.size() + " Mal.\n"
		+ "Die Komination: " + pa.getMuster() + ", " + ma.getFarbe() + ", " + pa.getForm() + " gibt es: " + aBc.size() + " Mal.\n"
		+ "Die Komination: " + pa.getMuster() + ", " + pa.getFarbe() + ", " + ma.getForm() + " gibt es: " + abC.size() + " Mal.\n"
		+ "Die Komination: " + pa.getMuster() + ", " + pa.getFarbe() + ", " + pa.getForm() + " gibt es: " + abc.size() + " Mal.\n";
		
		System.out.println(aStatistik);
	}
	
	
	public Map<String, Integer> verbliebeneMerkmale(List< Schmetterling > lK, String m){
		int v = 0;
		
		for (Schmetterling s : lK){
			if (s.getMuster().equals(m)){
				String merkmale = s.getFarbe() + s.getForm();
				if (sammelTrommel.containsKey(merkmale)){
					v = sammelTrommel.get(merkmale) + 1;
					sammelTrommel.put(merkmale, v);
				}
				else{
					sammelTrommel.put(merkmale, 1);
				}
			}
			
			else if(s.getFarbe().equals(m)){
				String merkmale = s.getMuster() + s.getForm();
				if (sammelTrommel.containsKey(merkmale)){
					v = sammelTrommel.get(merkmale) + 1;
					sammelTrommel.put(merkmale, v);
				}
				else{
					sammelTrommel.put(merkmale, 1);
				}
			}
			
			else if(s.getForm().equals(m)){
				String merkmale = s.getMuster() + s.getFarbe();
				if (sammelTrommel.containsKey(merkmale)){
					v = sammelTrommel.get(merkmale) + 1;
					sammelTrommel.put(merkmale, v);
				}
				else{
					sammelTrommel.put(merkmale, 1);
				}
			}
					
		}
		
		return sammelTrommel;
	}


	public void outVerbliebeneMerkmale(Map map){
		Iterator it = map.entrySet().iterator();
	    while (it.hasNext()){
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        it.remove();
	    }
	}
	
}
