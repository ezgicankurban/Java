package ecankurban.obj;

public class Arac {
	
	private int tekerlekSayisi;
	private String surucuAdi;
	private boolean koltuk;
	
	
	public Arac() {//default conts.
		//ara� tipinde d�n�� tipi d�nd�r�yor.private olan bie �eye kendi class �d���ndan eri�emeyece�imiz i�in public tan�mlan�r.
	
		
		
	}
	
	public Arac(int tekerlekSayisi) {//contst. � overload ettim.
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
		return this.tekerlekSayisi;//this yaz�lmasa da olur.
		
	}
	
	@Override
	public String toString() {//object class �ndan gelen toString metodunu ezdik.
		// TODO Auto-generated method stub
		return super.toString();
	}
	


}
