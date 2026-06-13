package ma.enset.obs;

public class ObserverImpl implements Observer {
    @Override
    public void update(Observable observable) {
        if (observable instanceof ObservableImpl) {
            System.out.println(" ------ observer 1 ---------- ");
            System.out.println("new state : " + ((ObservableImpl) observable).getState());
        }
    }
}
