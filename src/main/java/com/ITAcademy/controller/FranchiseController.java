package com.ITAcademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ITAcademy.dto.Franchise;
import com.ITAcademy.service.FranchiseServiceImpl;


@RestController
@RequestMapping("/api")
public class FranchiseController {
	
	@Autowired
	FranchiseServiceImpl FranchiseServiceImpl;
	
	@GetMapping("/franchise")
	public List<Franchise> listarFranchise(){
		return FranchiseServiceImpl.listarFranchise();
		
	}

}
