import converting.Fahrenheit;
import converting.Kelvin;
import primeNumbers.Prime;
import shape.Ball;
import shape.Cylinder;
import shape.Piramid;
import shape.Box;



import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        //Prime.findPrimeNumbers();

        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.convert(10);
        Kelvin kelvin = new Kelvin();
        kelvin.convert(10);

       Ball ball = new Ball(5);
       Cylinder cylinder = new Cylinder(3, 4);
       Piramid piramid = new Piramid(3,4);

       Box box = new Box(500);
        System.out.println(box.add(ball));
        System.out.println(box.add(piramid));
        System.out.println(box.add(cylinder));

    }

}
