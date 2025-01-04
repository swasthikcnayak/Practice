/**
 * Problem statement : Create different types of the objects based on the paramters.
 * Helps to decouple the object creation logic from the client.
 * Any future chnges in the constructor of the object, only factory needs to be changes
 * and no need to change the client.
 */

interface Shape { 
    void draw();
}
class Rectangele implements Shape {
    int width;
    int height;

    public Rectangele(){
    }

    public void draw(){
        System.out.println("Drawing Rectangele");
    }
}

class Circle implements Shape {
    int radius;

    public Circle(){
    }

    public void draw(){
        System.out.println("Drawing Circle");
    }
}

 interface IFactory {
    Shape getShape(String shapeType);
}
public class Factory implements IFactory{
    
    public Shape getShape(String shapeType){
        if(shapeType == "CIRCLE"){
            return new Circle();
        }else if(shapeType == "RECTANGLE"){
            return new Rectangele();
        }
        else {
            return null; // can use null object pattern here.
        }
    }
}

class Client { 
    public static void main(String[] args){
        IFactory factory = new Factory();
        Shape shape = factory.getShape("CIRCLE");
        shape.draw();

        // as seen client only depneds on interface and not on abstract implemetnations
        // also is easy to add new types of shapes
    }
}