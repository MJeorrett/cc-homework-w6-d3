import static org.junit.Assert.*;
import org.junit.*;

public class PersonTest {

  @Test
  public void getMaleReturnsMale() {
    Person person = Person.getMale();
    assertEquals( 'm', person.getGender() );
  }

  @Test
  public void getFemaleReturnsFemale() {
    Person person = Person.getFemale();
    assertEquals( 'f', person.getGender() );
  }
}
