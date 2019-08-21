package com.example.stockspring.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id; 
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="stock_price_details")
public class StockPrice {
	
	
	
	@Id
	@Column(name="stock_code")
	private int stockCode;
	
	public int getStockCode() {
		return stockCode;
	}

	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}

	@Column(name="company_code")
	private int companyCode;
	
	
	@Column(name="stock_exchange_id")
	private int stockExchanges;
	
	@Column(name="current_price")
	private BigDecimal currentPrice;
	
	@Column(name="date")
	private String date;
	
	@NotEmpty(message="please enter stockExchange")
	@Column(name="time")
	private String time;

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public int getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(int stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
}
