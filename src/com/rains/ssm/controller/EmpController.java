package com.rains.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rains.ssm.bean.Emp;
import com.rains.ssm.bean.Result;
import com.rains.ssm.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;
	@RequestMapping("/queryAll.do")
	public @ResponseBody Result<List<Emp>> queryAll(){
		List<Emp> list = empService.queryAll();
		Result<List<Emp>> result = new Result<>();
		result.setCode(200);
		result.setMsg("请求成功~");
		result.setResult(list);
		return result;
	}
	@RequestMapping("/addEmp.do")
	public @ResponseBody Result<String> addEmp(Emp emp){
		Result<String> result = new Result<>();
		result.setCode(200);
		result.setMsg("请求成功~");
		result.setResult("添加成功~");
		return result;
	}
	@RequestMapping("/deleteEmp.do")
	public @ResponseBody Result<String> deleteEmp(Emp u_id){
		Result<String> result = new Result<>();
		empService.deleteEmp(9);
		result.setCode(200);
		result.setMsg("请求成功~");
		result.setResult("删除成功~");
		return result;
	}
	@RequestMapping("/updateEmp.do")
	public @ResponseBody Result<String> updateEmp(Emp emp){
		Result<String> result = new Result<>();
		empService.updateEmp(9);
		result.setCode(200);
		result.setMsg("请求成功~");
		result.setResult("更新成功~");
		return result;
	}


}
