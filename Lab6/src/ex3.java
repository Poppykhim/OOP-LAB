
import java.awt.event.*;
import javax.swing.*;

public class ex3 {

    public static void main(String[] args) {
        JFrame f = new JFrame("First GUI");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel t1, t2, result;
        t1 = new JLabel("Count Number of Vowel,Consonant and space: ");
        t2 = new JLabel("Text: ");
        result = new JLabel();
        f.add(t1);
        f.add(t2);
        f.add(result);
        t1.setBounds(50, 30, 350, 100);
        t2.setBounds(50, 80, 350, 100);
        result.setBounds(50, 190, 200, 100);

        JTextField input = new JTextField();
        JButton find = new JButton("Find");
        f.add(input);
        f.add(find);
        input.setBounds(50, 140, 150, 25);
        find.setBounds(50, 170, 100, 25);

        find.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = input.getText().toLowerCase();
                int vowels = 0, consonants = 0, spaces = 0;

                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (Character.isLetter(c)) {
                        if ("aeiou".indexOf(c) != -1) {
                            vowels++;
                        } else {
                            consonants++;
                        }
                    } else if (c == ' ') {
                        spaces++;
                    }
                }

                String message = "<html>Vowels: " + vowels
                        + "<br>Consonants: " + consonants
                        + "<br>Spaces: " + spaces + "</html>";

                result.setText(message);
            }
        });

    }
}
