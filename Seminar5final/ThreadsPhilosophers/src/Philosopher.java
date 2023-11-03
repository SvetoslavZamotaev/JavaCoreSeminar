import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Philosopher implements Runnable{


    private final String name;
    private int capacityOfFood = 3;
    private final List<Fork> listofForks;

    Lock lock = new ReentrantLock();

    public Philosopher(String name , List<Fork> listofForks){
        this.name = name;
        this.listofForks = listofForks;
    }

    @Override
    public void run() {
        while(getCapacityOfFood()>0){
//            lock.lock();
            if(isHereTwoFreeForks(listofForks)){
                int[] indexes = gettIndex(listofForks);
                System.out.println("this indexes of free fork: "+ indexes[0]+ " "+ indexes[1]);
//                ArrayList<Integer> getIndex = getIndex(listofForks);
                changingConditionBusy(listofForks,indexes);
                System.out.println(this.name+": if true, fork is taken : "+ listofForks.get(0).isTaken()+ " "+listofForks.get(1).isTaken()+ " "+listofForks.get(2).isTaken()+ " "+listofForks.get(3).isTaken()+ " "+listofForks.get(4).isTaken());
                eatingFood();
                System.out.println(this.name + " is eating!");
                changingConditionFree(listofForks,indexes);
//                lock.unlock();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                System.out.println(this.name + " is thinking....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public int getCapacityOfFood() {
        return capacityOfFood;
    }

    public void eatingFood(){
        if (capacityOfFood>0){
        this.capacityOfFood = this.capacityOfFood-1;
        }
    }

    @Override
    public String toString() {
        return "Philosopher{" +
                "name='" + name + '\'' +
                ", capacityOfFood=" + capacityOfFood +
                '}';
    }

    public boolean isHereTwoFreeForks(List<Fork> list){
        boolean result = false;
        int counter = 0;
        for (Fork fork:list) {
            if(!fork.isTaken()){
                counter++;
            }
        }
        if (counter>1){
            result = true;
        }
        return result;
    }

    public ArrayList<Integer> getIndex(List<Fork> list){
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        for (Fork fork:list) {
            if(!fork.isTaken()){
                if(count>2){
                    break;
                }
                result.add(list.indexOf(fork));
                count++;
            }
        }
        return result;
    }

    int[] gettIndex(List<Fork> list){
        int counter = 0;
        int[] error = {404,404};
        int[] result = new int[2];
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).isTaken()){
                if(counter>1){
                    break;
                }
                result[counter]=i;
                counter++;
            }
        }
        if(counter!=2){
            return error;
        }
        return result;
    }


    public void changingConditionBusy(List<Fork> forks, int[] list){
//        if(list.size()>=2){
//            forks.get(list.get(0)).setTaken(true);
//            forks.get(list.get(1)).setTaken(true);
//            try {
//                Thread.sleep(700);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        if(list[0]!=404){
            forks.get(list[0]).setTaken(true);
            forks.get(list[1]).setTaken(true);
        }
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void changingConditionFree(List<Fork> forks, int[] list){
//        if(list.size()>=2){
//            forks.get(list.get(0)).setTaken(false);
//            forks.get(list.get(1)).setTaken(false);
//            try {
//                Thread.sleep(700);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        if(list[0]!=404){
            forks.get(list[0]).setTaken(false);
            forks.get(list[1]).setTaken(false);
        }
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




















}
