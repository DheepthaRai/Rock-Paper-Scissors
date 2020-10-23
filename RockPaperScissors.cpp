#include<iostream>
#include<stdlib.h>
using namespace std;

char computer = 'r';
char player = 'r';
	
void getInput() {
		
	cout<<"\nChoose your element. \nr for Rock.\np for Paper.\ns for Scissor.\n";
	cin>>player;
		
	}
	
	void generate() {
		
		int no = rand() %10;
				
		if(no<3)
			computer = 'r';
	    else if((no>=3) && (no<6))
	        computer = 'p';
	    else if((no>=6) && (no<9))
	        computer = 's';
		
		cout<<"Your opponent has played " <<computer<<"\n";
	}
	
	void play() {
		
        if(player=='r') {
            if(computer=='r')
            	cout<<"match draw :3";
            else if(computer=='p')
            	cout<<"Opponent wins this round :(";
            else
            	cout<<"You win this round. Yayy!";
        }
        else if(player=='p') {
            if(computer=='r')
            	cout<<"You win this round. Yayy!";
            else if(computer=='p')
            	cout<<"match draw :3";
            else
            	cout<<"Opponent wins this round :(";
        }
        else {
            if(computer=='r')
            	cout<<"Opponent wins this round :(";
            else if(computer=='p')
            	cout<<"You win this round. Yayy!";
            else
            	cout<<"match draw :3";
        }
        
        cout<<"\n";
	}
	
	int main() {
		
		char yn = 'y';
		
		do {
			getInput();
			generate();
			
			if((player=='r')||(player=='p')||(player=='s'))
				play();
			else
			{
				cout<<"Incorrect input. No such option available :/";
				yn = 'n';
			}
			
			cout<<"Do you want to go again?";
			cin>>yn;
			
		} while(yn=='y');
		
		cout<<"\nThanks for playing with us. Have a great day!";
		return 0;
	}

