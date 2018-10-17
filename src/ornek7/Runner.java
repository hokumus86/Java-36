package ornek7;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		D d = new D();
		d.adi = "hüseyin";
		d.bAdi = "Okumuþ";
		B b = new B();
		b.adi= "Furkan";
		b.bAdi = "Gizem";
		System.out.println(d.adi + "	 D class Adi deðeri");
		System.out.println(d.bAdi + " 	D class bAdi deðeri");
		System.out.println(b.adi + " 	B class Adi deðeri");
		System.out.println(b.bAdi + "	 B class bAdi deðeri");
		System.out.println(d.hiz + " D class hiz deðeri");
		d.hiz = 200;
		System.out.println(d.hiz + " D class hiz deðeri");
		C c= new C();
	
		
	}

}
