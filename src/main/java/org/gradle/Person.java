package org.gradle;

public class Person {

  private String personName;

  public static void main(String[] args) {
    System.out.println("smth");
  }

  public Person(String name) {
    this.personName = name;
  }

  public void setPersonName(String name) {
    this.personName = name;
  }

  public String getPersonName() {
    return personName;

  }

  private Integer age;

}
