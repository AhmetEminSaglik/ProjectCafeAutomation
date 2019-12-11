package Gui;

import Logic.Actions;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.RepaintManager;
import sun.font.CreatedFontTracker;

public class MainGui {
    
    JFrame jfMain;
    JPanel jpMain;
    JButton btnMasa1;
    JButton btnMasa2;
    JButton btnMasa3;
    JButton btnMasa4;
    JButton btnMasa5;
    JButton btnMasa6;
    JButton btnMasa7;
    JButton btnUserExit;
    LoginGui lg;
    JLabel creatorCaption;
    public JButton[] btnMasalar = new JButton[7];
    
    Icon iconTable = new ImageIcon("src/Images/table.png");
    final int btnWidth = 120;
    final int btnHeight = 120;
    Font font = new Font("monospaced", Font.BOLD, 16);
    Actions action = new Actions(this);
    public Color colorBtnTable = new Color(236, 204, 104);
    public Color colorBtnText = new Color(47, 53, 66);
    RepaintManager rm = new RepaintManager();
    
    public MainGui(LoginGui lg) {
        this.lg = lg;
        
        getJpMain().add(getBtnUserExit());
        getJfMain().add(getJpMain());
        /*this.setLayout(null);
        getJfMain().add(this);
        this.add(getBtnUserExit());*/
        getJfMain().setVisible(true);
        getJpMain().add(getBtnMasa1());
        getJpMain().add(getBtnMasa2());
        getJpMain().add(getBtnMasa3());
        getJpMain().add(getBtnMasa4());
        getJpMain().add(getBtnMasa5());
        getJpMain().add(getBtnMasa6());
        getJpMain().add(getBtnMasa7());
        masalarıButonDizisineEkleme();
        getJpMain().add(getCreatorCaption());
    }
    
    public void masalarıButonDizisineEkleme() {
        btnMasalar[0] = btnMasa1;
        btnMasalar[1] = btnMasa2;
        btnMasalar[2] = btnMasa3;
        btnMasalar[3] = btnMasa4;
        btnMasalar[4] = btnMasa5;
        btnMasalar[5] = btnMasa6;
        btnMasalar[6] = btnMasa7;
        
    }

    /*  @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.red);
        //g.drawRect(0, 0, 100, 100);
        //g.draw3DRect(150, 50, 50, 70, false);//--> borderları koyu açık renkli çizer
        g.setColor(Color.BLUE);
        //g.copyArea(0, 0, 300, 300, 50, 50); //--> bölgeyi olduğu gibi kopyalar ve istenilen yere yapıştırır
        //g.drawOval(200, 200, 60, 60);
        //g.setColor(Color.orange);
        //g.drawOval(222, 75, 100, 100);
        g.drawRoundRect(50, 50, 100, 100, 0, 0);// --> kare butonun köşelerini yumuşatır

    }
     */
    public JFrame getJfMain() {
        if (jfMain == null) {
            jfMain = new JFrame("Harun Doğdu Efsane Kafe");
            jfMain.setBounds(250, 80, 900, 600);
            jfMain.setResizable(false);
            jfMain.setUndecorated(true);
        }
        return jfMain;
    }
    
    public void setJfMain(JFrame jfMain) {
        this.jfMain = jfMain;
    }
    
    public JPanel getJpMain() {
        if (jpMain == null) {
            jpMain = new JPanel();
            jpMain.setBounds(getJfMain().getBounds());
            jpMain.setBackground(new Color(241, 196, 15));
            jpMain.setLayout(null);
        }
        return jpMain;
    }
    
    public void setJpMain(JPanel jpMain) {
        this.jpMain = jpMain;
    }
    
    public JButton getBtnMasa1() {
        if (btnMasa1 == null) {
            btnMasa1 = new JButton("MASA 1");
            btnMasa1.setBounds(250, 120, btnWidth, btnHeight);
            btnMasa1.setIcon(iconTable);
            btnMasa1.setFocusable(false);
            btnMasa1.setCursor(new Cursor(12));
            btnMasa1.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa1.addMouseListener(action);
            btnMasa1.setBackground(colorBtnTable);
            btnMasa1.setForeground(colorBtnText);
        }
        return btnMasa1;
    }
    
    public void setBtnMasa1(JButton btnMasa1) {
        this.btnMasa1 = btnMasa1;
    }
    
    public JButton getBtnMasa2() {
        if (btnMasa2 == null) {
            btnMasa2 = new JButton("MASA 2");
            btnMasa2.setBounds(250, 250, btnWidth, btnHeight);
            btnMasa2.setIcon(iconTable);
            btnMasa2.setFocusable(false);
            btnMasa2.setCursor(new Cursor(12));
            btnMasa2.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa2.addMouseListener(action);
            btnMasa2.setBackground(new Color(238, 238, 238));
            btnMasa2.setBackground(colorBtnTable);
            btnMasa2.setForeground(colorBtnText);
        }
        return btnMasa2;
    }
    
    public void setBtnMasa2(JButton btnMasa2) {
        this.btnMasa2 = btnMasa2;
    }
    
    public JButton getBtnMasa3() {
        if (btnMasa3 == null) {
            btnMasa3 = new JButton("MASA 3");
            btnMasa3.setBounds(250, 380, btnWidth, btnHeight);
            btnMasa3.setIcon(iconTable);
            btnMasa3.setFocusable(false);
            btnMasa3.setCursor(new Cursor(12));
            btnMasa3.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa3.addMouseListener(action);
            btnMasa3.setBackground(colorBtnTable);
            btnMasa3.setForeground(colorBtnText);
        }
        return btnMasa3;
    }
    
    public void setBtnMasa3(JButton btnMasa3) {
        this.btnMasa3 = btnMasa3;
    }
    
    public JButton getBtnMasa4() {
        if (btnMasa4 == null) {
            btnMasa4 = new JButton("MASA 4");
            btnMasa4.setBounds(385, 250, btnWidth, btnHeight);
            btnMasa4.setIcon(iconTable);
            btnMasa4.setFocusable(false);
            btnMasa4.setCursor(new Cursor(12));
            btnMasa4.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa4.addMouseListener(action);
            btnMasa4.setBackground(colorBtnTable);
            btnMasa4.setForeground(colorBtnText);
        }
        return btnMasa4;
    }
    
    public void setBtnMasa4(JButton btnMasa4) {
        this.btnMasa4 = btnMasa4;
    }
    
    public JButton getBtnMasa5() {
        if (btnMasa5 == null) {
            btnMasa5 = new JButton("MASA 5");
            btnMasa5.setBounds(520, 120, btnWidth, btnHeight);
            btnMasa5.setIcon(iconTable);
            btnMasa5.setFocusable(false);
            btnMasa5.setCursor(new Cursor(12));
            btnMasa5.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa5.addMouseListener(action);
            btnMasa5.setBackground(colorBtnTable);
            btnMasa5.setForeground(colorBtnText);
        }
        return btnMasa5;
    }
    
    public void setBtnMasa5(JButton btnMasa5) {
        this.btnMasa5 = btnMasa5;
    }
    
    public JButton getBtnMasa6() {
        if (btnMasa6 == null) {
            btnMasa6 = new JButton("MASA 6");
            btnMasa6.setBounds(520, 250, btnWidth, btnHeight);
            btnMasa6.setIcon(iconTable);
            btnMasa6.setFocusable(false);
            btnMasa6.setCursor(new Cursor(12));
            btnMasa6.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa6.addMouseListener(action);
            btnMasa6.setBackground(colorBtnTable);
            btnMasa6.setForeground(colorBtnText);
        }
        return btnMasa6;
    }
    
    public void setBtnMasa6(JButton btnMasa6) {
        this.btnMasa6 = btnMasa6;
    }
    
    public JButton getBtnMasa7() {
        if (btnMasa7 == null) {
            btnMasa7 = new JButton("MASA 7");
            btnMasa7.setBounds(520, 380, btnWidth, btnHeight);
            btnMasa7.setIcon(iconTable);
            btnMasa7.setFocusable(false);
            btnMasa7.setCursor(new Cursor(12));
            btnMasa7.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnMasa7.addMouseListener(action);
            btnMasa7.setBackground(colorBtnTable);
            btnMasa7.setForeground(colorBtnText);
        }
        return btnMasa7;
    }
    
    public void setBtnMasa7(JButton btnMasa7) {
        this.btnMasa7 = btnMasa7;
    }
    
    public JButton getBtnUserExit() {
        if (btnUserExit == null) {
            btnUserExit = new JButton();
            btnUserExit.setBounds(15, 15, 180, 64);
            btnUserExit.setText("   " + lg.getTxtUser().getText());
            //btnUserExit.setBorder(BorderFactory.createBevelBorder(0, Color.red, Color.BLACK));// --> div etiketi gibi
            btnUserExit.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
            btnUserExit.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 10));
            btnUserExit.setBackground(new Color(22, 160, 133));
            btnUserExit.setForeground(new Color(223, 228, 234));
            btnUserExit.setFocusable(false);
            btnUserExit.setFont(font);
            Icon iconExit = new ImageIcon("src/Images/exit.png");
            btnUserExit.setIcon(iconExit);
            btnUserExit.setLayout(null);
            btnUserExit.setToolTipText("Çıkış");
            btnUserExit.addActionListener(action);
            btnUserExit.setCursor(new Cursor(12));
        }
        return btnUserExit;
    }
    
    public void setBtnUserExit(JButton btnUserExit) {
        this.btnUserExit = btnUserExit;
    }
    
    public JLabel getCreatorCaption() {
        if (creatorCaption == null) {
            creatorCaption = new JLabel();
            creatorCaption.setText("Creators by Harun & Ahmet");
            creatorCaption.setBounds(690, 530, 400, 40);
            creatorCaption.setFont(font);
            //creatorCaption.setForeground(colorBtnText);

        }
        return creatorCaption;
    }
    
    public void setCreatorCaption(JLabel creatorCaption) {
        this.creatorCaption = creatorCaption;
    }
    
}
