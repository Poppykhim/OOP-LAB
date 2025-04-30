
class operations {

    void Length(String text) {
        System.out.println("Text length is: " + text.length());
    }

    void Cut(String text, String cut) {
        System.out.println("Result: " + text.replaceFirst(cut, "").trim());
    }

    void vowel(String text) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.indexOf(text.charAt(i)) != -1) {
                System.out.println("\"" + ch + "\" is at index: " + i);
            }
        }
    }

    void check2TextEqual() {

        String str1 = "Hi Student!";
        String str2 = "Students";
        String str3 = "Hi Student!";

        System.out.println("\nText1 is equal to Text2: " + str1.equals(str2));
        System.out.println("Text1 is equal to Text3: " + str1.equals(str3));
    }

    void CheckTextContains() {
        String txt1 = "Hi Students!";
        String txt2 = "Students";
        String txt3 = "Teacher";

        System.out.println("\nText1 contains Text2: " + txt1.contains(txt2));
        System.out.println("Text1 contains Text3: " + txt1.contains(txt3));
    }
}

public class Ex5 {

    public static void main(String[] args) {

        operations op = new operations();

        String textA = "I Love My Hometown";
        String textB = "I love my little country";
        String textC = "Hi Students!";
        op.Length(textA);
        System.out.println();
        op.Cut(textB, "I love");
        System.out.println();
        op.vowel(textC);
        System.out.println();
        op.check2TextEqual();
        System.out.println();
        op.CheckTextContains();
    }
}
