package org.anudip.hotelManagement.dao;

import org.anudip.hotelManagement.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client, Integer> {
	@Query("select max(clientNumber) from Client")
	public Integer getLastClientNumber();

}
