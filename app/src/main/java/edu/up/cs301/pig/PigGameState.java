package edu.up.cs301.pig;

/**
 * Created by Jason on 3/1/2018.
 */

public class PigGameState {

    private int turnNum;

    private int p0Score;
    private int p1Score;

    private int curTotal;
    private int diceVal;

    public PigGameState(){



    }

    public PigGameState( PigGameState pigState ){


    }

    public int getTurnNum(){
        return turnNum;
    }

    public int getP0Score(){
        return p0Score;
    }

    public int getP1Score(){
        return p1Score;
    }

    public int getCurTotal(){
        return curTotal;
    }

    public int getDiceVal(){
        return diceVal;
    }

    public void setTurnNum(int turnNum) {
        this.turnNum = turnNum;
    }

    public void setP0Score(int p0Score) {
        this.p0Score = p0Score;
    }

    public void setP1Score(int p1Score) {
        this.p1Score = p1Score;
    }

    public void setCurTotal(int curTotal) {
        this.curTotal = curTotal;
    }

    public void setDiceVal(int diceVal) {
        this.diceVal = diceVal;
    }





}
