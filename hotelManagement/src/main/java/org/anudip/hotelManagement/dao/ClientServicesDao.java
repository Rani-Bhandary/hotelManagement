package org.anudip.hotelManagement.dao;

import java.util.List;

import org.anudip.hotelManagement.bean.ClientServices;

public interface ClientServicesDao {
 public void save(ClientServices clientService);
 public List<ClientServices> allClientServiceDeatils();
 public Integer generateSerialNumber();
List<ClientServices> allClientServiceRecords();
List<ClientServices> clientServicesByClientNumber(Integer clientNumber);
}
