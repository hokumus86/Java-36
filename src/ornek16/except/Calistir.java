package ornek16.except;

public class Calistir {
	
	public static double Hesapla(int sayi, int sayi1)throws HataSinif{
		if(sayi ==5){
			HataSinif hata = new HataSinif(101,"Burada bir hata olu�tu");
			throw hata;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Ba�lad�");
		try {
			double sonuc = Hesapla(5, 1);
			System.out.println(sonuc);
		} catch (HataSinif e) {
			System.out.println("hatan�n mesaj� " + e.getMessage());
		}
		System.out.println("program bitti");
	}

}
