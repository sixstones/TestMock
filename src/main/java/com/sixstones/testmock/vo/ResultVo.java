package com.sixstones.testmock.vo;

public class ResultVo {

	private String code;
	private String message;
	private Object data;

	public ResultVo(String code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	};

	public static ResultVo success() {
		return new ResultVo("1000", "SUCCESS", null);
	}

	public static ResultVo fail(String code, String message) {
		return new ResultVo(code, message, null);
	}

}
