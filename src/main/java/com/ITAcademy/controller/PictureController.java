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

import com.ITAcademy.dto.Picture;
import com.ITAcademy.service.PictureServiceImpl;

@RestController
@RequestMapping("/api")
public class PictureController {

	@Autowired
	PictureServiceImpl PictureServiceImpl;
	
	@GetMapping("/picture")
	public List<Picture>listPicture(){
		return PictureServiceImpl.listPicture();
	}
	
	@PostMapping("/picture")
	public Picture addPicture(@RequestBody Picture picture) {
		return PictureServiceImpl.savePicture(picture);
	}
	
	@GetMapping("/picture/{id}")
	public Picture pictureXID(@PathVariable(name="id")Long id) {
		Picture picture_xid= new Picture();
		picture_xid = PictureServiceImpl.pictureXID(id);
		System.out.println("Picture is: " +picture_xid);
		return picture_xid;
		
	}
	@PutMapping("/picture/{id}")
	public Picture updatePicture(@PathVariable(name="id")Long id,@RequestBody Picture picture) {
		Picture picture_selected = new Picture();
		Picture picture_updated = new Picture();
		
		picture_selected = PictureServiceImpl.pictureXID(id);
		
		picture_selected.setNameauthor(picture.getNameauthor());
		picture_selected.setNamepicture(picture.getNamepicture());
		picture_selected.setPrice(picture.getPrice());
		picture_selected.setDateofregister(picture.getDateofregister());
		
		picture_updated = PictureServiceImpl.updatePicture(picture_selected);
		System.out.println("The picture update is " + picture_updated);
		return picture_updated;
	}
	@DeleteMapping("/picture/{id}")
	public void eliminatePicture(@PathVariable(name="id")Long id) {
		PictureServiceImpl.eliminatePicture(id);
	}
}
