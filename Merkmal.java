package mendelsLand;

/**
 * ? Brauchen wir diese Klasse wirklich??
 * @author chef
 *
 */

public class Merkmal
{
	private String[] musterA = {"kein Muster", "schwarze Punkte", "schwarze Streifen"};
	private String[] farbeA = {"rot", "gelb", "gruen", "blau"};
	private String[] formA = {"gerade", "gekruemmt"};
	//private String[] form = new String[3];
	
	private String musterS;
	private String farbeS;
	private String formS;
	
	public Merkmal() {
		
	}
	
	public Merkmal(String mu, String fa, String fo)
	{
		switch(mu){
			case "kein Muster":
				this.musterS = musterA[1];
				break;
			case "schwarze Punkte":
				this.musterS = musterA[2];
				break;
			case "schwarze Streifen":
				this.musterS = musterA[3];
				break;
			default:
				System.out.println("\nEs muss ein gueltiges Muster eingegeben werden!");
		}
		
		switch(fa){
			case "rot":
				this.farbeS = farbeA[1];
				break;
			case "gelb":
				this.farbeS = farbeA[2];
				break;
			case "gruen":
				this.farbeS = farbeA[3];
				break;
			case "blau":
				this.farbeS = farbeA[4];
				break;
			default:
				System.out.println("\nEs muss eine gueltige Farbe eingegeben werden!");
		}
		
		switch(fo){
			case "gerade":
				this.farbeS = farbeA[4];
				break;
			case "gekruemmt":
				this.farbeS = farbeA[4];
				break;
			default:
				System.out.println("\nEs muss eine gueltige Form eingegeben werden!");
		}
		
	}
	
	public String getMuster(int mu){
		return musterA[mu];
	}
	
	public String getFarbe(int fa){
		return farbeA[fa];
	}
	
	public String getForm(int fo){
		return formA[fo];
	}
	
	public boolean checkMerkmal(String merk){
		boolean check = false;
		for (String s : musterA) {
			if (s.equals(merk)) {
				check = true;
			}
		}
		
		if (!check) {
			for (String s : farbeA) {
				if (s.equals(merk)) {
					check = true;
				}
			}
			
			if (!check) {
				for (String s : formA) {
					if (s.equals(merk)) {
						check = true;
					}
				}
			}	
		}
		
		return check;
		
	}
}
