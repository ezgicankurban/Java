package ecankurban.obj.insan;

public class Runner {

	public static void main(String[] args) {
		
		Insan ben=new Insan();
		ben.adi="Ezgi";
		ben.soyadi="Cankurban";
		
		ben.anne=new Insan();
		ben.anne.adi="Ferda";
		ben.anne.anne=new Insan();
		ben.anne.anne.adi="Nevin";
		
		ben.baba=new Insan();
		ben.baba.adi="Ahmet";
		ben.baba.baba=new Insan();
		ben.baba.baba.adi="Hasan";
		
		System.out.println(ben.adi);
		System.out.println(ben.anne.adi);
		System.out.println(ben.baba.adi);
		System.out.println(ben.anne.anne.adi);
		//System.out.println(ben.baba.anne.adi);new ile tanımlama yapmadığım için ram de yer açılmaz null dır.
		System.out.println(ben.baba.baba.adi);
		
		
	
	}

}
