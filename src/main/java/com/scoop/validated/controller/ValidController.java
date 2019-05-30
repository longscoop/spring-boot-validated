package com.scoop.validated.controller;

import com.scoop.validated.api.ValidClient;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author qilong on 2019/5/29.
 */
@RestController
public class ValidController implements ValidClient {

	@Override
	public String queryById(@Min(1) @Max(400) Integer id) {
		return "id:" + id;
	}
}
