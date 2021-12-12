import java.lang.Math;
public class Dice{
	private int nofDice;
	public Dice(int nofDice){
		this.nofDice = nofDice;
	}
	public int throwDice(){
		int val = (int)(Math.random()*(6*nofDice-nofDice))+nofDice;
		if(nofDice==1&&val==6){
			while(true){
				val = 6+(int)(Math.random()*(6*nofDice-nofDice))+nofDice;
				if(val==12){
					val = 12+(int)(Math.random()*(6*nofDice-nofDice))+nofDice;	
					if(val==18){
						System.out.println("Better Luck in Next Turn!!Wait until next turn.");
						val = 0;
						break;
					}
					else{
						break;
					}
				}
				else{
					break;
				}
				
			}
		}
		return val;
	}
}