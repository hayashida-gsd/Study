package schoo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageUtil {

	@Before("execution(* schoo.service.*.*(..))")
	public void beforeMessage() {
		System.out.println("----- Serviceクラス createUser メソッド開始 -----");
	}
}