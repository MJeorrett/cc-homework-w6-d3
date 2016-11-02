public class Person {

  private String catchphrase;
  private Emphasiser emphasiser;

  public Person( String catchphrase, Emphasiser emphasiser ) {
    this.catchphrase = catchphrase;
    this.emphasiser = emphasiser;
  }

  public void setEmphasiser( Emphasiser emphasiser ) {
    this.emphasiser = emphasiser;
  }

  public String getCatchphraseEmphasised() {
    return this.emphasiser.emphasise( this.catchphrase );
  }
}
