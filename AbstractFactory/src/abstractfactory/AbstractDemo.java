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
public class AbstractDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //get shape factory
     System.out.println("\t\t\tSIMPLE SHAPE FACTORY");
      AbstractFactory shapeFactory = FactoryProducer.getFactory("simple");
      //get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shape shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
      Shape shape3 = shapeFactory.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape3.draw();
      //get shape factory
      
      System.out.println("\t\t\tROUNDED FACTORY");
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory("rounded");
      //get an object of Shape Rectangle
      Shape shape4 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape4.draw();
      //get an object of Shape Square 
      Shape shape5 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape5.draw();
      
      Shape shape6 = shapeFactory1.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape6.draw();
      System.out.println("\t\t\tSINGLE BORDERED FACTORY");
      AbstractFactory shapeFactory2 = FactoryProducer.getFactory("singleborder");
      //get an object of Shape Rectangle
      Shape shape7 = shapeFactory2.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape7.draw();
      //get an object of Shape Square 
      Shape shape8 = shapeFactory2.getShape("SQUARE");
      //call draw method of Shape Square
      shape8.draw();
      
      Shape shape9 = shapeFactory2.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape9.draw();
        System.out.println("\t\t\tDOUBLE BORDERED FACTORY");
      AbstractFactory shapeFactory3 = FactoryProducer.getFactory("doubleborder");
      //get an object of Shape Rectangle
      Shape shape10 = shapeFactory3.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape10.draw();
      //get an object of Shape Square 
      Shape shape11 = shapeFactory3.getShape("SQUARE");
      //call draw method of Shape Square
      shape11.draw();
      
      Shape shape12 = shapeFactory3.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape12.draw();
    }
    
}
