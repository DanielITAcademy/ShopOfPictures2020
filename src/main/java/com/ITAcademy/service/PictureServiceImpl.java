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
	public Picture addPicture(Picture picture) {
		return IPictureDAO.save(addPicture(picture));
	}
	@Override
	public List<Picture> listPicture() {
		return IPictureDAO.findAll();
	}
	@Override
	public void eliminatePicture(Long id) {
		
		IPictureDAO.deleteAll();
	}
	
}
