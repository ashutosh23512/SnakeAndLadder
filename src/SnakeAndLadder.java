public class SnakeAndLadder {

	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Game");
		System.out.println("");

		int PlayerPosition1=0;
		int PlayerPosition2=0;
		int moves1=0;
		int moves2=0;
		
		int DiceValue=0;
		int NoPlay=0;
		int Ladder=1;
		int Snake=2;
		int newdice1=0;
		int newdice2=0;
		
		while(PlayerPosition1<100 && PlayerPosition2<100)
		{
		//PLAYER 1
			
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
			newdice1=((int)Math.floor(Math.random()*10)%6)+1;
	
			if(PlayerPosition1+DiceValue+newdice1>100)
			{System.out.println("No Move");}
			else if(PlayerPosition1+DiceValue+newdice1==100)
			{System.out.println("Player 1 Won");
			break;}
			else {
			System.out.println("Player 1 Move forward by "+DiceValue+" steps");
			PlayerPosition1+=DiceValue;
			PlayerPosition1+=newdice1;}
			
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
		
		
		//PLAYER 2
		
		DiceValue=((int)Math.floor(Math.random()*10)%6)+1;
		moves2++;
		System.out.println("Player 2 rolled "+DiceValue);
		Check=(int)Math.floor(Math.random()*10)%3;
		if(Check==NoPlay)
		{
			System.out.println("No Move");
		}
		else if(Check==Ladder)
		{
			newdice2=((int)Math.floor(Math.random()*10)%6)+1;
	
			if(PlayerPosition2+DiceValue+newdice2>100)
			{System.out.println("Player 2 No Move");}
			else if(PlayerPosition2+DiceValue+newdice2==100)
			{System.out.println("Player 2 Won");
			break;}
			else {
			System.out.println("Player 2 Move forward by "+DiceValue+" steps");
			PlayerPosition2+=DiceValue;
			PlayerPosition2+=newdice2;}
			
		}
		else if(Check==Snake)
		{
			System.out.println("Player 2 Move Back by "+DiceValue+" steps");
			if(PlayerPosition2-DiceValue<0)
			{PlayerPosition2=0;}
			else
			PlayerPosition2-=DiceValue;
			
		}
		System.out.println("Player 2 is at position "+PlayerPosition2);
		
		}
		System.out.println("Total number of moves of Player 1 "+moves1);
		System.out.println("Total number of moves of Player 2 "+moves2);
			
	
	}

}
