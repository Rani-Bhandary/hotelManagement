package org.anudip.hotelManagement.dao;


import java.util.List;
import org.anudip.hotelManagement.bean.Hotel;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class HotelDaoImpl implements HotelDao {
	@Autowired
	private HotelRepository repository;

	@Override
	public void save(Hotel hotel) {
		repository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotelRecords() {
		return repository.findAll();
	}

	@Override
	public Hotel getHotelById(String id) {
		return repository.findById(id).get();
	}

	@Override
	public String generateId() {
		String  id = repository.getLastHotelId();
		if(id==null) {
			id="H1";
		}
		else {
			Integer newId=Integer.parseInt(id.substring(1));
			id="H"+(newId++);
		}
		return id;
	}

}

