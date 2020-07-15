package com.ITAcademy.service;

import java.util.List;

import com.ITAcademy.dto.Franchise;



public interface IFranchiseService {
	//Métodos del CRUD
	public List<Franchise> listarFranchise();//Listar ALL
	public Franchise saveFranchise(Franchise franchise); //Guarda una franquicia CREATE
	public Franchise franchiseXID(Long id);// Leer datos de una franquicia READ
	public Franchise updateFranchise(Franchise franchise);//Actualiza datos de franquicia UPDATE
	public void eliminateFranchise(Long id);//Elimina el cliente DELETE
	


}
