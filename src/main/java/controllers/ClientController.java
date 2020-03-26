package controllers;



import javax.ws.rs.Path;

import models.Client;
import repositories.ClientRepository;
import services.ClientService;




@Path("clients")
public class ClientController extends EntityController <ClientService, ClientRepository, Client>

{

}
