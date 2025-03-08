// class 
//it is the blueprint which includes the property for any class to be created
import java.util.*;

class Box {
    double height;
    double width;
    double length;
}

public class OOPinJava {
    public static void main(String[] args) {
        Box myBox = new Box();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length:");
        myBox.length = s.nextDouble();

        System.out.print("Enter the height:");
        myBox.height = s.nextDouble();

        System.out.print("Enter the width:");
        myBox.width = s.nextDouble();

        double vol = myBox.width * myBox.height * myBox.length;
        System.out.println("Volume is " + vol);
    }
}
