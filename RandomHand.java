
//Pearson Frank 12/18
//With thanks to big papi pranv mathur

public class RandomHand {
	//remember to shift from static to non - this should be a resource class only
	private int[][][] hands = new int[30][10][4]; 
	private int[][][] hands1 = new int[30][5][4];
	private int[][][] hands2 = new int[30][5][4];
	
	public void drawHands()
	{
		for(int k=0; k<30; k++)
		{
			for(int i=0; i<10; i++) {
				hands[k][i][0] =  (int) (Math.random()*52.0);
				hands[k][i][1] =  (int) (Math.random()*52.0);
				while(hands[k][i][1]==hands[k][i][0])
				{
					hands[k][i][1] = (int) (Math.random()*52.0);
				}
				hands[k][i][2] =  (int) (Math.random()*52.0);
				while(hands[k][i][2]==hands[k][i][0]||hands[k][i][2]==hands[k][i][1])
				{
					hands[k][i][2] = (int) (Math.random()*52.0);
				}
				hands[k][i][3] = (int) (Math.random()*52.0);
				while(hands[k][i][3]==hands[k][i][0]||hands[k][i][3]==hands[k][i][1]||hands[k][i][3]==hands[k][i][2])
				{
					hands[k][i][3] = (int) (Math.random()*52.0);
				}
				//System.out.println("Trial " + k +", Hand: " + (i + 1));
				//System.out.println(hands[k][i][0]+", "+hands[k][i][1]+", "+hands[k][i][2]+", "+hands[k][i][3]);			
			}
		}
		
				
	}
	public void randomizeHands()
	{
		for(int i=0; i<30; i++)
		{
			int currentH1 = 0;
			int currentH2 = 0;
			for(int k=0; k<10; k++)
			{
				
				
				if(currentH1>4)
				{
					hands2[i][currentH2][0]=hands[i][k][0];
					hands2[i][currentH2][1]=hands[i][k][1];
					hands2[i][currentH2][2]=hands[i][k][2];	
					hands2[i][currentH2][3]=hands[i][k][3];
					currentH2++;
				} else if(currentH2>4)
				{
					hands1[i][currentH1][1]=hands[i][k][1];
					hands1[i][currentH1][2]=hands[i][k][2];	
					hands1[i][currentH1][3]=hands[i][k][3];
					currentH1++;
				} else
				{
					if(Math.random()>.5)
					{
						hands1[i][currentH1][0]=hands[i][k][0];
						hands1[i][currentH1][1]=hands[i][k][1];
						hands1[i][currentH1][2]=hands[i][k][2];	
						hands1[i][currentH1][3]=hands[i][k][3];
						currentH1++;
					}
					else	
					{
						hands2[i][currentH2][0]=hands[i][k][0];
						hands2[i][currentH2][1]=hands[i][k][1];
						hands2[i][currentH2][2]=hands[i][k][2];	
						hands2[i][currentH2][3]=hands[i][k][3];
						currentH2++;
					}
				}
				
			}
			
			
		}
	}
	public void report()	{
		for(int i=0; i<30; i++)
		{
			System.out.println("trial: "+i+", group 1");
			for(int j=0; j<5; j++)
			{
				
				System.out.println(hands1[i][j][0]+", "+hands1[i][j][1]+", "+hands1[i][j][2]+", "+hands1[i][j][3]);
			}
			
		}
		for(int i=0; i<30; i++)
		{
			System.out.println("trial: "+i+", group 2");
			for(int j=0; j<5; j++)
			{
				System.out.println(hands2[i][j][0]+", "+hands2[i][j][1]+", "+hands2[i][j][2]+", "+hands2[i][j][3]);
			}
		}
		
	}
	
}
