package ecankurban.base.fordongusu;

public class Donguler {
	
	private boolean durum=true;
	private int count=0;
	public Donguler() {
		dongu();
		Islem();
	}
	
	private void Islem() {
		int sayi=10;
		
		System.out.println(sayi++);
		sayi++;
		System.out.println(++sayi);
		sayi--;
		System.out.println(--sayi);
		System.out.println(sayi--);
		
		
	}
	
	private void dongu() {
		
		for (int i = 5; i>=0; i--) {
			
			System.out.println(i);
	
		}
		
		System.out.println("************");
		
		while(durum) {
			System.out.println(count++);
			if(count==1)
				durum=false;
				
		}
		System.out.println("************");
		
		do {
			System.out.println(count++);
			
		} while (durum);
	}
	

}
