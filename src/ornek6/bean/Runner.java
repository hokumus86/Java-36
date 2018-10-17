package ornek6.bean;

public class Runner {

	
	public static void main(String[] args) {
		Insan temp = new Insan();
		temp.adi="hüseyin";
		temp.anne = new Insan();
		temp.anne.adi = "Sultan";
		temp.baba.adi = "Ahmet";
		temp.baba.anne = new Insan();
		temp.baba.anne.adi ="Esma";		
		temp.anne.baba.adi = "Haþim";
		System.out.println(temp.adi);
		System.out.println(temp.anne.adi);
		System.out.println(temp.baba.adi);
		System.out.println(temp.baba.anne.adi);
		System.out.println(temp.anne.baba.adi);
		

	}

}
