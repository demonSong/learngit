package com.vip.vipxgroute.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vip.venus.core.beans.mapping.BeanMapper;
import com.vip.vipxgroute.account.entity.BusSmsRoute;
import com.vip.vipxgroute.account.model.BusSmsRouteModel;
import com.vip.vipxgroute.account.repository.BusSmsRouteRepository;
import com.vip.vipxgroute.account.service.BusSmsRouteService;

@Service
public class BusSmsRouteServiceImpl implements BusSmsRouteService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private BusSmsRouteRepository busSmsRouteRepo;

	@Transactional
	@Override
	public int create(BusSmsRouteModel busSmsRouteModel) {
		busSmsRouteModel.setSmsCode(busSmsRouteModel.getSmsCode().toUpperCase());
		BusSmsRoute busSmsRoute =beanMapper.map(busSmsRouteModel, BusSmsRoute.class);
		int rowNum = busSmsRouteRepo.insert(busSmsRoute);
		busSmsRouteModel.setRouteId(busSmsRoute.getRouteId());
		return rowNum;
	}

	@Transactional
	@Override
	public int update(BusSmsRouteModel busSmsRouteModel) {
		return busSmsRouteRepo.update(beanMapper.map(busSmsRouteModel, BusSmsRoute.class));
	}

	@Transactional(readOnly = true)
	@Override
	public BusSmsRouteModel selectBySmsCode(String smsCode) {
		if(smsCode ==null || smsCode.length() == 0){
			return null;
		}
		return beanMapper.map(busSmsRouteRepo.selectBySmsCode(smsCode), BusSmsRouteModel.class);
	}
}
