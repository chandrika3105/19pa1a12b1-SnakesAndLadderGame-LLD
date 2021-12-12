/*Dice class is used to generate random number on a dice throw of player
Here code is written in such a way that if the user throws 6 one time he gets another chance and if he throws 2 times again he get a chance but if he throws 3rd time his turn will be cancelled and next person turn occurs*/



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
