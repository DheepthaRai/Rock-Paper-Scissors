import random as r

i=1
while True:
    player = input('\nChoose your element. \nr for Rock.\np for Paper.\ns for Scissor.\n')
    no = r.randint(1,9)

    if player=='r' or player=='p' or player=='s':
        if no<=3:
            computer = 'r'
        elif 3<no<6:
            computer = 'p'
        else:
            computer = 's'

        print("Player: %s \nComputer: %s\n" %(player,computer))

        if player=='r':
            if computer=='r':
                print('match draw :3')
            elif computer=='p':
                print('Opponent wins this round :(')
            else:
                print('You win this round. Yayy!')
        elif player=='p':
            if computer=='r':
                print('You win this round. Yayy!')
            elif computer=='p':
                print('match draw :3')
            else:
                print('Opponent wins this round :(')
        else:
            if computer=='r':
                print('Opponent wins this round :(')
            elif computer=='p':
                print('You win this round. Yayy!')
            else:
                print('match draw :3')

        yn = input('\nDo you want to go again? (y/n)\n')

        if yn=='y':
            i=1
        elif yn=='n':
            i=2
            break
        else:
            print('Sorry invalid response. Exiting game')
            i=2
            break

    else:
        print("No such option available. Exiting game")
        break

print("Thanks for playing Rock-Paper-Scissors with us. Good day!")