package net.seitenbau.sdc2020;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Demo {
  private static final ResourceBundle messages = ResourceBundle.getBundle("i18n.messages");

  static {
    try {
      TimeUnit.SECONDS.sleep(1L);
    } catch (InterruptedException e) {
    }
  }

  public static void main(String[] args) {
    var hello = messages.getString("hello.sdc");
    System.out.println(hello);
  }
}
