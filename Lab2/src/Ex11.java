
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

        ID_Card idCard1 = new ID_Card("p20230018", "Sok", "Male", "A", "SE");
        ID_Card idCard2 = new ID_Card("p20230033", "Sao", "Male", "A", "SE");
        ID_Card idCard3 = new ID_Card("p20230038", "Chan", "Male", "A", "SE");

        Facebook_Post facebookPost1 = new Facebook_Post("Tola", "bye world!", 10000, 2945, 3021);
        Facebook_Post facebookPost2 = new Facebook_Post("Sokha", "i miss you:(", 1034, 567, 345);
        Facebook_Post facebookPost3 = new Facebook_Post("Thy", "Im so tired of my life", 341, 57, 21);

        Phone phone1 = new Phone("Apple", "iPhone 12pro", "iOS", "A18 Pro", 1295);
        Phone phone2 = new Phone("Samsung", "Galaxy S22", "Android ", "Qualcomm Snapdragon 8 Gen 3 (4 nm)", 869);
        Phone phone3 = new Phone("Oppo", "Oppo reno 5", "Android ", "Snapdragon 8 Gen 2", 800);

        Book book1 = new Book(1, "9780132350884", "C++ basic", "John son", 39.99);
        Book book2 = new Book(2, "9780134685991", "Java programming", "Rith", 45.50);
        Book book3 = new Book(3, "9780201616224", "life is a game", "pu chhok", 42.75);

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
