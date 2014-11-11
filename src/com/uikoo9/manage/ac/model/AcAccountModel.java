package com.uikoo9.manage.ac.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;
import com.uikoo9.util.QStringUtil;
import com.uikoo9.util.crud.QTable;

/**
 * AcAccountModel
 * @author qiaowenbin
 */
@QTable("t_ac_account")
@SuppressWarnings("serial")
public class AcAccountModel extends Model<AcAccountModel>{
	
	public static final AcAccountModel dao = new AcAccountModel();
	
	/**
	 * find all default
	 * @return
	 */
	public List<AcAccountModel> findAll(){
		return findAll(null);
	}
	
	/**
	 * find all with order
	 * @param order
	 * @return
	 */
	public List<AcAccountModel> findAll(String order){
		StringBuilder sb = new StringBuilder("select * from t_ac_account ");
		if(QStringUtil.isEmpty(order)){
			return dao.find(sb.append("order by id desc").toString());
		}else{
			return dao.find(sb.append(order).toString());
		}
	}
	
}