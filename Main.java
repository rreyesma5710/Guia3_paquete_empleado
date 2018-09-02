 
import java.util.Scanner;
import java.util.ArrayList;
//import paquete.Empleado;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String nombre;
        String servicio_departamento;
        String posicion;
        double salario; 
        int respuesta = 0;
        
        ArrayList <Empleado> lista =new ArrayList();
        try{
        do{
        System.out.println("¿Cual es su nombre?: ");
        nombre = in.nextLine();
        System.out.println("¿Cual es su Servicio/Departamento?: ");
        servicio_departamento = in.nextLine();
        System.out.println("¿Cual es su posicion?: ");
        posicion = in.nextLine();
        System.out.println("¿Cual es su salario?: ");
        salario = Double.parseDouble(in.nextLine());
        lista.add(new Empleado(nombre,servicio_departamento,posicion,salario));
        System.out.println("¿Desea agregar otro empleado? SI=1 NO=otro?");
        //lee como caracter y transforma a entero evita error de salto
        respuesta = Integer.parseInt(in.nextLine()); 
        // Esto tambien quitará del buffer el cambio de línea
        //teclado.nextLine() 
        }while(respuesta == 1);
        }catch(Exception ex){ // handle your exception

        }
        String mensaje;
        for(Empleado em : lista){
           mensaje = em.toString();
           System.out.println(mensaje); 
           System.out.println("*********************");           
        }        
        
    }    
    
}
