package pkg.glassbox;

import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@javax.decorator.Decorator
public abstract class Decorator implements IToy {
    @Inject
    @Delegate
    @Any
    IToy toy;
    public String Interact() {
        return " DECORATED" + toy.Interact();
    }

}