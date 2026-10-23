import java.util.Scanner;

public class TemperatureMeasure {
    private double[] measurements = new double[5];
    private double average;

    public void inputMeasurements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 показаний датчика:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Измерение " + (i + 1) + ": ");
            measurements[i] = scanner.nextDouble();
        }
        calculateAverage();
    }

    private void calculateAverage() {
        double sum = 0;
        for (double m : measurements) {
            sum += m;
        }
        average = sum / 5;
    }

    public double getAverage() {
        return average;
    }
}