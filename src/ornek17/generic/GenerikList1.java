package ornek17.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerikList1 {
	
	public static void main(String[] args) {
		List liste = new ArrayList();
		liste.add(1);
		liste.add(2);
		liste.add(3);
		List liste1 =new ArrayList();
		liste1.add("Deniz");
		liste1.add("Den");
		liste1.add(2);
		System.out.println("liste " + liste);
		System.out.println("liste1 " + liste1);
		int sayi = 2;
		for (int i = 0; i < liste.size(); i++) {
			Object temp = liste.get(i);
			liste.set(i, liste1.get(sayi));
			liste1.set(sayi, temp);
			sayi--;
		}
		//Collections.sort(liste1);
		Collections.sort(liste);
		System.out.println("---------------");
		System.out.println("liste " + liste);
		System.out.println("liste1 " + liste1);
	}

}
