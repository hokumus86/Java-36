package ornek15.anotation.siniflar;

import java.sql.Date;
import java.util.Calendar;

@Insan(UyariAdi="Uyari",UyariTuru="Exception")
public class Runner {

	@Deprecated
	/* sdlkfjsdlfjl sdfksdjfklj
	 * 
	 * TestYeni() metodunu kullanýn
	 * 
	 */
	public static void Test() {

		System.out.println("bu meted geçersiz oldu");
	}

	public static void TestYeni() {

		System.out.println("bu metod geçerli Hali bu");
	}

	public static void main(String[] args) {
		TestYeni();
		
		Date d = new Date(2018,9,21);
		
		Insan temp = Runner.class.getAnnotation(Insan.class);
		System.out.println(temp.UyariAdi());
		System.out.println(temp.UyariTuru());
	}

}
