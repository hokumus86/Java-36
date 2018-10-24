package ornek16.except;

public class HataSinif extends Exception{
	private int hataKodu;
	HataSinif(int hataKodu, String mesaj){
		super(mesaj);
		this.hataKodu=hataKodu;
	}
	public int getHataKodu() {
		return hataKodu;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hata kod " + this.hataKodu + " : Hatanýn mesajý:  " +super.getMessage();
	}
	
	
	

}
