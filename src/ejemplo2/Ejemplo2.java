/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;
import java.util.Scanner;
/**
 *
 * @author Karol Cobos
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        boolean b;
       String accionstring;
       int n1;
        System.out.println("-----------------Ejercicio 1 -------------");
      //System.out.println("Introduzca un numero");
     // n1 = sc.nextInt();
       // switch(n1){
       //   case 1:
      //  System.out.println("U N O");
       // break;
        // case 2:
      // System.out.println("D O S");  
      // break;
       //  case 3:
      // System.out.println("T R E S"); 
      //  break;
       // case 4:
       //System.out.println("C U A T R O"); 
       //break;
       // case 5:
       //System.out.println("C I N C O"); 
        //break;
        // default:    
       //System.out.println("El numero es mayor o menor de 1 a 5 ");  
         //   }
      System.out.println("-----------------Ejercicio 2 -------------");  
       //   System.out.println("Introduzca un numero");
        //  n1 = sc.nextInt();
         // switch(n1){
          //    case 1: accionstring ="Correr";
          //    System.out.println("la accion elegida fue "+accionstring);
          //    break;
          //    case 2: accionstring ="Saltar";
          //    System.out.println("la accion elegida fue "+accionstring);
         //    break;
          //    case 3: accionstring="dormir";
           //   System.out.println("la accion elegida fue "+accionstring);
           //   break;
           //   case 4: accionstring="comer";
           //   System.out.println("la accion elegida fue "+accionstring);
          //    break;
          //    case 5: accionstring="Estudiar";
          //    System.out.println("la accion elegida fue "+accionstring);
          //    break;
           //   default: accionstring="accion no valida";
         //     System.out.println("la  "+accionstring);
           //    break; 
         // }
          System.out.println("-----------------Ejercicio 3 -------------"); 
        //  System.out.println("Dia Miercoles");
        //  System.out.println("Introduzca una Hora");
       //   n1 = sc.nextInt();
        //  switch(n1){
         //     case 1:
         //         System.out.println("1am =Dormir ");
         //         break;
         //     case 2:
         //         System.out.println("2am =Dormir ");
          //        break; 
          //    case 3:
          //        System.out.println("3am =Dormir ");
         //         break;
         //      case 4:
        //         System.out.println("4am =Dormir ");
         //         break; 
          //     case 5:
           //        System.out.println("5am =Dormir ");
           //       break; 
           //    case 6:
            //       System.out.println("6am =Dormir ");
           //       break; 
            //   case 7:
              //     System.out.println("7am =Clases de Calculo ");
             //     break;
           //    case 8:
            //       System.out.println("8am =Clases de Calculo ");
            //      break;
             //  case 9:
               //    System.out.println("9am = termina Clases de Calculo y "
            //               + "empieza clases de ingles ");
           //       break;
            //   case 10:
             //      System.out.println("10am =Clases de ingles ");
            //      break;
             //  case 11:
            //       System.out.println("11am = termina Clases de ingles y "
              //             + "empieza clases de fisica ");
            //      break;
            //   case 12:
            //       System.out.println("12pm =Clases de fisica ");
            //      break;
            //   case 13:
            //       System.out.println("1pm =Clase  de fisica ");
             //     break;
            //   case 14:
            //       System.out.println("2pm = Limpieza del hogar ");
             //     break;
            //   case 15:
            //       System.out.println("3pm =Comer y bañarse");
            //      break;  
           //   case 16:
            //       System.out.println("4pm = Realizar tarea ");
            //      break; 
            //   case 17:
            //       System.out.println("5pm =Clase  de Economia ");
             //     break;
             //  case 18:
              //      System.out.println("6pm =Clase  de Economia ");
              //    break;
              // case 19:
             //      System.out.println("7pm = termina Clase  de Economia "
             //              + "empieza clases de administraccion");
              //     break;
              // case 20:
               //    System.out.println("8pm =Clase  de administraccion ");
              //    break;
               //case 21:
             //      System.out.println("9pm = Cenar y terminar tareas ");
                 // break;
               //case 22:
               //    System.out.println("10pm =Jugar videojuegos con amigos ");
               //  break;
               //case 23:
                 //  System.out.println("11pm =Jugar videojuegos con amigos ");
                //  break;
               //case 24:
                 //  System.out.println("12pm =dormir ");
                //  break;
              // default:
                  // System.out.println("el numero integrado no pertence alas"
                    //       + "24 horas");
                 // break;
                 //}
         System.out.println("-----------------Ejercicio 4 -------------"); 
         System.out.println("Introduzca un numero");
           n1 = sc.nextInt();
              if(n1>=1 && n1<=7){
              System.out.println("Introduzca si es True o false");
               b =sc.nextBoolean();
             if(b==true){
                 System.out.println("Es semana Inglesa");
             } else if(b==false){
                 System.out.println("Es semana Laborable");
             }         
   }   else{ 
               System.out.println("el numero introducido supera del 1 al 7");   
              }   
    } 
    }
     

