package ornek7;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		D d = new D();
		d.adi = "h�seyin";
		d.bAdi = "Okumu�";
		B b = new B();
		b.adi= "Furkan";
		b.bAdi = "Gizem";
		System.out.println(d.adi + "	 D class Adi de�eri");
		System.out.println(d.bAdi + " 	D class bAdi de�eri");
		System.out.println(b.adi + " 	B class Adi de�eri");
		System.out.println(b.bAdi + "	 B class bAdi de�eri");
		System.out.println(d.hiz + " D class hiz de�eri");
		d.hiz = 200;
		System.out.println(d.hiz + " D class hiz de�eri");
		C c= new C();
	
		
	}

}
