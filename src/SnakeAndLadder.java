
public class SnakeAndLadder {

	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Game");
		System.out.println("");

		
		
		
		int NoPlay=0;
		int Ladder=1;
		int Snake=2;
		int PlayerPosition1=0;
		int DiceValue=0;
		int moves1=0;
		
		while(PlayerPosition1<100)
		{
		
			
		DiceValue=((int)Math.floor(Math.random()*10)%6)+1;
		moves1++;
		System.out.println("Player 1 rolled "+DiceValue);
		int Check=(int)Math.floor(Math.random()*10)%3;
		if(Check==NoPlay)
		{
			System.out.println("Player 1 No Move");
		}
		else if(Check==Ladder)
		{
			
			if(PlayerPosition1+DiceValue>100)
			{System.out.println("No Move");}
			else if(PlayerPosition1+DiceValue==100)
			{System.out.println("Player 1 Won");
			break;}
			else {
			System.out.println("Player 1 Move forward by "+DiceValue+" steps");
			PlayerPosition1+=DiceValue;
			}
			
		}
		else if(Check==Snake)
		{
			if(PlayerPosition1-DiceValue<0)
			{PlayerPosition1=0;}
			else
			{System.out.println("Player 1 Move Back by "+DiceValue+" steps");
			PlayerPosition1-=DiceValue;}
			
		}
		System.out.println("Player 1 is at position "+PlayerPosition1);

	}
		System.out.println("Total number of moves of Player 1 "+moves1);
		}}
