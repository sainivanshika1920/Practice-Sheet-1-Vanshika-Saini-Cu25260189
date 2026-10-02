import java.util.Scanner; 
public class Cylinder5 {  
    double radius; 
    double height;  
    Cylinder5(double r, double h) { 
        radius = r;
         height = h; 
    } 
 
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
        Cylinder5 c = new Cylinder5(r, h); 
 
        System.out.println("Volume = " + c.calculateVolume()); 
        System.out.println( 
            "Total Surface Area = " + c.calculateSurfaceArea() 
        ); 
 
        sc.close(); 
    } 
}
