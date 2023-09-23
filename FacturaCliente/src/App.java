
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        char tipoDeCliente;
        int numeroDeCuenta = 0,numeroDeCliente = 0, numCanalesPremium,numConexionesServicios;
        
        double totalFactura1,totalFactura2;
        
        int conexionesAdicionales = 0,pagoConexionBasica,pagoConexionAdicional = 0;
       
        
        for(int i = 0; i< 3; i++){
      System.out.println("Por favor ingrese que tipo de cliente es usted R = cliente residencia y N = cliente de negocio");
      tipoDeCliente = entrada.next().charAt(0);
      
      if(tipoDeCliente == 'R'){
          System.out.println("Ingrese su numero de cuenta: ");
          numeroDeCuenta = entrada.nextInt();
          
          System.out.println("`Por favor ingrese un numero de cliente: ");
          numeroDeCliente = entrada.nextInt();
          
          System.out.println("Por favor ingrese el numero de canales premium: ");
          numCanalesPremium = entrada.nextInt();
          
          
      }else if(tipoDeCliente == 'N'){
          System.out.println("Ingrese el numero de cliente: ");
          numeroDeCliente = entrada.nextInt(); 
          System.out.println("Ingrese el numero de cuenta del cliente: ");
          numeroDeCuenta = entrada.nextInt();
          
          System.out.println("Ingrese el numero de conexiones de servicios basicos: ");
          numConexionesServicios = entrada.nextInt();
          
          System.out.println("Ingrese el numero de conexiones adicionales, si las tiene sino solo coloque cero: ");
          conexionesAdicionales = entrada.nextInt();
          System.out.println("");
         
      }else {
          System.out.println("La opcion que ha ingresado no se encuentra en las opciones");
      }
      
      System.out.println("Tenemos dos tarifas para calcular su factura de cable, una para clientes residenciales y otra para clientes de negocio");
      
      if( tipoDeCliente == 'R'){
          System.out.println("Usted aplica a la siguiente tarifa: ");
          System.out.println("Cargo por procesamiento de la factura = C$ 4.50");
          System.out.println("Crago por servicio basico = C$ 20.50");
          System.out.println("canales`premium = C$ 7.50 por canal");
          System.out.println("**********************************************************************************");
          System.out.println("");
          
          
      }else if( tipoDeCliente == 'N'){
          System.out.println("********************************************************************************");
          System.out.println("Usted aplica a la siguiente tarifa: ");
          System.out.println("Crago por procesamiento de la factura = C$ 15.00");
          System.out.println("Cargo por servicio basico = C$ 75.00 por las primeras 10 conexones; C$ 5 por cada conexion adicional");
          System.out.println("canales premium = C$ 50.00 por canala para cualquier numero de conexiones");
          System.out.println("*******************************************************************************");
          System.out.println("");
             
      }else{
          System.out.println("No podemos encontrar la opcion que ingreso");
      }
      
      
      totalFactura1 = 4.50 + 20.50 + 7.50;
      totalFactura2 = 15 + 75 + (5 * conexionesAdicionales) + 50;
    
     
     //importe de la factura: 
     System.out.println("********************************************************");
     System.out.println("El importe de su factura es la siguiente");
     System.out.println("Numero de cliente : " + numeroDeCliente);
     System.out.println("Numero de cuenta del cliente: " + numeroDeCuenta);
     
     if( tipoDeCliente == 'R'){
          System.out.println("Cargo por procesamiento de la factura = C$ 4.50");
          System.out.println("Cargo por servicio basico = C$ 20.50");
          System.out.println("canales`premium = C$ 7.50 por canal");
          System.out.println("El total de su factura es: " + totalFactura1 );
          System.out.println("*****************************************************");
          
     }else if(tipoDeCliente == 'N'){
         System.out.println("Cargo por procesamiento de la factura = C$ 15.00");
         System.out.println("Cargo por servicio basico = C$ 75.00 por las primeras 10 conexiones; C$ 5 por cada conexion adicional");
         System.out.println("canales premium = C$ 50.00 por canala para cualquier numero de conexiones");
         System.out.println("El total de su factura es: " + totalFactura2);
         System.out.println("**********************************************************");
     }    
     } 
     entrada.close();
    }
}
