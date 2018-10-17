package ornek8;

public class IntfcDeneme implements IDatabase{

	public void Test() {
		System.out.println("Test Çalýþtý");
	}

	public void Yaz() {
		System.out.println("Yaz Çalýþtý");		
	}
	
	public void Test(int sayi){
		System.out.println("Test integer deðer alan  Çalýþtý");
	}
	
	public void Test(String adi){
		System.out.println("Test Çalýþtý" + adi);
	}
	

	

}
