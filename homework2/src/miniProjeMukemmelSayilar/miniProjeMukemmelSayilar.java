package miniProjeMukemmelSayilar;

public class miniProjeMukemmelSayilar {

	public static void main(String[] args) {
		// Mükemmel Sayılar
				//6--->1,2,3
				int number=6;
				int total=0;
				
				for (int i = 1; i < number; i++) {
					if(number % i ==0) {
						total=total+i;
					}
				}
					
					if (total==number) {
						System.out.println("Mükemmel sayıdır.");
					}
					
					else {
						System.out.println("Mükemmel sayı değildir.");
					}
					
				}

			}


