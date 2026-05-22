import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] persons = new Person[10];
        Scanner userInputScanner = new Scanner(System.in);
        for (int x = 0; x < persons.length; x++) {
            System.out.println("Enter Name: ");
            persons[x].name = userInputScanner.next();
            userInputScanner.close();
            System.out.println("Enter Age: ");
            persons[x].age = userInputScanner.nextInt();
            userInputScanner.close();
        }

    }
}

class Person {
    String name;
    int age;
}
