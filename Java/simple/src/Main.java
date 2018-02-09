import java.util.Scanner;

public class Main {

    public static int rectangle(int width, int height){
        return width * height;
    }

    public static int square(int width){
        return rectangle(width, width);
    }

    public static void triangle(){
        double width;
        double height;
        double triangle_area;

        Scanner n = new Scanner(System.in);
        System.out.print("triangle width: ");
        width = n.nextDouble();
        System.out.print("triangle height: ");
        height = n.nextDouble();
        triangle_area = .5 * width * height;
        System.out.println("triangle area = " + triangle_area);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World! ไทย ดี");
        int width;
        int height;
        int rectangle_area, square_area;



        Scanner in = new Scanner(System.in);
        System.out.print("please put width: ");
        width = in.nextInt();
        System.out.print("please put height: ");
        height = in.nextInt();

//  rectangle method
        rectangle_area = rectangle(width, height);
        System.out.println("width = " + width + " height = " + height + "\nrectangle area = " + rectangle_area);
//  square method
        square_area = square(width);
        System.out.println("Square area = " + square_area);
//  triangle method
        triangle();


    }
}
