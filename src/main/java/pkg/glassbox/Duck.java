package pkg.glassbox;

import javax.enterprise.inject.Alternative;

@Alternative
public class Duck implements IToy{

    public String Interact() {
        return "Quack!";
    }
}
