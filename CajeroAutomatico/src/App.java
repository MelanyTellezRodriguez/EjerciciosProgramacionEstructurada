
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int saldoInicialCordobas = 2000,saldoInicialDolares = 50,opcion = 0;
        char tipoDeCuenta;
        int cantidadRetirar,deposito,consultarSaldo,retirarEfectivo,salir;
      
        
        for(int i = 0; i<3; i++){
        System.out.println("¿Con cual cuenta desea trabajar (C= cuenta en cordobas) y (D= cuenta en Dolares): ");
        tipoDeCuenta = entrada.next().charAt(0);
        
        if (tipoDeCuenta == 'C'){
            
            do{
            
            System.out.println("*************Bienvenido a BBVA****************");
            System.out.println("ELIGE UNA OPCION: ");
            System.out.println("1- CONSULTAR SALDO.");
            System.out.println("2- RETIRAR EFECTIVO.");
            System.out.println("3- DEPOSITAR EFECTIVO");
            System.out.println("4- SALIR.");
         opcion = entrada.nextInt();
         
         switch (opcion){
             case 1 : System.out.println("Tu saldo es " + saldoInicialCordobas + "Cordobas");
             break;
             
             case 2: System.out.println("Ingrese la cantidad a retirar:  ");
                cantidadRetirar = entrada.nextInt();
                
                if(cantidadRetirar > saldoInicialCordobas){
                    System.out.println("Usted cuenta con saldo insuficiente para realizar el retiro");
                }else{
                    saldoInicialCordobas = saldoInicialCordobas - cantidadRetirar;
                    System.out.println("Tu saldo es: " + saldoInicialCordobas + "Cordobas");
                }break;
                
              case 3: System.out.println("¿Cuanto desea Depositar?");
                deposito = entrada.nextInt();
                
                saldoInicialCordobas = saldoInicialCordobas + deposito; 
                System.out.println("SU saldo es: " + saldoInicialCordobas + "cordobas");
                break;
                
              case 4:
                System.out.println("Gracias por utilizar nuestros servicios");
                break;
                
                default: 
                    System.out.println("no podemos encontrar la opcion que ha ingresado");
                    break;
                
         }
           }while (opcion != 4);  
            
        }else if(tipoDeCuenta == 'D'){
            do{
                
            System.out.println("*************Bienvenido a BBVA****************");
            System.out.println("ELIGE UNA OPCION: ");
            System.out.println("1- CONSULTAR SALDO.");
            System.out.println("2- RETIRAR EFECTIVO.");
            System.out.println("3- DEPOSITAR EFECTIVO");
            System.out.println("4- SALIR.");
            
            switch (opcion){
                case 1 : System.out.println("Tu saldo es " + saldoInicialDolares + "Dolares");
                saldoInicialCordobas = entrada.nextInt();
                break;
                
                case 2: System.out.println("Ingrese la cantidad a retirar:  ");
                cantidadRetirar = entrada.nextInt();
                
                if (cantidadRetirar > saldoInicialDolares){
                    System.out.println("Usted cuenta con saldo insuficiente para realizar el retiro");
                }else{
                    saldoInicialDolares = saldoInicialDolares - cantidadRetirar;
                    System.out.println("Tu saldo es: " + saldoInicialDolares + "Dolares");
                break;
                }
                
                case 3: System.out.println("Cuanto desea depositar");
                deposito = entrada.nextInt();
                
                
                saldoInicialCordobas = saldoInicialDolares + deposito; 
                System.out.println("SU saldo es: " + saldoInicialCordobas + "Dolares");
                break;
                
                case 4:
                System.out.println("Gracias por utilizar nuestros servicios");
                break;
                
                default: 
                    System.out.println("no podemos encontrar la opcion que ha ingresado");
                    break;
           
            }
            }while(opcion != 4);
            
        }
        
    }
    entrada.close();
    }
}
