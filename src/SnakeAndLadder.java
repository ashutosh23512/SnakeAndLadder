
public class SnakeAndLadder {

	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Game");
		System.out.println("");

		
		
		
		int NoPlay=0;
		int Ladder=1;
		int Snake=2;
		int PlayerPosition1=0;
		int DiceValue=0;
		
		while(PlayerPosition1<100)
		{
		
			
		DiceValue=((int)Math.floor(Math.random()*10)%6)+1;
		System.out.println("Player 1 rolled "+DiceValue);
		
		int Check=(int)Math.floor(Math.random()*10)%3;
		if(Check==NoPlay)
		{
			System.out.println("Player 1 No Move");
		}
		else if(Check==Ladder)
		{
			System.out.println("Player 1 Move forward by "+DiceValue+" steps");
		}
			
		else if(Check==Snake)
		{
			if(PlayerPosition1-DiceValue<0)
			{PlayerPosition1=0;}
			else
			{System.out.println("Player 1 Move Back by "+DiceValue+" steps");
			}
			
		}
		
	}

	}}
