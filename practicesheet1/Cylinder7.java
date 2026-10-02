public class Cylinder7 { 
    double radius; 
    double height;
    Cylinder7(double r, double h) { 
        radius = r; 
        height = h; 
    } 
    double calculateVolume() { 
        return Math.PI * Math.pow(radius, 2) * height; 
    } 
    void display(int number) { 
        System.out.println("Cylinder " + number); 
        System.out.println("Radius = " + radius); 
        System.out.println("Height = " + height); 
        System.out.println("Volume = " + calculateVolume()); 
    } 
    public static void main(String[] args) {  
        double[] radii = {2, 3, 4}; 
        double[] heights = {5, 6, 7};  
        for (int i = 0; i < radii.length; i++) {  
            Cylinder7 c = new Cylinder7(radii[i], heights[i]);  
            c.display(i + 1);
            System.out.println(); 
        } 
    } 
}