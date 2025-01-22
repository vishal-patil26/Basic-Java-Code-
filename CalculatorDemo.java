
//Method Overloading 

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    float add(float a, float b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition of 10 and 20: " + calculator.add(10, 20));

        System.out.println("Addition of 10, 20, and 30: " + calculator.add(10, 20, 30));

        System.out.println("Addition of 5.5 and 4.5: " + calculator.add(5.5f, 4.5f));
    }
}
