package com.revature.service;

import java.util.List;

import com.revature.exceptions.MegaBeatenException;
import com.revature.exceptions.MegaFullException;
import com.revature.model.MegaSoap;

public interface MegaService {
	public List<MegaSoap> getAllMegas();
	public String addMega(MegaSoap mega) throws MegaFullException;
    public String fight(MegaSoap mega) throws MegaBeatenException;
}
