package ornek16.except;

public class Runner {

	public static double Hesapla(int sayi, int sayi1)
			throws ArithmeticException {
		double sonuc = 0;
		if(sayi1==0){
			ArithmeticException ex = new ArithmeticException("S�fra b�lme hatas�");
			throw ex;
			
		}
		sonuc = sayi / sayi1;

		return sonuc;
	}

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println("i�lemin sonucu : " + Hesapla(4, 0));
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
		}
	}

}
