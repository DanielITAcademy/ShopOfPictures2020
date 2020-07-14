package com.ITAcademy.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="picture")
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
		
		@ManyToOne(fetch = FetchType.LAZY)
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

		@Override
		public String toString() {
			return "Picture [id=" + id + ", nameauthor=" + nameauthor + ", namepicture=" + namepicture + ", price=" + price
					+ ", shop=" + shop + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		

		

}
