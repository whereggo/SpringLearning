/**
 * 
 */
package aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author L
 *
 * @version 2017Äê3ÔÂ30ÈÕ
 *
 */
@Aspect
public class Audience {

	@Before("execution(** aop.Artist.art(..))")
	public void talkshow(){
		
		System.out.println("Hello Everyone!");
	}
	@Before("execution(** aop.Artist.art(..))")
	public void clap(){
		
		System.out.println("Boom CLAP!");
	}
	@AfterReturning("execution(** aop.Artist.art(..))")
public void clapSecond(){
		
		System.out.println("Boom CLAP for nicce art!");
	}
	@AfterThrowing("execution(** aop.Artist.art(..))")
public void encourage(){
		
		System.out.println("also Boom CLAP for nicce art!");
	}
	
	
	
}
