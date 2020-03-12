package ru.stqa.sandbox;

public class Square {

  public double l;

  //konstruktor
  public Square(double len) {
    this.l = len;
  }

  public double area() {
    return this.l * this.l;
  }

}
