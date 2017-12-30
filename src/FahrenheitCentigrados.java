import java.util.Scanner;
public class FahrenheitCentigrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double centigrados, fahrenheit; /*Definimos las variables*/
		
		System.out.println("introduzca los Grados Fahrenheit que quiere convertir a Grados Centígrados");
		fahrenheit = sc.nextDouble();
		centigrados = (5*(fahrenheit-32))/9;
		System.out.println(fahrenheit + " Grados Fahrenheit son " + centigrados + " Grados Centígrados");
		sc.close();
	}

}
