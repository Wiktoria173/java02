package ru.stqa.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");

    Square s = new Square(); // tu zostaje swtorzony obieky typu s
    s.l = 5;
    System.out.println("Powierzchnia kwadratu o boku " + s.l + " = " + area(s)); //tu: przenosze obiekt w charakterze parametru w funkcje area

    Rectangle r = new Rectangle();
    r.a = 4;
    r.b = 6;
    System.out.println("Powierzchnia prostokąta o bokach " + r.a + " i " + r.b + " = " + area(r));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }

}

