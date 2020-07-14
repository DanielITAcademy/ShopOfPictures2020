package com.ITAcademy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ITAcademy.dto.Picture;

public interface IPictureDAO extends JpaRepository<Picture,Long>{

}
