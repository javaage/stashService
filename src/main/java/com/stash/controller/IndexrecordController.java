/**
 * 
 */
package com.stash.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stash.Constant;
import com.stash.model.IndexrecordModel;
import com.stash.service.IndexrecordService;

/**
 * @author P9030576
 *
 */
@Controller
@RestController
@RequestMapping(value="/indexrecord")
public class IndexrecordController {
	
	@Autowired
	private IndexrecordService indexrecordService;
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	
    @Scheduled(cron = "1 * * * * ?")
	//@Scheduled(fixedRate = 10000)
	public void recordIndex(){
    	System.out.println("current time : "+ dateFormat.format(new Date()));
    	
    	long time = (new Date().getTime()/(60*1000));
    	
    	try {
    		String htmlContent = Constant.httpsRequest(Constant.URL_INDEX_RECORD, "GET", null, null);
    		htmlContent = htmlContent.replaceAll("\"","");
    		String stocks[] = htmlContent.split(";");
    		List<IndexrecordModel> listIndexrecordModel = new ArrayList<IndexrecordModel>();
    		for(int i = 0; i < stocks.length; i++){
    			String shItems[] = stocks[i].split(",");
    			String names[] = shItems[0].split("=");
    			String name = names[1];
    			String code = names[0].substring(names[0].length()-8);
    			
    			IndexrecordModel indexrecordModel = new IndexrecordModel();
    			
    			indexrecordModel.setCode(code);
    			System.out.println(shItems[30]);
    			System.out.println(dateFormat.parse(shItems[30]));
    			indexrecordModel.setDate(dateFormat.parse(shItems[30]));
    			indexrecordModel.setTime((int)time);
    			indexrecordModel.setName(name);
    			indexrecordModel.setClose(Double.parseDouble(shItems[2]));
    			indexrecordModel.setOpen(Double.parseDouble(shItems[1]));
    			indexrecordModel.setCurrent(Double.parseDouble(shItems[3]));
    			indexrecordModel.setHigh(Double.parseDouble(shItems[4]));
    			indexrecordModel.setLow(Double.parseDouble(shItems[5]));
    			indexrecordModel.setClmn(Double.parseDouble(shItems[8]));
    			indexrecordModel.setMoney(Double.parseDouble(shItems[9]));
    			indexrecordModel.setAvg(Double.parseDouble(shItems[9]) / Double.parseDouble(shItems[8]));
    			indexrecordModel.setFlag("");
    			listIndexrecordModel.add(indexrecordModel);
    		}
    		indexrecordService.save(listIndexrecordModel);
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
//    @Scheduled(fixedRate = 10000)
//    public void timerRate() {
//        System.out.println(dateFormat.format(new Date()));
//    }
//    
//    //第一次延迟1秒执行，当执行完后2秒再执行
//    @Scheduled(initialDelay = 1000, fixedDelay = 2000)
//    public void timerInit() {
//        System.out.println("init : "+dateFormat.format(new Date()));
//    }
//
//    //每天20点16分50秒时执行
//    @Scheduled(cron = "50 12 20 * * ?")
//    public void timerCron() {
//        System.out.println("current time : "+ dateFormat.format(new Date()));
//    }
    
    

}
