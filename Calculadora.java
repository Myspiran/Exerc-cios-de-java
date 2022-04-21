import java.util.Scanner;

public class Calculadora {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int cal = 0;
		int total = 0;
		
		
		while(true) {		
			
			System.out.println("Digite 1 para somar, 2 para subtrair, 3 para mutiplicar, 4 para dividir e 5 para fechar");
			cal = sc.nextInt();
			
			System.out.println("Digite o primeiro valor");
			num1 = sc.nextInt();
						
						
			System.out.println("Digite o segundo valor");
			num2= sc.nextInt();
						
			if(cal == 1) {
				total =num1 + num2;
				System.out.printf("Total = %d%n", total);
			}
						
			else if(cal == 2) {
				total = num1 - num2;
				System.out.printf("Total = %d%n", total);
			}
			else if(cal == 3) {
				total = num1 * num2;
				System.out.printf("Total = %d%n", total);
			}
			else if(cal == 4) {
				total = num1 / num2;
				System.out.printf("Total = %d%n", total);
			}
			else if(cal < 0 || cal >4) {
				break;
			}
						
		}
		sc.close();
	}
}

