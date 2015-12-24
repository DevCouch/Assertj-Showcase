package net.devcouch.assertj.animals;

public abstract class Animal {
    public final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract String talk();
}
