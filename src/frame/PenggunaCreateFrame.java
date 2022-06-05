package frame;

import javax.swing.*;

public class PenggunaCreateFrame extends JFrame {

    JLabel labelUsername = new JLabel("Username");
    JTextField tfUsername = new JTextField();

    JButton buttonSimpan = new JButton("Simpan");
    public PenggunaCreateFrame(){
        setTitle("Input data pengguna");
        setSize(640,480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void meletakkanKomponen(){
        getContentPane().setLayout(null);
        getContentPane().add(labelUsername);
        getContentPane().add(tfUsername);
        getContentPane().add(buttonSimpan);

        labelUsername.setBounds(10,20,80,20);
        tfUsername.setBounds(10,48,110,20);
        buttonSimpan.setBounds(100,80,110,24);
    }

    public void menambahkanListener(){
        buttonSimpan.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"tes");
        });
    }
}
