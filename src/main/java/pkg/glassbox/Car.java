package pkg.glassbox;

import javax.enterprise.inject.Alternative;

@Alternative
public class Car implements IToy{

    public String Interact() {
        return "Beep Beep!";
    }
}
