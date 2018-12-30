package ecankurban.obj.kalitim.ornek;

public class Runner {

	public static void main(String[] args) {
		Arac[] araclar= {
				new UstuAcikAraba(),
				new BinekAraba(),
				new SporAraba(), 
				new Araba(),
				new Arac() };
		
		for(Arac arac: araclar) {
			arac.YakýtAl();
			arac.Calis();
		}

	}

}
