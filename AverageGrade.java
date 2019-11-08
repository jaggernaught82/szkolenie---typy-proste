package practice.primitivetypes;

import java.util.Scanner;

public class AverageGrade {
    public static void obliczanieSredniej(int[][] oceny){
        float suma = 0F;
        int iloscOcen = 0;
        for (int i = 0; i < oceny.length; i++){
            for (int j = 0; j < oceny[i].length; j++) {
                iloscOcen++;
                suma=oceny[i][j]+suma;
            }

        }
        float srednia = (float) suma / iloscOcen;
        System.out.println("Suma: " + suma);
        System.out.println("Ilość ocen: " + iloscOcen);
        System.out.println("Średnia: " + srednia);
        System.out.println("Średnia ocen wynosi " + (suma / iloscOcen));
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
