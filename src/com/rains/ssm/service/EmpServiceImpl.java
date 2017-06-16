package com.rains.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rains.ssm.bean.Emp;
import com.rains.ssm.bean.Result;
import com.rains.ssm.dao.EmpMapper;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper;
	@Override
	public List<Emp> queryAll() {
		// TODO Auto-generated method stub
		return empMapper.queryAll();
	}

	@Override
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.addEmp(emp);
	}

	@Override
	public void deleteEmp(int u_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmp(int emp) {
		// TODO Auto-generated method stub

	}

}
