import java.util.Scanner; 
 
public class Cylinder6 {  
    static String unit = "cm";
     double radius; 
    double height; 
    Cylinder6() { 
        radius = 1; 
        height = 1; 
    } 
    Cylinder6(double r, double h) { 
        radius = r; 
        height = h; 
    } 
 
    double calculateVolume() { 
        return Math.PI * Math.pow(radius, 2) * height; 
    } 
 
    void display() { 
        System.out.println("Radius = " + radius + " " + unit); 
        System.out.println("Height = " + height + " " + unit); 
        System.out.println("Volume = " + calculateVolume()); 
    } 
 
    public static void main(String[] args) { 
        Cylinder6 c1 = new Cylinder6(); 
        System.out.println("Default Constructor:"); 
        c1.display(); 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter radius: "); 
        double r = sc.nextDouble(); 
 
        System.out.print("Enter height: "); 
        double h = sc.nextDouble(); 
        Cylinder6 c2 = new Cylinder6(r, h); 
        System.out.println("Parameterized Constructor:"); 
        c2.display(); 
 
        sc.close(); 
    } 
}