package com.vip.vipxgroute.account.model;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class BusSmsRouteModel implements Serializable {
	private static final long serialVersionUID = 6867305670502435625L;
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