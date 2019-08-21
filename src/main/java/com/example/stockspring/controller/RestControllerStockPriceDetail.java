package com.example.stockspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.StockPrice;



@RestController
public class RestControllerStockPriceDetail {
	
	@Autowired
	StockPriceDao stockpricedao;
	
	@GetMapping("/stockpricedetail")
	public List<StockPrice> getStockPriceDetail()
	{
		return stockpricedao.findBycompanyCode(1);
	}

}
