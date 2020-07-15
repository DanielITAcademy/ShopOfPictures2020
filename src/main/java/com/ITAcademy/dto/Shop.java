package com.ITAcademy.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="shop")
public class Shop {
	//Atributos de la tienda
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//Busca ultimo valor e incremente desde id final
		private Long id;
		@Column(name = "nameshop")
		private String nameshop;
		@Column(name = "capacity")
		private int capacity;
		
		@ManyToOne
		@JoinColumn(name = "id_franchise")
		private Franchise franchise;
		
		@OneToMany
		@JoinColumn(name = "id")
		private List<Picture> picture;
		
		//Constructores
		public Shop() {
			
		}

		
		public Shop(Long id, String nameshop, int capacity, Franchise franchise) {
			//super();
			this.id = id;
			this.nameshop = nameshop;
			this.capacity = capacity;
			this.franchise = franchise;
		}


		
		//Getters y setters

		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNameshop() {
			return nameshop;
		}


		public void setNameshop(String nameshop) {
			this.nameshop = nameshop;
		}


		public int getCapacity() {
			return capacity;
		}


		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}


		public Franchise getFranchise() {
			return franchise;
		}


		public void setFranchise(Franchise franchise) {
			this.franchise = franchise;
		}
		
		
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Video")
		public List<Picture> getPicture() {
			return picture;
		}


		public void setPicture(List<Picture> picture) {
			this.picture = picture;
		}


		@Override
		public String toString() {
			return "Shop [id=" + id + ", nameshop=" + nameshop + ", capacity=" + capacity + ", franchise=" + franchise
					+ ", picture=" + picture + "]";
		}

		//impresión datos por consola
		

}
