package frame;

import model.Pengguna;

import javax.swing.*;

public class PenggunaCreateForm extends JFrame{
    private JTextField tfUsername;
    private JTextField tfNamaLengkap;
    private JTextField tfLevel;
    private JButton buttonBatal;
    private JButton buttonSimpan;
    public JPanel panelMain;
    private JPasswordField tfPassword;

    public PenggunaCreateForm() {
        buttonSimpan.addActionListener(e -> {
            Pengguna p = new Pengguna();
            p.setUsername(tfUsername.getText());
            p.setPassword(tfPassword.getPassword().toString());
            p.setNamaLengkap(tfNamaLengkap.getText());
            p.setLevel(tfLevel.getText());
            p.create();

            tfUsername.setText("");
            tfPassword.setText("");
            tfNamaLengkap.setText("");
            tfLevel.setText("");

            JOptionPane.showMessageDialog(null,"Simpan data berhasil");
        });
        buttonBatal.addActionListener(e -> {
            dispose();
        });
    }

    public PenggunaCreateForm(int id) {
        Pengguna p = new Pengguna();
        p.setId(id);
        p.find();
        tfUsername.setText(p.getUsername());
        tfNamaLengkap.setText(p.getNamaLengkap());
        tfLevel.setText(p.getLevel());

        buttonSimpan.addActionListener(e -> {
            Pengguna pSimpan = new Pengguna();
            pSimpan.setId(id);
            pSimpan.setUsername(tfUsername.getText());
            pSimpan.setPassword(tfPassword.getPassword().toString());
            pSimpan.setNamaLengkap(tfNamaLengkap.getText());
            pSimpan.setLevel(tfLevel.getText());
            pSimpan.update();

            tfUsername.setText("");
            tfPassword.setText("");
            tfNamaLengkap.setText("");
            tfLevel.setText("");

            JOptionPane.showMessageDialog(null,"Ubah data berhasil");
            dispose();
        });
        buttonBatal.addActionListener(e -> {
            dispose();
        });
    }
}
