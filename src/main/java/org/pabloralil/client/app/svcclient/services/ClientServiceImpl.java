package org.pabloralil.client.app.svcclient.services;

import java.util.List;
import java.util.Optional;

import org.pabloralil.client.app.svcclient.models.entity.Client;
import org.pabloralil.client.app.svcclient.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return (List<Client>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Client> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Client save(Client client) {
        return repository.save(client);
    }

}
