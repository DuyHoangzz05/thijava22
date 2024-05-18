package session13;

public class DaemonTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("=> Main Thread running...\n");
        Thread daemonThread = new DaemonThreadDemo();
        daemonThread.setDaemon(true);
        daemonThread.start();
        new NoneDaemonThread().start();
        Thread.sleep(5000);

        System.out.printf("=>Main thread stopped");
    }
}
