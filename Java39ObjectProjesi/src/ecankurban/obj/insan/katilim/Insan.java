package ecankurban.obj.insan.katilim;

public class Insan {
	public String adi;
	public String soyadi;
	public String tcKNO;
	private String gozRengi;//ogretmen ve ogrenciden ulaþýlamaz
	protected String dna;//kalýtým yoluyla geçtiði için ogretmen ve ogrenciden ulaþýlýr
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Adi:" + adi + "Soyadi:" +soyadi + "TcKNO:" + tcKNO;
	}

}
