package ecankurban.obj.insan.katilim;

public class Insan {
	public String adi;
	public String soyadi;
	public String tcKNO;
	private String gozRengi;//ogretmen ve ogrenciden ula��lamaz
	protected String dna;//kal�t�m yoluyla ge�ti�i i�in ogretmen ve ogrenciden ula��l�r
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Adi:" + adi + "Soyadi:" +soyadi + "TcKNO:" + tcKNO;
	}

}
