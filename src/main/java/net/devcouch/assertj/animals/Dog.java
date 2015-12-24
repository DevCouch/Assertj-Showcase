package net.devcouch.assertj.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return bark();
    }

    public String bark() {
        return "woof";
    }
}
