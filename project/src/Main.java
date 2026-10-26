public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        AddStrategy plus = new AddStrategy();
        SubstractStrategy minus = new SubstractStrategy();
        MultiplyStrategy multiply = new MultiplyStrategy();

        calc.setStrategy(plus);
        int result = calc.calculate(10, 5);
        System.out.println(result);

        calc.setStrategy(multiply);
        result = calc.calculate(10, 5);
        System.out.println(result);
    }
}