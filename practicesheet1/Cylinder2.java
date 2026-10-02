public class Cylinder2 { 
    public static void main(String[] args) { 
        double radius = 5.0; 
        double height = 10.0; 
        double radiusSquared = Math.pow(radius, 2); 
        double volume = Math.PI * radiusSquared * height;double surfaceArea = 2 * Math.PI * radius * (radius + height); 
        System.out.println("Volume = " + volume); 
        System.out.println("Total Surface Area = " + surfaceArea);
    }
}