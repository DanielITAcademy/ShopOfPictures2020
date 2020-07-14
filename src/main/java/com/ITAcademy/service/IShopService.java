package com.ITAcademy.service;

import java.util.List;

import com.ITAcademy.dto.Shop;

public interface IShopService {
	//Métodos del CRUD
	public Shop createShop(Shop shop);//crear tienda
	public List<Shop> listarShop();// listar tiendas
		


}
