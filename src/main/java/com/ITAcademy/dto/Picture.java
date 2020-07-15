package com.ITAcademy.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="pictures")
public class Picture {
	//Atributos de los cuadros
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "nameauthor")
		private String nameauthor;
		@Column(name = "namepicture")
		private String namepicture;
		@Column(name = "price")
		private Double price;
		@Column(name = "dateofregister")
		private Date dateofregister;
		
		@ManyToOne
		@JoinColumn(name="id_shop")
		private Shop shop;
		
		//Constructores
		public Picture() {
			
		}

		public Picture(Long id, String nameauthor, String namepicture, Double price, Shop shop) {
			//super();
			this.id = id;
			this.nameauthor = nameauthor;
			this.namepicture = namepicture;
			this.price = price;
			this.shop = shop;
		}
		
		
		//impresión datos por consola

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNameauthor() {
			return nameauthor;
		}

		public void setNameauthor(String nameauthor) {
			this.nameauthor = nameauthor;
		}

		public String getNamepicture() {
			return namepicture;
		}

		public void setNamepicture(String namepicture) {
			this.namepicture = namepicture;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Date getDateofregister() {
			return dateofregister;
		}

		public void setDateofregister(Date dateofregister) {
			this.dateofregister = dateofregister;
		}

		public Shop getShop() {
			return shop;
		}

		public void setShop(Shop shop) {
			this.shop = shop;
		}

		@Override
		public String toString() {
			return "Picture [id=" + id + ", nameauthor=" + nameauthor + ", namepicture=" + namepicture + ", price="
					+ price + ", dateofregister=" + dateofregister + ", shop=" + shop + "]";
		}

		
	}
		

		


