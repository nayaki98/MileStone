package com.example.stockspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;

public class RestControllerSector {
	@Autowired
	SectorDao sectordao;
	@Autowired
	CompanyDao companydao;
	
	@GetMapping("/sectorlist")
	public List<Company> getSectorList()
	{
		Sector sector= sectordao.findBysectorName("IT");
		return companydao.findBySectorId(sector.getSectorId());
	}

}
