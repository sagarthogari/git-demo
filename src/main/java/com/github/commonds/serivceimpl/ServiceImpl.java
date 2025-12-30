package com.github.commonds.serivceimpl;

import org.springframework.stereotype.Service;

import com.github.commonds.serivce.GitCommondService;

@Service
public class ServiceImpl implements GitCommondService{

	@Override
	public String getMessage() {
		
		return "sagar";
	}

}
