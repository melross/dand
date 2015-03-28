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
    private JSpinner levelSpinner1;
    private JSpinner levelSpinner;
    private JSpinner levelSpinner3;
    private JSpinner strengthSpinner;
    private JSpinner dexeritySpinner;
    private JSpinner constitutionSpinner;
    private JSpinner intelligenceSpinner;
    private JSpinner wisdomSpinner;
    private JSpinner charismaSpinner;
    private JLabel healthAmount;
    private JCheckBox healthOverideCheckBox;
    private JLabel totalLeverDisplay;
    private String name;

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


    public void actionPerformed(ActionEvent e) {
        name = characterNameTextField.getText();
    }

    private void onOK() {
        int str = (Integer) strengthSpinner.getValue();
        int dex = (Integer) dexeritySpinner.getValue();
        int con = (Integer) constitutionSpinner.getValue();
        int inte = (Integer) intelligenceSpinner.getValue();
        int wis = (Integer) wisdomSpinner.getValue();
        int cha = (Integer) charismaSpinner.getValue();
        int[] abilityScores = {str, dex, con, inte, wis, cha};
        int levelOne= (Integer) levelSpinner1.getValue();
        Class  classOne = (Class) class1ComboBox.getSelectedItem();
        Npc characterNameTextField = new Npc(name, classOne, levelOne, abilityScores);
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
