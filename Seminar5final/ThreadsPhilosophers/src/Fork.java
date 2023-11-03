public class Fork {
   private volatile boolean taken;



    private final String name;

   public  Fork(String name){
       this.name = name;
   }

    @Override
    public String toString() {
        return "Fork{" +
                "taken=" + taken +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean  isTaken(){
       return taken;
   }

    public synchronized void setTaken(boolean taken) {
        this.taken = taken;
    }
}
