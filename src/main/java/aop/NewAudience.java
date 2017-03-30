/**
 * 
 */
package aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author L
 *
 * @version 2017Äê3ÔÂ30ÈÕ
 *
 */
@Aspect
public class NewAudience {

	@Pointcut("execution(** aop.Artist.art(..))")
	public void art(){}
	
	@Before("art")
	public void talkshow(){
		
		System.out.println("Hello Everyone!");
	}
	@Before("art")
	public void clap(){
		
		System.out.println("Boom CLAP!");
	}
	@AfterReturning("art")
public void clapSecond(){
		
		System.out.println("Boom CLAP for nicce art!");
	}
	@AfterThrowing("art")
public void encourage(){
		
		System.out.println("also Boom CLAP for nicce art!");
	}
	
	
	
}
