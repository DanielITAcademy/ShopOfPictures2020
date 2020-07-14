package com.ITAcademy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ITAcademy.dto.Shop;

public interface IShopDAO extends JpaRepository<Shop,Long> {

}
