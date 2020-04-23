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
public class Test {
    
    public static void main(String x[]){
    
        Amigo juan=new Amigo(233,"juan","perez");
        Familiar karina= new Familiar(333,"Karina","Martino");
        Especial matias=new Especial(332,"Matias","Castro");
       
        
        
        Fiesta<Invitado> f=new Fiesta<Invitado>();
        
        f.agregaInvitado(karina);
        f.agregaInvitado(matias);
        f.agregaInvitado(juan);
        
       
        
        
    
    }
    
}
