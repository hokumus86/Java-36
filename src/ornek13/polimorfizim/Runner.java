package ornek13.polimorfizim;

public class Runner {
	
	public static void AgaciTestEt(Object a){
		if(a instanceof String){
			Agac temp = (Agac)a;
			temp.getTur();
			temp.Test();
		}
		else if(a instanceof CamAgaci){
			
		}
		
	}
	
	public static void AgaciTestEt(Agac a){
			a.getTur();
			a.Test();		
	}
	
	public static void Hesapla(int sayi){
		
	}
	
	public static void main(String[] args) {
		CamAgaci c = new  CamAgaci();
		AgaciTestEt(c);
		MeseAgaci m = new MeseAgaci();
		AgaciTestEt(m);
		Agac a = new Agac();
		AgaciTestEt(a);
		AgaciTestEt("hüseyin");
		AgaciTestEt(new Integer(1));
	}

}
