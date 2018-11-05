/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author T-107
 */
public class Banco {
      public static void main(String[] args) {
       //Primero creamos una tarjeta credito
      TarjetaCredito tcredito=new TarjetaCredito();
      tcredito.setNumero(1234);
      tcredito.setNombre("banamex");
      tcredito.setTipo("credito");
      tcredito.setSaldo(100);
      
      TarjetaAhorro tahorro=new TarjetaAhorro();
      tahorro.setNumero(4321);
      tahorro.setNombre("bancomer");
      tahorro.setTipo("ahorro");
      tahorro.setSaldo(100);
      
      TarjetaNomina tnomina=new TarjetaNomina();
      tnomina.setNumero(6666);
      tnomina.setNombre("hsbc");
      tnomina.setTipo("nomina");
      tnomina.setSaldo(100);
      
      //Generamos el codigo de depocito 
      //vamos a hacerlo de la forma mas basica 
      
      //Tarjeta de nomina 
     // tnomina.pagar(150);
      
      //Tarjeta de Ahorro
      
      //tahorro.pagar(150);
      
      
      //Tarjet6a de credito
      
     // tcredito.pagar(150);
      
      //Generamos un arreglo para las tarjeta
      
      Tarjeta tarjetas[]=new Tarjeta[3];
      tarjetas[0]=tnomina;
      tarjetas[1]=tcredito;
      tarjetas[2]=tahorro;
      
      
      //Iteramos el Arreglo osea recorrer un arreglo
      
      for(Tarjeta t: tarjetas){
          t.pagar(150);
          System.out.println(" El Saldo es "+t.getSaldo()+" Tipo "+t.getTipo());
      }
      
      
      }
      
}
