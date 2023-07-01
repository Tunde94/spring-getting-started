package ro.sda.spring.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//a join pont is an opportunity within the code to apply an aspect(just an opportunity)
//ones you selected one or more join point and applied the aspect on them, there you have a point-cut

//aspect is the class that contains cross - cutting concerns logic

/*when you go to a restaurant, you look at the menu and see several options to choose from (all the methods)
You can order one or more of the menu. But you actually order them, they are just "opportunities to dine"(join point).
 Once you place the order and the waiter bring is to your table, it's a meal(point-cut)
 */

@Aspect
public class MathAspect {
    //advice is one single action that could happen in a certain situation

    @After("execution(* ro.sda.spring.services.MathService.*(..))")
    public void after() {
        System.out.println("After advice!");
    }
    @AfterThrowing("execution(* ro.sda.spring.services.MathService.*(..))")
    public void afterThrowing() {
        System.out.println("After throwing advice!");
    }

    @Before("execution(* ro.sda.spring.services.MathService.*(..))")

    public void before() {
        System.out.println("Before advice!");

    }
}
