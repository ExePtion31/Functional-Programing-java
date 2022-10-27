package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {

  public static void main(String[] args) {
    //Módulo UnaryOperator
    UnaryOperator<String> quote = text -> "\"" + text + "\"";
    System.out.println(quote.apply("Agregando comillas al texto"));

    //Módulo BiFunction
    BiFunction<Integer, Integer, Integer> multiplication = (x, y) -> x * y;
    System.out.println("La multiplicación es: " + multiplication.apply(5, 2));
  }
}
