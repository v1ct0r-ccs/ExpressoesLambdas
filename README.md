 # Expressões Lambdas
 
- Métodos Default
- Interfaces Funcionais
- Expressões Lambdas
- Parênteses e colchetes com expressões lambda, quando usar e mais.
- Referências de método para lambda.

Expressões Lambda são funções anônimas.

A principal diferença de uma função normal e uma função lambda é que elas não possuem nome, definidas diretamente numa única linha, fornecendo abstrações para problemas complexos limpando o código deixando o escopo menor.

Elas estão presentes nas linguas como `Java`, `C#`, `Python`, `Ruby` e entre outras do mercado.

- Exemplos
```
(int a, int b) -> {return a + b; }

() -> System.out.println("Hello World");

(String s) -> {System.out.println(s);}

() -> 42 () -> {return 3.1415};

a -> a > 10
```

### Vantagens e desvantagens

- Vantagens
    - Código mais simples.
    - Simplifica diversas operações com coleções de dados.

- Desvantagens
    - Funções anônimas podem gerar problemas na hora de depurar o código.
    - Muitos argumentos numa Expressão Lambda fera legibilidade mais difícil.

### Indentificando expressões lambdas

Quando é encontrado o símbolo ``->``

```
palavras.forEach((String s) -> {
        System.out.println("consumer " + s);
    }
);
```

## Interfaces Funcionais

Interfaces funcionais são interfaces com um método a ser implementado, um método abstrato. Isso significa que toda interface criada que respeite esta premissa, torna-se automaticamente uma interface funcional.

O compilador reconhece essas interfaces e permite que elas estejam disponíveis para que os desenvolvedores trabalhem, por exemplo, com expressões lambda.

### Interfaces novas a partir do Java 8

- Fornecedor / Supplier
- Consumidor e BiConsumidor / Consumer e BiConsumer
- Predicado e BiPredicador / Predicate e BiPredicate
- Função e BiFunção / Function e BiFunction
- UnaryOperator e BinaryOperador

Todas elas se encontram no pacote ``java.util.function``

## Lambda X Interfaces anônimas
```
@FunctionalIntarface
public interface MyEventConsumer {
  public void consume(Object event);
}
```

```
MyEventConsumer myCon = new MyEventConsumer() {
  @Override
  public void consume(Object event) {
    System.out.println(event);
  }
};
myCon.consume("Olá Victor);
```

```
recebeInterface((x) -> System.out.println(x));
```

```
private static void recebeInterface(IMyEventConsumer consumer) {
  consumer.consume("Olá");
}
```

## Exemplo com Thread

```
public static void main(String[] args) {
  Runnable r = new Runnable() {
    public void run() {
      System.out.println("Thread com classe interna!"); }
  }
  new Thread(r).start();
}
```

```
new Thread(() -> System.out.println("Hello World")).start();
```

## Parênteses e colchetes

```
@FunctionalInterface
public interface MyEventConsumer {
  public void consume (Object event);
}
```

```
MyEventConsumer myConLmBody = s -> {
  System.out.println(s);
};
myConLamBody.consume("Com body");
```

```
MyEventConsumer myConLamBody = (s) -> {
System.out.println(s);
myConLamBody.consume("Com body");
```

## Retornando valores

```
FunctionalInterface
public interface MyEventConsumer1 {
  public Integer consume (Integer value, Integer value1);
}
```

```
MyEventConsumer1 myConLamBody = (value1, value2) -> {
  System.out.println(value1);
  System.out.println(value2);
  return value1 + value2;
};
Integer result = myConLamBody.consume(10, 20);
System.out.println("Result " + result);
```

## Referência de método

- Referencia de método
```
MyEventConsumer myConLamRe = System.out::println;
myConLamRe.consume("Olá Victor com Referência de método");
```

- Referência de método estático
```
Finder finder = myClass::doFind;
int result = finder.finnd("Teste", "Teste");
System.out.println(result);
```

- Referência de método no parâmetro
```
Finder finderParam = String::indexOf;
int resultParam = finderParam.find("Teste", "Teste");
System.out.println(resultParam);
```

- Referência de método no parâmetro em lambda
```
Finder finderParamSame = (s1, s2) -> s1.indexOf(s2);
int resultParamLamb = finderParamLambSame.find("Teste", "Teste");
System.out.println(resultParamLamb);
```

- Referência de método em construtores
```
Factory factory = String::new;
String ret = factory.create("Olá");
System.out.println(ret);
```

- Referência de método em construtores em lambda
```
Factory factory1 = s -> new String (s);
String ret1 = factory1.create("Olá");
System.out.println(ret1):
```