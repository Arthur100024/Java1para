package com.company;

class Ping extends Thread {
    private Table table;
    private String text1 = "";
    public Ping(Table t)
    {
        table = t;
    }
    public void run() {

        for (int i = 0; i < 10; i++) {
            text1= table.getPing();
            System.out.println(text1);
        }
    }
}

class Pong extends Thread {
    private Table table;
    private String text1 = "";
    
    public Pong(Table t)
    {
        table = t;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            text1= table.getPong();
            System.out.println(text1);   }
    }
}

class Table extends Thread {
    private Table table;
    private boolean pinged = false;
    public synchronized String getPong() {
        while (pinged == false) {
            try {
                wait();
            }
            catch (InterruptedException e)
            { }
        }
        pinged = false;
        
        notifyAll();
        String text = "pong";
        return text;
    }
    
    public synchronized String getPing() {
        while (pinged == true) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        pinged = true;
        notifyAll();
        String text = "ping";
        return text;
    }
}

public class PingPong {

    public static void main(String args[]) {

        Table t = new Table();
        Pong pong = new Pong(t);
        Ping ping = new Ping(t);
        
        ping.start();
        pong.start();

        System.out.println("Конец программы");
    }
    
}
