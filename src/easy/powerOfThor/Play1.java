package easy.powerOfThor;
import java.util.*;

public class Play1
{
	public static void main(String args[]){
		Game1 g=new Game1();
		Random r=new Random();
		g.setMapPositionX(40);
		g.setMapPositionY(18);
		g.setLightPositionLX(r.nextInt(g.getMapPositionX()));
		g.setLightPositionLY(r.nextInt(g.getMapPositionY()));
		g.setThorPositionTX(r.nextInt(g.getMapPositionX()));
		g.setThorPositionTY(r.nextInt(g.getMapPositionY()));
		
		while(true){
		g.moveThor("SW");
		}
	}
}
