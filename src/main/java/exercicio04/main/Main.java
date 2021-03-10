package exercicio04.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.start();
	}

	private void start() {
		
		int i = 1 ;
		
		while (i < 21){
			
			System.out.println("i +" + i);
			i++;
		}
		System.out.println("--------------------------------------");
		
		int k =1;
		
		do { 
			
			System.out.println("k +" + k );
			k++;
		}while (k < 21);
		
		
		
		System.out.println("--------------------------------------");
		
		
		for (int j = 0; j < 21; j++) {
			
			System.out.println("j + " + j); 
		}
		
	}

}
