import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame;
    JPanel panel;
    JPanel fillerPanel;
    JLabel label;
    JLabel cost1;
    JLabel cost2;
    JLabel cost3;
    JLabel cost4;
    JLabel cost5;
    JLabel cost6;
    JLabel cost7;
    JLabel cost8;
    JButton cookieButton;
    JButton upgradeButton1;
    JButton upgradeButton2;
    JButton upgradeButton3;
    JButton upgradeButton4;
    JButton upgradeButton5;
    JButton upgradeButton6;
    JButton upgradeButton7;
    JButton upgradeButton8;
    int counter = 0;
    Game game;
    ActionListener guiUpdate;
    Timer updateTimer;


    public GUI() {
        this.game = new Game();
        frame = new JFrame();
        panel = new JPanel();
        fillerPanel = new JPanel();
        label = new JLabel("MUCHO TEXTO");
        cost1 = new JLabel("Upgrade Cost: " + game.upgrade1Cost);
        cost2 = new JLabel("Upgrade Cost: " + game.upgrade2Cost);
        cost3 = new JLabel("Upgrade Cost: " + game.upgrade3Cost);
        cost4 = new JLabel("Upgrade Cost: " + game.upgrade4Cost);
        cost5 = new JLabel("Upgrade Cost: " + game.upgrade5Cost);
        cost6 = new JLabel("Upgrade Cost: " + game.upgrade6Cost);
        cost7 = new JLabel("Upgrade Cost: " + game.upgrade7Cost);
        cost8 = new JLabel("Upgrade Cost: " + game.upgrade8Cost);
        cookieButton = new JButton("COOKIE");
        upgradeButton1 = new JButton("MUCHO CLICK");
        upgradeButton2 = new JButton("SLOW COOK");
        upgradeButton3 = new JButton("25 COOKIES PER CLICK");
        upgradeButton4 = new JButton("15 COOKIES PER SECOND");
        upgradeButton5 = new JButton("100 COOKIES PER CLICK");
        upgradeButton6 = new JButton("1000 COOKIES PER CLICK");
        upgradeButton7 = new JButton("1500 COOKIES PER SEC");
        upgradeButton8 = new JButton("10000 COOKIES PER CLICK");
        cookieButton.addActionListener(this);
        upgradeButton1.addActionListener(e -> {
            game.buyUpgrade1();
        });
        upgradeButton2.addActionListener(e -> {
            game.buyUpgrade2();
        });
        upgradeButton3.addActionListener(e -> {
        game.buyUpgrade3();
        });
        upgradeButton4.addActionListener(e -> {
            game.buyUpgrade4();
        });
        upgradeButton5.addActionListener(e -> {
            game.buyUpgrade5();
        });
        upgradeButton6.addActionListener(e -> {
            game.buyUpgrade6();
        });
        upgradeButton7.addActionListener(e -> {
            game.buyUpgrade7();
        });
        upgradeButton8.addActionListener(e -> {
            game.buyUpgrade8();
        });













            cookieButton.setBackground(new Color(102, 51, 0));
            upgradeButton1.setBackground(new Color(153, 102, 0));
            upgradeButton2.setBackground(new Color(102, 51, 0));
            upgradeButton3.setBackground(new Color(153, 102, 0));
            upgradeButton4.setBackground(new Color(102, 51, 0));
            upgradeButton5.setBackground(new Color(153, 102, 0));
            upgradeButton6.setBackground(new Color(102, 51, 0));
            upgradeButton7.setBackground(new Color(153, 102, 0));
            upgradeButton8.setBackground(new Color(102, 51, 0));

        cookieButton.setForeground(new Color(45, 21, 21, 169));
        upgradeButton1.setForeground(new Color(45, 21, 21, 169));
        upgradeButton2.setForeground(new Color(45, 21, 21, 169));
        upgradeButton3.setForeground(new Color(45, 21, 21, 169));
        upgradeButton4.setForeground(new Color(45, 21, 21, 169));
        upgradeButton5.setForeground(new Color(45, 21, 21, 169));
        upgradeButton6.setForeground(new Color(45, 21, 21, 169));
        upgradeButton7.setForeground(new Color(45, 21, 21, 169));
        upgradeButton8.setForeground(new Color(45, 21, 21, 169));






        guiUpdate = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Cookies: " + game.cookieCounter);
                cost1.setText("Upgrade Cost: " + game.upgrade1Cost);
                cost2.setText("Upgrade Cost: " + game.upgrade2Cost);
                cost3.setText("Upgrade Cost: " + game.upgrade3Cost);
                cost4.setText("Upgrade Cost: " + game.upgrade4Cost);
                cost5.setText("Upgrade Cost: " + game.upgrade5Cost);
                cost6.setText("Upgrade Cost: " + game.upgrade6Cost);
                cost7.setText("Upgrade Cost: " + game.upgrade7Cost);
                cost8.setText("Upgrade Cost: " + game.upgrade8Cost);


            }
            };
        updateTimer = new Timer(500, guiUpdate); // delay, the thing to do.
        updateTimer.start();

//first need to add the label to the panel
        panel.setSize(600, 600);
        panel.setLayout(new GridLayout(6,3));
        panel.add(cookieButton);
        panel.add(upgradeButton1);
        panel.add(upgradeButton2);
        panel.add(label);
        panel.add(cost1);
        panel.add(cost2);
        panel.add(upgradeButton3);
        panel.add(upgradeButton4);
        panel.add(upgradeButton5);
        panel.add(cost3);
        panel.add(cost4);
        panel.add(cost5);
        panel.add(upgradeButton6);
        panel.add(upgradeButton7);
        panel.add(upgradeButton8);
        panel.add(cost6);
        panel.add(cost7);
        panel.add(cost8);
        panel.setBackground(new Color(195, 126, 67));

        fillerPanel.setSize(700,700);
        fillerPanel.setBackground(Color.DARK_GRAY);
//next, we add the panel to the frame
        frame.add(panel);
        frame.add(fillerPanel);

        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
        @Override
        public void actionPerformed(ActionEvent e) {
        game.click();
        label.setText("Cookies: " + game.cookieCounter);
    }
}
/*
To do:
Change the button colors (figure it out)
add more upgrades (youll need to change your grid)
-5-10
They need to be unique and do different things

bonus points
change your buttond to cookie ima
 */