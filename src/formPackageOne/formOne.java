package formPackageOne;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by Mel on 3/27/2015.
 */
public class formOne {
    private JPanel panel1;
    private JButton newCharacterButton;
    private JButton makeActiveButton;
    private JList mOnstersList;
    private JButton newButton;
    private JButton makeCopyButton;
    private JList acTiveCharactersList;
    private JRadioButton saveCharacterRadioButton;
    private JRadioButton damageHealRadioButton;
    private JRadioButton deleteCharacterRadioButton;
    private JRadioButton castSpellsRadioButton;
    private JRadioButton addRemoveStatusRadioButton;
    private JList activeFunctionList;
    private JButton okayButton;
    private JButton cancelButton;
    private JRadioButton editCharacterRadioButton;
    private JRadioButton makeNotActiveRadioButton;
    private JList nPCList;
    private JLabel Class;

    public formOne() {
        npcTracker npcTrack = new npcTracker();
        newCharacterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] wontBeUsed = new String[1];
                makeCharacter.main(wontBeUsed);
                JDialog makeCharacter = new JDialog();

            }
        });
        makeActiveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        castSpellsRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
        mOnstersList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
        acTiveCharactersList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
        okayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        makeCopyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        damageHealRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
        castSpellsRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
        addRemoveStatusRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
        deleteCharacterRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
        saveCharacterRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
        nPCList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("formOne");
        frame.setContentPane(new formOne().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void setData(formPackageOne.nPCList data) {
    }

    public void getData(formPackageOne.nPCList data) {
    }

    public boolean isModified(formPackageOne.nPCList data) {
        return false;
    }
}
