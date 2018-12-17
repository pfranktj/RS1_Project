
public class IntToCard {
	private final String[] suits = {"C", "D", "H", "S"};
	private final int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	private int[] input;
	
	public IntToCard(int[] hands)
	{
		input=hands;
	}
	public void convert()
	{
//		for(int i: input)
//		{
//			System.out.println(suits[i/13]+values[i%13]);
//		}
		for(int i=0; i<599; i+=4)
		{
			System.out.println(suits[input[i]/13]+values[input[i]%13]+", "+
					suits[input[i+1]/13]+values[input[i+1]%13]+", "+
					suits[input[i+2]/13]+values[input[i+2]%13]+", "+
					suits[input[i+3]/13]+values[input[i+3]%13]+", "
					);
			
		}
	}
	
	
	
	
}
