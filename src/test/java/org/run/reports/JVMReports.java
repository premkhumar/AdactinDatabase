package org.run.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	
	public static void reportGenerate(String json) {

		File f = new File("C:\\Users\\SAM\\Desktop\\Java\\AdactinDatabase\\src\\test\\resources\\Reports");
		Configuration c = new Configuration(f, "Adactin Testing Using Database");
		c.addClassifications("TestPage Name", "Login Page");
		c.addClassifications("HardWare ", "Amd Processor");
		c.addClassifications("Os", "Windows 10");
		c.addClassifications("Browser", "Google Chrome");
		c.addClassifications("Database ", "Oracle SQL 10G");
		
		List<String> l = new ArrayList<String>();
		l.add(json);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	}

}
