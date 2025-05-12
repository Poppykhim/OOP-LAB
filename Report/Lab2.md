<p>
  <img src="ITC.gif" alt="Alt text" style="float: left; width: 220px; margin-right: 20px;">
Name: Virak Rith

Student ID: P20230033

Course: OOP in java

Instructor: HOK Tin

Assignment: Lab02

Due Date: May 12, 20s25 (11:59 AM)

</p>
<br/>

# Exercise 1

## Source Codes

```Java
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
```

## Output

```Java
Input your name: Rith
Hello, Rith!
```

# Exercise 2

## Source Code

```Java
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollar;
        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.print("Please input conversion rate of 1 dollar in Riels: ");
        double exchange_rate = scanner.nextDouble();
        System.out.print("Please input money to exchange in Riels: ");
        double riel = scanner.nextDouble();
        dollar = riel / exchange_rate;
        System.out.println(riel + " RIELS = " + dollar + " USD");
        scanner.close();
    }
}
```

## Output:

```Java
Program for converting money in Riels to Dollars.
Please input conversion rate of 1 dollar in Riels: 4080
Please input money to exchange in Riels: 42000
42000.0 RIELS = 10.294117647058824 USD
```

# Exercise 3

## Source Code:

```Java
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] answer = new String[8];

		System.out.println("==== Covid-19 Screen Health ===");
		System.out.println("Q1. Feeling feverish and/or having chills?");
		System.out.print("Answer: ");
		answer[0] = scanner.nextLine();
		System.out.println(
				"Q2. Has there been any use of fever reducing medication within the last 24 hours not due to another health\r\n"
						+ "condition?");
		System.out.print("Answer: ");
		answer[1] = scanner.nextLine();
		System.out.println("Q3. A new cough that is not due to another health condition?");
		System.out.print("Answer: ");
		answer[2] = scanner.nextLine();
		System.out.println("Q4. New chills that are not due to another health condition?");
		System.out.print("Answer: ");
		answer[3] = scanner.nextLine();
		System.out.println("Q5. A new sore throat that is not due to another health condition?");
		System.out.print("Answer: ");
		answer[4] = scanner.nextLine();
		System.out.println("Q6. A new loss of taste or smell?");
		System.out.print("Answer: ");
		answer[5] = scanner.nextLine();
		System.out.println("Q7. Have you had a positive test for the virus that causes COVID-19\r\n"
				+ "disease within the past 10 days?");
		System.out.print("Answer: ");
		answer[6] = scanner.nextLine();
		System.out.println(
				"Q8. In the past 14 days, have you had close contact (within about 6 feet for 15 minutes or more) with someone with\r\n"
						+ "suspected or confirmed COVID-19?");
		System.out.print("Answer: ");
		answer[7] = scanner.nextLine();

		System.out.println("=================================================");
		System.out.println("| Questions           | Answers                 |");
		System.out.println("=================================================");

		for (int i = 0; i < 8; i++) {
			if (answer[i].equalsIgnoreCase("yes")) {
				System.out.printf("| Q %-17d | %-23s |\n", i + 1, answer[i]);
				System.out.println("-------------------------------------------------");
			} else if (answer[i].equalsIgnoreCase("no")) {
				System.out.printf("| Q %-17d | %-23s |\n", i + 1, answer[i]);
				System.out.println("-------------------------------------------------");
			} else {
				System.out.printf("| Q %-17d | %-23s |\n", i + 1, "Invalid");
				System.out.println("-------------------------------------------------");
			}
		}

		scanner.close();
	}

}
```

## Output:

```Java
==== Covid-19 Screen Health ===
Q1. Feeling feverish and/or having chills?
Answer: chills
Q2. Has there been any use of fever reducing medication within the last 24 hours not due to another health
condition?
Answer: yes
Q3. A new cough that is not due to another health condition?
Answer: no
Q4. New chills that are not due to another health condition?
Answer: yes
Q5. A new sore throat that is not due to another health condition?
Answer: yes
Q6. A new loss of taste or smell?
Answer: yes
Q7. Have you had a positive test for the virus that causes COVID-19
disease within the past 10 days?
Answer: no
Q8. In the past 14 days, have you had close contact (within about 6 feet for 15 minutes or more) with someone with
suspected or confirmed COVID-19?
Answer: no
=================================================
| Questions           | Answers                 |
=================================================
| Q 1                 | Invalid                 |
-------------------------------------------------
| Q 2                 | yes                     |
-------------------------------------------------
| Q 3                 | no                      |
-------------------------------------------------
| Q 4                 | yes                     |
-------------------------------------------------
| Q 5                 | yes                     |
-------------------------------------------------
| Q 6                 | yes                     |
-------------------------------------------------
| Q 7                 | no                      |
-------------------------------------------------
| Q 8                 | no                      |
-------------------------------------------------
```

# Exercise 4

## Source Code:

```Java
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputSecond;

        System.out.print("Input number of seconds: ");
        inputSecond = scanner.nextInt();

        int hours = inputSecond / 3600;
        int minutes = (inputSecond % 3600) / 60;
        int second = inputSecond % 60;

        System.out.printf("Time corresponding to %d seconds is: %02d:%02d:%02d", inputSecond, hours, minutes, second);

        scanner.close();

    }

}
```

## Output:

```Java
Input number of seconds: 2840
Time corresponding to 2840 seconds is: 00:47:20
```

# Exercise 5

## Source Code:

```Java
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x, y, z;

        System.out.println("Program for calculating equation 1/x = 1/y + 1/z to find value of x");
        System.out.print("Please input y: ");
        y = scanner.nextDouble();
        System.out.print("Please input z: ");
        z = scanner.nextDouble();

        x = 1 / ((1 / y) + (1 / z));

        System.out.println("Result x = " + x);

        scanner.close();

    }

}
```

## Output:

```Java
Program for calculating equation 1/x = 1/y + 1/z to find value of x
Please input y: 2
Please input z: 4
Result x = 1.3333333333333333
```

# Exercise 6

## Source Code:

```Java
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Input a number to check whether it is a prime number: ");
        number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            int divisor = findDivisor(number);
            System.out.println(number + " is not a prime number, because it is divisible by " + divisor + ".");
        }

        scanner.close();

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findDivisor(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return -1; // Should never happen if n is not prime
    }

}
```

## Output:

```Java
Input a number to check whether it is a prime number: 57
57 is not a prime number, because it is divisible by 3.

Input a number to check whether it is a prime number: 13
13 is a prime number.
```

# Exercise 7

## Source Code:

```Java
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vowel = 0;
        int consonant = 0;
        int space = 0;

        System.out.print("Input a sentence: ");
        String txt = scanner.nextLine();

        txt = txt.toLowerCase();

        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);

            if (ch == ' ') {
                space++;
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Count of vowel is: " + vowel);
        System.out.println("Count of consonant is: " + consonant);
        System.out.println("Count of space is: " + space);

        scanner.close();

    }

}
```

## Output:

```Java
Input a sentence: I love you
Count of vowel is: 5
Count of consonant is: 3
Count of space is: 2
```

# Exercise 8

## Source Code:

```Java
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] value = new int[5];

		System.out.print("Input value of A: ");
		value[0] = scanner.nextInt();
		System.out.print("Input value of B: ");
		value[1] = scanner.nextInt();
		System.out.print("Input value of C: ");
		value[2] = scanner.nextInt();
		System.out.print("Input value of D: ");
		value[3] = scanner.nextInt();
		System.out.print("Input value of E: ");
		value[4] = scanner.nextInt();

		int min = value[0];

		for(int i = 0; i < 5; i++) {
			if(value[i] <= min) {
				min = value[i];
			}
		}

		System.out.println("The smallest number among A, B, C, D, and E is: " + min);

		scanner.close();

	}
}
```

## Output:

```Java
Input value of A: 13
Input value of B: 22
Input value of C: 11
Input value of D: 66
Input value of E: 99
The smallest number among A, B, C, D, and E is: 11
```

# Exercise 9

## Source Code:

```Java
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];
		String answer;
		int max;
		int count = 0;

		do {

			System.out.print("Input value in Array at index " + count + ": ");
			arr[count] = scanner.nextInt();
			count++;

			if (count >= arr.length) {
				System.out.println("\nArray is full. Cannot add more values.");
				break;
			}

			scanner.nextLine();
			System.out.print("Do you want to add more(y/n)?: ");
			answer = scanner.nextLine();

		} while (answer.equalsIgnoreCase("y"));

		max = arr[0];

		for (int i : arr) {
			if (i >= max) {
				max = i;
			}
		}

		System.out.println("\nThe biggest number among in Array is: " + max);

		scanner.close();

	}

}
```

## Output:

```Java
Input value in Array at index 0: 12
Do you want to add more(y/n)?: y
Input value in Array at index 1: 32
Do you want to add more(y/n)?: y
Input value in Array at index 2: 42
Do you want to add more(y/n)?: y
Input value in Array at index 3: 23
Do you want to add more(y/n)?: n

The biggest number among in Array is: 42
```

# Exercise 10

## Source Code:

```Java
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int opt;
		double a, b;
		String answer;

		do {

			Menu();

			opt = scanner.nextInt();

			switch (opt) {

			case 1:
				do {
					System.out.println("=== Addition(+) ===");
					System.out.print("Please input value A: ");
					a = scanner.nextDouble();
					System.out.print("Please input value B: ");
					b = scanner.nextDouble();
					System.out.println("Answer of " + a + " + " + b + " = " + Addition(a, b));

					System.out.println("Do you want to continue? If no go to Menu.");
					System.out.print("Input your answer (y/n): ");
					scanner.nextLine();
					answer = scanner.nextLine();
				} while (answer.equalsIgnoreCase("y"));
				break;
			case 2:
				do {
					System.out.println("=== Substruction(-) ===");
					System.out.print("Please input value A: ");
					a = scanner.nextDouble();
					System.out.print("Please input value B: ");
					b = scanner.nextDouble();
					System.out.println("Answer of " + a + " - " + b + " = " + Substruction(a, b));

					System.out.println("Do you want to continue? If no go to Menu.");
					System.out.print("Input your answer (y/n): ");
					scanner.nextLine();
					answer = scanner.nextLine();
				} while (answer.equalsIgnoreCase("y"));
				break;
			case 3:
				do {
					System.out.println("=== Multiplication(x) ===");
					System.out.print("Please input value A: ");
					a = scanner.nextDouble();
					System.out.print("Please input value B: ");
					b = scanner.nextDouble();
					System.out.println("Answer of " + a + " x " + b + " = " + Multiplication(a, b));

					System.out.println("Do you want to continue? If no go to Menu.");
					System.out.print("Input your answer (y/n): ");
					scanner.nextLine();
					answer = scanner.nextLine();
				} while (answer.equalsIgnoreCase("y"));
				break;
			case 4:
				do {
					System.out.println("=== Division(/) ===");
					System.out.print("Please input value A: ");
					a = scanner.nextDouble();
					System.out.print("Please input value B: ");
					b = scanner.nextDouble();
					System.out.println("Answer of " + a + " / " + b + " = " + Division(a, b));

					System.out.println("Do you want to continue? If no go to Menu.");
					System.out.print("Input your answer (y/n): ");
					scanner.nextLine();
					answer = scanner.nextLine();
				} while (answer.equalsIgnoreCase("y"));
				break;
			case 5:
				System.out.println("Exiting Program...");
				break;
			default:
				System.out.println("\nPlease choose an option again.");
				break;
			}

		} while (opt != 5);

		scanner.close();

	}

	public static void Menu() {
		System.out.println("=== Math Menu ===");
		System.out.println("1. Addition (+)");
		System.out.println("2. Substruction (-)");
		System.out.println("3. Multiplication (x)");
		System.out.println("4. Division (/)");
		System.out.println("5. Quit");
		System.out.print("\nPlease choose an option: ");
	}

	public static double Addition(double a, double b) {
		return a + b;
	}

	public static double Substruction(double a, double b) {
		return a - b;
	}

	public static double Multiplication(double a, double b) {
		return a * b;
	}

	public static double Division(double a, double b) {
		return a / b;
	}

}
```

## Output:

```java
=== Math Menu ===
1. Addition (+)
2. Substruction (-)
3. Multiplication (x)
4. Division (/)
5. Quit

Please choose an option: 1
=== Addition(+) ===
Please input value A: 10
Please input value B: 20
Answer of 10.0 + 20.0 = 30.0
Do you want to continue? If no go to Menu.
Input your answer (y/n): n
=== Math Menu ===
1. Addition (+)
2. Substruction (-)
3. Multiplication (x)
4. Division (/)
5. Quit

Please choose an option: 2
=== Substruction(-) ===
Please input value A: 10
Please input value B: 5
Answer of 10.0 - 5.0 = 5.0
Do you want to continue? If no go to Menu.
Input your answer (y/n): n
=== Math Menu ===
1. Addition (+)
2. Substruction (-)
3. Multiplication (x)
4. Division (/)
5. Quit

Please choose an option: 3
=== Multiplication(x) ===
Please input value A: 4
Please input value B: 3
Answer of 4.0 x 3.0 = 12.0
Do you want to continue? If no go to Menu.
Input your answer (y/n): n
=== Math Menu ===
1. Addition (+)
2. Substruction (-)
3. Multiplication (x)
4. Division (/)
5. Quit

Please choose an option: 4
=== Division(/) ===
Please input value A: 10
Please input value B: 2
Answer of 10.0 / 2.0 = 5.0
Do you want to continue? If no go to Menu.
Input your answer (y/n): n
=== Math Menu ===
1. Addition (+)
2. Substruction (-)
3. Multiplication (x)
4. Division (/)
5. Quit

Please choose an option: 5
Exiting Program...
```

# Exercise 11

## Source Code:

```Java

class ID_Card {

    String id;
    String full_name;
    String gender;
    String group;
    String major;

    ID_Card(String id, String full_name, String gender, String group, String major) {
        this.id = id;
        this.full_name = full_name;
        this.gender = gender;
        this.group = group;
        this.major = major;
    }

    // It will print unreadable format!!!
//	void display() {
//		System.out.println("ID: " + id);
//		System.out.println("Full Name: " + full_name);
//		System.out.println("Gender: " + gender);
//		System.out.println("Group: " + group);
//		System.out.println("Nationality: " + major);
//	}
    // To solve this problem I use toString
    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + full_name + "\nGender: " + gender + "\nGroup: " + group + "\nMajor: " + major;
    }

}

class Facebook_Post {

    String username;
    String caption;
    int numberOfLike;
    int numberOfComment;
    int numberOfShare;

    Facebook_Post(String username, String caption, int numberOfLike, int numberOfComment, int numberOfShare) {
        this.username = username;
        this.caption = caption;
        this.numberOfLike = numberOfLike;
        this.numberOfComment = numberOfComment;
        this.numberOfShare = numberOfShare;
    }

    @Override
    public String toString() {
        return "Username: " + username + "\nCaption: " + caption + "\nLike: " + numberOfLike + "\nComment: "
                + numberOfComment + "\nShare: " + numberOfShare;
    }
}

class Phone {

    String brand;
    String model;
    String operating_system;
    String chip;
    double price;

    Phone(String brand, String model, String operating_system, String chip, double price) {
        this.brand = brand;
        this.model = model;
        this.operating_system = operating_system;
        this.chip = chip;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s\nModel: %s\nOperating System: %s\nChip: %s\nPrice: $%.2f", brand, model,
                operating_system, chip, price);
    }
}

class Book {

    int id;
    String title;
    String author;
    String isbn;
    double price;

    Book(int id, String isbn, String title, String author, double price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nISBN: %s\nTitle: %s\nAuthor: %s\nPrice: $%.2f", id, isbn, title, author, price);
    }
}

public class Ex11 {

    public static void main(String[] args) {

        ID_Card idCard1 = new ID_Card("p20230018", "Do Davin", "Male", "A", "Software Engineering");
        ID_Card idCard2 = new ID_Card("p20230033", "Virak Rith", "Male", "A", "Software Engineering");
        ID_Card idCard3 = new ID_Card("p20230038", "Chin Hongnyheng", "Male", "A", "Software Engineering");

        Facebook_Post facebookPost1 = new Facebook_Post("Naraka", "Hello, World!", 10000, 2945, 3021);
        Facebook_Post facebookPost2 = new Facebook_Post("Godzilla", "Today Sad:(", 1034, 567, 345);
        Facebook_Post facebookPost3 = new Facebook_Post("Scar", "I'm so lonely:(", 341, 57, 21);

        Phone phone1 = new Phone("Apple", "iPhone 16 Pro Max", "iOS", "A18 Pro", 1295);
        Phone phone2 = new Phone("Samsung", "Galaxy S24 Ultra", "Android ", "Qualcomm Snapdragon 8 Gen 3 (4 nm)", 869);
        Phone phone3 = new Phone("Huawei", "Huawei P60 Pro", "Android ", "Snapdragon 8 Gen 2", 800);

        Book book1 = new Book(1, "9780132350884", "Clean Code", "Robert C. Martin", 39.99);
        Book book2 = new Book(2, "9780134685991", "Effective Java", "Joshua Bloch", 45.50);
        Book book3 = new Book(3, "9780201616224", "The Pragmatic Programmer", "Andrew Hunt", 42.75);

        ID_Card[] idCardArr = new ID_Card[3];
        idCardArr[0] = idCard1;
        idCardArr[1] = idCard2;
        idCardArr[2] = idCard3;

        Facebook_Post[] facebookPostArr = new Facebook_Post[3];
        facebookPostArr[0] = facebookPost1;
        facebookPostArr[1] = facebookPost2;
        facebookPostArr[2] = facebookPost3;

        Phone[] phoneArr = new Phone[3];
        phoneArr[0] = phone1;
        phoneArr[1] = phone2;
        phoneArr[2] = phone3;

        Book[] bookArr = new Book[3];
        bookArr[0] = book1;
        bookArr[1] = book2;
        bookArr[2] = book3;

        System.out.println("=== ID Card ===\n");
        for (ID_Card i : idCardArr) {
            System.out.println(i + "\n");
        }

        System.out.println("=== Facebook Post ===\n");
        for (Facebook_Post i : facebookPostArr) {
            System.out.println(i + "\n");
        }

        System.out.println("=== Phone ===\n");
        for (Phone i : phoneArr) {
            System.out.println(i + "\n");
        }

        System.out.println("=== Book ===\n");
        for (Book i : bookArr) {
            System.out.println(i + "\n");
        }

    }

}
```

## Output:

```Java
=== ID Card ===

ID: p20230018
Name: Sok
Gender: Male
Group: A
Major: SE

ID: p20230033
Name: Sao
Gender: Male
Group: A
Major: SE

ID: p20230038
Name: Chan
Gender: Male
Group: A
Major: SE

=== Facebook Post ===

Username: Tola
Caption: bye world!
Like: 10000
Comment: 2945
Share: 3021

Username: Sokha
Caption: i miss you:(
Like: 1034
Comment: 567
Share: 345

Username: Thy
Caption: Im so tired of my life
Like: 341
Comment: 57
Share: 21

=== Phone ===

Brand: Apple
Model: iPhone 12pro
Operating System: iOS
Chip: A18 Pro
Price: $1295.00

Brand: Samsung
Model: Galaxy S22
Operating System: Android
Chip: Qualcomm Snapdragon 8 Gen 3 (4 nm)
Price: $869.00

Brand: Oppo
Model: Oppo reno 5
Operating System: Android
Chip: Snapdragon 8 Gen 2
Price: $800.00

=== Book ===

ID: 1
ISBN: 9780132350884
Title: C++ basic
Author: John son
Price: $39.99

ID: 2
ISBN: 9780134685991
Title: Java programming
Author: Rith
Price: $45.50

ID: 3
ISBN: 9780201616224
Title: life is a game
Author: pu chhok
Price: $42.7
```

## Link to GitHub Account : [Click Here](https://github.com/Poppykhim/OOP-LAB.git) <3

Note: Viewing in VsCode IDE for better formatting!!!
