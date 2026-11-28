public class Main{
    // Aufgabe 4a:
    public static double average(int[] numbers){
        if (numbers != null &&
                numbers.length > 0){
            int sum = 0;
            for (int i = 0;
                    i < numbers.length;
                    ++i){
                sum += numbers[i];
            }
            return (double) sum / numbers.length;
        }
        return 0.0;
    }
}