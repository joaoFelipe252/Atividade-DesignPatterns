package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    private final EmailService emailService;
    private final SmsService smsService;
    private final PushService pushService;

    public NotificacaoService(SmsService smsService, PushService pushService) {
        this.emailService = EmailService.getInstance(); 
        
        this.smsService = smsService;
        this.pushService = pushService;
    }

    public void enviarNotificacoes(Pedido pedido) {
        emailService.enviar(pedido);
        smsService.enviar(pedido);
        pushService.enviar(pedido);
    }
}