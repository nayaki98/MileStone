package com.example.stockspring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.stockspring.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice, Integer>{
	public List<StockPrice> findBycompanyCode(int companyCode);

}
