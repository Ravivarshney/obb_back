package com.obb.Service;

import java.util.List;

import com.obb.Entity.Obb;

public interface ObbService {

	public List<Obb> getAll();
	public boolean signUp(Obb obb);
	public  List<Obb> login(String id, String pass);
	public boolean adminLogin(String id, String pass);
	public Obb edit(Obb obb, String id);
	public String delete();

}
