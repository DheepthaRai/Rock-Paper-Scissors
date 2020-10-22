import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	static char computer;
	static char player;
	
	
	void getInput() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your element. \nr for Rock.\np for Paper.\ns for Scissor.");
		player = sc.nextLine().charAt(0);
		
	}
	
	void generate() {
		
		Random r = new Random();
		int no = r.nextInt(9);
				
		if(no<=3)
			computer = 'r';
	    else if(no>3 && no<6)
	        computer = 'p';
	    else
	        computer = 's';
		
		System.out.println("Your opponent has played " +computer);
	}
	
	void play() {
		
        if(player=='r') {
            if(computer=='r')
            	System.out.println("match draw :3");
            else if(computer=='p')
            	System.out.println("Opponent wins this round :(");
            else
            	System.out.println("You win this round. Yayy!");
        }
        else if(player=='p') {
            if(computer=='r')
            	System.out.println("You win this round. Yayy!");
            else if(computer=='p')
            	System.out.println("match draw :3");
            else
            	System.out.println("Opponent wins this round :(");
        }
        else {
            if(computer=='r')
            	System.out.println("Opponent wins this round :(");
            else if(computer=='p')
            	System.out.println("You win this round. Yayy!");
            else
            	System.out.println("match draw :3");
        }
        
        System.out.println();
	}
	
	public static void main(String args[]) {
		
		RockPaperScissors a = new RockPaperScissors();
		Scanner s = new Scanner(System.in);
		
		char yn = 'y';
		
		do {
			a.getInput();
			a.generate();
			
			if(player=='r'||player=='p'||player=='s')
				a.play();
			else
			{
				System.out.println("Incorrect input. No such option available :/");
				yn = 'n';
			}
			
			System.out.println("Do you want to go again?");
			yn = s.nextLine().charAt(0);
			
		} while(yn == 'y');
		
		System.out.println("Thanks for playing with us. Have a great day!");
		
	}

}
