package com.vip.vipxgroute.account.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.vip.vipxgroute.account.entity.BusSmsRoute;

@Repository
public interface BusSmsRouteRepository{
  	int insert(BusSmsRoute busSmsRoute);
  	
	int update(BusSmsRoute busSmsRoute);
	
    BusSmsRoute selectBySmsCode(@Param("smsCode") String smsCode);

}