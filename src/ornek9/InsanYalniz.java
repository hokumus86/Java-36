package ornek9;

public class InsanYalniz implements IBulasiciHastalik, IBulasmayanHastalik {
	
	private String seker;
	private String tansiyon;
	protected String grip;
	protected String verem;
	
	public InsanYalniz() {
		
		System.out.println("Yaln�z bir �nsan �al��t�;");
		Tansiyon();
		Verem();
		Seker_Hastaligi();
		Grip();
	}

	public void Seker_Hastaligi() {
		System.out.println("Bula��c� de�il kal�t�mla ge�er. �eker Hastal���");
		
	}

	public void Tansiyon() {
		System.out.println("Bula��c� de�il kal�t�mla ge�er. Tansiyon");
		
	}

	public void Grip() {
		System.out.println("Bula��c� hastal�k �evrede varsa bula�abilir. Grip ");
		
	}

	public void Verem() {
		System.out.println("Bula��c� hastal�k �evrede varsa bula�abilir. Verem");
		
	}

	

}
