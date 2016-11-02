import static org.junit.Assert.*;
import org.junit.*;

public class PersonTest {

  private Person person;
  private Emphasiser upCaser;
  private Emphasiser youMuster;

  @Before
  public void before() {
    this.youMuster = new YouMuster();
    this.upCaser = new UpCaser();
    this.person = new Person( "never pat a burning dog", this.youMuster );
  }

  @Test
  public void youMusterWorks() {
    assertEquals( "You must never pat a burning dog", this.person.getCatchphraseEmphasised() );
  }

  @Test
  public void canChangeStrategy() {
    this.person.setEmphasiser( this.upCaser );
    assertEquals( "NEVER PAT A BURNING DOG", this.person.getCatchphraseEmphasised() );
  }

}
