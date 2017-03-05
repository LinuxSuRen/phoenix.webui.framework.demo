/**
* Copyright © 1998-2016, Glodon Inc. All Rights Reserved.
*/
package org.suren.autotest.test;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.suren.autotest.test.page.BaiduHomePage;
import org.suren.autotest.web.framework.settings.SettingUtil;
import org.xml.sax.SAXException;

public class Test {

	/**
	 * TODO
	 * @param args
	 * @throws SAXException 
	 * @throws DocumentException 
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, DocumentException, SAXException, InterruptedException {
		SettingUtil util = new SettingUtil();
		util.readFromClassPath("baidu.xml");
		
		BaiduHomePage baiduHomePage = util.getPage(BaiduHomePage.class);
		baiduHomePage.putData("param.url", "https://www.baidu.com/");
		baiduHomePage.open();
		baiduHomePage.getKeyword().putData("param.keyword", "kw");
		baiduHomePage.getKeyword().setValue("selenium");
		baiduHomePage.getKeyword().fillValue();
		baiduHomePage.getSearchBut().click();
		
		Thread.sleep(3000);
		
		util.close();
	}

}
