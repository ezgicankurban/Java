package ecankurban.obj;

public class Arac {
	
	private int tekerlekSayisi;
	private String surucuAdi;
	public boolean koltuk;
	
	
	public Arac() {//ara� tipinde d�n�� tipi d�nd�r�yor.private olan bie �eye kendi class �d���ndan eri�emeyece�imiz i�in public tan�mlan�r.
	
		
	}
	
	public void setTekerlekSayi(int tekerlekSayisi) {
		this.tekerlekSayisi=tekerlekSayisi;
	}
	
	public int getTekerlekSayisi() {
		return this.tekerlekSayisi;//this yaz�lmasa da olur.
		
	}

}
