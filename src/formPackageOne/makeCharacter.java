package formPackageOne;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
    private int sliderHealth = slider1.getValue();
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

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateSliderDisplay();
            }
        });
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
        Class  generic = new Class();
        Npc characterNameTextField = new Npc(name, generic, levelOne, abilityScores);

    }

    public void stateChanged(ChangeEvent e) {

    }

    private void onCancel() {
// add your code here if necessary
dispose();
    }


    private void updateSliderDisplay(){
        sliderHealth = slider1.getValue();
        healthAmount.setText(""+sliderHealth);
    }

    public static void main() {
        makeCharacter dialog = new makeCharacter();
        dialog.pack();
        dialog.setVisible(true);
    }
}
