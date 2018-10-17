package ornek2;

public class Insan {
	private String ad;
	private String soyad;
	private String tc;
	
	
	public Insan() {
		ad= "Ahmet";
	}
	public void setAd(String ad){
		this.ad= ad;
	}
	
	public String getAd(){
		return ad;
	}
	
	
	public void setSoyad(String soyAd){
		this.soyad= soyAd;
	}
	
	public String getSoyad(){
		return soyad;
	}
	
	public void setTc(String tc){
		if(tc.length()<=11){
			System.out.println("Yanlýþ Bir Tc girdiniz..");
		}else
		{
			this.tc= tc;
		}
	}
	
	public String getTc(){
		return tc;
	}
	
	
	

	

}
