import java.util.Scanner; 
public class Cylinder3 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter radius: "); 
        double radius = sc.nextDouble();
        System.out.print("Enter height: "); 
        double height = sc.nextDouble();  
        if (radius <= 0 || height <= 0) { 
            System.out.println("Invalid dimensions."); 
        } else { 
            double volume = Math.PI * Math.pow(radius, 2) * height; 
            double surfaceArea = 2 * Math.PI * radius * (radius + height); 
            System.out.println("Volume = " + volume); 
            System.out.println("Total Surface Area = " + surfaceArea);  
        }
        sc.close();
    }
}