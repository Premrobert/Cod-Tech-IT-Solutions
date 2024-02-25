import java.util.*;
import java.util.Scanner;

public class Student {
	final String name;
	final int rollNumber;
	public float english, maths, science;

	Student(String name, int rollNumber, float english, float maths, float science) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.english = english;
		this.maths = maths;
		this.science = science;

	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public float getEnglish() {
		return english;
	}

	public float getMaths() {
		return maths;
	}

	public float getScience() {
		return science;
	}
	public String toString() {
		return name + " " + rollNumber + " " + english + " " + maths + " " + science;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> c = new ArrayList<Student>();
		System.out.println("Welcome to Student Grade System");
		int ch;
		do {
			System.out.print("1: Add ");
			System.out.print("2: Display ");
			System.out.print("3: Update ");
			System.out.println("4: Delete ");
			System.out.println("Enter your Choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the Name");
				String name = sc.next();
				System.out.println("Enter the RollNumber");
				int rollNumber = sc.nextInt();
				System.out.println("Enter the English Marks");
				float english = sc.nextFloat();
				System.out.println("Enter the Maths Marks");
				float maths = sc.nextFloat();
				System.out.println("Enter the Science Marks");
				float science = sc.nextFloat();

				c.add(new Student(name, rollNumber, english, maths, science));
				
				float avg=(english+maths+science)/3;
				System.out.println("Average of Student " + name + " with RollNumber "+rollNumber+ " is : "+avg +" %");
				if(avg>=90 && avg<=100) {
					System.out.println("Your grade is A+");
				}
				else if(avg>=80 && avg<=90) {
					System.out.println("Your grade is A");
				}
				else if(avg>=65 && avg<=80) {
					System.out.println("Your grade is B");
				}
				else if(avg>=50 && avg<=65) {
					System.out.println("Your grade is C");
				}
				else if(avg>=35 && avg<=50) {
					System.out.println("Your grade is D");
				}
				else {
					System.out.println("Better luck  next time");
				}
				break;
			case 2:
				System.out.println("-------------------------");
				Iterator<Student> i = c.iterator();
				while (i.hasNext()) {
					Student s = i.next();
					System.out.println(s);
				}
				System.out.println("-------------------------");
				break;

			case 3:
				boolean found = false;
				System.out.println("Enter Student Rollnumber to Update");
				rollNumber = sc.nextInt();
				ListIterator<Student> li = c.listIterator();
				while (li.hasNext()) {
					Student s = li.next();
					if (s.getRollNumber() == rollNumber) {
						System.out.println("Enter the New name");
						name = sc.next();
						System.out.println("Enter the New RollNumber");
						rollNumber = sc.nextInt();
						System.out.println("Enter the New English Marks");
						english = sc.nextFloat();
						System.out.println("Enter the New Maths Marks");
						maths = sc.nextFloat();
						System.out.println("Enter the New Science Marks");
						science = sc.nextFloat();
						li.set(new Student(name, rollNumber, english, maths, science));
						
						float avg1=(english+maths+science)/3;
						System.out.println("Average of Student " + name + " with RollNumber "+rollNumber+ " is : "+avg1 +" %");
						if(avg1>=90 && avg1<=100) {
							System.out.println("Your grade is A+");
						}
						else if(avg1>=80 && avg1<=90) {
							System.out.println("Your grade is A");
						}
						else if(avg1>=65 && avg1<=80) {
							System.out.println("Your grade is B");
						}
						else if(avg1>=50 && avg1<=65) {
							System.out.println("Your grade is C");
						}
						else if(avg1>=35 && avg1<=50) {
							System.out.println("Your grade is D");
						}
						else {
							System.out.println("Better luck  next time");
						}
					}
					
					found = true;

				}
				if (!found) {
					System.out.println("File not Found");
				} else {
					System.out.println("Record is Update sucessfully");
				}
				
				System.out.println("-------------------------");
				break;

			case 4:
				found = false;
				System.out.println("Enter Student Rollnumber to Delete");
				rollNumber = sc.nextInt();
				i = c.iterator();
				while (i.hasNext()) {
					Student s = i.next();
					if (s.getRollNumber() == rollNumber) {
						i.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println("File not Found");
				} else {
					System.out.println("File deleted Sucessfully");
				}
				System.out.println("-------------------------");
				break;
			}

		} while (ch != 0);

	}
}
