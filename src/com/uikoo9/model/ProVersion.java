package com.uikoo9.model;

import com.jfinal.plugin.activerecord.Model;
import com.uikoo9.util.crud.QTable;

/**
 * 版本迭代
 * @author uikoo9
 */
@QTable("t_pro_version")
@SuppressWarnings("serial")
public class ProVersion extends Model<ProVersion>{
	
	public static final ProVersion dao = new ProVersion();
	
}
