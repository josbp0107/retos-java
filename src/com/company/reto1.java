package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");

        int tam;
        float average, sum = 0;

        tam = sc.nextInt();

        float[] irca = new float[tam];
        ArrayList<Float> classification = new ArrayList<>();

        for (int i =0; i < tam; i++) {
            irca[i] = sc.nextFloat();
            sum += irca[i];
            if (irca[i] >= 80.1 && irca[i] <= 100) {
                classification.add(irca[i]);
            }
        }
        Collections.sort(classification);
        average = sum / tam;

        if (average >= 0 && average <= 5)
            System.out.println("SIN RIESGO");
        else if (average >=5.1 && average <= 14)
            System.out.println("BAJO");
        else if (average >=14.1 && average <= 35)
            System.out.println("MEDIO");
        else if (average >=35.1 && average <= 80)
            System.out.println("ALTO");
        else if (average >=80.1 && average <= 100)
            System.out.println("INVIABLE SANITARIAMENTE");

        if (classification.size() == 0) {
            System.out.println("NA");
            System.out.println("NA");
        }else {
            System.out.println(df.format(classification.get(0)).replace(".", ","));
            System.out.println(df.format(classification.get(classification.size() - 1)).replace(".", ","));
        }
    }
}