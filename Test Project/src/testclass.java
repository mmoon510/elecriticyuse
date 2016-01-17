import java.util.Scanner;


public class testclass {

public static void main(String[] args) {
		
		double electricityuse = 0;
		System.out.println("Is your computer a laptop or desktop?");
		Scanner type = new Scanner(System.in);
		String computer=type.nextLine(); 
		if (computer.equals("laptop")) {
			electricityuse = 20;
		}
		if (computer.equals("desktop")) {
			electricityuse = 50;
		}
		
		double electricityuse1=0;
	
		System.out.println("What is your computer's screen size?(in inches)");
		Scanner screen = new Scanner(System.in);
		double screensize = screen.nextInt();
		if (screensize == 15) {
			electricityuse1= 18;
		} else if (screensize == 19) {
			electricityuse1= 22;
		} else if (screensize == 21) {
			electricityuse1= 30;
		} else if (screensize == 24) {
			electricityuse1= 50;
		}
	
		double electricityuse2=0;
		
		System.out.println("What is your brand of CPU? (Choices:intel or AMD)");
		Scanner CPU = new Scanner(System.in);
		String brand = CPU.nextLine();
		if (brand.equals("intel")) {
			System.out.println("What model is your CPU?");
			Scanner model= new Scanner(System.in);
			String design = model.nextLine();
			if (design== "core i3") {
				electricityuse2 = 62.8;
			} else if (design== "pentium") {
				electricityuse2 = 65.2;
			} else if (design=="core i5") {
				electricityuse2= 68.3;
			}
		}
		if (brand == "AMD") {
			System.out.println("What model is your CPU?");
			Scanner model1 = new Scanner(System.in);
			String design1= model1.nextLine();
			if (design1== "fx-4100") {
				electricityuse2 = 85.4;
			} else if (design1== "phenom ii x4") {
				electricityuse2 = 90.3;
			} else if (design1== "penom ii x6") {
				electricityuse2 = 106.8;
			}
		}
		
		double electricityuse3=0;
		
		System.out.println("How many cores does your CPU have?");
		Scanner cores= new Scanner(System.in);
		double number = cores.nextInt();
		if (number == 2) {
			electricityuse3 = 60;
		}
		if (number == 4) {
			electricityuse3 = 80;
		}
		if (number == 6) {
			electricityuse3 = 120; 
		}
		
		double electricityuse4=0;
		
		System.out.println("What is the size of your hard disk?");
		Scanner harddisk= new Scanner(System.in);
		double harddisksize = harddisk.nextDouble();
		if (harddisksize == 2.5) {
			electricityuse4 = 2.5;
		}
		if (harddisksize == 3.5) {
			electricityuse4 = 3.5;
		}
		
		double electricityuse5=0;
		System.out.println("Are you using a mouse?");
		Scanner mouse= new Scanner(System.in);
		String mouseuse= mouse.nextLine();
		if (mouseuse.equals("yes")) {
			electricityuse5 = 0.6;
		}
		if (mouseuse.equals("no")) {
			electricityuse5 = 0;
		}
		
		double electricityuse6=0;
		
		System.out.println("Where do you live?");
		Scanner country = new Scanner(System.in);
		String place = country.nextLine();
		if (place.equals("China")) {
			electricityuse6 = 8.9;
		} else if (place.equals("France")) {
			electricityuse6 = 19.39;
		} else if (place.equals("Hong Kong")) {
			electricityuse6 = 16.05;
		} else if (place.equals("South Korea")) {
			electricityuse6 = 7.45;
		} else if (place.equals("United States")) {
			electricityuse6 = 11;
		}
		
		double electricityuse7=0;
		
		System.out.println("How many hours do you use the computer?");
		Scanner timeuse = new Scanner(System.in);
		String use = timeuse.nextLine();
		electricityuse7 = Integer.parseInt(use);
		
		
		double electricityuse8=0;
		
		System.out.println("How much was your computer?");
		Scanner price = new Scanner(System.in);
		String howmuch = price.nextLine();
		electricityuse8 = Integer.parseInt(use);
		
		System.out.println("Electricity Cost:" + ((electricityuse + electricityuse1 + electricityuse2 + electricityuse3 + electricityuse4 + electricityuse5)*electricityuse7*electricityuse6/1000)*100);
		System.out.println("Battery Cost:"+(electricityuse5/4.5*0.69*electricityuse));
		System.out.println("Computer Cost:" + electricityuse8);
		System.out.println("Total Cost:" + (((electricityuse + electricityuse1 + electricityuse2 + electricityuse3 + electricityuse4 + electricityuse5)*electricityuse7*electricityuse6/1000)+electricityuse8));
	}
}