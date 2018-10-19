package ornek15.anotation.siniflar;

public class Cocuk {

	/*
	 * Yeni fonksiyonu aþaðýya yazdým
	 */	
	@Deprecated
	@SuppressWarnings("unused")
	public void Deneme() {
		System.out.println("deneme Çocuk Çalýþtý");
	    int b=1;
		int a= 0;
	}
	
	@SuppressWarnings("unused")
	public void YeniDeneme() {
		System.out.println("Yeni deneme Çocuk Çalýþtý");
	    int b=1;
		int a= 0;
	}
	
	
}
