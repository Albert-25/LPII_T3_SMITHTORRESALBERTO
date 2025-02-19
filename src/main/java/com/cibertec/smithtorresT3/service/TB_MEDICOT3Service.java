package com.cibertec.smithtorresT3.service;

import java.util.List;

import com.cibertec.smithtorresT3.model.TB_MEDICOT3;

public interface TB_MEDICOT3Service {
	
	public TB_MEDICOT3 guardar(TB_MEDICOT3 model);
	public TB_MEDICOT3 buscar(Integer id);
	public List<TB_MEDICOT3> listar();
	public void eliminar(Integer id);

}
