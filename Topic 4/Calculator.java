public class Calculator {
    private int result;

    public Calculator() {
        reset();
    }

    public void reset() {
        this.result = 0;
    }

    public int getResult() {
        return this.result;
    }

    public void add(int value) {
        this.result += value;
    }

    public void subtract(int value) {
        this.result -= value;
    }

    public void multiply(int value) {
        this.result *= value;
    }

    public void exponent(int value) {
        int base = this.result;
        if (value == 0) {
            this.result = 1;
        } else {
            for (int i = 1; i < value; i++) {
                this.result *= base;
            }
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Initial result: " + calc.getResult());

        calc.add(5);
        System.out.println("After adding 5: " + calc.getResult());

        calc.subtract(2);
        System.out.println("After subtracting 2: " + calc.getResult());

        calc.multiply(4);
        System.out.println("After multiplying by 4: " + calc.getResult());

        calc.exponent(2);
        System.out.println("After raising to the power of 2: " + calc.getResult());

        calc.reset();
        System.out.println("After reset: " + calc.getResult());
    }
}
