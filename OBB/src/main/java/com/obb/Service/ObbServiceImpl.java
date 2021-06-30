package com.obb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obb.Entity.Obb;
import com.obb.dao.ObbDao;


@Service
public class ObbServiceImpl implements ObbService {

	@Autowired
	ObbDao obbDao;
	
	
	@Override
	public List<Obb> getAll() {
		// TODO Auto-generated method stub
		return obbDao.getAll();
	}

	@Override
	public boolean signUp(Obb obb) {
		// TODO Auto-generated method stub
		return obbDao.signUp(obb);
	}

	@Override
	public  List<Obb> login(String id, String pass) {
		// TODO Auto-generated method stub
		return obbDao.login(id, pass);
	}

	@Override
	public boolean adminLogin(String id, String pass) {
		// TODO Auto-generated method stub
		return obbDao.adminLogin(id, pass);
	}

	@Override
	public Obb edit(Obb obb, String id) {
		// TODO Auto-generated method stub
		return obbDao.edit(obb, id);
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return obbDao.delete();
	}

}
