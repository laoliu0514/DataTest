package com.dl.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.dl.test.po.ReultPO;
import com.dl.tool.ValidateService;

public class TestPO {
	
	public static void main(String[] args) {
//		ReultPO reultPO=new ReultPO();
//		reultPO.setShopId("1223122");
//		try {
//			String msg=ValidateService.valid(reultPO);
//			System.out.println("--"+msg);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		getorders();
	}
	
	public static void getorders(){
		List<ReultPO> pos=new ArrayList<ReultPO>();
		
		ExecutorService service=Executors.newCachedThreadPool();
		pos=Collections.synchronizedList(pos);
		for(int i=10;i<500;i++){
			ReultPO reultPO=new ReultPO();
			reultPO.setShopId("1223122");
			reultPO.setEndTime("123212312");
			reultPO.setStartTime("123212312");
			pos.add(reultPO);
		}
		
		for(int i=0;i<pos.size();i++){
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			service.execute(new runa(pos.get(i)));
		}
		
	}
	
	static class runa implements Runnable{
		
		ReultPO po;
		public runa(ReultPO po) {
			this.po=po;
		}
		
		public void run() {
			
			val(po);
		}
		
	}
	
	
	public static void val(ReultPO po){
		String msg;
		try {
			msg = ValidateService.valid(po);
			System.out.println("--"+msg);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
