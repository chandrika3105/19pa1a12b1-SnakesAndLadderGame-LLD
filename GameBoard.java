import java.util.*;
public class GameBoard{
	private Dice dice;
	private Queue<Player> turns;
	private List<Jumper> snakes;
	private List<Jumper> ladders;
	private Map<String,Integer> playerPos;
	int boardSize;
	public GameBoard(Dice dice,Queue<Player> turns,List<Jumper> snakes,List<Jumper> ladders,Map<String,Integer> playerPos,int boardSize){
		this.dice = dice;
		this.turns = turns;
		this.snakes = snakes;
		this.ladders = ladders;
		this.playerPos= playerPos;
		this.boardSize = boardSize;
	}
	public void startGame(){
		while(turns.size()>1){
			Player pl = turns.poll();
			int curpos = playerPos.get(pl.getPlayerName());
			int diceVal = dice.throwDice();
			System.out.println(pl.getPlayerName()+" throws dice and got "+diceVal);
			int nextCell = curpos+diceVal;
			if(nextCell>boardSize){
				turns.offer(pl);
			}
			else if(nextCell==boardSize){
				System.out.println("Huray!! "+pl.getPlayerName()+" won the game!! "+nextCell);
				System.out.println("-----------------------------------------------------");
			}
			else{
				int[] nextpos = new int[1];
				boolean[] b = new boolean[1];
				nextpos[0] = nextCell;
				snakes.forEach(a->{
					if(a.start==nextCell){
						nextpos[0] = a.end;
					}
				});
				if(nextpos[0]!=nextCell){
					System.out.println("Alas! "+pl.getPlayerName()+" bitten by snake at "+nextCell);
					System.out.println("-----------------------------------------------------");
				}
				ladders.forEach(a->{
					if(a.start==nextCell){
						nextpos[0] = a.end;
						b[0] =true;
					}
				});
				if(nextpos[0]!=nextCell && b[0]){
					System.out.println(pl.getPlayerName()+" climbed ladder at "+nextCell);
					System.out.println("-----------------------------------------------------");
				}
				if(nextpos[0]==boardSize){
					System.out.println("Huray!! "+pl.getPlayerName()+" won the game!!");
					System.out.println("-----------------------------------------------------");
				}
				else{
					playerPos.put(pl.getPlayerName(),nextpos[0]);
					turns.offer(pl);
					System.out.println("Player "+pl.getPlayerName()+" at position "+playerPos.get(pl.getPlayerName()));
					System.out.println("-----------------------------------------------------");
				}
				
				
			}
		}
	}
}