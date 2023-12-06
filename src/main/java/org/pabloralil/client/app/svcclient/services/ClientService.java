package org.pabloralil.client.app.svcclient.services;

import java.util.List;
import java.util.Optional;

import org.pabloralil.client.app.svcclient.models.entity.Client;

public interface ClientService {

    List<Client> findAll();
    Optional<Client> findById(Long id);
    Client save(Client client);

}
