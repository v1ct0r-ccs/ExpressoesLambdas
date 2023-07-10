package Anonimas;

public class QuandoUtilizarParenteses {
    public static void main(String[] args) {
        IMyEventConsumer myEventConsumer = (Object s) -> {
            System.out.println(s);
        };

        IMyEventConsumer myEvent1 = (s) -> {
            System.out.println(s);
        };

        IMyEventConsumer myEvent2 = s -> System.out.println(s);
        myEvent2.consumer("k");

        /*
         * As chaves devem ser utilizadas quando tiver mais de uma linha na expressão Lambda como mostra o exemplo 3
         * ou quando tiver return como mostra no exemplo 4
         */

        IMyEventConsumer myEvent3 = s -> {
            System.out.println(s);
            System.out.println(s);
        };
        myEvent3.consumer("as");

        IMyEventConsumerReturn<Integer> ret = s -> {
            System.out.println(s);
            System.out.println(s);
            return 1;
        };
        ret.consumer(1);

        /*IMyEventConsumerReturn<String> retS = s -> {
            System.out.println(s);
            System.out.println(s);
            return "Olá";
        };*/
        ret.consumer(2);


        IMyEventConsumer myEvent4 = s -> imprimir(s);
        myEvent4.consumer(1);
    }

    private static <T> T imprimir(T value) {
        System.out.println(value);
        return value;
    }
}
