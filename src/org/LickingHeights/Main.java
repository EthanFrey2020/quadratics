package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TODO DECLARE VARIABLES
            double a,b,c,discriminant,axisOfSymetery,x,y;
            String parabolaFacing;
            Scanner radar;
        //TODO INITIALIZE VARIABLES MANUALLY
            radar = new Scanner(System.in);
            System.out.println("Give me an A");
            a = radar.nextDouble();
            System.out.println("Give me B");
            b = radar.nextDouble();
            System.out.println("Give me C");
            c = radar.nextDouble();
//            a=5;
//            b=3;
//            c=1;
            
        //TODO CALCULATIONS
            axisOfSymetery = -b/(2*a);
            discriminant = (b*b)-4*(a*c);
                if(discriminant >0){
                    System.out.println("There are two real solutions");
                }
                else if (discriminant == 0) {
                    System.out.println("There is one solution");
                }
                else {
                    System.out.println("There are NO real solutions");
                }
        //TODO PRINT RESULTS
            System.out.println("Axis of Symmetry: "+axisOfSymetery);
            System.out.println("Discriminant: "+discriminant);
        //TODO CHECK ACCURACY


        //TODO INITIALIZE FOR SCANNER

        //TODO DOUBLE CHECK RESULTS

























    }
}
