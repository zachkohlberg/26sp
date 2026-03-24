void main() {
    int[] dice1 = new int[] { 1, 1, 1, 1, 1 };
    int[] dice2 = new int[] { 5, 6, 6, 5, 3 };
    int[] dice3 = new int[] { 2, 3, 4, 4, 4 };

    // should print
    // 5
    // 0
    // 2
    IO.println("countDice");
    IO.println(countDice(dice1, 1));
    IO.println(countDice(dice1, 2));
    IO.println(countDice(dice2, 6));

    // should print
    // 5
    // 2
    // 3
    IO.println("countMostCommon");
    IO.println(countMostCommon(dice1));
    IO.println(countMostCommon(dice2));
    IO.println(countMostCommon(dice3));

    // should print
    // 5
    // 30
    // 17
    IO.println("sumDice");
    IO.println(sumDice(dice1));
    IO.println(sumDice(dice2));
    IO.println(sumDice(dice3));

    // should print
    // 5
    // 0
    // 5
    // 50
    IO.println("calculateScore p1");
    IO.println(calculateScore(dice1, 1));
    IO.println(calculateScore(dice1, 6));
    IO.println(calculateScore(dice1, 7));
    IO.println(calculateScore(dice1, 9));


    // should print
    // 10
    // 3
    // 30
    // 0
    // 0
    IO.println("calculateScore p2");
    IO.println(calculateScore(dice2, 5));
    IO.println(calculateScore(dice2, 3));
    IO.println(calculateScore(dice2, 10));
    IO.println(calculateScore(dice2, 9));
    IO.println(calculateScore(dice2, 7));


    // should print
    // 0
    // 12
    // 17
    // 0
    IO.println("calculateScore p3");
    int[] dice3 = new int[] { 2, 3, 4, 4, 4 };
    IO.println(calculateScore(dice3, 1));
    IO.println(calculateScore(dice3, 4));
    IO.println(calculateScore(dice3, 7));
    IO.println(calculateScore(dice3, 8));

}
