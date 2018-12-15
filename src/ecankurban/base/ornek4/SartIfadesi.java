package ecankurban.base.ornek4;

public class SartIfadesi {
	
	public SartIfadesi() {
		Islem();
		
	}

	private void Islem() {
		String deger="20";
		switch (deger) {
		case "0":
			System.out.println("Deger 0");
			break;
			
		case "10":
			System.out.println("Deger 10");
			break;
			
		case "20":
			System.out.println("Deger 20");
			break;
		
			

		default:
			System.out.println("Deger esitlenmedi");
		}
		
		
	}

}
