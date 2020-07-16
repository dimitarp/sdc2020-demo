package net.seitenbau.sdc2020;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Demo {
  private static final ResourceBundle messages = ResourceBundle.getBundle("i18n.messages");

  private static final Hello hello = new Hello();

  static {
    try {
      TimeUnit.SECONDS.sleep(1L);
    } catch (InterruptedException e) {
    }
  }

  public static void main(String[] args) throws Exception {
    System.out.print("Choose method: ");
    var methodName = System.console().readLine();

    var method = hello.getClass().getMethod(methodName);

    System.out.println(method.invoke(hello));
  }
}
