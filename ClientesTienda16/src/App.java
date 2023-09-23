import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int numeroCuenta,saldoInicial,totalArticulos,totalCreditosEnElMes,limiteCredito,saldoNuevo,cantClientes;
       
        for (int i = 0; i < 3; i++){
           System.out.println("Ingrese el numero de cuenta del cliente: ");
            numeroCuenta = entrada.nextInt();
            
            System.out.println("Ingrese el saldo al inicio del mes del cliente: ");
            saldoInicial = entrada.nextInt();
            
            System.out.println("Ingrese el total de los articulos cargados por el cliente en el mes");
            totalArticulos = entrada.nextInt();
            
            System.out.println("Ingrese el total de los creditos aplicados a la cuenta del cliente en el mes: ");
            totalCreditosEnElMes = entrada.nextInt(); 
            
            System.out.println("Ingrese el limite de credito permitido: ");
            limiteCredito = entrada.nextInt();
            System.out.println("");
            
            saldoNuevo = (saldoInicial + totalArticulos - totalCreditosEnElMes);
            
            System.out.println("Su Saldo nuevo es de: " + saldoNuevo);
            
            if(saldoNuevo > limiteCredito){
                System.out.println("**Aviso** se excedio el limite de su credito");
            }else{
                System.out.println("Gracias por utilizar nuestros servicios");
            }
 
        }
            
        entrada.close();
    }
}
