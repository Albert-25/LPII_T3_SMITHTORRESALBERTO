package com.cibertec.smithtorresT3.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.smithtorresT3.model.TB_MEDICOT3;
import com.cibertec.smithtorresT3.repository.TB_MEDICOT3Repository;
import com.cibertec.smithtorresT3.service.TB_MEDICOT3Service;

@Service
public class TB_MEDICOT3ServiceImpl implements TB_MEDICOT3Service{

	@Autowired
	private TB_MEDICOT3Repository medicot3Repository;
	
	@Override
	public TB_MEDICOT3 guardar(TB_MEDICOT3 model) {
		// TODO Auto-generated method stub
		return medicot3Repository.save(model);
	}

	@Override
	public TB_MEDICOT3 buscar(Integer id) {
		// TODO Auto-generated method stub
		return medicot3Repository.findById(id).get();
	}

	@Override
	public List<TB_MEDICOT3> listar() {
		// TODO Auto-generated method stub
		return medicot3Repository.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		medicot3Repository.deleteById(id);
	}

}
