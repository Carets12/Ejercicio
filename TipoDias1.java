import java.util.Scanner;
/** Clase que leido un dia de la semana
 * nos dice si es laborable o no
 * @author Daniel
 * @version 1.0
 */
public class TipoDias1 {
	
	public static void main (String args[]) {
	System.out.println("Introduce un día de la semana");
	Scanner sc = new Scanner(System.in);
	String diasSemana = sc.next();
	sc.close();
	String diasSemanaMinuscula = diasSemana.toLowerCase();
	
	String mensaje = "";
	switch (diasSemanaMinuscula){
		case "lunes":
		mensaje = "laborable";
		break;
		
		case "martes":
		mensaje = "laborable";
		break;
		
		case "miercoles": 
		mensaje = "laborable";
		break;
		
		case "jueves":
		mensaje = "laborable";
		break;
		
		case "viernes":
		mensaje = "laborable";
		break;
		
		case "sabado":
		mensaje = "no laborable";
		break;
		
		case "domingo":
		mensaje = "no laborable";
		break;
		
		default:
		mensaje = "no es un dia";
	}
	System.out.printf("%s %s%n", diasSemanaMinuscula, mensaje);
}
}

