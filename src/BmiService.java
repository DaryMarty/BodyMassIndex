public class BmiService {
    public int calculate(int mass, int height) {
        int squaredValue = height * height;
        int bmi = mass * 10_000 / squaredValue;

        return bmi;
    }
}