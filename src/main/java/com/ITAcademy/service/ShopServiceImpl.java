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
		public List<Shop> listarShop(){
			return IShopDAO.findAll();
		}
		
		@Override
		public Shop saveShop(Shop shop) {
			return IShopDAO.save(shop);
		}
		
		@Override
		public Shop shopXID(Long id) {
			return IShopDAO.findById(id).get();
		}

		@Override
		public Shop updateShop(Shop shop) {
			return IShopDAO.save(shop);
		}
		
		@Override
		public void eliminateShop(Long id) {
			IShopDAO.deleteById(id);
		}
}
