/**
 * 
 */
package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;

/**
 * @author L
 *
 * @version 2017Äê3ÔÂ30ÈÕ
 *
 */
@Aspect
public class OtherAudience {

	@Pointcut("execution(** aop.Artist.art(..))")
	public void art(){}
	
	@Around("art")
	public void watch(ProceedingJoinPoint joinPoint){
		try {
			System.out.println("Hello Everyone!");
			System.out.println("Boom CLAP!");

			joinPoint.proceed();
			
			System.out.println("Boom CLAP for nicce art!");
		} catch (Throwable e) {
			
			System.out.println("also Boom CLAP for nicce art!");
		}
		
		
	}
		
	@Bean
	public OtherAudience aud(){
		
		return new OtherAudience();
	}
	
}
