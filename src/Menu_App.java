import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu_App {
	
	static Scanner scanner = new Scanner(System.in);
	static List<String> students = new ArrayList<String>();
	
	public static void main(String[] args) {

		int choice = 0;
		
		while (choice != -1) {
			showMenu ();
			choice = getUserChoice();
			
			if (choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addNewStudent();
			} else if (choice == 3) {
				deleteStudent(); 
			} else if (choice == 4) {
				System.out.println("Goodbye");
			} else {
				System.out.println("Please selet a valid option!");
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Position");
		System.out.println("--------------------------------");
	}
	
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void printStudentNames() {
		for (String student : students) {
			System.out.println(student);
		}
	}
	
	public static void addNewStudent() {
		System.out.print("Enter the Student Name: ");
		String name = scanner.next();
		students.add(scanner.next());
		System.out.println("Student added: " + name);
	}
	
	public static void deleteStudent() {
		System.out.println("Enter the index of the student you wish to delete: ");
		int index = getUserChoice();
		if (index < students.size()) {
			students.remove(index);
		}
	}
}
