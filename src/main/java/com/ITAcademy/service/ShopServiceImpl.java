package com.ITAcademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ITAcademy.dao.IShopDAO;
import com.ITAcademy.dto.Shop;

@Service
public class ShopServiceImpl implements IShopService {
	//utilizo métodos de la interface IshopDAO(como si instanciaramos)
		@Autowired
		IShopDAO IShopDAO;
		
		@Override
		public Shop createShop(Shop shop) {
			return IShopDAO.save(shop);
		}
		@Override 
		public List<Shop> listarShop(){
			return IShopDAO.findAll();
		}

}
