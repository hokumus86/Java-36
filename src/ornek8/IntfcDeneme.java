package ornek8;

public class IntfcDeneme implements IDatabase{

	public void Test() {
		System.out.println("Test �al��t�");
	}

	public void Yaz() {
		System.out.println("Yaz �al��t�");		
	}
	
	public void Test(int sayi){
		System.out.println("Test integer de�er alan  �al��t�");
	}
	
	public void Test(String adi){
		System.out.println("Test �al��t�" + adi);
	}
	

	

}
