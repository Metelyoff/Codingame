package easy.SkynetTheChasm;

import java.util.Scanner;
import java.io.*;
import java.math.*;

public class SkynetTheChasm {
	
	
	
	public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.err.print("Road=");
        int road = in.nextInt();
        System.err.print("Gap=");
        int gap = in.nextInt();
        System.err.print("Platform=");
        int platform = in.nextInt();
        System.err.print("-------------");
        System.err.println();
        String motorbikeAction="SPEED";

        while (true) {
        	
        	System.err.println();
        	System.err.print("Speed=");
            int speed = in.nextInt(); // the motorbike's speed.
            System.err.print("CoordX=");
            int coordX = in.nextInt(); // the position on the road of the motorbike
            int nextCoordX=speed+coordX+1;
            int needSpeed=gap+1;
            
            System.err.println("road="+road);
            System.err.println("gap="+gap);
            System.err.println("platform="+platform);
            System.err.println("--------------------");
            System.err.println("coordX="+coordX);
            System.err.println("speed="+speed);
            System.err.println("Next coordX="+nextCoordX);
            System.err.println("Need Speed="+needSpeed);
            
            if(speed<=needSpeed) {motorbikeAction="SPEED";}else{motorbikeAction="SLOW";}
            if(speed==needSpeed) {motorbikeAction="WAIT";}
            if(coordX==road-1) {motorbikeAction="JUMP";}
            if(coordX>road-1) {motorbikeAction="SLOW";}
            
            System.err.println(motorbikeAction); // A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.
        }
    }
}
