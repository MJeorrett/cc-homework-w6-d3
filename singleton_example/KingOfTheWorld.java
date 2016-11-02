public class KingOfTheWorld {

  private static KingOfTheWorld kingOfTheWorld = new KingOfTheWorld();

  private KingOfTheWorld() {

  }

  public String greet() {
    return "Hello I am the King of the World!";
  }

  public static KingOfTheWorld getKingOfTheWorld() {
    return kingOfTheWorld;
  }

}
