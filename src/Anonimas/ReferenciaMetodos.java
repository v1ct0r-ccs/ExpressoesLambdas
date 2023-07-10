package Anonimas;

public class ReferenciaMetodos {
    public static void main(String[] args) {
        IMyEventConsumer myEvent1 = s -> System.out.println(s);
        IMyEventConsumer myEvent2 = System.out::println;
        myEvent2.consumer("Olá");
        myEvent1.consumer("Victor");
    }
}
