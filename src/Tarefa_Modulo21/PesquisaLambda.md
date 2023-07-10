# Expressões Lambda

Em Java, as expressões Lambda são uma forma concisa de escrever funções anônimas. Elas são uma poderosa adição à linguagem Java a partir da versão 8, permitindo que você passe funcionalidades como parâmetros para métodos e defina comportamento de forma mais flexível.

Uma expressão Lambda é definida usando uma sintaxe especial, que consiste numa lista de parâmetros, uma seta ``->`` e um corpo de expressão ou um bloco de código. Aqui está um exemplo básico:

```
(parametros) -> expressao
```

Por explo, se quisermos definir uma função que recebe dois inteiros e retorna a soma deles, podemos escrever uma expressão Lambda da seguinte forma:

```
(int a, int b) -> a + b
```

A expressão acima define uma função com os parâmetros **a** e **b** que retorna a soma deles. Pode-se atribuir essa expressão Lambda a uma variável de um tipo funcional compátivel, que á uma interface com um único método abstrado. Essas interfaces são conhecidas como interfaces funcionais.

## Diferenças entre as Expressões Normais e a Lambda

- **Concisão**: As expressões Lambda permitem escrever códigos mais breves, evitando a necessidade de definir uma função completa para implementar um comportamento simples.
- **Legibiligade**: AS expressões Lambda podem tornar o código mais legível, especialmente quenado usadas com conjuto com os métodos das Streams API do Java 8, onde você pode realizar operações de filtragem, mapeando e redução em coleções de elementos.
- **Tratamento de eventos**: As expressões Lambda são frequentemente usadas um Java para definir o comportamento de tratamento de eventos, como ao lidar com cliques de botões em interfaces gráficas.
- **Captura de variáveis**: As expressões Lambda podem capturar variáveis do escopo em que são definidas. Isso significa que elas podem acessar e modificar váriaveis locais externas, desde que sejam final ou efetivamente final.
- **Suporte a interfaces funcionais**: As expressões Lambda só podem ser usadas com interfaces funcionais, interfaces com apenas um método abstrato. Isso permite o uso de lambdas num contexto onde uma implementação de interface é esperada.
- **Interface de tipo**: Em muitos casos, o compilador Java consegue inferir automaticamente o tipo dos parâmetros de uma expressão Lambda, reduzindo a necessidade de especificar tipos explicitamente.

## Consideração final

As Expressões Lambda são uma poderosa adição ao Java que permite escrever códigos mais breves e flexíveis, epecialmente quando se trata de passar comportamnetos como parâmetros para métodos.