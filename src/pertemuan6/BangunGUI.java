package pertemuan6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BangunGUI extends JFrame {
    private JTextField panjangField, lebarField, tinggiField;
    private JRadioButton persegiButton, kubusButton;
    private JButton hitungButton;
    private JLabel hasilLabel;

    public BangunGUI() {
        setTitle("Kalkulator Bangun Datar dan Ruang");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Panjang:"));
        panjangField = new JTextField();
        inputPanel.add(panjangField);
        inputPanel.add(new JLabel("Lebar:"));
        lebarField = new JTextField();
        inputPanel.add(lebarField);
        inputPanel.add(new JLabel("Tinggi:"));
        tinggiField = new JTextField();
        inputPanel.add(tinggiField);

        persegiButton = new JRadioButton("Persegi");
        kubusButton = new JRadioButton("Kubus");
        ButtonGroup group = new ButtonGroup();
        group.add(persegiButton);
        group.add(kubusButton);

        JPanel radioPanel = new JPanel();
        radioPanel.add(persegiButton);
        radioPanel.add(kubusButton);

        hitungButton = new JButton("Hitung");
        hitungButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hitung();
            }
        });

        hasilLabel = new JLabel();

        setLayout(new FlowLayout());
        add(inputPanel);
        add(radioPanel);
        add(hitungButton);
        add(hasilLabel);
    }

    private void hitung() {
        try {
            double panjang = Double.parseDouble(panjangField.getText());
            double lebar = Double.parseDouble(lebarField.getText());
            double tinggi = Double.parseDouble(tinggiField.getText());

            if (persegiButton.isSelected()) {
                Persegi persegi = new Persegi(panjang);
                double keliling = persegi.hitungKeliling();
                double luas = persegi.hitungLuas();
                hasilLabel.setText("Keliling: " + keliling + ", Luas: " + luas);
            } else if (kubusButton.isSelected()) {
                Kubus kubus = new Kubus(panjang);
                double keliling = kubus.hitungKeliling();
                double luas = kubus.hitungLuas();
                double volume = kubus.hitungVolume();
                hasilLabel.setText("Keliling: " + keliling + ", Luas: " + luas + ", Volume: " + volume);
            } else {
                hasilLabel.setText("Pilih bangun datar atau bangun ruang.");
            }
        } catch (NumberFormatException ex) {
            hasilLabel.setText("Masukkan angka valid.");
        }
    }

    public static void main(String[] args) {
        BangunGUI gui = new BangunGUI();
        gui.setVisible(true);
    }
}
