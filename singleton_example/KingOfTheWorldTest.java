import static org.junit.Assert.*;
import org.junit.*;

public class KingOfTheWorldTest {

  @Test
  public void onlyOneInstanceReturned() {
    KingOfTheWorld kingOfTheWorld1 = KingOfTheWorld.getKingOfTheWorld();
    KingOfTheWorld kingOfTheWorld2 = KingOfTheWorld.getKingOfTheWorld();
    assertEquals( kingOfTheWorld1, kingOfTheWorld2 );
  }

}
