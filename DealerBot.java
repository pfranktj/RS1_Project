import java.util.*; 
/**
 * 
 */

/**
 * @author pears
 * !!!!!!!!!!!!!!!!!!!!!!NOTE: CYCLE THROUGH CARDS USING AN ARRAY AND INDEX. INCREMENT EACH HIT. TO CHECK FOR ACES:
 * WHEN BUST, CYCLE THROUGH FOR ACES AND SET LAST ONE TO 1. DEFAULT 11.
 */
public class DealerBot {

	private final int[] values = {11,2,3,4,5,6,7,8,9,10,10,10,10};
    private int total;
    private int[] cards = new int[10];
    private int cardIndex = 0;
    
    
	public DealerBot(int cardsin, int cardsin2) //Checked, this section works
	{
		
		cards[0]= (cardsin%13);
		cards[1]= (cardsin2%13);
		if(cards[0]==10||cards[0]==11||cards[0]==12)
		{
			cards[0]=10;
		}
		if(cards[0]==0)
		{
			cards[0]=11;
		}
		if(cards[1]==10||cards[1]==11||cards[1]==12)
		{
			cards[1]=10;
		}
		if(cards[1]==0)
		{
			cards[1]=11;
		}
		total=cards[0]+cards[1];
		//System.out.println(total);
		cardIndex += 2;
		
	}
	public boolean checkForNaturals() //works
	{
		if(total==21) {
			return true;
		} else
		{
			return false;
		}
	}
	public void hit(ArrayList<Integer> deck)
	{
		int card = deck.get((int) (Math.random()*(deck.size()))); 
		deck.remove(new Integer(card));
		card =  values[card%13];	
		cards[cardIndex]=card;	
		total+=card;
		//System.out.println("card= "+card);
		//System.out.println("total= "+total);
			
	}
	public void stand()
	{
	}
	public void play(ArrayList<Integer> deck)
	{ 
		//System.out.println("dealer playing yuh");
		while(total<=16)
		{
			hit(deck);
			if(total>21)
			{
				for(int k=cardIndex; k>=0; k--)
				{
					if(cards[k]==11)
					{
						cards[k]=1;
						total-=11;;
						total=+cards[k];
						//System.out.println("down, total: " + total);
						break;
					}
				}
				
			}
		}
		//System.out.println(total);
		}
	
	public int getTotal()
	{
		return total;
	}
	
	
	
	
	
	
	
}
