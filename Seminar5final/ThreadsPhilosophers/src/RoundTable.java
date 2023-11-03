import java.util.ArrayList;
import java.util.List;

public class RoundTable implements Runnable{


    private final List<Thread> listPhilosophers;

    private final List<Fork> forks;

    public RoundTable(){
        forks = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            forks.add(new Fork(Integer.toString(i)));
        }

        listPhilosophers = new ArrayList<>();
        listPhilosophers.add(new Thread(new Philosopher("John",forks)));
        listPhilosophers.add(new Thread(new Philosopher("Mike",forks)));
        listPhilosophers.add(new Thread(new Philosopher("Lena",forks)));
        listPhilosophers.add(new Thread(new Philosopher("Cody",forks)));
        listPhilosophers.add(new Thread(new Philosopher("Brian",forks)));

    }


    public void startPhilosophers(){
        for (Thread philosopher: listPhilosophers) {
            philosopher.start();
        }
    }


    @Override
    public void run() {
        startPhilosophers();
    }
}
