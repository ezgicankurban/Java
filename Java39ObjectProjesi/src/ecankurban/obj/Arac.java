package ecankurban.obj;

public class Arac {
	
	private int tekerlekSayisi;
	private String surucuAdi;
	public boolean koltuk;
	
	
	public Arac() {//araç tipinde dönüþ tipi döndürüyor.private olan bie þeye kendi class ýdýþýndan eriþemeyeceðimiz için public tanýmlanýr.
	
		
	}
	
	public void setTekerlekSayi(int tekerlekSayisi) {
		this.tekerlekSayisi=tekerlekSayisi;
	}
	
	public int getTekerlekSayisi() {
		return this.tekerlekSayisi;//this yazýlmasa da olur.
		
	}

}
