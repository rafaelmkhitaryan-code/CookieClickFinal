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
    JButton cookieButton;
    JButton upgradeButton1;
    JButton upgradeButton2;
    JButton upgradeButton3;
    JButton upgradeButton4;
    JButton upgradeButton5;
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
        cost2 = new JLabel("Upgrade Cost: " + game.upgrade1Cost);
        cookieButton = new JButton("COOKIE");
        upgradeButton1 = new JButton("MUCHO CLICK");
        upgradeButton2 = new JButton("SLOW COOK");
        upgradeButton3 = new JButton("X2");
        upgradeButton4 = new JButton("4");
        upgradeButton5 = new JButton("5");
        cookieButton.addActionListener(this);
        upgradeButton1.addActionListener(e -> {
            game.buyUpgrade1();
        });
        upgradeButton2.addActionListener(e -> {
            game.buyUpgrade2();
        });
            cookieButton.setBackground(Color.RED);
            upgradeButton1.setBackground(Color.BLUE);
            upgradeButton2.setBackground(Color.YELLOW);
            upgradeButton3.setBackground(Color.GREEN);
            upgradeButton4.setBackground(Color.MAGENTA);
            upgradeButton5.setBackground(Color.ORANGE);

        guiUpdate = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Cookies: " + game.cookieCounter);
                cost1.setText("Upgrade Cost: " + game.upgrade1Cost);
                cost2.setText("Upgrade Cost: " + game.upgrade2Cost);


            }
            };
        updateTimer = new Timer(500, guiUpdate); // delay, the thing to do.
        updateTimer.start();

//first need to add the label to the panel
        panel.setSize(600, 400);
        panel.setLayout(new GridLayout(3,3));
        panel.add(cookieButton);
        panel.add(upgradeButton1);
        panel.add(upgradeButton2);
        panel.add(label);
        panel.add(cost1);
        panel.add(cost2);
        panel.add(upgradeButton3);
        panel.add(upgradeButton4);
        panel.add(upgradeButton5);
        panel.setBackground(Color.PINK);

        fillerPanel.setSize(700,500);
        fillerPanel.setBackground(Color.DARK_GRAY);
//next, we add the panel to the frame
        frame.add(panel);
        frame.add(fillerPanel);

        frame.setSize(700,500);
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