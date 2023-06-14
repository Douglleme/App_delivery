package br.com.dl.dl_delivery.service;

import br.com.dl.dl_delivery.dominio.dto.clientedto.ClienteDTO;
import br.com.dl.dl_delivery.dominio.dto.clientedto.ClienteIdDTO;
import br.com.dl.dl_delivery.dominio.dto.clientedto.ClienteLoginDTO;
import br.com.dl.dl_delivery.dominio.dto.clientedto.ClienteSalvoDTO;

public interface ClienteService {
   ClienteSalvoDTO salvar(ClienteDTO dto);

   ClienteSalvoDTO procurarPeloId(Long id);

    boolean login(ClienteLoginDTO cliente);

    ClienteIdDTO procurarCliente(String email);

}