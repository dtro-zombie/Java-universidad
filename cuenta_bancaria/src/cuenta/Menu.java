package cuenta;



import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
    Cuenta cuenta=new Cuenta();
    Scanner sc = new Scanner(System.in);
    
    String mensajeOpciones = "Realizar acción: " + "1) depositar, 2) extraer, 3) pagar intgererese, 4)ver saldo, 5)actualizar estado, 6) salir";

    while (true) {
        System.out.println(mensajeOpciones);
       
        int opcion;
        opcion = sc.nextInt();
        
        switch (opcion) {
        			
            case 1: 
            	System.out.println("ingrese monto a depositar");
            	double monto=sc.nextDouble();
            	cuenta.Depositar(monto); break;
            case 2:
            	System.out.println("ingrese monto a extraer");
            	 monto=sc.nextDouble();
            	cuenta.Extraer(monto); break;
            	
            case 3: cuenta.Pagarintereses(); break;
            
            case 4:System.out.println("saldo:"+cuenta.getSaldo());break;
            
            case 5:cuenta.Actualizarestado(cuenta); break;
            
            case 6: System.out.println("Hasta pronto!"); System.exit(0);
            
            default: System.out.println("Opcion no válida");
        }
    }
	
	System.out.println("-----");
	}
	
	
	
	
	
}

    



