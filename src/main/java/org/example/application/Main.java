package org.example.application;

import org.example.modelo.Cliente;
import org.example.notificacao.Notificador;
import org.example.notificacao.NotificadorSMS;
import org.example.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente jackson = new Cliente("Jackson", "jackson@email.com","8191234-4321");
        Cliente aline = new Cliente("Aline","aline@email.com","8195678-8765");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService ativaCliente = new AtivacaoClienteService(notificador);
        ativaCliente.ativar(jackson);
        ativaCliente.ativar(aline);

        }
}