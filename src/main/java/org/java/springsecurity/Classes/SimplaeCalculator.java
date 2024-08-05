package org.java.springsecurity.Classes;

public class SimplaeCalculator {
    private double firstNumber ;
    private double secondNumber;

//    public SimplaeCalculator(double firstNumber, double secondNumber) {
//        this.firstNumber = firstNumber;
//        this.secondNumber = secondNumber;
//    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
       return secondNumber += firstNumber;
    }

    public double getSubtractionResult() {
       double sub = 0;
        if (secondNumber < firstNumber) {
            return firstNumber - secondNumber;
        } else {
            return secondNumber -= firstNumber;
        }
    }
    public double getMultiplicationResult () {
      return  secondNumber *= firstNumber;
    }
    public double getDivisionResult () {
        double v = 0;
        if (secondNumber == 0) {
             return v;
        } else {
           v =  secondNumber /= firstNumber;
        }
        return v;
    }

}
