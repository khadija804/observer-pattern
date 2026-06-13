package ma.enset.obs;

@FunctionalInterface
public interface Observer {
    void update(int newState);
}
