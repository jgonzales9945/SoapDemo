package com.revature.service;

import java.util.ArrayList;

import java.util.List;

import javax.jws.WebService;

import com.revature.exceptions.MegaBeatenException;
import com.revature.exceptions.MegaFullException;
import com.revature.model.MegaSoap;

@WebService(endpointInterface="com.revature.service.MegaService")
public class MegaServiceImpl implements MegaService {

	public MegaServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<MegaSoap> getAllMegas() {
		List<MegaSoap> fightingRobotList = new ArrayList<>();
		fightingRobotList.add(new MegaSoap("Rockman", "Mega Buster", 100));
		fightingRobotList.add(new MegaSoap("Cutman", "Scissors", 400));
		fightingRobotList.add(new MegaSoap("Blues", "Shield", 600));
		fightingRobotList.add(new MegaSoap("Base", "Charge Shot", 3000));
		return fightingRobotList;
	}

	@Override
	public String addMega(MegaSoap mega) throws MegaFullException {
		if(mega.getName().equals("Squid Alder")) {
			throw new MegaFullException(mega.getName() + " is a terrible robot master.");
		}
		return mega.getName() + " has been added";
	}

	@Override
	public String fight(MegaSoap mega) throws MegaBeatenException {
		mega.setHp(mega.getHp() - 20);
		if(mega.getHp()  <= 0) {
			throw new MegaBeatenException(mega.getName() + " has been destroyed");
		}
		return mega.getName() + " remaining HP=" + mega.getHp();
	}

}
