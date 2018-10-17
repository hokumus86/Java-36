package ornek9;

public class InsanYalniz implements IBulasiciHastalik, IBulasmayanHastalik {
	
	private String seker;
	private String tansiyon;
	protected String grip;
	protected String verem;
	
	public InsanYalniz() {
		
		System.out.println("Yalnýz bir Ýnsan çalýþtý;");
		Tansiyon();
		Verem();
		Seker_Hastaligi();
		Grip();
	}

	public void Seker_Hastaligi() {
		System.out.println("Bulaþýcý deðil kalýtýmla geçer. Þeker Hastalýðý");
		
	}

	public void Tansiyon() {
		System.out.println("Bulaþýcý deðil kalýtýmla geçer. Tansiyon");
		
	}

	public void Grip() {
		System.out.println("Bulaþýcý hastalýk çevrede varsa bulaþabilir. Grip ");
		
	}

	public void Verem() {
		System.out.println("Bulaþýcý hastalýk çevrede varsa bulaþabilir. Verem");
		
	}

	

}
