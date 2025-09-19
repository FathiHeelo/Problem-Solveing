//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


void main() {
Scanner input = new Scanner(System.in);
    System.out.println("Please enter  reqqerdmtion is ture or false: ");
    boolean req = input.nextBoolean();


if (req == true) {
    System.out.println("welcome your sharmota");

} else if (req == false) {
    System.out.println("Please enter your age: ");
    int age = input.nextInt();
    System.out.println("Please enter  driver linice is ture or false: ");
    boolean driver = input.nextBoolean();

    if (age >=21 &&driver == true) {
        System.out.println("Your age is greater than 21 years old!");
        System.out.println("Your driver linice is ture !");
        System.out.println("welcome");

    }else if (age >=21 && driver == false) {
        System.out.println("Your driver linice is flase !");

    }else if (age <21 && driver == true) {
        System.out.println("Your age is less than 21 years old!");
    }
}
}
