
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

         //tipo           //Cuesta
       double articulo1 = 239.99;
       double articulo2 = 129.75;
       double articulo3 = 99.55;
       double articulo4 = 350.89;
       int opcion = 0;
       int cantidadArticulo;
       double ingresosVendedor;
       double totalVendido;
       
       
       for (int i = 0; i < 3; i++){
       System.out.println("Ingrese el tipo de articulo que ha vendido: ");
       System.out.println("ELIGE UNA OPCION: ");
       System.out.println("     Articulo             Valor");
       System.out.println("1- articulo uno          C$ 239.99");
       System.out.println("2- articulo dos          C$ 129.75");
       System.out.println("3- articulo tres         C$ 99.55 ");
       System.out.println("4- articulo cuatro       C$ 350.89");
       System.out.println("");
       opcion = entrada.nextInt();
       
       switch (opcion){
           case 1: System.out.println("Ingrese la cantidad de articulos que ha vendido: ");
           cantidadArticulo = entrada.nextInt();
           
           totalVendido = articulo1 * cantidadArticulo;
           
           System.out.println("El total que ha vendido es de: " + totalVendido);
            {          
                int cantidadArticulos = 0;
                ingresosVendedor = 200 + (0.09 *totalVendido );
            }
             System.out.println("Los ingresos del vendedor son: " + ingresosVendedor + "Cordobas");
             System.out.println("");
           break;
           
           case 2: System.out.println("Ingrese la cantida de articulos que ha venidido: ");
           cantidadArticulo = entrada.nextInt();
           
           totalVendido = articulo2 * cantidadArticulo;
           System.out.println("El total que ha vendido es de: " + totalVendido);
           
           ingresosVendedor = 200 +(0.09 * totalVendido);
           System.out.println("Los ingrsos del vendedor son: " + ingresosVendedor);
           System.out.println("");
           break;
           
           case 3: System.out.println("Ingrese la cantidad de articulos que ha vendido: ");
           cantidadArticulo = entrada.nextInt();
           
           totalVendido = articulo3 * cantidadArticulo;
           System.out.println("El total que ha vendido es de: " + totalVendido);
           
           ingresosVendedor = 200 +(0.09 * totalVendido);
           System.out.println("Los ingrsos del vendedor son: " + ingresosVendedor);
           System.out.println("");
           break;
           
           case 4: System.out.println("Ingrese la cantidad de articulos que ha vendido: ");
           cantidadArticulo = entrada.nextInt();
           
           totalVendido = articulo4 * cantidadArticulo;
           System.out.println("El total que ha vendido es de: " + totalVendido);
           
           ingresosVendedor = 200 +(0.09 * totalVendido);
           System.out.println("Los ingrsos del vendedor son: " + ingresosVendedor);
           System.out.println("");
           break;
           
           default: System.out.println("No podemos encontrar la opcion que ha ingresado");
           break;
           
           
           
           
         
           
        
           
            

       }  
          
           
       }
       entrada.close();
    }
}
