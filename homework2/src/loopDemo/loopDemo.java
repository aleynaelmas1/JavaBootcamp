package loopDemo;

public class loopDemo {

	public static void main(String[] args) {
		// For Döngüsü
				for (int i = 1; i < 10; i++) {
					System.out.println(i);
				}
				System.out.println("Döngü bitti.");
				
				// Tek sayılar için for döngüsü
				for (int i = 1; i < 10; i=i+2) {
					System.out.println(i);
				}
				System.out.println("Döngü bitti.");
				
		//While Döngüsü
				int i=1;
				while (i<10) {
					System.out.println(i);
					i+=2;
				}
				System.out.println("While döngüsü bitti.");
				
		//Do-While Döngüsü
				int j=1;
				do {
					System.out.println(j);
					j+=2;
				} while (j<10);
				System.out.println("Do-while döngüsü bitti.");
				
	}

}
