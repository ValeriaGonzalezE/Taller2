package TallerDos;
import java.util.Scanner;
public class PuntoTres {
	
	//Un autobús lleva 45 personas. El colegio solo utilizará el autobús si puede llenarlo del todo. 
	//El resto de personas irá en furgonetas. 
	//Escriba un programa que registre el número de personas que se han apuntado para ir de viaje. 
	//Haga que el programa muestre el número necesario de autobuses y el número total de personas que tendrá que viajar en furgonetas

	public void autobusesFurgonetas() {
		Scanner sc = new Scanner(System.in);
		int personas = 0;
		
		System.out.println("escribe el numero de personas que van a ir al viaje: ");
		personas = personas + sc.nextInt();
			
				double bus=personas/45;
			double furgoneta;
			furgoneta = personas-45*bus;
			
		System.out.println("solo se necesita " + bus + " bus y "+ furgoneta + " personas van en furgoneta");		
			
	}
	
}
