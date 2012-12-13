package com.photon.phresco.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.photon.phresco.Screens.WelcomeScreen;
import com.photon.phresco.uiconstants.SiteData;
import com.photon.phresco.uiconstants.PhrescoUiConstants;
import com.photon.phresco.uiconstants.UIConstants;
import com.photon.phresco.uiconstants.UserInfoConstants;


public class WelcomeSiteCoreTest {

	private static UIConstants uiConstants;
	private static PhrescoUiConstants phrescoUIConstants;
	private static WelcomeScreen welcomeScreen;
	private static String methodName;
	private static String selectedBrowser;
	private static SiteData siteConstants;
	private static UserInfoConstants userInfo;
	
	/**
	 * Initializing the Object of a class PhrescoUiConstants, UIConstants, DrupalData, UserInfoConstants
	 * @throws Exception
	 */

	@BeforeTest
	public static void setUp() throws Exception {
		try {
			phrescoUIConstants = new PhrescoUiConstants();
			uiConstants = new UIConstants();
			siteConstants = new SiteData();
			userInfo = new UserInfoConstants();
			launchingBrowser();
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * Capturing the URL values through String & passing those values into WelcomeScreen
	 * @throws Exception
	 */

	public static void launchingBrowser() throws Exception {
		try {
			String applicationURL = phrescoUIConstants.PROTOCOL + "://"
					+ phrescoUIConstants.HOST + ":" + phrescoUIConstants.PORT
					+ "/";
			selectedBrowser = phrescoUIConstants.BROWSER;
			
			welcomeScreen = new WelcomeScreen(selectedBrowser, applicationURL,
					phrescoUIConstants.CONTEXT, siteConstants, uiConstants, userInfo);
		} catch (Exception exception) {
			exception.printStackTrace();

		}

	}
	
	/**
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws Exception
	 * In this Method just triggering testcases
	 */
	
	
	@Test
	public void testSiteHomePage()
			throws InterruptedException, IOException, Exception {
		try {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			System.out.println("---------testToVerifyTheAudioDevicesAddToCart()-------------");
			
			welcomeScreen.check(methodName);
			
		} catch (Exception t) {
			t.printStackTrace();

		}
	}
	
	/**
	 * 	Triggering close method in BaseScreen 
	 */
	
	@AfterTest
	public static void tearDown() {
		welcomeScreen.closeBrowser();
	}

}