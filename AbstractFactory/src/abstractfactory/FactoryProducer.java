/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author sp21-bse-043
 */
public class FactoryProducer {
   public static AbstractFactory getFactory(String name){   
      if(null==name){
          
      }else switch (name) {
           case "rounded":
               return new RoundedShapeFactory();
           case "simple":
               return new ShapeFactory();
           case "singleborder":
               return new SingleBorderShapeFactory();
           case "doubleborder":
               return new DoubleBorderShapeFactory();
           default:
               break;
       }
       return null;
   }
}
