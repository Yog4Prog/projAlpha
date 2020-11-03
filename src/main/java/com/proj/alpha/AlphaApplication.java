package com.proj.alpha;


import com.proj.alpha.empdetails.model.EmpDetails;
import com.proj.alpha.empdetails.model.EmpLogin;
import com.proj.alpha.empdetails.service.IEmpDetailsService;
import com.proj.alpha.empdetails.service.IEmpLoginService;
import com.proj.alpha.shared.model.Address;
import com.proj.alpha.storedetails.model.StoreDetails;
import com.proj.alpha.storedetails.service.IStoreDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class AlphaApplication implements CommandLineRunner {
	@Autowired
	IEmpDetailsService empDetailsService;
	@Autowired
	IEmpLoginService empLoginService;
	@Autowired
	IStoreDetailsService storeDetailsService;
	public static void main(String[] args) {
		SpringApplication.run(AlphaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
			// Push records to Store
	/*	for(int i=0; i< 20;i++ )
		{
			Address address = new Address("House"+i, "New Street","Hyderabad","TG","502"+i);
			int id = 100 + i;
			StoreDetails storeDetails = new StoreDetails(String.valueOf(id),"Store"+id,"88868890","Active",address);
			storeDetailsService.createStoreDetails(storeDetails);
		}


		for(int i=0;i<200;i++)
		{
			Address address = new Address("House"+i, "New Street","Hyderabad","TG","502"+i);
			int id = 100 + i;
			int storeID = 100 + i/10;
			EmpDetails empDetails = new EmpDetails(String.valueOf(id),"FirstName"+i,"lastName"+i,"888553312","Active", new Date(),
					"emp"+i,"pass@word1",address,String.valueOf(storeID),"L2");
			empDetailsService.createEmpDetails(empDetails);
			System.out.println("Added record "+i);
		}


		boolean inOut = true;
		for(int i=0;i<1000000;i++)
		{
			String login = "IN";
			if(!inOut){
				login = "OUT";
			}
			inOut = !inOut;
			int empId = i/200;
			EmpLogin empLogin = new EmpLogin(String.valueOf(i), String.valueOf(empId),login,new Date(),"100,100");
			empLoginService.createEmpLogin(empLogin);
			if(i%200==0)
			{
				System.out.println("Added record is "+i);
			}

		} */
	}
}
