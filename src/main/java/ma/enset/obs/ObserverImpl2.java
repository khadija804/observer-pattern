package ma.enset.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {

    List<Integer> history = new ArrayList<>();

    @Override
    public void update(Observable observable) {
        System.out.println("-------- observer 2--------");
        if (observable instanceof ObservableImpl) {
            if(history.size()<100){
                history.add(((ObservableImpl) observable).getState());
                double sum = 0;
                for (Integer integer : history) {
                    sum += integer;
                }
                System.out.println("moyenne :" + sum / history.size());
            }

        }

    }
}
