import java.util.Random;

public class L3P1 {
    public static void main(String[] args) {
        // Size of the array
        int size = 11;
        
        // Generate random heights between 150 and 250 cm
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101);  // 150 to 250 inclusive
        }
        
        // Calculate sum
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        
        // Calculate mean
        double mean = (double) sum / size;
        
        // Find shortest (minimum) height
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        
        // Find tallest (maximum) height
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        
        // Display results
        System.out.println("Heights (cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\n");
        System.out.println("Sum: " + sum + " cm");
        System.out.printf("Mean: %.2f cm%n", mean);
        System.out.println("Shortest: " + shortest + " cm");
        System.out.println("Tallest: " + tallest + " cm");
    }
}
    

