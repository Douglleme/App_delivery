package br.com.dl.dl_delivery.service;

import java.util.List;

import br.com.dl.dl_delivery.dominio.dto.pedidodto.PedidoDTO;
import br.com.dl.dl_delivery.dominio.dto.restaurantedto.Carrinho;

public interface PedidoService {

    PedidoDTO buscarPedidoPeloId(Long id);

    List<PedidoDTO> buscarTodosOsPedidosPorRestauranteId(Long restauranteId);

    List<PedidoDTO> buscarTodosOsPedidosPorClienteId(Long clienteId);

    PedidoDTO deCarrinhoParaPedidoDTO(Carrinho carrinho);

    PedidoDTO deCarrinhoParaPedidoFecharDto(Carrinho carrinho);

    PedidoDTO fecharPedido(PedidoDTO pedido);

    PedidoDTO salvar(Carrinho carrinho);

}