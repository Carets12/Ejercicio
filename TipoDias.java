import java.util.Scanner;
/** Clase que leido un dia de la semana
 * nos dice si es laborable o no
 * @author Daniel
 * @version 1.0
 */
public class TipoDias {
	
	public static void main (String args[]) {
		
	
	System.out.println("Introduce un día de la semana");
	Scanner sc = new Scanner(System.in);
	String diasSemana = sc.next();
	

	switch (diasSemana.toLowerCase()){
		case "lunes": 
		System.out.println("Es laboral");
		break;
		
		case "martes":
		System.out.println("Es laboral");
		break;
		
		case "miercoles":
		System.out.println("Es laboral");
		break;
		
		case "miércoles":
		System.out.println("Es laboral");
		break;
		
		case "jueves":
		System.out.println("Es laboral");
		break;
		
		case "viernes": 
		System.out.println("Es laboral");
		break;
		
		case "sabado":
		System.out.println("No es laboral");
		break;
		
		case "domingo":
		System.out.println("No es laboral");
		break;
		
		case "sábado":
		System.out.println("No es laboral");
		break;
		
		default:
		System.out.println("ERROR, no has introducido ningún día");
		break;
		
		}
	}
	
}

