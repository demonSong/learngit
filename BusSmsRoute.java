package com.vip.vipxgroute.account.entity;

import java.sql.Timestamp;

import lombok.Data;

import com.vip.venus.core.beans.mapping.annotation.MapClass;

@Data
@MapClass(value="com.vip.vipxgroute.account.model.BusSmsRouteModel")
public class BusSmsRoute{
	private Long routeId;
	
	private String smsCode;
	
	private String bizScenario;
	
	private String typeCode;
	
	private String templateCode;
	
	private Integer routeChannel;
	
	private Integer belongPrd;
	
	private Timestamp createTime;
	
	private Timestamp updateTime;
	
	private Integer isDeleted;
		
}
















