package com.revature.service;

import java.util.List;

import javax.jws.WebService;

import com.revature.model.*;

@WebService
public interface MegaService {
	
	public List<MegaSoap> getAllMegas();
	public String addMega(MegaSoap mega) throws Exception;
	public String fight(MegaSoap mega) throws Exception;

}
