package org.gradle;

public class Person {

  private String personName;
  private Integer age;

  public Person(String name) {
    this.personName = name;
  }

  public void setPersonName(String name) {
    this.personName = name;
  }

  public String getPersonName() {
    return personName;

  }

}
