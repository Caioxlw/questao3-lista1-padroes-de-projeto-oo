# Questão 3 - Lista 1 Padrões de Projeto OO
**Alunos:** Maria Letícia de Sousa Barboza e Caio Vinícius de Santana Gomes

Este repositório contém a solução para a lista de exercícios de Padrões de Projeto Orientados a Objetos, demonstrando a aplicação do padrão **Decorator** no contexto de um sistema de pedidos de uma padaria.

## 📖 O Problema
O pacote `bakery` (padaria) continha um código inicial para uma padaria que produzia apenas bolos simples de baunilha e chocolate. O desafio consistia em expandir o sistema para aceitar bolos mais complexos — como bolos de várias camadas, com granulado e com mensagens em texto personalizadas — sem a necessidade de modificar as classes dos bolos que já existiam, além da inclusão de um novo sabor: bolo de morango.

## 🏗️ Modelagem da Solução

O projeto implementa o padrão estrutural **Decorator** para permitir que novos comportamentos e preços sejam adicionados aos objetos (bolos) dinamicamente e de forma empilhável (um sobre o outro), mantendo o respeito ao Princípio do Aberto/Fechado (Open/Closed Principle).

### Mapeamento do Padrão:
- **Component (`Cake`):** A classe abstrata base que define os métodos fundamentais `getCost()` e `getDescription()`.
- **Concrete Components (`VanillaCake`, `ChocolateCake`, `StrawberryCake`):** As bases de bolos concretas da padaria. O novo bolo de morango foi inserido aqui contendo a regra de custar o dobro do valor base.
- **Decorator (`CakeDecorator`):** A classe abstrata que atua como invólucro (wrapper). Ela herda de `Cake` e também compõe um objeto `Cake`, repassando as chamadas de métodos para o bolo envolvido por padrão.
- **Concrete Decorators (`MultiLayered`, `Sprinkles`, `Saying`):** Classes concretas que estendem `CakeDecorator`. Elas interceptam a execução antes ou depois do objeto embrulhado, alterando a string da descrição e incrementando valores ao preço final (com exceção do `Saying`, que apenas adiciona texto mantendo o custo).

## 🚀 Como Executar

O projeto não requer gerenciadores de dependência externos e pode ser executado diretamente no terminal local.

1. Navegue até o diretório que contém o código (`bakery`):
   ```bash
   cd bakery
   ```
2. Compile os arquivos Java:
   ```bash
   javac *.java
   ```
3. Execute o programa principal:
   ```bash
   java Main
   ```