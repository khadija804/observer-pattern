package ma.enset;

import ma.enset.obs.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ObservableImpl observable= new ObservableImpl();
        Observer o1 = new ObserverImpl();
        Observer o2 = new ObserverImpl2();
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(obs -> {
            if(obs instanceof ObservableImpl o ){
                System.out.println(" --------- observer 3 -----");
                System.out.println(o.getState()*Math.cos(o.getState()));
            }
        });
        observable.setState(60);
        observable.setState(20);



    }
}