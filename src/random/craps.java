package random;
import java.util.*;
public class craps {
private static final Random RandomNumber=new Random();
private enum status {CONTINUE,WON,LOST};
private static final int SNAKE_AYES=2;
private static final int TREY=3;
private static final int SEVEN=7;
private static final int YO_LEVEN=11;
private static final int BOX_CARS=12;
public static int rollDice() {
int die1=1+RandomNumber.nextInt(5);
int die2=1+RandomNumber.nextInt(5);
int sum=die1+die2;
System.out.printf("player rolled %d+%d=%d\n", die1,die2,sum);
return sum;
}
public static void main(String []args) {
	int myroll=0;
	status gamestatus;
	int rollsum=rollDice();
	switch(rollsum) {
	case SEVEN:
	case YO_LEVEN:
	gamestatus=status.WON;
	break;
	case SNAKE_AYES:
	case TREY:
	case BOX_CARS:
		gamestatus=status.LOST;
		break;
		default:
			gamestatus=status.CONTINUE;
			myroll=rollsum;
			System.out.printf("point is: %d\n", myroll);
			break;
	}
			while(gamestatus==status.CONTINUE) {
			rollsum=rollDice();
			if(rollsum==myroll) {
				gamestatus=status.WON;
			}
			else {
				if(rollsum==SEVEN) {
					gamestatus=status.LOST;
				}
			}
			
	}
			if(gamestatus==status.WON) 
				System.out.println("PLAYER WON");
			
				else
					System.out.println("PLAYER LOSES");
				
}




}
