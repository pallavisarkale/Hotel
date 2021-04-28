package com.domain.services;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.entity.Hotel;
import com.domain.repository.HotelRepository;


@Service
public class HotelService 
{		
		@Autowired
	    private HotelRepository repo;
		
		public List<Hotel> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Hotel std) {
	        repo.save(std);
	    }
	     
	    public Hotel get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
	 
	}