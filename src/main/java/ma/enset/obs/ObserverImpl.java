package ma.enset.obs;

public class ObserverImpl implements Observer {
    @Override
    public void update(int newState) {
        System.out.println(" ------ observer 1 ---------- ");
        System.out.println("new state : "+newState);
    }
}
