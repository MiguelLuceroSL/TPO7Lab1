/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7;


import tp7.entidades.Alumno;
import tp7.entidades.Materia;

/**
 *
 * @author edu-1
 */
public class TP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
  

        Alumno a1=new Alumno(123,"maldonado","eduardo");
        Alumno a2=new Alumno(456,"Ovideo","Luis");
        Materia mat=new Materia(111,"matematica",1);
           Materia leng=new Materia(222,"lengua",1);
       Materia ingles=new Materia(111,"ingles",1);
          Materia literal=new Materia(444,"literal",1);
            
        
            
      
        

            a1.agregarMateria(mat);
          a1.agregarMateria(mat);
          
       a1.agregarMateria(ingles);
     a2.agregarMateria(mat);
  a2.agregarMateria(mat);
a2.agregarMateria(ingles);
  
   
       System.out.println(""+a1.cantidadMateria());
        System.out.println(""+a2.cantidadMateria());
      
        
         
        
       


//
//listaalu.add(a1);
//listaalu.add(a2);
//        for (Alumno alumno : listaalu) {
//            System.out.println(""+alumno);
//        }

        
        
    }
   

}
