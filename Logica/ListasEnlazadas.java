package Logica;

import NodoComun.NodoComun;
import NodoVip.NodoVIP;


public class ListasEnlazadas {
  NodoVIP Inicio,Final;
       
  NodoComun InicioC,FinalC;
          int Ventanilla1[];
 int tamaño,i = 0,aux=0,cont=0 ,num =3;
   

 public ListasEnlazadas(){
 Inicio=null;
 Final=null;
 InicioC=null;
 FinalC=null;
 tamaño=0;
 Ventanilla1 =  new int[num];
 }
    public boolean estaVacia(){
        if((Inicio==null)){
        return true;
        }else{
      return false;
     }
    }
    public boolean estaVaciaC(){
        if((InicioC==null)){
        return true;
        }else{
      return false;
     }
    }
    
    
    
    public void Empujar(String Cliente,int turno){ 
    if ("VIP".equals(Cliente)){
            NodoVIP Clientes= new  NodoVIP (Cliente,turno);
            Clientes.elemento=turno;
            Clientes.siguiente=null;
              if(estaVacia()){
             Inicio=Clientes;
              Final=Clientes;
              }else{
    Final.siguiente=Clientes;
    Final=Clientes;                
    }
  }else{
      
      NodoComun ClientesComun = new  NodoComun (Cliente,turno);
            ClientesComun.elemento=turno;
            ClientesComun.siguiente=null;
              if(estaVacia()){
             InicioC=ClientesComun;
              FinalC=ClientesComun;
                 }else{
        FinalC.siguiente=ClientesComun;
         FinalC=ClientesComun;                
    }
   }
  
    }
   public int SACAR(boolean tipo){
       
   if(tipo==true){
     aux=Inicio.elemento;
   
        if(Inicio==Final){
         Inicio=null;
         Final=null;
         }else{
    Inicio=Inicio.siguiente;
    tamaño--;
   }
   }else{
        aux=InicioC.elemento;
    
        if(InicioC==FinalC){
         InicioC=null;
         FinalC=null;
         }else{
    InicioC=InicioC.siguiente;
    tamaño--;
   }
      
    }
   return aux;
   }
    public void  PasarVetanillaS( String Cliente[],boolean tipo){
                    if((Ventanilla1[0]==0)||(Ventanilla1[1]==0)||(Ventanilla1[2]==0)){
                        
                        
                    if(Final!=null){
               tipo=true;
           
                Ventanilla1[cont]=Inicio.elemento;
                cont=cont+1;
                
             if(Ventanilla1[0]==Inicio.elemento){
                 if(Ventanilla1[0]==0){
                     
                     Ventanilla1[0]=Inicio.elemento;
                     System.out.println("VENTANILLA1: "+Cliente[0]+Ventanilla1[0]);
                     SACAR(tipo);
                 }else{
             System.out.println("VENTANILLA1: "+Cliente[0]+Ventanilla1[0]);
             SACAR(tipo);}
             }else if(Ventanilla1[1]==Inicio.elemento){
                 if(Ventanilla1[1]==0){
                     
                     Ventanilla1[1]=Inicio.elemento;
                     System.out.println("VENTANILLA1: "+Cliente[0]+Ventanilla1[1]);
                     SACAR(tipo);
                 }else{
             System.out.println("VENTANILLA 2: "+Cliente[0]+ Ventanilla1[1]);
             SACAR(tipo);
                 }
             }else if(Ventanilla1[2]==Inicio.elemento){
                 if(Ventanilla1[2]==0){
                     
                     Ventanilla1[2]=Inicio.elemento;
                     System.out.println("VENTANILLA1: "+Cliente[0]+Ventanilla1[2]);
                     SACAR(tipo);
                 }else{
             System.out.println("VENTANILLA 3: "+Cliente[0]+ Ventanilla1[2]);
             SACAR(tipo);
             } 
           }
        }else if(FinalC!=null) {
            tipo=false;
                 Ventanilla1[cont]=InicioC.elemento;
                 cont=cont+1;
             if(Ventanilla1[0]==InicioC.elemento){
                 
             if(Ventanilla1[0]==0){
                     
                     Ventanilla1[0]=InicioC.elemento;
                     System.out.println("VENTANILLA1: "+Cliente[1]+Ventanilla1[0]);
                     SACAR(tipo);
                 }else{
             System.out.println("VENTANILLA1: "+Cliente[1]+Ventanilla1[0]);
             SACAR(tipo);}
             }else if(Ventanilla1[1]==InicioC.elemento){
                 
             if(Ventanilla1[1]==0){
                     
                     Ventanilla1[1]=InicioC.elemento;
                     System.out.println("VENTANILLA1: "+Cliente[1]+Ventanilla1[1]);
                     SACAR(tipo);
                 }else{
             System.out.println("VENTANILLA 2: "+Cliente[1]+ Ventanilla1[1]);
             SACAR(tipo);}
             }else if(Ventanilla1[2]==InicioC.elemento){
                 
             if(Ventanilla1[2]==0){
                     
                     Ventanilla1[2]=InicioC.elemento;
                     System.out.println("VENTANILLA1: "+Cliente[1]+Ventanilla1[2]);
                     SACAR(tipo);
                 }else{
             System.out.println("VENTANILLA 3: "+Cliente[1]+ Ventanilla1[2]);
             SACAR(tipo);}
             }
           }
         }else {System.out.println("LAS VENTANILLAS ESTAN  LLENAS  " );}
       }
    
    
    public void LiveraraVentanilla(){
         num=(int)(Math.random()*2+0);
      switch (num) {
          case 0:
              if (Ventanilla1[0]==0){
                  System.out.println("ESTA VENTANILLA YA HA SIDO DESOCUPADA YA NO PUEDES DESOCUPARLA");
              }else{
                  Ventanilla1[0]=0;
                  
                  System.out.println(" SE DESACUPO LA VENTANILLA1:") ;
              }  break;
          case 1:
              if (Ventanilla1[1]==0){
                  System.out.println("ESTA VENTANILLA YA HA SIDO DESOCUPADA YA NO PUEDES DESOCUPARLA");
              }else{
                  Ventanilla1[1]=0;
                  System.out.println(" SE DESACUPO  LA VENTANILLA2:") ;
              }break;
          case 2:
              if (Ventanilla1[2]==0){
                  System.out.println("ESTA VENTANILLA YA HA SIDO DESOCUPADA YA NO PUEDES DESOCUPARLA");
              }else{
                  Ventanilla1[2]=0;
                  System.out.println(" SE DESOCUPO LA VENTANILLA3:") ;}
              break;
          default:
              break;
      }
    }
    


    public void mostrarCola(){
        System.out.println("********************LISTA DE CLIENTES VIP*********************");
        if( estaVacia()){
            System.out.println("NO HAY CLIENTES  VIP");
              }else{
    NodoVIP recorre=Inicio;
    while(recorre!=null){
        
        System.out.println("VIP: "+recorre.elemento);
        recorre=recorre.siguiente;
        
        }
       }
         System.out.println("********************LISTA DE CLIENTTES CUMUNES*********************");
        if( estaVaciaC()){
            System.out.println(" NO HAY CLIENTES COMUN");
              }else{
    NodoComun recorreA=InicioC;
    while(recorreA!=null){
        System.out.println("COMUN: "+recorreA.elemento);
        recorreA=recorreA.siguiente;
        }
       }
    }
    
}
