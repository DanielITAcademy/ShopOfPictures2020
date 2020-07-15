package com.ITAcademy.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ITAcademy.dto.Picture;
import com.ITAcademy.dao.IPictureDAO;

@Service
public class PictureServiceImpl implements IPictureService {
	
//Metodos de la interfaz IPictureService
	@Autowired
	IPictureDAO IPictureDAO;
	
	@Override
	public List<Picture> listPicture() {
		return IPictureDAO.findAll();
	}
	@Override
	public Picture savePicture(Picture picture) {
		return IPictureDAO.save(picture);
	}
	
	@Override 
	public Picture pictureXID(Long id) {
		return IPictureDAO.findById(id).get();
	}
	@Override
	public Picture updatePicture(Picture picture) {
		return IPictureDAO.save(picture);
	}
	@Override
	public void eliminatePicture(Long id) {
		
		IPictureDAO.deleteAll();
	}
	
}
