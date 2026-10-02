import java.util.Scanner;

public class Cylinder10 {

    static final double PI = Math.PI;
    static int objectCount = 0;

    double radius;
    double height;

    Cylinder10(double r, double h) {
        radius = r;
        height = h;
        objectCount++;
    }

    double calculateVolume() {
        return PI * Math.pow(radius, 2) * height;
    }

    double calculateCurvedSurfaceArea() {
        return 2 * PI * radius * height;
    }

    double calculateTotalSurfaceArea() {
        return 2 * PI * radius * (radius + height);
    }

    void display(int number) {
        System.out.println("\nCylinder " + number);
        System.out.println("Radius = " + radius);
        System.out.println("Height = " + height);
        System.out.println("Volume = " + calculateVolume());
        System.out.println("Curved Surface Area = "
                + calculateCurvedSurfaceArea());
        System.out.println("Total Surface Area = "
                + calculateTotalSurfaceArea());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cylinders: ");
        int n = sc.nextInt();

        if (n <= 0) {

            System.out.println(
                    "Number of cylinders must be greater than 0.");

        } else {

            double[] radii = new double[n];
            double[] heights = new double[n];
            double[] volumes = new double[n];

            for (int i = 0; i < n; i++) {

                System.out.println(
                        "\nEnter details for Cylinder " + (i + 1));

                System.out.print("Radius: ");
                radii[i] = sc.nextDouble();

                System.out.print("Height: ");
                heights[i] = sc.nextDouble();
            }

            double totalVolume = 0;
            double largestVolume = 0;
            int largestCylinder = 0;

            for (int i = 0; i < n; i++) {

                if (radii[i] <= 0 || heights[i] <= 0) {

                    System.out.println(
                            "Invalid dimensions for Cylinder "
                                    + (i + 1));

                    volumes[i] = 0;

                } else {

                    Cylinder10 c = new Cylinder10(
                            radii[i], heights[i]);

                    volumes[i] = c.calculateVolume();

                    totalVolume = totalVolume + volumes[i];

                    if (volumes[i] > largestVolume) {
                        largestVolume = volumes[i];
                        largestCylinder = i + 1;
                    }

                    c.display(i + 1);
                }
            }

            double averageVolume = totalVolume / n;

            System.out.println(
                    "\n========== FINAL REPORT ==========");

            System.out.println(
                    "Valid Objects Created = " + objectCount);

            System.out.println(
                    "Total Volume = " + totalVolume);

            System.out.println(
                    "Average Volume = " + averageVolume);

            if (objectCount > 0) {

                System.out.println(
                        "Largest Cylinder = " + largestCylinder);

                System.out.println(
                        "Largest Volume (rounded) = "
                                + Math.round(largestVolume));

            } else {

                System.out.println(
                        "No valid cylinder was created.");
            }
        }

        sc.close();
    }
}