# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - 2025-10-06

### Adicionado
Padrão de Projeto Singleton: Implementado na classe EmailService para garantir que apenas uma instância deste serviço seja criada e utilizada em toda a aplicação.

Padrão de Projeto Factory Method: Introduzido para a criação de objetos Pedido. Foram criadas a interface PedidoFactory e a implementação PedidoSimplesFactory para desacoplar a lógica de criação de pedidos do código cliente.

### Corrigido
Acoplamento na criação de objetos: A criação direta de instâncias de Pedido na classe principal foi refatorada para usar o Factory Method, centralizando a lógica de criação e tornando o sistema mais flexível a futuros tipos de pedido.

### Modificado
NotificacaoService: Alterado para obter a dependência de EmailService através do método estático getInstance() do Singleton, em vez de recebê-la por injeção de dependência no construtor.

EmailService: Deixou de ser um @Service gerenciado pelo Spring para se tornar uma classe que implementa o padrão Singleton.

NotificacaoApplication: A lógica de instanciação dos pedidos de teste foi atualizada para utilizar a PedidoSimplesFactory.
