package com.vyku.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("prices")
@Data
public class Prices
{
	@Value("${menu.idlyPrice}")
	private Double idlyPrice;
	@Value("${menu.dosaPrice}")
	private Double dosaPrice;
	@Value("${menu.puriPrice}")
	private Double puriPrice;
	@Value("${menu.pohaPrice}")
	private Double pohaPrice;

	

}
