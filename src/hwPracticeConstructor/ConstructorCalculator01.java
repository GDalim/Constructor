package hwPracticeConstructor;

public class ConstructorCalculator01 {

    int num1;
    int num2;
    int total;

    ConstructorCalculator01(int num1, int num2)
    {

        this.num1=num1;
        this.num2=num2;
        this.total=this.num1+this.num2;

        System.out.println(this.total);

    }

    public static void main(String[] args) {
        ConstructorCalculator01 hi = new ConstructorCalculator01(20, 65  );
    }
}
