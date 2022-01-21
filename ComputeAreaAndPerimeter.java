import java.util.Scanner;

public class ComputeAreaAndPerimeter{

    public static Shape getShape(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter R for rectangle");
        String figType = in.next();
        if (figType.equalsIgnoreCase("R")){
            return new Rectangle();
        }
        else{
            return null;
        }
    }

    public static void displayResult(Shape myShape, double area, double perimeter){
        System.out.println(myShape);
        System.out.printf("The area is %.2f%nThe perimeter is %.2f%n",area,perimeter);
    }
    
    public static void main(String args[]){
        Shape myShape;
        double perimeter;
        double area;
        myShape = getShape();
        myShape.readShapeData();
        perimeter = myShape.computerPerimeter();
        area = myShape.computeArea();
        displayResult(myShape, area, perimeter);
        System.exit(0);
    }
}