package ecankurban.obj;

public class Arac {
	
	private int tekerlekSayisi;
	private String surucuAdi;
	private boolean koltuk;
	
	
	public Arac() {//default conts.
		//araç tipinde dönüþ tipi döndürüyor.private olan bie þeye kendi class ýdýþýndan eriþemeyeceðimiz için public tanýmlanýr.
	
		
		
	}
	
	public Arac(int tekerlekSayisi) {//contst. ý overload ettim.
		this.tekerlekSayisi=tekerlekSayisi;
		
	}
	
	public void setSurucuAdi(String surucuAdi) {
		this.surucuAdi=surucuAdi;//
		
	}
	
	
	
	public String getSurucuAdi() {
		return surucuAdi;//this de yazabiliriz.
	}
	
	
	public void setKoltuk(boolean koltuk) {
		this.koltuk=koltuk;
	}
	public boolean getKoltuk() {
		return koltuk;
	}
	public void setTekerlekSayi(int tekerlekSayisi) {
		this.tekerlekSayisi=tekerlekSayisi;
	}
	
	public int getTekerlekSayisi() {
		return this.tekerlekSayisi;//this yazýlmasa da olur.
		
	}
	
	@Override
	public String toString() {//object class ýndan gelen toString metodunu ezdik.
		// TODO Auto-generated method stub
		return super.toString();
	}
	


}
