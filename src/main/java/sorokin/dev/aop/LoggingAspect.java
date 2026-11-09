package sorokin.dev.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("@annotation(loggable)")
    public void log(JoinPoint joinPoint,
                    Loggable loggable) {
        for (int i = 0; i < loggable.countPrintLog(); i++) {
            System.out.printf("Log %s: before method= %s\n",
                    loggable.value(), joinPoint.getSignature().getName());
        }
    }

//    @Around("execution(* sorokin.dev.springcore.TaskManager.*(..))")
//    public Object logAround(
//            ProceedingJoinPoint proceedingJoinPoint
//    ) throws Throwable {
//        System.out.println("До метода");
//        Long result = (Long) proceedingJoinPoint.proceed();
//        System.out.println("после метода");
//        return result / 2;
//    }

//    @Before("execution(* sorokin.dev.springcore.TaskManager.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("перед вызовом метода: " + joinPoint.getSignature().getName());
//    }
//
//    @AfterReturning(value = "execution(* sorokin.dev.springcore.TaskManager.*(..))",
//            returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint, Object result) {
//        System.out.println("после возвращения результата: " + joinPoint.getSignature().getName() + "результат = " + result);
//    }
//
//    @AfterThrowing(value = "execution(* sorokin.dev.springcore.TaskManager.*(..))",
//            throwing = "exc")
//    public void afterThrowing(
//            JoinPoint joinPoint,
//            Exception exc
//    ) {
//        System.out.println("после исключения: " + exc.getMessage());
//    }
//
//    @After("execution(* sorokin.dev.springcore.TaskManager.*(..))")
//    public void after(
//            JoinPoint joinPoint
//    ) {
//        System.out.println("после выполнения метода: " +joinPoint.getSignature().getName());
//    }


}
