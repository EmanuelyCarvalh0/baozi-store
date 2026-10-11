package com.baozistore.dto;

/**
 * Formato do JSON recebido ao criar/atualizar um pedido:
 * { "clienteId": 1, "produtoId": 1, "quantidade": 6 }
 */
public record PedidoRequest(Long clienteId, Long produtoId, Integer quantidade) {
}
