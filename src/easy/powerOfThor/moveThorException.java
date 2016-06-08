package easy.powerOfThor;

class MoveThorException extends Exception
{
	private int number;
	
	public MoveThorException(int n){
		number=n;
	}

	@Override
	public String toString()
	{
		return "Error move thor";
	}
}
