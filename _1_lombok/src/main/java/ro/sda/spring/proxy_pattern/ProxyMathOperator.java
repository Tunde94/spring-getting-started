package ro.sda.spring.proxy_pattern;

public class ProxyMathOperator extends MathOperator {

    MathOperator operator = new MathOperator();


    @Override
    public int add(int a, int b) {
        System.out.println("BEFORE");
        try{
            return operator.add(a, b);
        } catch(RuntimeException ex){
            System.out.println("AFTER THROWING");
        }finally {
            System.out.println("AFTER");
        }
        return 0;
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println("BEFORE");
        try{
            return operator.subtract(a, b);
        } catch(RuntimeException ex){
            System.out.println("AFTER THROWING");
        }finally {
            System.out.println("AFTER");
        }
        return 0;
    }
}
