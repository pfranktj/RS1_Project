import java.util.*; 


public class SimulationRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> deck = new ArrayList<Integer>();
/** BE FOREWARNED: THIS IS A GHETTO ASS CODE PRACTICE DO NOT DO THIS
 * LIKE THIS SHOULD BE READING A FILE BUT I RAN OUT OF TIME LMAO
 * SERIOUSLY THIS IS SHITFEST
 *  **/		int[] hands = {


33, 23, 49, 7,
49, 27, 42, 26,
32, 21, 45, 4,
0, 44, 6, 3,
39, 10, 23, 8,

34, 7, 39, 45,
36, 15, 47, 51,
34, 45, 12, 23,
24, 2, 0, 15,
16, 45, 2, 32,

4, 22, 46, 43,
24, 10, 34, 16,
39, 33, 23, 19,
24, 37, 33, 41,
17, 42, 27, 49,

48, 43, 26, 22,
33, 13, 30, 10,
31, 10, 45, 22,
13, 33, 23, 2,
42, 25, 6, 32,

17, 38, 43, 45,
12, 34, 15, 5,
41, 3, 48, 14,
28, 31, 23, 38,
34, 37, 7, 32,

8, 10, 43, 7,
19, 26, 24, 14,
27, 39, 30, 19,
32, 21, 17, 46,
9, 3, 44, 41,
 
18, 39, 21, 14,
13, 46, 44, 12,
6, 41, 1, 8,
43, 4, 7, 48,
31, 51, 42, 23,

9, 27, 36, 24,
40, 41, 6, 21,
8, 41, 47, 18,
16, 12, 51, 27,
47, 5, 6, 17,

41, 33, 40, 21,
13, 48, 44, 41,
15, 32, 35, 21,
20, 1, 45, 36,
2, 51, 4, 32,

5, 12, 20, 24,
7, 6, 5, 27,
46, 50, 42, 37,
45, 29, 15, 33,
50, 41, 5, 16,

47, 19, 32, 21,
27, 11, 15, 38,
7, 26, 49, 18,
36, 30, 21, 41,
9, 46, 23, 28,

22, 20, 37, 51,
51, 14, 29, 10,
40, 44, 15, 11,
39, 18, 6, 1,
39, 4, 44, 10,

38, 23, 10, 22,
26, 8, 16, 7,
3, 6, 20, 25,
38, 32, 14, 29,
30, 36, 7, 0,

46, 29, 0, 5,
40, 19, 28, 14,
9, 11, 43, 19,
45, 38, 11, 41,
22, 3, 6, 30,

19, 50, 29, 1,
47, 27, 42, 45,
14, 18, 23, 12,
20, 50, 11, 49,
47, 36, 24, 50,

43, 37, 12, 11,
11, 38, 50, 13,
10, 50, 47, 27,
51, 46, 14, 5,
24, 37, 41, 26,

33, 3, 19, 49,
13, 3, 23, 47,
20, 22, 13, 49,
0, 12, 50, 20,
2, 4, 12, 28,

44, 4, 10, 20,
21, 5, 28, 12,
3, 6, 50, 47,
38, 45, 2, 10,
27, 20, 33, 0,

31, 13, 2, 0,
2, 44, 24, 50,
30, 8, 2, 22,
17, 23, 13, 37,
47, 17, 21, 11,

22, 40, 30, 44,
46, 14, 51, 0,
4, 34, 44, 11,
16, 3, 14, 41,
31, 25, 35, 22,

29, 23, 7, 45,
37, 11, 20, 10,
27, 24, 34, 51,
48, 45, 50, 25,
41, 3, 42, 35,

50, 43, 16, 14,
3, 29, 5, 20,
25, 22, 4, 27,
48, 10, 38, 13,
46, 29, 7, 5,

10, 23, 28, 26,
2, 5, 18, 6,
39, 13, 50, 51,
27, 35, 37, 46,
29, 13, 51, 0,

22, 45, 24, 27,
32, 2, 49, 33,
24, 32, 29, 17,
16, 15, 28, 22,
10, 20, 26, 12,

41, 37, 36, 31,
45, 15, 40, 37,
45, 6, 31, 36,
29, 42, 38, 12,
17, 28, 14, 32,
 
40, 41, 6, 31,
40, 5, 31, 6,
6, 49, 3, 30,
34, 47, 39, 3,
31, 49, 17, 15,

2, 23, 27, 18,
34, 36, 23, 14,
49, 18, 36, 50,
45, 35, 21, 10,
13, 7, 3, 32,

51, 29, 19, 5,
30, 1, 42, 19,
51, 50, 5, 36,
4, 6, 31, 42,
50, 11, 23, 29,

17, 42, 12, 28,
1, 8, 23, 18,
24, 18, 19, 51,
1, 34, 13, 29,
21, 35, 17, 1,

44, 1, 43, 28,
30, 18, 49, 21,
48, 0, 17, 43,
48, 8, 32, 40,
51, 44, 12, 35
				
		};
		for(int i=0; i<52; i++)
		{
			deck.add(i);
		} 
		for(int k = 1; k<=30; k++)
		{
			for(int j = 0; j<5; j++)
			{
				PlayerBot player = new PlayerBot(hands[k*j],hands[k*j+2]);
				DealerBot dealer = new DealerBot(hands[k*j+1],hands[k*j+3]);
				if(player.checkForNaturals()||dealer.checkForNaturals())
				{
					if(player.checkForNaturals()&&dealer.checkForNaturals())
					{
						System.out.print(0+",");
					}
					else if(dealer.checkForNaturals()&&!player.checkForNaturals())
					{
						System.out.print(0+",");
					}
					else if(!dealer.checkForNaturals()&&player.checkForNaturals())
					{
						System.out.print(1+",");
					}
				}
				else
				{
					//player play
					player.play(deck);
					//System.out.println(player.getTotal());
					
					//dealer play
					dealer.play(deck);
					//System.out.println(dealer.getTotal());
					
					if(player.getTotal()<=21&&dealer.getTotal()<=21)
					{
						//System.out.println("under 21");
						if(player.getTotal()>dealer.getTotal())
						{
							System.out.print(1+",");
						}
						if(player.getTotal()<dealer.getTotal())
						{
							System.out.print(0+",");
						}
						if(player.getTotal()==dealer.getTotal())
						{
							System.out.print(0+",");
						}
					}				
					else
					{
						//System.out.println("activated multi stage comparison");
						if(player.getTotal()<=21&&dealer.getTotal()>21)
						{
							System.out.print(1+",");
							//System.out.println("dealer bust");
						}
						if(player.getTotal()>21&&dealer.getTotal()<=21)
						{
							System.out.print(0+",");
							//System.out.println("player bust");
						}
						if(player.getTotal()>21&&dealer.getTotal()>21)
						{
							System.out.print(0+",");
							//System.out.println("bust tie");
						}
						
					}
					
				}
				}
				
			System.out.println("");
			deck.clear();
			for(int i=0; i<52; i++)
			{
				deck.add(i);
			}
			
		}
		
			
	}
}
