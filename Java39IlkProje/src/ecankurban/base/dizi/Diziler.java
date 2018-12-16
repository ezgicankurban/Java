package ecankurban.base.dizi;

public class Diziler {
	
	public Diziler() {
		
		diziIslem();
		
		
	}

	private void diziIslem() {
		
		int[] dizi1= new int[10];
		int[] dizi={1,2,3,4,5,6,7,8,9,10};
		
		int count=dizi.length -1;
		
		for(int i=0; i<dizi.length;i++) {
			dizi1[i]=dizi[count];
			count--;
		
		}
		for(int i=0; i<dizi1.length;i++) {
			System.out.println(dizi1[i]);
			
			
		}
		
		
		
		
		
		//int[] dizi1= {1,2,3,4,5};
		
	
		//dizi[0]=4;
		
		/*for(int i=0; i<dizi.length;i++)
		{
			dizi[i]=i+2;
		}
	
		
		for(int i=0; i<dizi.length;i++)
		{
			System.out.println(dizi[i]);
		}*/
	}
		

 }
