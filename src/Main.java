public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMassIndex = service.calculate(51, 165);
        System.out.println(bodyMassIndex);
    }
}
