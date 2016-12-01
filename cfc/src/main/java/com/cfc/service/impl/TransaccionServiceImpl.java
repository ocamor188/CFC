/**
 * 
 */
package com.cfc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cfc.dao.ITransaccionDao;
import com.cfc.model.Transaccion;
import com.cfc.service.ITransaccionService;

/**
 * @author JIO
 *
 */
@Service("iTransaccionService")
@Transactional
public class TransaccionServiceImpl implements ITransaccionService {

	@Autowired
	ITransaccionDao transaccionDAO;
	
	@Override
	public Transaccion findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveTransaccion(Transaccion transaccion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTransaccion(Transaccion transaccion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Transaccion> findAllTransacciones() {
		return transaccionDAO.findAllTransacciones();
	}
	
	public List<Transaccion> findByCurrencyAndBranch(int currencyId, int branchId){
		return transaccionDAO.findByCurrencyAndBranch(currencyId, branchId);
	}

}