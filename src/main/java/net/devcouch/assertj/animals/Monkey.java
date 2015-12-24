package net.devcouch.assertj.animals;

/**
 * Created by markusvieghofer on 23.12.15.
 */
public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return "Oo";
    }
}
