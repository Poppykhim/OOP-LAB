
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
