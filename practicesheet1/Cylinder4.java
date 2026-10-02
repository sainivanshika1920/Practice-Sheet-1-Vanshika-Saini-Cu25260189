import java.util.Scanner;

public class Cylinder4 {
    double radius;
    double height;
    double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height; 
    }
    double calculateSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height); 
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter radius: "); 
        double r = sc.nextDouble(); 
        System.out.print("Enter height: "); 
        double h = sc.nextDouble();  
        Cylinder4 c = new Cylinder4(); 
        c.radius = r; 
        c.height = h;  
    System.out.println("Volume = " + c.calculateVolume()); 
    System.out.println("Total Surface Area = " + c.calculateSurfaceArea()); 
    sc.close(); 
    }
}