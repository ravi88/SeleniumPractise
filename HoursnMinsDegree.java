package practise_java;

import java.util.Scanner;

public class HoursnMinsDegree{
	
public static void main(String args[])
{
        int hours,mins;

    System.out.println("Enter the Time(hours) : ");
        Scanner dx = new Scanner(System.in);
        hours = dx.nextInt();

    System.out.println("Enter the time(mins) : ");
        Scanner fx = new Scanner(System.in);
        mins = fx.nextInt();

    if(hours>=0 && hours<=12){

        if(mins>=0 && mins<=59){
            double hDegrees = (hours * 30) + (mins * 0.5);
                    double mDegrees = mins * 6;
                    double diff  = Math.abs(hDegrees - mDegrees);

        System.out.println("The angle between sticks is (degrees) : "+diff);
                if (diff > 180){ 

                diff = 360 - diff;
       System.out.println("The angle between sticks is (degrees) : "+diff);//least  angle
                }

        }

    }

    else{
        System.out.println("Wrong input ");
    }


}

}

