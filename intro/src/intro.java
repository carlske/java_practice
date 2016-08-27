import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by Francys System on 27/08/2016.
 */
public class intro {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JButton showList1Button;
    private JButton showList2Button;
    private JButton sortList2Button;
    private JButton sortList1Button;
    private JPanel window;
    private JLabel Date;

    List<String> lis1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();

    public intro() {
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate date1 = currentTime.toLocalDate();
        Date.setText(date1.toString());

        button2.addActionListener( e-> addListatwo());
        button1.addActionListener(e-> addlistone());
        showList1Button.addActionListener(e-> showlist(lis1) );
        showList2Button.addActionListener(e-> showlist(list2));
        sortList1Button.addActionListener(e-> soet(lis1));
        sortList2Button.addActionListener(e -> soet(list2));
    }

    private void addlistone() {
        lis1.add(textField1.getText());
    }

    private  void addListatwo(){
        list2.add(textField2.getText());
    }

    private  void showlist(List<String> list){
        list.forEach(lis -> System.out.println(lis));
    }

    private  void soet(List<String> tipo){
        Collections.sort(tipo,(lis1,list2) -> lis1.compareTo(list2));
        System.out.println("ordered list");
        showlist(tipo);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("intro");
        frame.setContentPane(new intro().window);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
