package com.ITAcademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/franchise")
	public Franchise saveFranchise(@RequestBody Franchise franchise) {
	
		return FranchiseServiceImpl.saveFranchise(franchise);

	}
	@GetMapping("/franchise/{id}")
	public Franchise franchiseXID(@PathVariable(name="id") Long id){
		Franchise franchise_xid= new Franchise();
		franchise_xid = FranchiseServiceImpl.franchiseXID(id);
		
		System.out.println("Franchise XID: "+ franchise_xid);
		return franchise_xid;
		
	}
	@PutMapping("/franchise/{id}")
	public Franchise updateFranchise(@PathVariable(name="id")Long id,@RequestBody Franchise franchise) {
		
		Franchise franchise_selected = new Franchise();
		Franchise franchise_updated = new Franchise();
		
		franchise_selected = FranchiseServiceImpl.franchiseXID(id);
		
		franchise_selected.setNamefranchise(franchise.getNamefranchise());
		
		franchise_updated = FranchiseServiceImpl.updateFranchise(franchise_updated);
		System.out.println("The franchise updated is "+ franchise_updated);
		return franchise_updated;
		
	}
	@DeleteMapping("/franchise/{id}")
	public void eliminateFranchise(@PathVariable(name="id")Long id) {
		FranchiseServiceImpl.eliminateFranchise(id);
	}
	
}
