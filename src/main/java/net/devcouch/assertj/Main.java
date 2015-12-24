package net.devcouch.assertj;

import net.devcouch.assertj.animals.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal scooby = new Dog("scooby");
        System.out.println(scooby.talk());

        Animal garfield = new Cat("garfield");
        System.out.println(garfield.talk());

        Animal donkey = new Monkey("donkey");
        System.out.println(donkey.talk());

        Animal leo = new Lion("leo");
        System.out.println(leo.talk());


        zoo.animals.add(scooby);
        zoo.animals.add(garfield);
        zoo.animals.add(donkey);
        zoo.animals.add(leo);
    }
}
