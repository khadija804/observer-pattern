package ma.enset.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {

    List<Integer> history = new ArrayList<>();

    @Override
    public void update(int newState) {
        System.out.println("-------- observer 2--------");
        history.add(newState);
        double sum = 0;
        for (Integer integer : history) {
            sum += integer;
        }
        System.out.println("moyenne :"+sum/history.size());
    }
}
