/**
 * 
 */
package com.cfc.dao;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cfc.model.Movimiento;
import com.cfc.model.Sucursal;

/**
 * @author JIO
 *
 */
@Repository("sucursalDao")
public class SucursalDaoImpl extends AbstractDao<Integer, Sucursal> implements ISucursalDao {

	/* (non-Javadoc)
	 * @see com.cfc.dao.ISucursalDao#findById(int)
	 */
	@Override
	public Sucursal findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cfc.dao.ISucursalDao#save(com.cfc.model.Sucursal)
	 */
	@Override
	public void save(Sucursal sucursal) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.cfc.dao.ISucursalDao#deleteById(int)
	 */
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.cfc.dao.ISucursalDao#findAllSucursales()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Sucursal> findAllSucursales() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		
		List<Sucursal> sucursales = (List<Sucursal>) criteria.list();
		
		return sucursales;
	}
	
	@Override
	public Sucursal findSucursalByName(String name) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("nomAgencia",name).ignoreCase());
		Sucursal sucursal = (Sucursal) criteria.uniqueResult();

		return sucursal;
	}

}
