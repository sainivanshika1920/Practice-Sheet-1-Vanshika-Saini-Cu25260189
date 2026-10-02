import java.util.Scanner; 
public class Cylinder9 { 
    static final double MIN_DIMENSION = 0.01; 
 
    double radius; 
    double height;  
    Cylinder9(double r, double h) { 
 
        radius = r; 
        height = h; 
    } 
 
    double volume() { 
        return Math.PI * Math.pow(radius, 2) * height; 
    } 
 
    double curvedSurfaceArea() { 
        return 2 * Math.PI * radius * height; 
    } 
 
    double totalSurfaceArea() { 
        return 2 * Math.PI * radius * (radius + height); 
    } 
 
    // Method uses a local variable and conditions. 
    String classify() { 
        double v = volume(); 
 
        if (v < 100) { 
            return "Small"; 
        } else if (v < 500) { 
            return "Medium"; 
        } else { 
            return "Large"; 
        } 
    } 
 
    void display() { 
        System.out.println("\n--- Cylinder Report ---"); 
        System.out.println("Radius = " + radius); 
        System.out.println("Height = " + height); 
        System.out.println("Volume = " + volume()); 
        System.out.println("Curved Surface Area = " 
                           + curvedSurfaceArea()); 
        System.out.println("Total Surface Area = " 
                           + totalSurfaceArea()); 
 
        
        System.out.println("Rounded Volume = " 
                           + Math.round(volume())); 
 
        System.out.println("Category = " + classify()); 
    } 
 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
System.out.print("Enter radius: "); 
double r = sc.nextDouble(); 
System.out.print("Enter height: "); 
double h = sc.nextDouble(); 
if (r < MIN_DIMENSION || h < MIN_DIMENSION) { 
System.out.println("Invalid dimensions."); 
} else { 

Cylinder9 c = new Cylinder9(r, h); 
c.display(); 
} 
sc.close(); 
} 
}