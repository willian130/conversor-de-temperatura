package temperatura;

import java.util.Locale;
import java.util.Scanner;

import Util.TemperatureConverter;

public class Main {
	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String continuar;
		
		do {
		 System.out.println("DIgite o numero corepondente a convresão desejada:");
	     System.out.println("1----Celsius para Fahrenheit ");
	     System.out.println("2----Fahrenheit para Celsius");
	     System.out.println("3----Celsius para Kelvin");
	     
	     int option = sc.nextInt();
	     
	     double inputTemp;
	     double result;
	     
	     switch (option) {
	     
	     case 1:
	     System.out.println("Digite a temperatura ");
	     inputTemp = sc.nextDouble();
	     result = TemperatureConverter.CelsiusFahrenheit(inputTemp);
	     System.out.printf("A temperatuar em Fahrenheit e: %.1f%n ", result);
		 break;
		 
	     case 2:
		     System.out.println("Digite a temperatura ");
		     inputTemp = sc.nextDouble();
		     result = TemperatureConverter.FahrenheitCelsius(inputTemp);
		     System.out.printf("A temperatuar em Celsius e: %.1f%n ", result);
			 break;
			 
	     case 3:
		     System.out.println("Digite a temperatura ");
		     inputTemp = sc.nextDouble();
		     result = TemperatureConverter.CelsiusKelvin(inputTemp);
		     System.out.printf("A temperatuar em Kelvin e: %.1f%n ", result);
			 break;
		 
		 default:
			 System.out.println("Opção invalida");
	     }
	     System.out.println("Deseja continuar? SIM/NÃO?");
		 continuar = sc.next();
		} while (continuar.equalsIgnoreCase("SIm"));
		
		  System.out.println("Até a próxima");
		 
		 sc.close();	
     }
}

