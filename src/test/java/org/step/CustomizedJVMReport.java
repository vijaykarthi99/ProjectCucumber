package org.step;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CustomizedJVMReport {
	public static void reporingJVM(String json) {
		File f = new File("D:\\JavaClassProjectsEclipse\\ProjectCucumber\\target\\facebookAU.file");
		Configuration con = new Configuration(f,"facebook");
		con.addClassifications("Sprint", "3.2");
		con.addClassifications("UserStoryNo", "3.2.6");
		con.addClassifications("Tc02", "40");
		con.addClassifications("OS", "windows");
		con.addClassifications("Verstion", "10 pro");
		con.addClassifications("Architechure", "64x bits");
		con.addClassifications("Bowser", "Google_Chrome");
		con.addClassifications("version", "99.99.89.100");
		List<String> li = new ArrayList();
		li.add(json);
		li.add(json);
		for (int i = 0; i < li.size(); i++) {
			
		}
		
		ReportBuilder builder = new ReportBuilder(li, con);		
		builder.generateReports();
		
		
		
	}
	
	

}
