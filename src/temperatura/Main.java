package temperatura;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 char resp;
		 do {
		  System.out.print("digite o valor em celsios");
		  double c = sc.nextDouble();
		  double f = 9.0 * c/ 5.0 + 32.0 ;
		  System.out.printf("O equivalente em fahrenheit: %.1f%n", f);
		  System.out.println("deseja continuar? S/N");
		  resp = sc.next().charAt(0);
	} while (resp !='N');
		 sc.close();
	}
	
}

