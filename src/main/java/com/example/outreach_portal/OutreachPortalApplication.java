package com.example.outreach_portal;

import com.example.outreach_portal.bean.*;
import com.example.outreach_portal.dao.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OutreachPortalApplication {

	
	@Autowired
	ProfileDao profileDao;
	
	@Autowired
	AdminDao dao;
	
	public static void main(String[] args) {
		
		SpringApplication.run(OutreachPortalApplication.class, args);
		
		

	}
	
	@Bean
	InitializingBean sendDatabase() {
	    return () -> {

			profileDao.save(new User(100, "anshul@gmail.com", "1234",true,"https://firebasestorage.googleapis.com/v0/b/student-sphere-f2213.appspot.com/o/images%2FIMG_20230114_014031_036.jpg?alt=media&token=5a56210c-906d-49ae-8fbe-647fb835e798", "Anshul Sharma",
					"Mtech","MT2022143", "2022", "SPE", "DevOps",1));
			profileDao.save(new User(101, "anisha@gmail.com", "1234",false,"https://firebasestorage.googleapis.com/v0/b/student-sphere-f2213.appspot.com/o/images%2Fanisha.jpeg?alt=media&token=7c8d2010-42d1-4a6a-bd9e-aaf462b93ccb", "Anisha Rani",
					"Mtech","MT2022153", "2022", "", "",1));
	    	
	    	profileDao.save(new User(103, "abc@iiitb.org", "12345678",true,"https://firebasestorage.googleapis.com/v0/b/outreach-portal-8d2c2.appspot.com/o/abc.png?alt=media&token=11511c26-c594-4d2f-9b41-bdd2a2e17ca9", "Abc",
					"","", "", "", "",1));
	    	
			dao.save(new admin(101,"pass"));

	      };
	   }
	
	

    

}
