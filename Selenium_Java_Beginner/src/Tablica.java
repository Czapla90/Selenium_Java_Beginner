// Tablice - struktury pozwalające na gromadzenie większej ilości danych.

public class Tablica {

    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Mateusz";
        imiona[1] = "Magdalena";
        imiona[2] = "Liliana";

        System.out.println("Imię męza: " + imiona[0]);
        System.out.println("Imię żony: " + imiona[1]);
        System.out.println("Imię baby: " + imiona[2]);

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        System.out.println(lottoNumbers.length);

        for (int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);
        }

    }
}
