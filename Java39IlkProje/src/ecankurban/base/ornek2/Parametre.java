package ecankurban.base.ornek2;

public class Parametre {
	public Parametre() {
		String ad="Ezgi";
		String soyad="Cankurban";
		String isimSoyisim=IsimSoyisim(ad,soyad);
		System.out.println(isimSoyisim);
		
		
	}

	private String IsimSoyisim(String ad, String soyad) {
		
		return ad+" "+soyad;
		
		
	}

	
}
