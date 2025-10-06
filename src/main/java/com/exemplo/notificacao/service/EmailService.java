package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

public class EmailService {
    
    private static EmailService instance;

    private EmailService() {
        System.out.println("[SINGLETON] EmailService inicializado.");
    }

    public static EmailService getInstance() {
        if (instance == null) {
            instance = new EmailService();
        }
        return instance;
    }

    public void enviar(Pedido pedido) {
        System.out.println("Enviando e-mail para " + pedido.getCliente());
    }
}