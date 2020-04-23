/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.colecciones;

import java.util.*;

/**
 *
 * @author usuario2
 */
public class PruebaColecciones {
    
    public static void main(String...a){
    //Byte Short Integer Long Double Float Boolean Character
    
    //Primitivos Wrappeados
    
        HashSet<Integer> conjunto=new HashSet<>();
        
       conjunto.add(12);
       conjunto.add(45);
       conjunto.add(77);
       conjunto.add(45);
       
       
       Iterator<Integer> it=conjunto.iterator();
       while(it.hasNext()){
                 Integer x=it.next();
                 System.out.println(x);
       }
       
       
       
       //Guardando String
       
       HashSet<String> conjunto2=new HashSet<>();
        
       conjunto2.add("Maria");
       conjunto2.add("Juana");
       conjunto2.add("Pedro");
       conjunto2.add("Juana");
       
       
       
       Iterator<String> it2=conjunto2.iterator();
       while(it2.hasNext()){
                 String x=it2.next();
                 System.out.println(x);
       }
       
       //Guardamos nuestros objetos
       
       HashSet<Cliente> conjunto3=new HashSet<>();
        Cliente c1=new Cliente(23,"Perez");
        Cliente c2=new Cliente(45,"Lopez");
        Cliente c3=new Cliente(89,"Martinez");
        Cliente c4=new Cliente(23,"Perez");
        

        System.out.println(c1.equals(c4));
       
       conjunto3.add(c1);
       conjunto3.add(c2);
       conjunto3.add(c3);
       conjunto3.add(c4);
       
       
       Iterator<Cliente> it3=conjunto3.iterator();
       while(it3.hasNext()){
                 Cliente x=it3.next();
                 System.out.println(x.getApellido());
                 System.out.println(x.hashCode());
       }
       
    }
    
}
