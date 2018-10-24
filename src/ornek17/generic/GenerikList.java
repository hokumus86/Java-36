package ornek17.generic;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class GenerikList {
	
	public static void main(String[] args) {
		List liste = new ArrayList();
		liste.add("gizem");
		liste.add("deniz");
		liste.add("ahmet");
		liste.add("doðukan");
		liste.add("tuðçe");
		liste.add("Çaðrý");
		
		Collator coll = Collator.getInstance(new Locale("tr","TR"));
		Collections.sort(liste,coll);
		//Collections.sort(liste);
		System.out.println(liste);
	}

}
