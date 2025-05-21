<p>
  <img src="ITC.gif" alt="Alt text" style="float: left; width: 220px; margin-right: 20px;">
Name: Virak Rith

Student ID: P20230033

Course: OOP in java

Instructor: HOK Tin

Assignment: Lab03

Due Date: May 19, 2025 (11:59 AM)

</p>
<br/>

# Exercise 1

## Source Codes

```C++
import java.util.Scanner;

class Equation {

    double a, b, c;

    Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void quadraticEquation() {
        double x1, x2, x;
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("X1 = " + x1 + ", X2 = " + x2);
        } else if (delta == 0) {
            x = (-b) / (2 * a);
            System.out.println("X1 = X2 = " + x);
        } else {
            System.out.println("Equation roots are complex!");
        }
    }
}

public class ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("Program for calculating roots of quadratic equation");
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Input value of a: ");
        a = scanner.nextDouble();
        System.out.print("Input value of b: ");
        b = scanner.nextDouble();
        System.out.print("Input value of c: ");
        c = scanner.nextDouble();

        Equation equation = new Equation(a, b, c);
        equation.quadraticEquation();

        scanner.close();
    }

}
```

## Output

```C++
Program for calculating roots of quadratic equation
ax^2 + bx + c = 0
Input value of a: 1
Input value of b: -2
Input value of c: 1
X1 = X2 = 1.0
```

---

# Exercise 2

## Source Code

```C++
import java.util.Scanner;

class Process {

    int num;
    int value[];

    Process(int num, int value[]) {
        this.num = num;
        this.value = value;
    }

    int findMin() {
        int min = value[0];
        for (int i = 1; i < num; i++) {
            if (value[i] < min) {
                min = value[i];
            }
        }
        return min;

    }

    int findMax() {
        int max = value[0];
        for (int i = 1; i < num; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }
        return max;
    }

    int findSum() {
        int Sum = value[0];
        for (int i = 1; i < num; i++) {
            Sum += value[i];
        }
        return Sum;
    }

    int findAvg() {
        return findSum() / num;
    }

}

public class ex2 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many number to be input? ");
            System.out.println("Number of input: ");
            int num = sc.nextInt();
            int value[] = new int[num];

            for (int i = 0; i < num; i++) {
                System.out.print("Value #" + (i + 1) + ": ");
                value[i] = sc.nextInt();
            }
            Process p = new Process(num, value);
            System.out.println("Min: " + p.findMin());
            System.out.println("Max: " + p.findMax());
            System.out.println("Average: " + p.findAvg());
            System.out.println("Sum: " + p.findSum());
        }
    }
}
```

## Output:

```C++
How many number to be input?
Number of input: 5
Value #1: 2
Value #2: -4
Value #3: 3
Value #4: 7
Value #5: 8
Min: -4
Max: 8
Average: 3
Sum: 16
```

---

# Exercise 3

## Source Code:

```C++
import java.util.Scanner;

class Setting {

    void Menu() {
        System.out.println("Phone Setting: ");
        System.out.printf("%-15s %-3s\n", "1. General", ">");
        System.out.printf("%-15s %-3s\n", "2. Wi-Fi", ">");
        System.out.printf("%-15s %-3s\n", "3. Bluetooth", ">");
        System.out.printf("%-15s %-3s\n", "4. Mobile Data", ">");
        System.out.printf("%-15s %-3s\n", "5. Hotspot", ">");
        System.out.printf("%-15s %-3s\n", "6. Notification", ">");
        System.out.printf("%-15s", "0. Quit");
    }

    void general() {
        System.out.println("\nGeneral:");
        System.out.printf("%-15s %s\n", "1. About", ">");
        System.out.printf("%-15s %s\n", "2. Software update", ">");
        System.out.printf("%-15s %s\n", "3. Storage", ">");
        System.out.printf("%-15s\n", "0. Back");
    }

    void generalToAbout() {
        System.out.println("\nGeneral > About:");
        System.out.printf("%-15s %s\n", "Name", "iPhone");
        System.out.printf("%-15s %s\n", "Model", "IXs");
        System.out.printf("%-15s %s\n", "Version", "18.5");
        System.out.printf("%-15s\n", "0. Back");
    }

    void generalToSU() {
        System.out.println("\n======================");
        System.out.println("Software is up to date");
        System.out.println("======================");
        System.out.printf("%-15s\n", "0. Back");
    }

    void wifi() {
        System.out.println("\nWi-Fi:");
        System.out.printf("%-15s %s\n", "Status", "On");
        System.out.printf("%-15s %s\n", "Network", "I-Coffee");
        System.out.printf("%-15s %s\n", "1. Other networks", ">");
        System.out.printf("%-15s\n", "0. Back");
    }

    void wifiToON() {
        System.out.println("\nWi-Fi > Other networks:");
        System.out.printf("%-15s %s\n", "Bayon coffee", "*****");
        System.out.printf("%-15s %s\n", "Angkor coffee", "**");
        System.out.printf("%-15s %s\n", "Brown coffee", "****");
        System.out.printf("%-15s %s\n", "Koi", "*");
        System.out.printf("%-15s\n", "0. Back");
    }

    void otherSetting(String title) {
        System.out.println(title);
        System.out.println("\n============================");
        System.out.println("The Feture is not available");
        System.out.println("============================");
        System.out.printf("%-15s\n", "0. Back");
    }

}

public class ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Setting phone_setting = new Setting();

        int choice;

        do {

            int generalChoice;
            int wifiChoice;

            System.out.println();
            phone_setting.Menu();
            System.out.print("\nChoice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    do {

                        int choiceInGeneral;
                        phone_setting.general();
                        System.out.print("Choice: ");
                        generalChoice = scanner.nextInt();

                        switch (generalChoice) {
                            case 1:
                                do {
                                    phone_setting.generalToAbout();
                                    System.out.print("\nChoice: ");
                                    choiceInGeneral = scanner.nextInt();
                                } while (choiceInGeneral != 0);
                                break;
                            case 2:
                                do {
                                    System.out.println("\nGeneral > Software Update:");
                                    phone_setting.generalToSU();
                                    System.out.print("\nChoice: ");
                                    choiceInGeneral = scanner.nextInt();
                                } while (choiceInGeneral != 0);
                                break;
                            case 3:
                                do {
                                    System.out.println("\nGeneral > Storage:");
                                    phone_setting.generalToSU();
                                    System.out.print("\nChoice: ");
                                    choiceInGeneral = scanner.nextInt();
                                } while (choiceInGeneral != 0);
                                break;

                        }

                    } while (generalChoice != 0);
                    break;

                case 2:

                    do {

                        int choiceInWifi;
                        phone_setting.wifi();
                        System.out.print("\nChoice: ");
                        wifiChoice = scanner.nextInt();

                        switch (wifiChoice) {
                            case 1:
                                do {
                                    phone_setting.wifiToON();
                                    System.out.print("\nChoice: ");
                                    choiceInWifi = scanner.nextInt();
                                } while (choiceInWifi != 0);
                                break;
                        }

                    } while (wifiChoice != 0);
                    break;

                case 3:
                    int opt;
                    do {
                        phone_setting.otherSetting("\nBluetooth");
                        System.out.print("Choice: ");
                        opt = scanner.nextInt();
                    } while (opt != 0);
                    break;
                case 4:
                    do {
                        phone_setting.otherSetting("\nMobile Data");
                        System.out.print("\nChoice: ");
                        opt = scanner.nextInt();
                    } while (opt != 0);
                    break;
                case 5:
                    do {
                        phone_setting.otherSetting("\nHotspot");
                        System.out.print("Choice: ");
                        opt = scanner.nextInt();
                    } while (opt != 0);
                    break;
                case 6:
                    do {
                        phone_setting.otherSetting("\nNotification");
                        System.out.print("Choice: ");
                        opt = scanner.nextInt();
                    } while (opt != 0);
                    break;

            }
        } while (choice != 0);

        System.out.println("\nThank you for using our Program ><");

        scanner.close();

    }

}
```

## Output:

```c++
Choice 1

Phone Setting:
1. General      >
2. Wi-Fi        >
3. Bluetooth    >
4. Mobile Data  >
5. Hotspot      >
6. Notification >
0. Quit
Choice: 1

General:
1. About        >
2. Software update >
3. Storage      >
0. Back
Choice: 1

General > About:
Name            iPhone
Model           IXs
Version         18.5
0. Back

Choice: 0

General:
1. About        >
2. Software update >
3. Storage      >
0. Back
Choice: 2

General > Software Update:

======================
Software is up to date
======================
0. Back

Choice: 0

General:
1. About        >
2. Software update >
3. Storage      >
0. Back
Choice: 3

General > Storage:

======================
Software is up to date
======================
0. Back

choice 2

Phone Setting:
1. General      >
2. Wi-Fi        >
3. Bluetooth    >
4. Mobile Data  >
5. Hotspot      >
6. Notification >
0. Quit
Choice: 2

Wi-Fi:
Status          On
Network         I-Coffee
1. Other networks >
0. Back

Choice: 1

Wi-Fi > Other networks:
Bayon coffee    *****
Angkor coffee   **
Brown coffee    ****
Koi             *
0. Back

choice 3

Phone Setting:
1. General      >
2. Wi-Fi        >
3. Bluetooth    >
4. Mobile Data  >
5. Hotspot      >
6. Notification >
0. Quit
Choice: 3

Bluetooth

============================
The Feture is not available
============================
0. Back

choice 4

Phone Setting:
1. General      >
2. Wi-Fi        >
3. Bluetooth    >
4. Mobile Data  >
5. Hotspot      >
6. Notification >
0. Quit
Choice: 4

Mobile Data

============================
The Feture is not available
============================
0. Back

choice 5

Phone Setting:
1. General      >
2. Wi-Fi        >
3. Bluetooth    >
4. Mobile Data  >
5. Hotspot      >
6. Notification >
0. Quit
Choice: 5

Hotspot

============================
The Feture is not available
============================
0. Back

choice 6

Phone Setting:
1. General      >
2. Wi-Fi        >
3. Bluetooth    >
4. Mobile Data  >
5. Hotspot      >
6. Notification >
0. Quit
Choice: 6

Notification

============================
The Feture is not available
============================
0. Back

Choice 0

Phone Setting:
1. General      >
2. Wi-Fi        >
3. Bluetooth    >
4. Mobile Data  >
5. Hotspot      >
6. Notification >
0. Quit
Choice: 0

Thank you for using our Program ><
```

---

# Exercise 4

## Source Code:

```C++
import java.util.Scanner;

class Student {

	String id;
	String name;
	int age;

	Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

}

public class ex4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Student[] student = new Student[100];

		String id, name;
		int age;
		String answer;
		int count = 0;

		for (int i = 0; i < student.length; i++) {
			System.out.println("Student #" + (i + 1) + ":");
			System.out.print("ID: ");
			id = scanner.nextLine();
			System.out.print("Name: ");
			name = scanner.nextLine();
			System.out.print("Age: ");
			age = scanner.nextInt();

			student[i] = new Student(id, name, age);
			count++;

			scanner.nextLine();
			System.out.print("Do you want to add more (y/n)?: ");
			answer = scanner.nextLine();

			if (answer.equalsIgnoreCase("n")) {
				break;
			}

		}

		System.out.println("===============================================");
		System.out.printf("| %-5s | %-10s | %-15s | %-4s |\n", "No", "ID", "Name", "Age");
		System.out.println("===============================================");

		for (int j = 0; j < count; j++) {
			System.out.printf("| %-5d | %-10s | %-15s | %-4d |\n", (j + 1), student[j].id, student[j].name,
					student[j].age);
		}

		System.out.println("===============================================");

		scanner.close();

	}
}

```

## Output:

```C++
Student #1:
ID: 0001
Name: Rith
Age: 18
Do you want to add more (y/n)?: y
Student #2:
ID: 0002
Name: Rithyy
Age: 19
Do you want to add more (y/n)?: n
===============================================
| No    | ID         | Name            | Age  |
===============================================
| 1     | 0001       | Rith            | 18   |
| 2     | 0002       | Rithyy          | 19   |
===============================================
```

---

# Exercise 5

## Source Code:

```C++
import java.util.Scanner;

class Math {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    static double min(double a, double b) {

        if (a > b) {
            return b;
        } else {

            return a;
        }

    }

    static double max(double a, double b) {

        if (a > b) {
            return a;
        } else {

            return b;
        }

    }

}

public class ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x, y;

        System.out.print("Enter a number: ");
        x = scanner.nextDouble();
        System.out.print("Enter other number: ");
        y = scanner.nextDouble();

        System.out.println("\nResult: \n");
        System.out.println(x + " + " + y + " = " + Math.add(x, y));
        System.out.println(x + " - " + y + " = " + Math.subtract(x, y));
        System.out.println(x + " x " + y + " = " + Math.multiply(x, y));
        System.out.println(x + " / " + y + " = " + Math.divide(x, y));
        System.out.println("Min: " + Math.min(x, y));
        System.out.println("Max: " + Math.max(x, y));

        scanner.close();

    }

}
```

## Output:

```C++
Enter a number: 10
Enter other number: 8

Result:

10.0 + 8.0 = 18.0
10.0 - 8.0 = 2.0
10.0 x 8.0 = 80.0
10.0 / 8.0 = 1.25
Min: 8.0
Max: 10.0

if number / 0:

Enter a number: 10
Enter other number: 0

Result:

10.0 + 0.0 = 10.0
10.0 - 0.0 = 10.0
10.0 x 0.0 = 0.0
10.0 / 0.0 = Infinity
Min: 0.0
Max: 10.0
```

# Exercise 6

## Source Codes

```C++
import java.util.Scanner;

class MyMath2 {

	static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	static double rectangleSurface(double width, double height) {
		return width * height;
	}

	static double circleSurface(double radius) {
		return 3.14 * radius * radius;
	}

	static int max(int a, int b, int c, int d, int e) {

		if (a > b && a > c && a > d && a > e) {
			return a;
		} else if (b > a && b > c && b > d && b > e) {
			return b;
		} else if (c > a && c > b && c > d && c > e) {
			return c;
		} else if (d > a && d > b && d > c && d > e) {
			return d;
		} else {
			return e;
		}

	}

	static int min(int a, int b, int c, int d, int e) {

		if (a < b && a < c && a < d && a < e) {
			return a;
		} else if (b < a && b < c && b < d && b < e) {
			return b;
		} else if (c < a && c < b && c < d && c < e) {
			return c;
		} else if (d < a && d < b && d < c && d < e) {
			return d;
		} else {
			return e;
		}

	}

}

public class ex6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n;
		double width, height;
		double radius;
		int a, b, c, d, e;

		System.out.print("Enter a number to define its Factorial: ");
		n = scanner.nextInt();

		System.out.println(n + "! = " + MyMath2.factorial(n));

		System.out.println("\n\t=== Define Rectangle Surface ===");
		System.out.print("Enter a Width: ");
		width = scanner.nextDouble();
		System.out.print("Enter a Height: ");
		height = scanner.nextDouble();

		System.out.println("Surface of Rectangle = " + MyMath2.rectangleSurface(width, height) + " m^2");

		System.out.println("\n\t=== Define Circle Surface ===");
		System.out.print("Enter a Radius: ");
		radius = scanner.nextDouble();

		System.out.println("Surface of Circle = " + MyMath2.circleSurface(radius) + " m^2");

		System.out.println("\n\t=== Define Max and Min value ===");
		System.out.print("Enter a value of a: ");
		a = scanner.nextInt();
		System.out.print("Enter a value of b: ");
		b = scanner.nextInt();
		System.out.print("Enter a value of c: ");
		c = scanner.nextInt();
		System.out.print("Enter a value of d: ");
		d = scanner.nextInt();
		System.out.print("Enter a value of e: ");
		e = scanner.nextInt();

		System.out.println("Max: " + MyMath2.max(a, b, c, d, e));

		System.out.println("Min: " + MyMath2.min(a, b, c, d, e));

		scanner.close();

	}
}

```

## Output

```C++
Enter a number to define its Factorial: 13
13! = 1932053504

        === Define Rectangle Surface ===
Enter a Width: 12
Enter a Height: 3
Surface of Rectangle = 36.0 m^2

        === Define Circle Surface ===
Enter a Radius: 4
Surface of Circle = 50.24 m^2

        === Define Max and Min value ===
Enter a value of a: 4
Enter a value of b: 2
Enter a value of c: 5
Enter a value of d: 2
Enter a value of e: 1
Max: 5
Min: 1
```

---

# Exercise 7

## Source Code

```C++
import java.util.Scanner;

class Students {

	String id;
	String name;
	int age;

	void setValues(Scanner scanner) {

		System.out.print("ID: ");
		id = scanner.nextLine();
		System.out.print("Name: ");
		name = scanner.nextLine();
		System.out.print("Age: ");
		age = scanner.nextInt();

	}

	void display(int no) {

		System.out.printf("| %-5d | %-10s | %-15s | %-4d |\n", no, id, name, age);

	}
}

public class ex7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Students[] students = new Students[100];

		int choice;
		int count = 0;

		do {

			System.out.println("====== Menu ======");
			System.out.println("1. Create a student");
			System.out.println("2. List students");
			System.out.println("3. Quit");
			System.out.print("Choose an option:");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:

				if (count < students.length) {
					students[count] = new Students();
					System.out.println("Student #" + (count + 1) + ":");
					students[count].setValues(scanner);
					System.out.println("\nA student is added to the list!\n");
					count++;
				} else {
					System.out.println("Student list is full!");
				}

				break;

			case 2:

				if (count == 0) {
					System.out.println("\nNo students to display.\n");
				} else {
					System.out.println("===============================================");
					System.out.printf("| %-5s | %-10s | %-15s | %-4s |\n", "No", "ID", "Name", "Age");
					System.out.println("===============================================");
					for (int i = 0; i < count; i++) {
						students[i].display(i + 1);
					}
					System.out.println("===============================================");

				}
				break;

			case 3:
				System.out.println("Exiting Program...");
				break;

			default:
				System.out.println("Invalid value please try again...");
				break;

			}

		} while (choice != 3);

		scanner.close();

	}

}
```

## Output:

```C++
====== Menu ======
1. Create a student
2. List students
3. Quit
Choose an option:1
Student #1:
ID: 123
Name: rith
Age: 18

A student is added to the list!

====== Menu ======
1. Create a student
2. List students
3. Quit
Choose an option:1
Student #2:
ID: 1234
Name: vin
Age: 14

A student is added to the list!

====== Menu ======
1. Create a student
2. List students
3. Quit
Choose an option:2
===============================================
| No    | ID         | Name            | Age  |
===============================================
| 1     | 123        | rith            | 18   |
| 2     | 1234       | vin             | 14   |
===============================================
====== Menu ======
1. Create a student
2. List students
3. Quit
Choose an option:3
Exiting Program...
```

---

# Exercise 8

## Source Code:

```C++

class Category {
	String name;
}

class Product {
	String id;
	String name;
	double price;
	int stock;
	String brand;
	Category category;

	void setValues(String id, String name, double price, int stock, String brand, Category category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.brand = brand;
		this.category = category;
	}

	void display() {
		System.out.println("Product ID: " + id + ", Name: " + name + ", Price: $" + price + ", Stock: " + stock
				+ ", Brand: " + brand + ", Category: " + category.name);
	}
}

class Video {
	String title;
}

class User {
	String id;
	String username;
	String email;
	int subscribers;
	String country;
	Video video;

	void setValues(String id, String username, String email, int subscribers, String country, Video video) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.subscribers = subscribers;
		this.country = country;
		this.video = video;
	}

	void display() {
		System.out.println("User ID: " + id + " Username: " + username + " Email: " + email + " Subscribers: "
				+ subscribers + " Country: " + country + " Title: " + video.title);
	}
}

class Author {
	String name;
}

class Book {
	String isbn;
	String title;
	double price;
	int pages;
	String language;
	Author author;

	void setValues(String isbn, String title, double price, int pages, String language, Author author) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.pages = pages;
		this.language = language;
		this.author = author;
	}

	void display() {
		System.out.println("Book ISBN: " + isbn + ", Title: " + title + ", Price: $" + price + ", Pages: " + pages
				+ ", Language: " + language + ", Author: " + author.name);
	}
}

public class ex8 {
	public static void main(String[] args) {

		Category category = new Category();
		category.name = "Laptops";

		Product[] productsArr = new Product[3];

		Product product = new Product();
		product.setValues("101", "MacBook Pro", 1999.99, 5, "Apple", category);
		productsArr[0] = product;

		Product product2 = new Product();
		product2.setValues("102", "XPS 15", 1799.99, 7, "Dell", category);
		productsArr[1] = product2;

		Product product3 = new Product();
		product3.setValues("103", "ThinkPad X1", 1599.00, 4, "Lenovo", category);
		productsArr[2] = product3;

		System.out.println("\n-- Product and Category --");
		for (Product p : productsArr) {
			p.display();
		}

		Video videos = new Video();
		videos.title = "Python for Beginners";
		Video videos2 = new Video();
		videos2.title = "Web Development 101";
		Video videos3 = new Video();
		videos3.title = "Data Science with R";

		User[] userArr = new User[3];

		User user = new User();
		user.setValues("201", "Sokha", "Sokha@gmail.com", 1500000, "USA", videos);
		userArr[0] = user;

		User user2 = new User();
		user2.setValues("202", "Davin", "Davin@gmail.com", 2500000, "UK", videos2);
		userArr[1] = user2;

		User user3 = new User();
		user3.setValues("203", "Rith", "Rith@gmail.com", 3500000, "Canada", videos3);
		userArr[2] = user3;

		System.out.println("\n-- User and Video --");
		for (User u : userArr) {
			u.display();
		}

		Author author = new Author();
		author.name = "Robert C. Martin";
		Author author2 = new Author();
		author2.name = "Brian W. Kernighan";
		Author author3 = new Author();
		author3.name = "Martin Fowler";

		Book[] booksArr = new Book[3];

		Book book = new Book();
		book.setValues("9780132350884", "Clean Code", 49.99, 464, "English", author);
		booksArr[0] = book;

		Book book2 = new Book();
		book2.setValues("9780131103627", "The C Programming Language", 39.99, 288, "English", author2);
		booksArr[1] = book2;

		Book book3 = new Book();
		book3.setValues("9780321127426", "Refactoring", 59.99, 431, "English", author3);
		booksArr[2] = book3;

		System.out.println("\n-- Book and Author --");
		for (Book b : booksArr) {
			b.display();
		}
	}
}
```

## Output:

```C++
-- Product and Category --
Product ID: 101, Name: MacBook Pro, Price: $1999.99, Stock: 5, Brand: Apple, Category: Laptops
Product ID: 102, Name: XPS 15, Price: $1799.99, Stock: 7, Brand: Dell, Category: Laptops
Product ID: 103, Name: ThinkPad X1, Price: $1599.0, Stock: 4, Brand: Lenovo, Category: Laptops

-- User and Video --
User ID: 201 Username: Sokha Email: Sokha@gmail.com Subscribers: 1500000 Country: USA Title: Python for Beginners
User ID: 202 Username: Davin Email: Davin@gmail.com Subscribers: 2500000 Country: UK Title: Web Development 101
User ID: 203 Username: Rith Email: Rith@gmail.com Subscribers: 3500000 Country: Canada Title: Data Science with R

-- Book and Author --
Book ISBN: 9780132350884, Title: Clean Code, Price: $49.99, Pages: 464, Language: English, Author: Robert C. Martin
Book ISBN: 9780131103627, Title: The C Programming Language, Price: $39.99, Pages: 288, Language: English, Author: Brian W. Kernighan
Book ISBN: 9780321127426, Title: Refactoring, Price: $59.99, Pages: 431, Language: English, Author: Martin Fowler
```

## Link to GitHub Account : [Click Here](https://github.com/Poppykhim/OOP-LAB.git) <3

Note: Viewing in VsCode IDE for better formatting!!!
