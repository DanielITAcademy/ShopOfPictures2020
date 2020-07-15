package com.ITAcademy.service;

import java.util.List;

import com.ITAcademy.dto.Shop;

public interface IShopService {
	//Métodos del CRUD
	public List<Shop> listarShop();// listar tiendas ALL
	public Shop saveShop(Shop shop);//guarda una tienda CREATE
	public Shop shopXID(Long id);// leer datos de una tienda READ
	public Shop updateShop(Shop shop); // Actualizar datos del cliente UPDATE
	public void eliminateShop(Long id);//Elimina el cliente DELETE


}
