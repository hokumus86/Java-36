package ornek15.anotation.siniflar;

public class Cocuk {

	/*
	 * Yeni fonksiyonu a�a��ya yazd�m
	 */	
	@Deprecated
	@SuppressWarnings("unused")
	public void Deneme() {
		System.out.println("deneme �ocuk �al��t�");
	    int b=1;
		int a= 0;
	}
	
	@SuppressWarnings("unused")
	public void YeniDeneme() {
		System.out.println("Yeni deneme �ocuk �al��t�");
	    int b=1;
		int a= 0;
	}
	
	
}
