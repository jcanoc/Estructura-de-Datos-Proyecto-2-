/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_colas1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cano
 */
public class Proyecto_Colas1{

   static int opcion  = 0; 
    static int elemento = 0; 
     public static void main(String[] args) { 
       Colas cola = new Colas(); 
       Colas cajero1 = new Colas(); 
       Colas cajero2 = new Colas(); 
       Colas cajero3 = new Colas(); 
       Colas cajero4 = new Colas(); 
       BufferedReader leer = new BufferedReader 
         (new InputStreamReader(System.in));       
        
         do { 
           try { 
               System.out.println("**** Elija una opcion ****"); 
               System.out.println("1- Ingresar elementos"); 
              System.out.println("2-  Eliminar elementos"); 
               System.out.println("3- Ver si la cola esta vacia"); 
               System.out.println("4- Ver el frente de la cola"); 
               System.out.println("5- Borrar todo"); 
               System.out.println("6- Ver si la cola esta llena"); 
               System.out.println("7- Salir"); 
               opcion = Integer.parseInt(leer.readLine()); 
                
               if (opcion==1) { 
                   if (cola.Colallena()) { 
                       System.out.println("Cola llena no puede ingresar datos"); 
                   } else 
                   { 
                       System.err.print("Digite un elemento: "); 
                       elemento = Integer.parseInt(leer.readLine()); 
                      try { 
                           cola.insertar(elemento); 
                       } catch (Exception ex) { 
                           Logger.getLogger(Proyecto_Colas1.class.getName()).log(Level.SEVERE, null, ex); 
                       } 
                   } 
               } 
           } catch (IOException ex) { 
               Logger.getLogger(Proyecto_Colas1.class.getName()).log(Level.SEVERE, null, ex); 
           } 
              
            if (opcion==2) { 
                if (cola.ColaVacia()) { 
                     System.err.println("Cola vacia no puede eliminar elementos"); 
                 } else 
                 {   try { 
                     System.out.println(cola.eliminar()); 
                     } catch (Exception ex) { 
                         Logger.getLogger(Proyecto_Colas1.class.getName()).log(Level.SEVERE, null, ex); 
                     } 
                 } 
             } 
              
             if (opcion==3) { 
                if (cola.ColaVacia())  
                    System.err.println("Cola vacia"); 
                  else 
                     System.err.println("Cola no llena"); 
             } 
              
             if (opcion == 4) { 
                 if (cola.ColaVacia()) { 
                    System.err.println("Cola vacia"); 
                } else 
                 { 
                   try { 
                         System.out.println("El frente es: " + cola.frente()); 
                     } catch (Exception ex) { 
                         Logger.getLogger(Proyecto_Colas1.class.getName()).log(Level.SEVERE, null, ex); 
                     } 
                 } 
            } 
             
            if (opcion == 5) { 
                cola.Borrartodo(); 
            } 
              
            if (opcion == 6) { 
                 if (cola.Colallena()) 
                     System.err.println("Cola llena"); 
                    else 
                     System.err.println("Cola no llena"); 
             } 
              
         } while (opcion!=7); 

 
     } 

 
 } 
