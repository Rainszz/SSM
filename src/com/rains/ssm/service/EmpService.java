package com.rains.ssm.service;

import java.util.List;

import com.rains.ssm.bean.Emp;
import com.rains.ssm.bean.Result;


public interface EmpService {
	/*
	 * 查询所有
	 */
	public List<Emp> queryAll();
	/*
	 * 添加员工
	 */
	public void addEmp(Emp emp);
	/*
	 * 删除员工
	 */
	public void deleteEmp(int u_id);

	/*
	 * 修改信息
	 */
	public void updateEmp(int emp);


}
