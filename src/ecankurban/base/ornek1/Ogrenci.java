package ecankurban.base.ornek1;

public class Ogrenci {

	public Ogrenci() {
		sart();
		
		int a=5;
		int b=6;
		int sonuc= toplama(a,b);
		

	}

	private int toplama(int a,int b) {
	
		return a+b;
		
	}

	private void sart() {

		int sayi = 5;
		if (sayi == 5) {
			sayi = sayi + 1;

		} else if(sayi==3) {
			sayi = sayi - 1;
			
		}else if(sayi==2) {
			sayi = sayi*61;
			
		}else if(sayi==20) {
			sayi = sayi/7;
		}
		
		System.out.println(sayi);
	}

}
