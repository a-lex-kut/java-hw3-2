public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmiindex = service.calculate(1.65, 65);
        System.out.println(bmiindex);
    }
}