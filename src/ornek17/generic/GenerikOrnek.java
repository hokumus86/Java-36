package ornek17.generic;

import java.util.ArrayList;
import java.util.List;

public class GenerikOrnek {
	
	public static void main(String[] args) {
		List c = new ArrayList();
		c.add(1);
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();
		b.add("gizem");
		b.add("tuðçe");
		b.add("deniz");
		a.add(1);
		a.add("hüseyin");
		a.add(14.8);
		Deneme temp = new Deneme();
		temp.setSayi(4);
		temp.setAd("hüseyin");
		System.out.println("b dizisi "+  b);
		System.out.println("a dizisi " +a);
		a.add(temp);
		System.out.println(a);
		/*for (int i = 0; i < b.size(); i++) {
			//System.out.println(a.get(i));
			Object o = b.get(i);
			b.set(i, a.get(i));
			a.set(i, o);
			
		}*/
		System.out.println("---------------------");
		System.out.println("b dizisi "+  b);
		System.out.println("a dizisi " +a);
		
	}

}
