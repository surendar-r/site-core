package com.photon.phresco.Screens;

import java.io.IOException;


import com.photon.phresco.uiconstants.SiteData;
import com.photon.phresco.uiconstants.UIConstants;
import com.photon.phresco.uiconstants.UserInfoConstants;

/**
 * Invoking the super class method through passing the vale of Browser,URL, Context, then DrupalData,UIConstants,UserInfoConstants Xml Values
 * @throws InterruptedException
 * @throws IOException
 * @throws Exception
 */

public class WelcomeScreen extends PhotonAbstractScreen {
	public WelcomeScreen(String selectedBrowser, String applicationURL,
			String applicationContext, SiteData siteConstants, UIConstants uiConstants, UserInfoConstants userinfo)
			throws InterruptedException, IOException, Exception {
		super(selectedBrowser, applicationURL, applicationContext,
				siteConstants, uiConstants, userinfo);

	}

}	




