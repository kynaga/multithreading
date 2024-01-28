import  java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Задание №1
        NewThread newThread = new NewThread();
        newThread.start();
        System.out.println("");
        // Задание №2
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(new MyRunnable(), "Thread " + i);
            t.start();
            threads.add(t);
        }
    }
}


class NewThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}