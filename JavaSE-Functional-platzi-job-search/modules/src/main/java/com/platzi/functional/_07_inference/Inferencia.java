package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NombresUtils;
import java.util.List;
import java.util.function.Function;

public class Inferencia {

  public static void main(String[] args) {
    Function<Integer, String> convertidora = integer -> "Al cubo" + integer * 2;

    List<String> alumnos = NombresUtils.getList("Hugo", "Paco", "Luis");
    alumnos.forEach(System.out::println);
  }
}
