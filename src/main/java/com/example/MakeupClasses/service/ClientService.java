package com.example.MakeupClasses.service;

import com.example.MakeupClasses.pojo.entity.Client;
import com.example.MakeupClasses.pojo.input.ClientInput;
import java.util.List;

public interface ClientService {
    List<Client> findAll();

    Client findClientByName(String name);

    Client save(ClientInput clientInput);

    Client update(String name, ClientInput clientInput);

    void delete(String name);

    List<Client> findClientWithBookings();
}
