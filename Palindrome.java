import java.util.Scanner;

/**
Escribe un programa que pida una cadena al usuario y que revise si esta es un palindromo o no y terminar.

Un palindromo significa que los caracteres de la cadena son los mismos al leer hacia adelante o hace atras.
Debes ignorar los espacios, los acentos, puntuaciones y mayusculas y minusculas.

Ejemplos de palindromos:
Amor a Roma
Bob
Somos o no somos
Acaso hubo buhos aca.
Ana, la tacana catalana
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star

El programa debe imprimir true si es un palindromo y false si no lo es.
*/
class Palindrome {
  public static void main(String[] args) {
    
    System.out.println("In:");
    Scanner lectura = new Scanner(System.in);
    String textPalindromo = lectura.nextLine();
    textPalindromo = textPalindromo.replace(" ", "");
    textPalindromo = textPalindromo.replace(".", "");
    textPalindromo = textPalindromo.replace(",", "");
    textPalindromo = textPalindromo.replace("ñ", "n");
    textPalindromo = textPalindromo.toLowerCase();

    boolean isPalindromo = true;
    int inicial = 0;
    int finallyPos = textPalindromo.length() - 1;

    while (inicial < finallyPos) {
      if (textPalindromo.charAt(inicial) != textPalindromo.charAt(finallyPos)) {
        isPalindromo = false;
      }
      inicial++;
      finallyPos--;
    }

    if (isPalindromo) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

  }
}
