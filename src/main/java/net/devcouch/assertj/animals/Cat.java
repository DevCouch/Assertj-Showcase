package net.devcouch.assertj.animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return meow();
    }

    public String meow() {
        return "meow";
    }
}
