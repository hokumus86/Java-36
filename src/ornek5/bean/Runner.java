package ornek5.bean;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Insan temp =new Insan();
		temp.adi = "Hüseyin";
		temp.anne = new Insan();
		temp.anne.adi="Sultan";
		temp.anne.anne = new Insan();
		temp.anne.anne.adi = "Döne";
		System.out.println(temp.adi);
		System.out.println("     " + temp.anne.adi);
		System.out.println("                " +temp.anne.anne.adi);
		
	
	}

}
