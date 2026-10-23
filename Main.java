public class Main {
    public static void main(String[] args) {
        ShowTemperature display = new ShowTemperature();

        System.out.println("--- Объект 1 ---");
        TemperatureMeasure sensor1 = new TemperatureMeasure();
        sensor1.inputMeasurements();
        display.show(sensor1.getAverage());

        System.out.println("\n--- Объект 2 ---");
        TemperatureMeasure sensor2 = new TemperatureMeasure();
        sensor2.inputMeasurements();
        display.show(sensor2.getAverage());
    }
}
