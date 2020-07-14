package com.ITAcademy.service;

import java.util.List;

import com.ITAcademy.dto.Picture;

public interface IPictureService {

	//M�todos del CRUD
	public Picture addPicture(Picture picture);//A�adir cuadro
	public List<Picture>listPicture();//Listar cuadro
	public void eliminatePicture(Long id);//Eliminar cuadro
}
