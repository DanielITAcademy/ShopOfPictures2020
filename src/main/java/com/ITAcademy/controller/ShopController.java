package com.ITAcademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ITAcademy.dto.Shop;
import com.ITAcademy.service.ShopServiceImpl;

@RestController
@RequestMapping("/api")
public class ShopController {
	@Autowired
	ShopServiceImpl ShopServiceImpl;
	
	@PostMapping("/shop")
	public Shop createShop(@RequestBody Shop shop) {
		return ShopServiceImpl.createShop(shop);
	}
	@GetMapping("/shop")
	public List<Shop> listShops(){
		return ShopServiceImpl.listarShop();
	}


}
