package com.ITAcademy.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="franchise")
public class Franchise {
	//Atributos de entidad franquicia
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca el último valor e incrementa
		private Long id;
		@Column(name="namefranchise")
		private String namefranchise;
		
		@OneToMany
		@JoinColumn(name="id")
		private List<Shop> shop;
		
		//Constructores
		public Franchise() {
			
		}
		/**
		 * @param id
		 * @param namefranchise
		 */

		public Franchise(Long id, String namefranchise) {
			//super();
			this.id = id;
			this.namefranchise = namefranchise;
		}
		//Getters y setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNamefranchise() {
			return namefranchise;
		}
		public void setNamefranchise(String namefranchise) {
			this.namefranchise = namefranchise;
		}
		
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Video")
		public List<Shop> getShop() {
			return shop;
		}
		public void setShop(List<Shop> shop) {
			this.shop = shop;
		}
		//impresión de datos por consola
		@Override
		public String toString() {
			return "Franchise [id=" + id + ", namefranchise=" + namefranchise + ", shop=" + shop + "]";
		}
		
		

}
