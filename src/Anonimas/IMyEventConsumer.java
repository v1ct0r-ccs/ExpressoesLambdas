package Anonimas;

@FunctionalInterface
public interface IMyEventConsumer {
    public void consumer(Object value);

    default void calcular() {

    }
}
