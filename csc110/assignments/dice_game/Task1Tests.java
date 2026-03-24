void main() {
    // the seed 123456 will produce the following sequence of die rolls:
    // 3, 1, 5, 2, 2,
    // 5, 2, 6, 2, 5,
    // 6, 4, 4, 2, 5
    seed = 123456;

    // an array for the rollAll and rollSome functions
    int[] dice = new int[5];

    // should print the first five values
    // 3
    // 1
    // 5
    // 2
    // 2
    IO.println(rollDie());
    IO.println(rollDie());
    IO.println(rollDie());
    IO.println(rollDie());
    IO.println(rollDie());

    // roll all dice
    // should print next five values: 5 2 6 2 5
    rollAll(dice);
    IO.println(String.format("%d %d %d %d %d", dice[0], dice[1], dice[2], dice[3], dice[4]);

    // roll first, third, and fifth dice
    // should print: 6 2 4 2 4
    rollSome(dice, "ace");
    IO.println(String.format("%d %d %d %d %d", dice[0], dice[1], dice[2], dice[3], dice[4]);

    // roll first and fourth dice
    // should print: 2 2 4 5 4
    rollSome(dice, "ad");
    IO.println(String.format("%d %d %d %d %d", dice[0], dice[1], dice[2], dice[3], dice[4]);
}
