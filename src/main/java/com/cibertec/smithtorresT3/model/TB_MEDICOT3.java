package com.cibertec.smithtorresT3.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="TB_MEDICOT3")
@Data
public class TB_MEDICOT3 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IDMEDICOT3 ;
	private String NOMBRET3 ;
	private String APELLIDOT3 ;
	private String EMAILT3 ;
	private String DNIT3 ;
	private String ESTADOCIVILT3 ;
	private Date FECHANACIMT3 ;
	

}
