package ornek2;

public class Motosiklet {
	private int tekerlekSayisi;
	
	public Motosiklet() {
		this(3);
		System.out.println(tekerlekSayisi);
		tekerlekSayisi = 2;
		System.out.println("5");		
	}
	
	private  Motosiklet(int tsayisi){
		System.out.println("7");
		tekerlekSayisi= tsayisi;
		System.out.println(tekerlekSayisi);
	}
	
	public int getTekerlekSayisi (){
		return tekerlekSayisi;
	}
	
	public void setTekerlekSayisi(int tsayisi){
		System.out.println("10");
		this.tekerlekSayisi =tsayisi;
	}
}
