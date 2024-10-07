package InstallTestMaven;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris")); //https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3

    }
    public static String abbrevName(String name) {
        name = name.toUpperCase().charAt(0) + "." + name.toUpperCase().charAt(name.indexOf(" ") + 1) + ".!";
        return name;
    }
}
