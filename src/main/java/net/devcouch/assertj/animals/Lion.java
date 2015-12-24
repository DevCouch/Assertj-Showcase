package net.devcouch.assertj.animals;

/**
 * Created by markusvieghofer on 23.12.15.
 */
public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return "Roaw";
    }
}
