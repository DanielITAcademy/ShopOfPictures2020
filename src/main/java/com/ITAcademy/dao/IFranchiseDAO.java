package com.ITAcademy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ITAcademy.dto.Franchise;

public interface IFranchiseDAO extends JpaRepository<Franchise,Long> {

}
