package org.dhaval.springexperiment.aop;

import model.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Dhaval on 4/5/2016.
 * Advice is standard AOP terminology. An aspect contains number of advices
 */
@Component
@Aspect
public class LoggingAspect {

    @Before("allSetters()")
    public void loggingAdvice(JoinPoint joinPoint){
        Circle circle = (Circle)joinPoint.getTarget();
        System.out.println("Advice run get method called");
        circle.setName("DSdfdsf");

    }
//    @Before("args(name)")
//    public void allArguments(String name){
//        System.out.println("A method taht takes string has been called value is " +name);
//    }
    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void exceptionAdvice(String name, RuntimeException ex){
        System.out.println("Run time exception occured "+ex);
    }

    @Around("@annotation(org.dhaval.springexperiment.aop.Loggable)")
    public void exceptionAdvice(ProceedingJoinPoint proceedingJoinPoint){
        try{
            System.out.println("Before getter call");
            proceedingJoinPoint.proceed();
            System.out.println("After getter called");
        }
        catch(Throwable ex){
            System.out.println("Exception caught");
        }
    }

    @Pointcut("execution(public * get*(..))")
    public void allGetters(){} // Dummy method to hold Pointcut annotaion

    @Pointcut("execution(public void set*(*))")
    public void allSetters(){
    }

    @Pointcut("within(model.Circle)")
    public void allCircle(){}
}
