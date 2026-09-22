# Uso de Inteligência Artificial na Atividade

Nesta atividade, a Inteligência Artificial foi utilizada como suporte para ajudar a interpretar o problema proposto e estruturar a aplicação correta do padrão de projeto **Decorator**. 

A interação com a IA consistiu principalmente em fornecer o enunciado e o código fonte original, solicitando explicações e um guia passo a passo do que deveria ser feito para atender às restrições do professor.

## O Plano de Implementação Sugerido

# Implementar o Padrão Decorator na Padaria

O objetivo destas mudanças é aplicar o padrão Decorator (Decorador) ao sistema de padaria, permitindo criar bolos complexos (como bolos de várias camadas, com granulado e mensagens personalizadas) sem a necessidade de modificar as classes de bolo existentes. Também será adicionado um novo tipo de bolo base (Bolo de Morango).

## Proposed Changes

---

### Bakery Components

#### [NEW] [CakeDecorator.java]
Criação da classe abstrata base para todos os decoradores de bolo.
- Estenderá a classe abstrata `Cake`.
- Conterá uma referência protegida a um objeto `Cake`.
- Delegará as chamadas de `getCost()` e `getDescription()` para o objeto `Cake` encapsulado por padrão.

#### [NEW] [MultiLayered.java]
Criação do decorador para adicionar camadas ao bolo.
- Estenderá `CakeDecorator`.
- Sobrescreverá `getCost()` para adicionar $5 ao custo do bolo base.
- Sobrescreverá `getDescription()` para adicionar o prefixo "Multi-layered " à descrição original do bolo.

#### [NEW] [Sprinkles.java]
Criação do decorador para adicionar granulado.
- Estenderá `CakeDecorator`.
- Sobrescreverá `getCost()` para adicionar $2 ao custo.
- Sobrescreverá `getDescription()` para adicionar o sufixo " with sprinkles" à descrição.

#### [NEW] [Saying.java]
Criação do decorador para adicionar uma mensagem ao bolo.
- Estenderá `CakeDecorator`.
- Terá um atributo extra do tipo `String` para armazenar a mensagem passada no construtor.
- Não alterará o custo (o custo permanece o mesmo do bolo decorado).
- Sobrescreverá `getDescription()` para adicionar o sufixo ` with saying "X"` (onde X é a mensagem).

#### [NEW] [StrawberryCake.java]
Criação do novo tipo de bolo base.
- Estenderá a classe `Cake`.
- Sobrescreverá `getDescription()` para retornar "Strawberry cake".
- Sobrescreverá `getCost()` para retornar o dobro do custo base (`super.getCost() * 2`).

#### [MODIFY] [Main.java]
Atualização da classe `Main` para montar os pedidos exatamente conforme o exemplo fornecido:
- Remover os bolos antigos que estavam sendo adicionados para teste.
- Adicionar um `ChocolateCake`.
- Adicionar um `VanillaCake` decorado com `Saying("PLAIN!")`.
- Adicionar um `VanillaCake` decorado com `Sprinkles` e em seguida `Saying("FANCY!")`.
- Adicionar um `StrawberryCake` decorado na seguinte ordem: `MultiLayered`, `Sprinkles`, `Sprinkles`, `Saying("One of")` e `Saying("EVERYTHING")`.
```
