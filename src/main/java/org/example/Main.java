package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(hasTeen(9,99,19));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(5.0));

        Scanner sc=new Scanner(System.in);
        System.out.println("width");
        double width=sc.nextDouble();
        System.out.println("height");
        double height=sc.nextDouble();
        System.out.println("area:"+area(width,height));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock<0 || clock>23 ||isBarking){
            return false;
        }
        return clock>=20 || clock<8;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge>13 && firstAge<=19) ||
                (secondAge>13 && secondAge<=19) ||
                (thirdAge>13 && thirdAge<=19);


    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        int lowestTemp=25;
        int highestTem=isSummer?45:35;
        return(temp<highestTem && temp>lowestTemp);

    }

    public static double area(double width, double height) {
        if (width<0 || height<0){
            System.out.println("uzunluk veya genislik 0'dan kücük olamaz!! Width:"+width + "Height:" +height );
            return -1;
        }

        return width*height;
    }

    public static double area(double radius) {
        if(radius<0){
            System.out.println( "radius:"+radius);
            return -1;
        }

        return Math.PI* Math.pow(radius,2);
    }
}
