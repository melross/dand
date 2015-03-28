package formPackageOne;

import javax.swing.*;
import java.awt.event.*;

public class makeCharacter extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField characterNameTextField;
    private JSlider slider1;
    private JComboBox raceComboBox;
    private JProgressBar completionTracker;
    private JComboBox class1ComboBox;
    private JSpinner levelSpinner;
    private JSpinner levelSpinner2;
    private JSpinner levelSpinner1;
    private JSpinner strengthSpinner;
    private JSpinner dexeritySpinner;
    private JSpinner constitutionSpinner;
    private JSpinner intelligenceSpinner;
    private JSpinner wisdomSpinner;
    private JSpinner charismaSpinner;
    private JLabel healthAmount;
    private JCheckBox healthOverideCheckBox;

    public makeCharacter() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
// add your code here
       // Npc
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        makeCharacter dialog = new makeCharacter();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
