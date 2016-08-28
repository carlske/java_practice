import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Francys System on 28/08/2016.
 */
public class NashornForm {
    private JPanel window;
    private JTextField textField1;
    private JButton binarioButton;
    private JButton octalButton;
    private JButton hexadecimalButton;
    private JButton agregarEnPilaButton;
    private JButton primosButton;
    private JButton mostrarButton;
    Invocable invocable;
    ScriptEngine scriptEngine;

    public NashornForm() throws FileNotFoundException, ScriptException {
        filescript();
        binarioButton.addActionListener(e -> {
            try {
                binario();
            } catch (ScriptException e1) {
                e1.printStackTrace();
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            }
        });
        hexadecimalButton.addActionListener(e -> {
            try {
                hexa();
            } catch (ScriptException e1) {
                e1.printStackTrace();
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            }
        });
        octalButton.addActionListener(e -> {
            try {
                octal();
            } catch (ScriptException e1) {
                e1.printStackTrace();
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            }
        });
        agregarEnPilaButton.addActionListener(e -> {
            try {
                addpila();
            } catch (ScriptException e1) {
                e1.printStackTrace();
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            }
        });
        mostrarButton.addActionListener(e -> {
            try {
                showpila();
            } catch (ScriptException e1) {
                e1.printStackTrace();
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            }
        });
        primosButton.addActionListener(e -> {
            try {
                odenar();
            } catch (ScriptException e1) {
                e1.printStackTrace();
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            }
        });
    }

    private void filescript() throws FileNotFoundException, ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        scriptEngine = scriptEngineManager.getEngineByName("nashorn");
        scriptEngine.eval(new FileReader("src/conver.js"));
        invocable = (Invocable) scriptEngine;
    }

    private void binario() throws ScriptException, NoSuchMethodException {
        Object result = invocable.invokeFunction("converbinario",textField1.getText());
        System.out.println(result);

    }

    private void hexa() throws ScriptException, NoSuchMethodException {
        Object result = invocable.invokeFunction("converhexa", textField1.getText());
        System.out.println(result);
    }

    private void octal() throws ScriptException, NoSuchMethodException {
        Object result = invocable.invokeFunction("converoctal", textField1.getText());
        System.out.println(result);
    }

    private void addpila() throws ScriptException, NoSuchMethodException {
        Object result = invocable.invokeFunction("addpila", textField1.getText());
        System.out.println(result);
    }

    private void showpila() throws ScriptException, NoSuchMethodException {
        Object result = invocable.invokeFunction("showpila", textField1.getText());
        System.out.println(result);
    }

    private  void odenar() throws ScriptException, NoSuchMethodException {
        Object result = invocable.invokeFunction("ordenar");
        System.out.println(result);
    }

    public static void main(String[] args) throws FileNotFoundException, ScriptException {
        JFrame frame = new JFrame("NashornForm");
        frame.setContentPane(new NashornForm().window);
        frame.setTitle("java & java script");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
