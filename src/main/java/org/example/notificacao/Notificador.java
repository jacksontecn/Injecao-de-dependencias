package org.example.notificacao;

import org.example.modelo.Cliente;

public interface Notificador {

     void notificar(Cliente cliente, String mensagem);
}
