import java.util.Scanner;

/*
 * version de sergio
 */
public class Practica1 {
	
	 public static void main(String[] args) {
	System.out.println("Introduce un numero impar");
	
	Scanner scan=new Scanner (System.in);
	
	int base= Integer.parseInt (scan.next());
	
	int filas= (base+1)/2;
	
	for(int i=0; i<filas; i++){
		
		for (int j= filas-1-i; j>0; j--)
			System.out.print(' ');
		//calcular e imprimir blanos, para ello realizamos
		//un razonamiento análogico a los blancos
		
		for (int j=0; j<2*i+1; j++)
			System.out.print('*');
		//calcular e imprimir asteriscos
	
	
		System.out.print('\n');
		
		
	}//for
	
}//main

}


