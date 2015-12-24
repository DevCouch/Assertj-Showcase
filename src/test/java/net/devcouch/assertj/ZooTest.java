package net.devcouch.assertj;

import net.devcouch.assertj.animals.Cat;
import net.devcouch.assertj.animals.Dog;
import net.devcouch.assertj.animals.Lion;
import net.devcouch.assertj.animals.Monkey;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZooTest {

    private Zoo zoo = new Zoo();
    private Dog dog;
    private Monkey monkey;
    private Lion lion;
    private Cat cat;

    @Before
    public void setup() {
        dog = new Dog("dog");
        monkey = new Monkey("monkey");
        lion = new Lion("lion");
        cat = new Cat("cat");

        zoo.animals.add(dog);
        zoo.animals.add(monkey);
        zoo.animals.add(lion);
    }

    @Test
    public void zooTest() {
        assertThat(zoo.animals).containsOnly(dog, monkey, lion)
                               .doesNotContain(cat);
    }
}
