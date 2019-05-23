package pkg.glassbox;

import javax.enterprise.inject.Specializes;
import javax.interceptor.Interceptor;
import java.io.Serializable;

@IInterceptor
@Specializes
public class RubberDuck extends Duck implements Serializable{

    public String Interact() {
        return "squish quack";
    }
}
