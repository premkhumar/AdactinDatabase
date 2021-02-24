package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.run.reports.JVMReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Login.Feature",
glue= {"org.step"},dryRun=false,monochrome=true,plugin= {"pretty","json:C:\\Users\\SAM\\Desktop\\Java\\AdactinDatabase\\src\\test\\resources\\Reports\\report.json"})
public class TestRunner {
	
	@AfterClass
	public static void reports() {
		JVMReports.reportGenerate("C:\\Users\\SAM\\Desktop\\Java\\AdactinDatabase\\src\\test\\resources\\Reports\\report.json");
		
	}

}
