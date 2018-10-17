package ornek4.main;

import ornek4.bean.Araba;
import ornek4.bean.Motosiklet;

public class Runner {


		public static void main(String[] args) {
			Araba a = new Araba();
			System.out.println(a.hiz);
			a.hiz= 18;
			System.out.println(a.hiz);
			a.tekerlekSayisi = 4;
			System.out.println(a.tekerlekSayisi);
			Motosiklet m = new Motosiklet();
			System.out.println(m.hiz);
			m.tekerlekSayisi =2;
			System.out.println(m.tekerlekSayisi);
			System.out.println(a.hiz);
		}
		
}
