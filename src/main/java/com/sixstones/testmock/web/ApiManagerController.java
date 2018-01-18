package com.sixstones.testmock.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixstones.testmock.service.ApiService;
import com.sixstones.testmock.utils.JsonUtil;
import com.sixstones.testmock.vo.ResultVo;

@Controller
@RequestMapping(value="/api")
public class ApiManagerController extends BaseController{

	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping(value="/saveRequestByJson")
	@ResponseBody
	public ResultVo doSaveApiInField(@RequestBody String mockJson) {
		try {
			Object obj = JsonUtil.toObject(mockJson, Object.class);
		}catch (Exception e) {
			return ResultVo.fail("9999", e.getMessage());
		}
		return ResultVo.success();
	}
}
