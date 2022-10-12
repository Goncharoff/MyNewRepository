package com.academy.algorithm;

public class Algorithm {

    public void fourthSolution() {
        int numberOfFlatsInEntrance = 9 * 4;
        int flatNumber = 157;
        int entranceResult = flatNumber / numberOfFlatsInEntrance + 1;
        int countOfFlatsBefore = flatNumber % numberOfFlatsInEntrance;
        int resultFloor = countOfFlatsBefore / 4;

        System.out.println("Result entrance = " + entranceResult);
        System.out.println("Result floor = " + (resultFloor + 1));
    }

    public void fifthSolution() {
        int avg = (200 + 1000) / 2;
        System.out.println(avg > 500);
        int resultTicketPrice = 600 - 10;
        System.out.println(resultTicketPrice);

        //second condtion
        int win = 1000 - 500;
        int looseCondition = 200 - 300;
        System.out.println(win > looseCondition);
    }
}
