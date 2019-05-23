package pkg.glassbox;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;

@Interceptor
@IInterceptor
public class TheInterceptor implements Serializable {

    @AroundInvoke
    public Object log(InvocationContext ctx) throws Exception {
        System.out.println("Intercepted this method: " + ctx.getMethod().getName());
        Object obj = ctx.proceed();
        return obj;
    }
}
