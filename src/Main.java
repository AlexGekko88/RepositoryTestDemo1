import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] sales = {500, 1000, 560, 12000, 2500, 3450, 30120, 8900};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Самая крупная  продажа на " + salesManager.max() + " руб.");

        long max = getMax(sales);
        System.out.println("Maximum: " + max);

        long min = getMin(sales);
        System.out.println("Minimum: " + min);

        double avg = getAvg(sales);
        System.out.println("Average: " + avg); // Среднее

        double mean = getTrim(sales);
        System.out.println("Trimmed mean: " + mean); // Расчёт обрезанного среднего. Среднее значение, за исключением max и min.
    }

    public static long getMax(long[] inputArray) {
        long maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static long getMin(long[] inputArray) {
        long minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static double getAvg(long[] inputArray) {
        double total = 0;
        double avg;
        for (int i = 0; i < inputArray.length; i++) {
            total = total + inputArray[i];
        }
        return avg = total / inputArray.length;
    }

    public static double getTrim(long[] inputArray) {
        long max = getMax(inputArray);
        long min = getMin(inputArray);
        double sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
        }
        return ((double) (sum - max - min)) / (inputArray.length - 2);
    }
}