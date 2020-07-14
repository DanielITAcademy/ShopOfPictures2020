package com.ITAcademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ITAcademy.dao.IFranchiseDAO;
import com.ITAcademy.dto.Franchise;



@Service
public class FranchiseServiceImpl implements IFranchiseService {
	@Autowired
	IFranchiseDAO IFranchiseDAO;
	
	@Override
	public List<Franchise> listarFranchise(){
		return IFranchiseDAO.findAll();
	}
	
	
}
