import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        setTitle("Менеджеры компоновки Java");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Менеджер компоновки главного окна
        setLayout(new BorderLayout(10, 10));

        // Верхняя часть окна
        JLabel title = new JLabel(
                "Демонстрация менеджеров компоновки",
                SwingConstants.CENTER
        );
        title.setFont(new Font("Arial", Font.BOLD, 20));
        add(title, BorderLayout.NORTH);

        // Панель с FlowLayout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));
        buttonPanel.setBorder(
                BorderFactory.createTitledBorder("FlowLayout")
        );

        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        JButton button3 = new JButton("Кнопка 3");
        JButton button4 = new JButton("Кнопка 4");

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);

        add(buttonPanel, BorderLayout.CENTER);

        // Нижняя часть окна
        JLabel info = new JLabel(
                "Главное окно использует BorderLayout",
                SwingConstants.CENTER
        );
        info.setFont(new Font("Arial", Font.PLAIN, 14));
        add(info, BorderLayout.SOUTH);

        // Обработка нажатий кнопок
        button1.addActionListener(e ->
                info.setText("Нажата кнопка 1"));
        button2.addActionListener(e ->
                info.setText("Нажата кнопка 2"));
        button3.addActionListener(e ->
                info.setText("Нажата кнопка 3"));
        button4.addActionListener(e ->
                info.setText("Нажата кнопка 4"));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }
}