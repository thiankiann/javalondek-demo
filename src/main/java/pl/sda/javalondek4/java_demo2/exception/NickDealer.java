package pl.sda.javalondek4.java_demo2.exception;

public class NickDealer {
    private ExceptionGenerator exceptionGenerator;

    public NickDealer(ExceptionGenerator exceptionGenerator) {
        this.exceptionGenerator = exceptionGenerator;
    }

  public String NickFromDealer() throws NoNickExceptions {
        return exceptionGenerator.nick();
  }

  public String Nick(){

        return exceptionGenerator.nickWithRuntimeException();
  }
}
