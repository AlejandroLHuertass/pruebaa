package edu.eci.cvds.servlet;

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import java.util.ArrayList;

@ManagedBean(name = "guessBean")
@SessionScoped
public class GuessBean{
	private ArrayList<Integer> userNumbers = new ArrayList<Integer>();
	private int currentNumberGuess;
	private int attempts;
	private int prize;
	private String[] gameStates = new String[]{"Winner of ", "You Loose", "Gotta keep up"};
	private String gameState;
	private Random guessNumber = new Random();
	
	
	public GuessBean(){
		this.gameState = gameStates[2];
		setPrize(50000);
		setAttempts(5);
		setNewNumber();
	}
	
	public void gues(String value){
		
		try{ 
			int numberChoosen = Integer.parseInt(value);
            userNumbers.add(numberChoosen);
			if ((getPrize() <= 0 || getAttempts() <= 1) && this.gameState == gameStates[2]){
				setGameState("L");
				this.prize = 0;
			}
			else{

				if (numberChoosen == getCurrentGuessNumber() && getAttempts() == 5){
					this.prize = getPrize() + 100000;
					setGameState("W");
				}
				if (numberChoosen == getCurrentGuessNumber()){
					setGameState("W");
				}
				else{
					this.prize = getPrize() - 10000;
				}
			}
			setAttempts(getAttempts() - 1);           
        }
        catch (Exception e){
            reset();
        }
    }
	
	
	
	public void reset(){
		userNumbers.clear();
		this.gameState = gameStates[2];
		setPrize(50000);
		setAttempts(5);
		setNewNumber();
	}
	
	public ArrayList<Integer> getNumbersTried(){
		return userNumbers;
	}
	
	public void setNewNumber(){
		this.currentNumberGuess = guessNumber.nextInt(5)+1;
	}
	
	public void setAttempts(int newAttempts) {
		this.attempts = newAttempts;
	}
	
	public void setPrize(int newPrize){
		this.prize = newPrize;
	}
	
	public void setGameState(String newGameState){
		this.gameState = (newGameState.equals("W")) ? gameStates[0] + "$" + getPrize(): gameStates[1];
	}
	
	public int getCurrentGuessNumber(){
		return currentNumberGuess;
	}
	
	public int getAttempts(){
		return attempts;
	}
	
	public int getPrize(){
		return prize;
	}
	
	public String getGameState(){
		return gameState;
	}
}