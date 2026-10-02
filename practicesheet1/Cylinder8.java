import java.util.Scanner; 
public class Cylinder8 { 
    double radius; 
    double height; 
    Cylinder8(double r, double h) { 
        radius = r; 
        height = h; 
        } 
        double calculateVolume() { 
            return Math.PI * Math.pow(radius, 2) * height; 
        } 
        public static void main(String[] args) { 
            Scanner sc = new Scanner(System.in); 
            System.out.print("How many cylinders? "); 
            int n = sc.nextInt(); 
            double[] radii = new double[n]; 
            double[] heights = new double[n]; 
            for (int i = 0; i < n; i++) { 
                System.out.print("Radius " + (i + 1) + ": "); 
                radii[i] = sc.nextDouble(); 
                System.out.print("Height " + (i + 1) + ": "); 
                heights[i] = sc.nextDouble(); 
            } 
            double totalVolume = 0; 
            for (int i = 0; i < n; i++) { 
                Cylinder8 c = new Cylinder8(radii[i], heights[i]); 
                double volume = c.calculateVolume(); 
                totalVolume = totalVolume + volume; 
                System.out.println( "Cylinder " + (i + 1) + " Volume = " + volume ); 
            }  
    System.out.println("Total Volume = " + totalVolume); 
    sc.close();
}
}