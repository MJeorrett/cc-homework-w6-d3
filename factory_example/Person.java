public class Person {

  private char gender;

  public Person( char gender ) {
    this.gender = gender;
  }

  public char getGender() {
    return this.gender;
  }

  public static Person getMale() {
    Person newPerson = new Person( 'm' );
    return newPerson;
  }

  public static Person getFemale() {
    return new Person( 'f' );
  }

}
