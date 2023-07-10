package Model;

public class CalculatorModel {
    private double num1;
    private double num2;
    private char operator;

    public CalculatorModel() {
        num1 = 0;
        num2 = 0;
        operator = ' ';
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double performCalculation() {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
        }
        return result;
    }
}
