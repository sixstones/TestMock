package com.sixstones.testmock.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sixstones.testmock.service.ApiService;
import com.sixstones.testmock.vo.ApiQueryVo;
import com.sixstones.testmock.vo.ApiVo;
import com.sixstones.testmock.vo.ResultVo;


/**
 * 接口管理接口
 * 1、接口增删改查
 * 2、接口参数管理
 * @author 11073512
 *
 */

@Controller
@RequestMapping(value = "/api")
public class ApiManagerController extends BaseController {

//	@Autowired
//	private ApiService apiService;
	//
	// @RequestMapping(value="/saveRequestByJson")
	// @ResponseBody
	// public ResultVo doSaveApiInField(@RequestBody String mockJson) {
	// try {
	// Object obj = JsonUtil.toObject(mockJson, Object.class);
	// }catch (Exception e) {
	// return ResultVo.fail("9999", e.getMessage());
	// }
	// return ResultVo.success();
	// }

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public ResultVo saveApi(ApiVo api) {
		//TODO to add api
		return ResultVo.success();
	}
	
	@RequestMapping(value = "/update",method= RequestMethod.POST)
	@ResponseBody
	public ResultVo updateApi(ApiVo api) {
		//TODO update api
		return ResultVo.success();
	}
	
	@RequestMapping(value = "/delete",method= RequestMethod.POST)
	@ResponseBody
	public ResultVo deleteApi(Integer apiId) {
		//TODO delete api
		return ResultVo.success();
	}
	
	@RequestMapping(value="/query")
	@ResponseBody
	public ResultVo query(ApiQueryVo query) {
		//TODO query api
		return ResultVo.success();
	}
}
