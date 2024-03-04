package com.mycompany.switchcase2;

import java.util.Scanner;

public class SwitchCase2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a;
        
        a = teclado.nextInt();
                
        switch (a) {
            case 1 -> System.out.println("Dia da Semana: Domingo");
            case 2 -> System.out.println("Dia da Semana: Segunda");
            case 3 -> System.out.println("Dia da Semana: Terça");
            case 4 -> System.out.println("Dia da Semana: Quarta");
            case 5 -> System.out.println("Dia da Semana: Quinta");
            case 6 -> System.out.println("Dia da Semana: Sexta");
            case 7 -> System.out.println("Dia da Semana: Sábado");
            default -> { System.out.println("Dia da Semana: São Nunca");
            }
        }
    }
}