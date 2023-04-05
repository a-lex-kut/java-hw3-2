public class BmiService {


    public int calculate(double highM, int massKg) {
        double firstResult = highM * highM;
        double secondResult = massKg / firstResult;
        return (int) secondResult;
    }


}
