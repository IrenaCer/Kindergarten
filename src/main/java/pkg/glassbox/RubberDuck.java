package pkg.glassbox;

import javax.enterprise.inject.Specializes;
import javax.interceptor.Interceptor;

@IInterceptor
@Specializes
public class RubberDuck extends Duck{

    public String Interact() {
        return "squish quack";
    }
}
