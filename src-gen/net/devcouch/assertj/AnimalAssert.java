package net.devcouch.assertj;

import net.devcouch.assertj.animals.Animal;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link Animal} specific assertions - Generated by CustomAssertionGenerator.
 */
public class AnimalAssert extends AbstractAssert<AnimalAssert, Animal> {

  /**
   * Creates a new <code>{@link AnimalAssert}</code> to make assertions on actual Animal.
   * @param actual the Animal we want to make assertions on.
   */
  public AnimalAssert(Animal actual) {
    super(actual, AnimalAssert.class);
  }

  /**
   * An entry point for AnimalAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myAnimal)</code> and get specific assertion with code completion.
   * @param actual the Animal we want to make assertions on.
   * @return a new <code>{@link AnimalAssert}</code>
   */
  public static AnimalAssert assertThat(Animal actual) {
    return new AnimalAssert(actual);
  }

  /**
   * Verifies that the actual Animal's name is equal to the given one.
   * @param name the given name to compare the actual Animal's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Animal's name is not equal to the given one.
   */
  public AnimalAssert hasName(String name) {
    // check that actual Animal we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualName = actual.name;
    if (!Objects.areEqual(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return this;
  }

}