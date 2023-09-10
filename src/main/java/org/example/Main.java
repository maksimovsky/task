package org.example;

public class Main {
    public static void main(String[] args) {
        //Напишите пример перехвата и обработки исключения в блоке try-catch-метода.

        String str = null;
        try {
            str.length();
        } catch (NullPointerException e) {
            System.out.println("str is null");
        }
    }
}