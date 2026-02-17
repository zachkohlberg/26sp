// File: HeightFunction.java

// A variation of last week's Height.java where we only have one function that
// converts inches to a height string
void main() {
    String inches = Integer.parseInt(IO.readln("How tall are you in inches? "));
    String height = convertToHeight(inches);

    IO.println("Your height is " + height + ".");
    IO.println("55 inches is " + convertToHeight(55) + ".");
    IO.println("67 inches is " + convertToHeight(67) + ".");
    IO.println("80 inches is " + convertToHeight(80) + ".");
}

String convertToHeight(int totalInches) {
    int inches = totalInches % 12;
    int feet = totalInches / 12;
    return feet + "'" + inches + "\"";
}
