package ma.enset.obs;

@FunctionalInterface
public interface Observer {
    void update(Observable o);
}
