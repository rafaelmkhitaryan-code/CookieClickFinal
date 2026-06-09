import java.util.Timer;
import java.util.TimerTask;

public class Game {
    protected int cookieCounter;
    private int cookiesPerClick;
    private int cookiesPerSecond;
    protected int upgrade1Cost;
    protected int upgrade2Cost;
    protected int upgrade3Cost;
    protected int upgrade4Cost;
    protected int upgrade5Cost;
    protected int upgrade6Cost;
    protected int upgrade7Cost;
    protected int upgrade8Cost;

    public Game() {
        this.cookieCounter = 0;
        this.cookiesPerClick = 1;
        this.cookiesPerSecond = 0;
        this.upgrade1Cost = 5;
        this.upgrade2Cost = 25;
        this.upgrade3Cost = 50;
        this.upgrade4Cost = 100;
        this.upgrade5Cost = 500;
        this.upgrade6Cost = 2500;
        this.upgrade7Cost = 7500;
        this.upgrade8Cost = 100000;



    Timer timer = new Timer();
     TimerTask slow = new TimerTask() {

         @Override
         public void run() {
             slowCookie();
         }
     };
    timer.schedule(slow, 0, 1000);
    }

    public void slowCookie(){
        cookieCounter +=cookiesPerSecond;
    }


    public void click() {
        cookieCounter += cookiesPerClick;
    }


    public void buyUpgrade1() {
            //write an if statement that will check if you have enough cookies first
            //if you don't have at leat 5 cookie, the upgrade will not be purchased
        if (cookieCounter >= upgrade1Cost) {
        cookieCounter -= upgrade1Cost;
        cookiesPerClick++;
            upgrade1Cost += cookiesPerClick * 2;
        }
}
//write a method to buy another upgrade, called buyUpgrade2
public void buyUpgrade2() {
    if (cookieCounter >= upgrade2Cost) {
        cookieCounter -= upgrade2Cost;
        cookiesPerSecond++;
        upgrade2Cost += cookiesPerSecond * 3;
    }
}

    public void buyUpgrade3 () {
        if (cookieCounter >= upgrade3Cost) {
            cookieCounter -= upgrade3Cost;
             cookiesPerClick = cookiesPerClick + 25;
             upgrade3Cost = cookiesPerClick * 4;
        }
    }

    public void buyUpgrade4 () {
        if (cookieCounter >= upgrade4Cost) {
            cookieCounter -= upgrade4Cost;
            cookiesPerSecond = cookiesPerSecond + 15;
            upgrade4Cost = cookiesPerClick * 5;
        }
    }


    public void buyUpgrade5 () {
        if (cookieCounter >= upgrade5Cost) {
            cookieCounter -= upgrade5Cost;
            cookiesPerClick = cookiesPerClick + 100;
            upgrade5Cost = cookiesPerClick * 6;
        }
    }

    public void buyUpgrade6 () {
        if (cookieCounter >= upgrade6Cost) {
            cookieCounter -= upgrade6Cost;
            cookiesPerClick = cookiesPerClick + 1000;
            upgrade6Cost = cookiesPerClick * 7;
        }
    }

    public void buyUpgrade7 () {
        if (cookieCounter >= upgrade6Cost) {
            cookieCounter -= upgrade6Cost;
            cookiesPerSecond = cookiesPerSecond + 1500;
            upgrade7Cost = cookiesPerSecond * 8;
        }
    }
    public void buyUpgrade8 () {
        if (cookieCounter >= upgrade8Cost) {
            cookieCounter -= upgrade8Cost;
            cookiesPerClick = cookiesPerClick + 10000;
            upgrade8Cost = cookiesPerClick * 9;
        }
    }





}