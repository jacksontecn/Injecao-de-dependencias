package org.example.notificacao;

import org.example.modelo.Cliente;

public class NotificadorEmail implements Notificador{
    @Override
    public void notificar (Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do e-mail <%s>: %s\n", cliente.getNome(),
                cliente.getEmail(), mensagem);
    }
}