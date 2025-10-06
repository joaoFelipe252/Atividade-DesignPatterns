package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import com.exemplo.notificacao.service.NotificacaoService;
import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.factory.PedidoFactory; // Importa a Factory
import com.exemplo.notificacao.factory.PedidoSimplesFactory; // Importa a implementação

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    @Autowired
    private NotificacaoService notificacaoService;
    
    private PedidoFactory pedidoFactory = new PedidoSimplesFactory(); // Instancia o Criador concreto

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Sistema de Notificação de Pedidos (usando Factory) ===");
        
        Pedido pedido1 = pedidoFactory.criarPedido("João", 150.0);
        Pedido pedido2 = pedidoFactory.criarPedido("Maria", 320.0);
        Pedido pedido3 = pedidoFactory.criarPedido("Carlos", 80.0);

        notificacaoService.enviarNotificacoes(pedido1);
        notificacaoService.enviarNotificacoes(pedido2);
        notificacaoService.enviarNotificacoes(pedido3);

        System.out.println("=== Fim da execução ===");
    }
}