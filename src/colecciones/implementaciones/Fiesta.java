/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.implementaciones;

/**
 *
 * @author usuario2
 */
public class Fiesta<T extends Invitado> {
    
    private  final Invitado lista[]=new Invitado[100];
    private int indice=-1;
    
    
    public void agregaInvitado(T inv){
       
    
        indice++;
        if(indice<lista.length){
        
            lista[indice]=inv;
        }
    }
    
    public Invitado[] getAll(){
    
        return lista;
    }
    
    public void enLetras(Pagable p,double x){
    
        p.pagarTarjeta(x);
        System.out.println(x);
        if (p instanceof Amigo){
                 Amigo a=(Amigo)p;
                System.out.println("Nombre "+a.getApellido());
        }
    }
}
