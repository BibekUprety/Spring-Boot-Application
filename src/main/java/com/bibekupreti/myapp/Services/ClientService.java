package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.ClientDao;
import com.bibekupreti.myapp.Models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    private ClientDao clientDao;

    //Return list of clients
    public List<Client> getClients(){
        return clientDao.findAll();
    }

    //SAve new client
    public void save(Client client) {
        clientDao.save(client);
    }

    //get by id
    public Optional<Client> findById(int id) {
        return clientDao.findById(id);
    }

    public void delete(Integer id) {
        clientDao.deleteById(id);
    }

}
