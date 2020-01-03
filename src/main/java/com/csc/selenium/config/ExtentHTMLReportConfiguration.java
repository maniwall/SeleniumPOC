package com.csc.selenium.config;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentHTMLReportConfiguration {

	private static ExtentReports extent;

	public static ExtentReports configExtentReport() {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("CSC_Selenium_Test.html");

		extent = fetchExtentReports();
		extent.attachReporter(htmlReporter);

		return extent;
	}

	public static ExtentReports fetchExtentReports() {

		if (null == extent || extent.equals(null)) {

			extent = new ExtentReports();
			return extent;

		} else {

			return extent;
		}
	}

}
