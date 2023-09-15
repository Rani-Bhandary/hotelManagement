package org.anudip.hotelManagement.dao;

import java.util.List;
import org.anudip.hotelManagement.bean.Client;

public interface ClientDao {
	
	public void save(Client client);
	public List<Client> displayClientTable();
	public Client findSingleClient(Integer id);
	public Integer generateId();
}