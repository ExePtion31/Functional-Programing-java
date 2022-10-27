package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunction {

  public static void main(String[] args) {
    //Módulo Function
    Function<Integer, Integer> square = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer x) {
        return x * x;
      }
    };
    System.out.println("El número al cuadrado es: " + square.apply(7));

    //Modulo Predicate
    Predicate<Integer> isEven = x -> x % 2 == 0;
    System.out.println("El numero es par?: " + (isEven.test(3) ? "Si" : "No")); //True

    Student juan = new Student(5.2);
    Predicate<Student> isApproved = student -> student.getScore() > 5.0;
    System.out.println("El estudiante aprobó?: " + (isApproved.test(juan) ? "Si" : "No"));

  }

  public static class Student {

    private double score;

    public Student(double score) {
      this.score = score;
    }

    public double getScore() {
      return score;
    }

    public void setScore(double score) {
      this.score = score;
    }
  }
}
