package com.example.stockspring.dao;

import com.example.stockspring.model.Sector;

public interface SectorDao {

	

	Sector findBysectorName(String sectorname);

}
