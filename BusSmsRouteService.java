package com.vip.vipxgroute.account.service;

import com.vip.vipxgroute.account.model.BusSmsRouteModel;

public interface BusSmsRouteService{
	
	public int create(BusSmsRouteModel busSmsRouteModel);//创建数据
	
	public int update(BusSmsRouteModel busSmsRouteModel);//更新数据
	
	public BusSmsRouteModel selectBySmsCode(String smsCode); 
	
}