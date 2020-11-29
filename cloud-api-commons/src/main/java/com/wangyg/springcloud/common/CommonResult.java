package com.wangyg.springcloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回值包装类
 *
 * @author wangyg
 * @version 1.0.0
 * @description 返回值包装类
 * @copyright Copyright © 2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

	private Integer code;
	private String message;
	private T data;

	public CommonResult(Integer code, String message){
		this(code,message,null);
	}
}
