package Anonimas;

public class MetodosComLambda {
    public static void main(String[] args) {
        IMyEventConsumer myEvent1 = s -> imprimir(s);
        myEvent1.consumer("Olá1");
    }

    private static void imprimir(Object o) {
        System.out.println(o);
    }
}
