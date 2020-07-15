package com.ITAcademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ITAcademy.dao.IFranchiseDAO;
import com.ITAcademy.dto.Franchise;




@Service
public class FranchiseServiceImpl implements IFranchiseService {
	
	//utilización de métodos de la interface IFranchiseDAO, como si se instanciase
	@Autowired
	IFranchiseDAO IFranchiseDAO;
	
	@Override
	public List<Franchise> listarFranchise(){
		return IFranchiseDAO.findAll();
	}
	@Override 
	public Franchise updateFranchise(Franchise franchise) {
		return IFranchiseDAO.save(franchise);
	}
	
	@Override
	public Franchise saveFranchise(Franchise franchise) {
		return IFranchiseDAO.save(franchise);
	}
	
	@Override
	public Franchise franchiseXID(Long id) {
		return IFranchiseDAO.findById(id).get();
	}
	
	@Override
	public void eliminateFranchise(Long id) {
		IFranchiseDAO.deleteById(id);
	}
}
