package com.training;

/**
 * 
 * @author nliem
 * 
 * Comment comment comment.....
 *
 */
public class Application {
  public static void main(String[] args) {
    Greeting grtObject = new Greeting();
    System.out.println(grtObject.getMessage());
    ClassLoader clsLoader = grtObject.getClass().getClassLoader();
    System.out.println("My class loader (grtObject) " + clsLoader);
    
    String s = new String("Hello");
    ClassLoader sClassLoader = s.getClass().getClassLoader();
    System.out.println("String class loader " + sClassLoader);
  }
}
