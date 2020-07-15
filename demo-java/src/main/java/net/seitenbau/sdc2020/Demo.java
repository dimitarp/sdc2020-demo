package net.seitenbau.sdc2020;

import java.util.ResourceBundle;

public class Demo {
  private static final ResourceBundle messages = ResourceBundle.getBundle("i18n.messages");

  public static void main(String[] args) {
    var hello = messages.getString("hello.sdc");
    System.out.println(hello);
  }
}
