package com.ITAcademy.service;

import java.util.List;

import com.ITAcademy.dto.Picture;

public interface IPictureService {

	//Métodos del CRUD
	public List<Picture>listPicture();//Listar cuadro
	public Picture savePicture(Picture picture);//Añadir cuadro CREATE
	public Picture pictureXID(Long id);//Leer datos de un cliente READ
	public Picture updatePicture(Picture picture);//Actualiza datos del cuadro UPDATE
	public void eliminatePicture(Long id);//Eliminar TODOS LOS CUADROS DELETE
}
