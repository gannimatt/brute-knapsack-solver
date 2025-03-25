import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bruteForce {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src\\knapsack"));
        int capacity = Integer.parseInt(scan.nextLine().trim());
        List<Item> items = new ArrayList<>();
        while (scan.hasNextLine()) {
            String[] data = scan.nextLine().split(" ");
            int weight = Integer.parseInt(data[0]);
            int value = Integer.parseInt(data[1]);
            items.add(new Item(weight, value));

        }
        scan.close();

        int size = items.size();
        int totalCombinations = (int) Math.pow(2, size);
        int[] optimalVector = new int[size];
        int optimalValue = 0;
        int optimalWeight = 0;

        for (int i = 0; i < totalCombinations; i++) {
            int[] currentVector = new int[size];
            int currentValue = 0;
            int currentWeight = 0;
            int number = i;


            for (int j = 0; j < size; j++) {
                currentVector[j] = number % 2;
                if (currentVector[j] == 1) {
                    currentValue += items.get(j).value;
                    currentWeight += items.get(j).weight;
                }
                number /= 2;
            }

            if (currentWeight <= capacity && currentValue > optimalValue) {
                optimalValue = currentValue;
                optimalWeight = currentWeight;
                optimalVector = currentVector.clone();
            }
        }

        System.out.println("Optimal Value: " + optimalValue);
        System.out.println("Optimal Weight: " + optimalWeight);
        System.out.print("Optimal Characteristic Vector: ");
        for (int bit : optimalVector) {
            System.out.print(bit + " ");
        }
        System.out.println();
    }
}