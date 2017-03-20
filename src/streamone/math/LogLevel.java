package streamone.math;

@InTransaction(isMandatory = true)
public enum LogLevel {

  WARNING("Uwaga") {
    @Override
    public String extendedComment() {
      return null;
    }
  }, INFO("Info") {
    @Override
    public String extendedComment() {
      return null;
    }
  }, ERROR("Błąd") {
    @Override
    public String extendedComment() {
      return null;
    }
  }, NOTICE("Notka") {
    @Override
    public String extendedComment() {
      return null;
    }
  };

  private final String comment;

  LogLevel(String comment) {
    this.comment = comment;
  }

  public abstract String extendedComment();
}
