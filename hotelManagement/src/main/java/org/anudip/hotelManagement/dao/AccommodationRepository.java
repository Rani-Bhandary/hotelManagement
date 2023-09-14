package org.anudip.hotelManagement.dao;

import org.anudip.hotelManagement.bean.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;


public interface AccommodationRepository extends JpaRepository<Accommodation, String> {

}