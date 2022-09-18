public class CreditCalculatorService {
    public double calculate(int credit, double percent, int period) {
        double monthlyPayment = credit * (percent + percent / ((Math.pow(1 + percent)), period)-1);
        return monthlyPayment;

    }
}
