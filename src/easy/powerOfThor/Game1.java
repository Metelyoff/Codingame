package easy.powerOfThor;

public class Game1 extends Game
{
	@Override
	public void setMapPositionX(int x)
	{
		System.out.println("Map position x: "+x);
		// TODO: Implement this method
		super.setMapPositionX(x);
	}

	@Override
	public void setMapPositionY(int y)
	{
		System.out.println("Map position y:"+y);
		// TODO: Implement this method
		super.setMapPositionY(y);
	}

	@Override
	public void setLightPositionLX(int lx)
	{
		System.out.println("Light position lx:"+lx);
		// TODO: Implement this method
		super.setLightPositionLX(lx);
	}

	@Override
	public void setLightPositionLY(int ly)
	{
		System.out.println("Light position ly:"+ly);
		// TODO: Implement this method
		super.setLightPositionLY(ly);
	}

	@Override
	public void setThorPositionTX(int tx)
	{
		// TODO: Implement this method
		System.out.println("Thor position tx:"+tx);
		super.setThorPositionTX(tx);
	}

	@Override
	public void setThorPositionTY(int ty)
	{
		System.out.println("Thor position ty:"+ty);
		// TODO: Implement this method
		super.setThorPositionTY(ty);
	}

	@Override
	public void setEnergy(int e)
	{
		// TODO: Implement this method
		System.out.println("Energy:"+e);
		e--;
		if(e<0){
			game=false;
			System.out.println("End thor energy");
		}
		super.setEnergy(e);
	}

	@Override
	void moveThor(String nav)
	{
		// TODO: Implement this method
		int tx=getThorPositionTX();
		int ty=getThorPositionTY();

		switch(nav){
			case "SW":{tx--;ty++;
			System.out.println(tx+" "+ty);};
			break;
			case "NW":{tx--;ty--;};
			break;
			case "NE":{tx++;ty--;};
			break;
			case "SE":{tx++;ty++;};
			break;
			case "N":{tx=tx;ty--;};
			break;
			case "S":{tx=tx;ty++;};
			break;
			case "W":{tx--;ty=ty;};
			break;
			case "E":{tx++;ty=ty;};
			break;
		}
		setThorPositionTX(getThorPositionTX());
		setThorPositionTY(getThorPositionTY());
	}
	
}
