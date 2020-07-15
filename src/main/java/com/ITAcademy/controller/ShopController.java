package com.ITAcademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/shop")
	public List<Shop> listShops(){
		return ShopServiceImpl.listarShop();
	}

	@PostMapping("/shop")
	public Shop createShop(@RequestBody Shop shop) {
		return ShopServiceImpl.saveShop(shop);
	}
	
	@GetMapping("/shop/{id}")
	public Shop shopXID(@PathVariable(name="id")Long id) {
		
		Shop shop_xid = new Shop();
		shop_xid = ShopServiceImpl.shopXID(id);
		
		System.out.println("Shop XID: " +shop_xid);
		
		return shop_xid;
	}
	@PutMapping("/shop/{id}")
	public Shop updateShop(@PathVariable(name="id")Long id,@RequestBody Shop shop) {
		Shop shop_selected = new Shop();
		Shop shop_updated = new Shop();
		
		shop_selected = ShopServiceImpl.shopXID(id);
		
		shop_selected.setNameshop(shop.getNameshop());
		shop_selected.setCapacity(shop.getCapacity());
		
		shop_updated = ShopServiceImpl.updateShop(shop_selected);
		
		System.out.println("The shop updated is " + shop_updated);
		return shop_updated;
		
	}
	@DeleteMapping("/shop/{id}")
	public void eliminateShop(@PathVariable(name="id")Long id) {
		ShopServiceImpl.eliminateShop(id);
	}

}
