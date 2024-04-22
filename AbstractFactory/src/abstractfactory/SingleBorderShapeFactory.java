/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author sp21-bse-066
 */
public class SingleBorderShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new SingleBorderdRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new SingleBorderdSquare();
      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
         return new SingleBorderdTriangle();
      }	 
      return null;
   }
}