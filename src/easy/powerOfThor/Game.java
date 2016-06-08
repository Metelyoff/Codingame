package easy.powerOfThor;

abstract public class Game{

	private int X;
	private int Y;
	private int LX;
	private int LY;
	private int TX;
	private int TY;

	boolean game=true;

	private int energy;

	public void setMapPositionX(int x){
		X=x;
	}
	
	public void setMapPositionY(int y){
		Y=y;
	}
	
	public int getMapPositionX(){
		return X;
	}
	
	public int getMapPositionY(){
		return Y;
	}

	public void setLightPositionLX(int lx){
		LX=lx;
	}
	
	public void setLightPositionLY(int ly){
		LX=ly;
	}

	public int getLightPositionLX(){
		return LX;
	}
	
	public int getLightPositionLY(){
		return LY;
	}

	public void setThorPositionTX(int tx){
		TX=tx;
		if(tx>X||tx<0){
			game=false;
			System.out.println("out of border x");
		}
	}
	
	public void setThorPositionTY(int ty){
		TY=ty;
		if(ty>Y||ty<0){
			game=false;
			System.out.println("out of border y");
		}
	}
	
	public int getThorPositionTX(){
		return TX;
	}
	
	public int getThorPositionTY(){
		return TY;
	}
	
	public void setEnergy(int e){
		energy=e;
	}
	
	public int getEnergy(){
		System.out.println("Thor energy: "+energy+".");
		return energy;
	}
	
	abstract void moveThor(String nav);
}
