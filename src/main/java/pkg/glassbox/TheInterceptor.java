package pkg.glassbox;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@IInterceptor
public class TheInterceptor {

    @AroundInvoke
    public Object log(InvocationContext ctx) throws Exception {
        System.out.println("Intercepted this method: " + ctx.getMethod().getName());
        Object obj = ctx.proceed();
        return obj;
    }
}
