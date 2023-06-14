package br.com.dl.dl_delivery.service;

import java.util.List;

import br.com.dl.dl_delivery.dominio.dto.restaurantedto.ItemCardapioDTO;
import br.com.dl.dl_delivery.dominio.dto.restaurantedto.ItemCardapioTabelaDTO;
import br.com.dl.dl_delivery.dominio.entidades.restaurante.CategoriaItem;

public interface ItemCardapioService {

    ItemCardapioDTO salvar(ItemCardapioDTO dto);

    ItemCardapioDTO procurarPeloId(Long id);

    List<ItemCardapioDTO> procurarTodos();

    void deletar(Long id);

    List<CategoriaItem> pegarTodasAsCategorias();

    List<ItemCardapioTabelaDTO> procurarTodosOsItensPeloIdDoRestaurante(Long id);

    List<ItemCardapioTabelaDTO> procurarTodosOsItensPeloIdDoRestauranteEQueEstejamEmDestaque(Long restauranteId);

}