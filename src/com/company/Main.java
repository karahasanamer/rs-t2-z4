package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite duzinu niza: ");

        int n;

        n = ulaz.nextInt();
        double niz[];                                           //incijalizacija niza
        niz=new double[n];                                      //dodjeljivanje duzine niza

        int i = 0;

            for (i = 0; i < niz.length; i++) {                  //unos niza

               do{

                niz[i] = ulaz.nextDouble();

                if(niz[i]<1 || niz[i]>100){
                    System.out.println("Neispravan broj!");
                    i--;                                        //vracanje na prethodni clan za ponovan unos

                }
                }while(niz[i]<1 && niz[i]>100);

            }



            for(i=0;i<niz.length;i++){

                System.out.println(niz[i]);

            }


    }
}
