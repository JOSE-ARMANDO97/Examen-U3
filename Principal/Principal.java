package Principal;

import Logica.ListasEnlazadas;
import java.util.Scanner;


public class Principal {
     public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
     ListasEnlazadas objeto= new ListasEnlazadas();
        String Cliente[]={"VIP","COMUN"};
        
       boolean continuar = true, res=false;
             
       int  menu=0,num, turno = 0 ,turno1=0;
    
        while(continuar){
    
        System.out.println("BIENVENIDOS AL USO DE COLAS DINAMICAS \n"
                   + "1: NUEVO CLIENTE\n"
                   + "2: PASAR A VENTANILLA \n"
                   + "3: MOSTRAR COLAS \n"
                   + "4: TERMINAR UNA VENTANILLA\n"
                   + "5: -SALIR");
        menu=leer.nextInt();
        
          switch(menu){
              case 1:
                  num=(int)(Math.random()*2+0);
                  if(num==0){
                 if(turno==0){ 
            turno=(int)(Math.random()*10+1);
             objeto.Empujar(Cliente[0],turno);
                 }else{
                       turno++;
                     objeto.Empujar(Cliente[0],turno);
                       
                      }
                 }else if(num==1){ 
                 
                     if(turno1==0){
                         
            turno1=(int)(Math.random()*10+1);
            objeto.Empujar(Cliente[1],turno1);
                 }else{
                        turno1++;
                         objeto.Empujar(Cliente[1],turno1);
                        
                     }
                 }
              
                break;
            case 2:
                objeto.PasarVetanillaS(Cliente,res);
          
               break;
            case 3:
                objeto.mostrarCola();
                break;
            case 4:
               
              
                objeto.LiveraraVentanilla();
            
                break;
            case 5:
                System.out.println(" ELEGISTE SALIR...");
                continuar=false;
                break;
                 default:
                 System.out.println("opcion incorrecta");
                 break;
           
          }
     }
  }
}
