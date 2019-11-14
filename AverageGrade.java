package practice.primitivetypes;

import java.util.Scanner;

public class AverageGrade {
    public static void obliczanieSredniej(int[][] oceny){
        float suma = 0;
        float srednia=0;
        float sumasrednich=0;
        for (int i = 0; i < oceny.length; i++){
            for (int j = 0; j < oceny[i].length; j++) {
                suma+=oceny[i][j];
            }
            srednia=suma/oceny[i].length;
            System.out.println("Średnia z " + i + " przedmiotu wynosi: " + srednia);
            sumasrednich+=srednia;
            suma=0;
        }
        System.out.println("Średnia przedmiotów wynosi: " + (sumasrednich/oceny.length));

    }

    public static void main (String[] args){

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę przedmiotów, którym chcesz wprowadzić oceny");
        int liczbaPrzedmiotow = inputScanner.nextInt();
        int[][] oceny = new int [liczbaPrzedmiotow][4];
        for (int i=0; i < liczbaPrzedmiotow; i++) {
            for (int j=0; j < 4; j++) {
                System.out.println("Wprowadź " + (j+1) + " ocenę dla " + (i+1) + " przedmiotu");
                oceny[i][j] = inputScanner.nextInt();
            }
        }
        obliczanieSredniej(oceny);
    }
}
