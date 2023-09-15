package org.anudip.hotelManagement.controller;

import java.util.List;
import org.anudip.hotelManagement.bean.Hotel;
import org.anudip.hotelManagement.dao.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HotelController {
	@Autowired
	private HotelDao hotelDao;
	
	@GetMapping("index")
	public ModelAndView showIndexPage() {
		return new ModelAndView("index");
	}
	
	@GetMapping("/hotel-index")
	public ModelAndView showHotelIndexPage() {
		return new ModelAndView("HotelIndex");
	}
	
	@GetMapping("/hotel-add")
	public ModelAndView showHotelAddPage() {
		ModelAndView mv = new ModelAndView("HotelAddition");
		String id= hotelDao.generateId();
		Hotel hotel = new Hotel(id, id);
		mv.addObject("hotelrecords", hotel);
		return mv;
	}
	
	@PostMapping("/hotel-save")
	public ModelAndView saveHotelRecords(@ModelAttribute("hotelrecords") Hotel hotel) {
		hotelDao.save(hotel);
		return new ModelAndView("redirect:/");
	}
	@GetMapping("/hotel-view")
	public ModelAndView showDisplayAllHotelPage() {
		ModelAndView mv = new ModelAndView("DisplayAllHotels");
		List<Hotel> hotelList = hotelDao.getAllHotelRecords();
		mv.addObject("hotellist", hotelList);
		return mv;
	}
	
}
