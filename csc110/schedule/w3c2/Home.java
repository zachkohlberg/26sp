// Filename: Home.java

void main() {
    String user = "zach";

    IO.print("  Linux: /home/");
    IO.println(user);

    IO.print("    Mac: /Users/");
    IO.println(user);

    IO.print("Windows: /c/Users/");
    IO.println(user);

    IO.print("      or C:\\Users\\");
    IO.println(user);
}
// We'll talk about why "\\" prints as "\" later
