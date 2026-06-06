package hq.controller;

import java.util.List;

import hq.dao.HibernateRepo;
import hq.entity.HibernateEntity;

public class HibernateController {
	
	public static void main(String[] args) {
		
		HibernateRepo ro = new HibernateRepo();
		
	    HibernateEntity hi = new HibernateEntity("New English Library", "Gao", 4382873334l);
	    
//	    ro.insertData(hi);
	    
	    HibernateEntity he = new HibernateEntity(5);
	    
//	    ro.deletData(he);
	    
	    HibernateEntity up = new HibernateEntity(3);
	    
//	    ro.updateData(up);
//	    
//	    HibernateEntity get = new HibernateEntity(2);
//	    
//	    HibernateEntity sir = ro.getsingleData(up);
//	    
//	    System.out.println("Id: "+sir.getLibId());
//	    System.out.println("Name: "+sir.getLibName());
//	    System.out.println("City: "+ sir.getLibCity());
//	    System.out.println("Phone: "+ sir.getLibMob());
//	    
	    List<HibernateEntity> li = ro.getallData();
	    
	 
	    // use for loop and remove one one element from the list
	    for(HibernateEntity i : li) {
	    	System.out.println("ID : "+ i.getLibId());
	    	System.out.println("Name: "+ i.getLibName());
	    	System.out.println("City: "+ i.getLibCity());
	    	System.out.println("Mob: "+ i.getLibMob());
	    	System.out.println("--------------------------");
	    }
	    
	}

}
