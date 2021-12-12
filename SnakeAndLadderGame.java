import java.util.*;
public class SnakeAndLadderGame{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user regarding number of dice
		System.out.println("Enter the number of dices you want to play with : ");
		int nofDice = sc.nextInt();
		
		//Taking input from user regaring number of players
		System.out.println("Enter the number of players are going to play the game : ");
		int nofplayers = sc.nextInt();
		
		String[] names = new String[nofplayers];
		Queue<Player> allplayers = new LinkedList<>();
		
		//For output purpose names of players are taken from user
		System.out.println("Enter the names of the players : ");
		for(int i = 0;i<nofplayers;i++){
			names[i] = sc.next();
			Player p = new Player(names[i],i+1);
			allplayers.offer(p);
		}
		
		//Creating dice object and passing number of dice as parameter
		Dice dice = new Dice(nofDice);
		
		//Asking user to enter the size of board required
		System.out.println("Enter the size of the board : ");
		int size = sc.nextInt();
		
		//Asking user to mention number of snakes wanted in board
		System.out.println("Enter number of snakes you want in board : ");
		int nofSnakes = sc.nextInt();
		
		List<Jumper> snakes = new ArrayList<>();
		
		//Taking the required posions of the snakes from user and asking him to enter correctly!!
		System.out.println("Enter Positions of Snakes -- : ");
		System.out.println("Warning : Please enter valid positions accordingly : ");
		
		for(int q = 0;q<nofSnakes;q++){
			sc.nextLine();
			String[] sn = sc.nextLine().split(" ");
			
			//System.out.println(sn[0]);
			int strt = Integer.parseInt(sn[0]);
			int end = Integer.parseInt(sn[1]);
			Jumper snake = new Jumper(strt,end);
			snakes.add(snake);
			nofSnakes-=1;
		}
		
		List<Jumper> ladders = new ArrayList<>();
		
		//Asking user to mention number of ladders wanted in board
		System.out.println("Enter number of ladders you want in the board : ");
		int nofLad = sc.nextInt();
		
		//Taking the required posions of the ladders from user and asking him to enter correctly!!
		System.out.println("Enter Positions of Ladders -- : ");
		System.out.println("Warning : Please enter valid positions accordingly ");
		
		for(int w = 0;w<nofLad;w++){
			sc.nextLine();
			String[] sl = sc.nextLine().split(" ");
			
			int strt_ = Integer.parseInt(sl[0]);
			int end_ = Integer.parseInt(sl[1]);
			Jumper ladder = new Jumper(strt_,end_);
			ladders.add(ladder);
			nofLad-=1;
		}
		//Taking hashmap playercurpos inorder to keep track of the player current position
		Map<String,Integer> playercurpos = new HashMap<>();
		for(int j = 0;j<nofplayers;j++){
			playercurpos.put(names[j],0);
		}
		
		//Creating an object for the GameBoard and passing all the required parameters
		GameBoard gb = new GameBoard(dice,allplayers,snakes,ladders,playercurpos,size);
		
		//Calling startGame method inorder to start the game
		gb.startGame();
		
	}
}
