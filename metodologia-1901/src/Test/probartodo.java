/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author xaviiorichi
 */
public class probartodo {
    public static void main(String[] args) {
        Opcion op1=new Opcion("El azucar y la harina",true);
       // System.out.println("tu titulo es "+op1.titulo);
       // System.out.println("Es correcta "+op1.correcta);
        
        Opcion op2=new Opcion("la grasa",false);
        
       Opcion op3=new Opcion("El sol",false);
       
       Opcion op4=new Opcion("la contaminacion",false);
       
       Opcion op5=new Opcion("la sal",false);
     
       Opcion[] opciones={op1,op2,op3,op4,op5};
       
       Pregunta p1=new Pregunta("Esta es la causa del cancer",opciones);
       
        System.out.println(p1.titulo);
        
        for (Opcion opcione : opciones) {
            System.out.println(opcione.titulo);
        }
    }
}
