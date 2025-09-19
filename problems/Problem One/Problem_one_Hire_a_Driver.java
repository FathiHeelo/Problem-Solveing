//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


void main() {
Scanner input = new Scanner(System.in);
    System.out.println("Recommendation is true or false: ");
    boolean Recommendation = input.nextBoolean();


if (Recommendation == true) {
    System.out.println("welcome ");

} else if (Recommendation == false) {
    System.out.println("Please enter your age: ");
    int age = input.nextInt();
    System.out.println("Please enter  driver license is true or false: ");
    boolean driver_license = input.nextBoolean();

    if (age >=21 &&driver_license == true) {
        System.out.println("Your age is greater than 21 years old!");
        System.out.println("Your driver license is true !");
        System.out.println("Hired");

    }else if (age >=21 && driver_license == false) {
        System.out.println("Your driver license is false !\nRejected");

    }else if (age <21 && driver_license == true) {
        System.out.println("Your age is less than 21 years old!\nRejected");
    }
}
}
