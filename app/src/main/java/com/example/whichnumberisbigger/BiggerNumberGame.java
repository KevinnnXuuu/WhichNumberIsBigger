package com.example.whichnumberisbigger;

public class BiggerNumberGame {
    private int number1;
    private int number2;
    private int score;
    private int lowerLimit;

    public BiggerNumberGame(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    public void generateRandomNumbers() {
        // generate a number between the upper & Lower limits inclusive
        // store that in number1
        // generate another number and make sure that it's different
        // store that in number2
        number1 = (int) (Math.random()*(upperLimit+1-lowerLimit)+lowerLimit);
        number2 = (int) (Math.random()*(upperLimit+1-lowerLimit)+lowerLimit);
        if (number1 == number2) {
            generateRandomNumbers();
        }
    }

    public String checkAnswer(int answer) {
      int largerNumber = Math.max(number1, number2);
      if (answer == largerNumber) {
          score+=17;
          return "Nice!!";
      }
      else {
          score-=10;
          return "Umm...";
      }


    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    private int upperLimit;
}
