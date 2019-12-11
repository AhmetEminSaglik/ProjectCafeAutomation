package Logic;

import Gui.LoginGui;
import Gui.MainGui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Time;
import javax.swing.JOptionPane;

public class Actions implements ActionListener, MouseListener {

    LoginGui lg;
    MainGui mg;

    public Actions(LoginGui lg) {
        this.lg = lg;

    }

    public Actions(MainGui mg) {
        this.mg = mg;
        animationCreatorCaption();
    }

    String id = "HARUN";
    String pw = "CANDIR";

    @Override
    public void actionPerformed(ActionEvent e) {

        if (lg != null) {
            if (e.getSource() == lg.getBtnGiris()) {
                if (lg.getTxtUser().getText().equals(id)
                        && String.valueOf(lg.getTxtPassword().getPassword()).equals(pw)) {
                    lg.getJfLogin().setVisible(false);
                    MainGui mg = new MainGui(lg);
                    JOptionPane.showMessageDialog(null, "Hoşgeldiniz Sayın " + id);

                } else {
                    JOptionPane.showMessageDialog(null, "Hatalı kullanıcı adı veya parola");
                    lg.getTxtUser().setText("");
                    lg.getTxtPassword().setText("");
                }
            }
        } else if (mg != null) {
            if (e.getSource() == mg.getBtnUserExit()) {
                int answer = JOptionPane.showConfirmDialog(null, "Çıkış Yapmak İstediğinize Emin Misiniz? ", "ÇIKIŞ  UYARISI", 2, 2);
                if (answer == 0) {
                    mg.getJfMain().setVisible(false);
                    LoginGui lg = new LoginGui();

                }
            }
        }
    }

    public void animationCreatorCaption() {
        Thread t1 = new Thread() {
            public void run() {
                int index = -250;
                try {
                    while (true) {
                        for (int i = 885; i > index; i--) {
                            Thread.sleep(10 );
                            mg.getCreatorCaption().setLocation(i, 500);

                        }
                        /*for (int i = index; i < 600; i++) {
                            Thread.sleep(2);
                            mg.getCreatorCaption().setLocation(i, 600);
                        }*/
                    }
                } catch (Exception e) {
                    System.out.println(" hata kodu : " + e);
                }
            }
        };
        t1.start();

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (mg != null) {
            for (int i = 0; i < 7; i++) {
                if (e.getSource() == mg.btnMasalar[i]) //mg.btnMasalar[i].setBackground(Color.red);
                {
                    mg.btnMasalar[i].setBackground(new Color(255, 107, 129));
                    mg.btnMasalar[i].setForeground(new Color(235, 235, 235));

                }
            }
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (mg != null) {
            for (int i = 0; i < 7; i++) {
                if (e.getSource() == mg.btnMasalar[i]) //mg.btnMasalar[i].setBackground(Color.red);
                {
                    mg.btnMasalar[i].setBackground(mg.colorBtnTable);
                    mg.btnMasalar[i].setForeground(mg.colorBtnText);

                }
            }
        }
    }

}
