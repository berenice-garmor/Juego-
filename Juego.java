/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import java.util.Scanner;


/**
 *
 * @author Hp
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        
        Scanner  nomb= new Scanner(System.in);
        System.out.println("INGRESA TU NOMBRE");
        String nom= nomb.next();
        
        //imprimir msg de bienvenida
        System.out.println("BIENVENIDO " +nom);
        
        System.out.println("NIVEL 1");
        
        System.out.println("|2|       |14|");
        
        System.out.println("|+|     |/|  ");
        
        System.out.println("|5|   |2|    ");
        
        System.out.println("|=| |=|   ");
        
        System.out.println("|?|=|6|-|13|");
        
        //RESPUESTA nivel 1
        
        Scanner  RES= new Scanner(System.in);
        System.out.print("RESPUESTA: ");
        int res= RES.nextInt();
        
        
        //si la respuesta es igual a 7 gano
        if (res==7)
        {
             System.out.println("GANASTE!!");
        }
        else
        {
            System.out.println("INTENTA DE NUEVO!");
            
            Scanner RESP= new Scanner(System.in);
            System.out.print("RESPUESTA: ");
            res= RESP.nextInt(); 
            if (res!=7)
            {
               System.out.println("INCORRECTO"); 
            }
        }
        
        //para ingresar si desea o no seguir jugando
        char resp;
        System.out.println("DESEA SEGUIR JUGANDO? S/N");
        Scanner  RESP= new Scanner(System.in);
        resp= RESP.next().charAt(0);
//_________________________________________________________
        
        System.out.println(" ");
        if (resp=='S')
        {
        System.out.println("NIVEL 2");
        
        System.out.println("|258|       |52|");
        
        System.out.println("| - |     |+|  ");
        
        System.out.println("|185|   |21|    ");
        
        System.out.println("| = | |=|   ");
        
        System.out.println("| ? ||=| |3| |/| |219|"); 
        
       
        Scanner  RES2= new Scanner(System.in);
        System.out.print("RESPUESTA: ");
        int res2= RES2.nextInt();
        
        //si la respuesta es igual a 73 gano
        if (res2==(73))
        {
             System.out.println("GANASTE!!");
        }
        else
        {
            System.out.println("INTENTA DE NUEVO!");
            Scanner  RESP2= new Scanner(System.in);
            System.out.print("RESPUESTA: ");
            res2= RESP2.nextInt(); 
            if (res2!=73)
            {
               System.out.println("INCORRECTO"); 
            }
        }
        
       
        //para ingresar si desea o no seguir jugando
        System.out.println("DESEA SEGUIR JUGANDO? S/N");
        Scanner  RESP2= new Scanner(System.in);
        resp= RESP2.next().charAt(0);
//_________________________________________________________________________         
        System.out.println(" ");
        if (resp=='S')
        {
        System.out.println("NIVEL 3");
        
        System.out.println("|-47|       |-36|");
        
        System.out.println("| - |     |/|  ");
        
        System.out.println("|-29|   |2|    ");
        
        System.out.println("| = | |=|   ");
        
        System.out.println("| ? ||=| |-3| |*| |6|"); 
        
        Scanner  RES3= new Scanner(System.in);
        System.out.print("RESPUESTA: ");
        int res3= RES3.nextInt();
        
        //si la respuesta es igual a 18 gano
        if (res3==-18)
        {
             System.out.println("FELICIDADES COMPLETASTE TODOS LOS NIVELES");
        }
        else 
        {
            System.out.println("INTENTA DE NUEVO!");
            Scanner RESP3= new Scanner(System.in);
            System.out.print("RESPUESTA: ");
            res3= RES3.nextInt();
            if (res3!=-18)
            {
               System.out.println("INCORRECTO, FIN DEL UEGO"); 
            }
            else
            {
             System.out.println("FELICIDADES COMPLETASTE TODOS LOS NIVELES");   
            }
        }
        
        }
        else 
        {
             System.out.println("HASTA LUEGO"); 
             
        }
        
        } 
        
       
        
    }
    
}
