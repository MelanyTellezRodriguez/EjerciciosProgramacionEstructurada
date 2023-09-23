
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int cantidadHoras;
        double totalPagar;
        int horasAdicionales = 0;
        
       for(int i = 0; i<3; i++){
        System.out.println("*****Bienvenido al sistema de cobro del parqueo***");
        
        System.out.println("Ingrese la cantidad de horas que estuvo estacionado su coche: ");
        cantidadHoras = entrada.nextInt();
        
        if(cantidadHoras >0 && cantidadHoras <= 3){
            totalPagar = 2;
            System.out.println("Usted debe pagar: " + totalPagar + "dolares por estacionamiento");
            
        } else if(cantidadHoras > 3){
             System.out.println("Ingrese la cantidad de horas adicionales a tres que estuvo estacionado: ");
             horasAdicionales = entrada.nextInt();
             
             totalPagar = 2 + (0.50 * horasAdicionales);
             System.out.println("Usted debe pagar: " + totalPagar + "dolares por las horas adicionales que estuvo estacionado");
         
        }
       }
        entrada.close();
    }
}
