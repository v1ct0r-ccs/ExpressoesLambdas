public class TesteLambdasThreads {
    public static void main(String[] args) {
        //comum
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando comum");
            }
        };
        new Thread(r).start();
        //Lambda
        Runnable rLambda = () -> System.out.println("Executando com Lambda");
        new Thread(rLambda).start();

        new Thread(() -> System.out.println("Executando com Lambda outro modo")).start();
    }
}
