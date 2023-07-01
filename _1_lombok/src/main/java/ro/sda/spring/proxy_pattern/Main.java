package ro.sda.spring.proxy_pattern;

public class Main {

    public static void main(String[] args) {

        MathOperator operator = new ProxyMathOperator();

        operator.add(2, 2);




    }


}
