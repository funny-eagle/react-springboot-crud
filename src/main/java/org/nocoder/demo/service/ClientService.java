package org.nocoder.demo.service;

import org.nocoder.demo.modal.Client;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author yangjl
 * @description client service
 * @date 2023-02-15 14:47
 **/
@Service
public class ClientService {

    @Cacheable( value = "clientCache")
    public Client getClient(){
        Client client = new Client();
        client.setId(1L);
        client.setName("Jason Yang");
        client.setEmail("yangjinlong86@gmail.com");

        System.out.println(client.toString());
        return client;
    }
}
