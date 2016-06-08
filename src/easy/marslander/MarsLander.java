package easy.marslander;

import java.util.Scanner;

public class MarsLander {
	
	String getPower(int verticalSpeed){
        String power=null;
        if(verticalSpeed<=-40) {power="0 4";}
        if(verticalSpeed>-40 && verticalSpeed<=30) {power="0 3";}
        if(verticalSpeed>-30 && verticalSpeed<=20) {power="0 2";}
        if(verticalSpeed>-20 && verticalSpeed<=10) {power="0 1";}
        if(verticalSpeed>-10 && verticalSpeed<=0) {power="0 1";}
        if(verticalSpeed>0) {power="0 0";}
        return power;
    }
	
	public static void main(String args[]) {
        
		MarsLander ml=new MarsLander();
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        System.err.println("Surface="+surfaceN);
        System.err.println("--------------");
        
        for (int i = 0; i < surfaceN; i++) {
            System.err.println(" ");
            
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            System.err.println("Land X="+landX);
            
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
            System.err.println("Land Y="+landY);
            
        }

        while (true) {
            
            int X = in.nextInt();
            int Y = in.nextInt();
            System.err.println("Position of Mars Lander: "+"X="+X+"  Y="+Y);
            
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            System.err.println("Horizontal speed="+hSpeed);
            System.err.println("Vertical speed="+vSpeed);
            
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            System.err.println("Fuel="+fuel);
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            System.err.println("Rotate="+rotate);
            int power = in.nextInt(); // the thrust power (0 to 4).
            System.err.println("Power="+power);

            System.out.println(ml.getPower(vSpeed)); // rotate power. rotate is the desired rotation angle. power is the desired thrust power.
        }
    }
}
