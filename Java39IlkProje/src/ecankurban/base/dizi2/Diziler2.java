package ecankurban.base.dizi2;

public class Diziler2 {
	
	public Diziler2() {
		
		//diziTers();
		//diziCokBoyutlu();
		diziCokBoyutlu2();
		
		
		
		
	}

	private void diziCokBoyutlu2() {
		String[][] isimler= new String[10][];
		isimler[0]= new String[5];//0. indis 5 uzunluklu bir ba�ka diziyi i�aret ediyor.Pointer gibi d���n.
		System.out.println(0);//ram adresini g�sterir.
		isimler[1][2]="ezgi";
		System.out.println(isimler[1][2]);//ikinci indis yeri bellek de ayr�lmad��� i�in hata verir.
		
		
		
	}

	private void diziCokBoyutlu() {
    
		String[][]	isimler= new String [5][7];
		
		isimler [0][0]="Ezgi";
		isimler [1][4]="Beste";
		isimler [0][3]="Cankurban";
		
		/*System.out.println(isimler[0][0]);
		System.out.println(isimler[1][4]);
		System.out.println(isimler[0][5]);*/
		
		for(int i=0;i<isimler.length ;i++) {
			
			for(int j=0; j<isimler[i].length;j++) {
			
				System.out.print(isimler[i][j]+ " ");
			}
			System.out.print("\n");
		}
			
	}

	private void diziTers() {
		
		//String[] isimler= new String[10];
		
		int[] dizi={1,2,3,4,5,6,7,8,9,10};
		int count=dizi.length-1;
		int temp;
		
		for(int i=0; i<dizi.length/2; i++) {
			
			temp=dizi[i];
			dizi[i]=dizi[count];
			dizi[count]=temp;
			count--;

		}
		for(int i=0; i<dizi.length;i++) {
			System.out.println(dizi[i]);	
		}
	
	}

}
