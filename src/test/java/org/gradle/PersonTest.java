package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {
  @Test
  public void canConstructAPersonWithAName() {
    Person person = new Person("Larry");
    assertEquals("Larry", person.getName());
  }

  @Test
  public void canConstructAPersonWithDifferentName() {
    Person person = new Person("Larry2");
    assertEquals("Larry2", person.getName());
  }
}
