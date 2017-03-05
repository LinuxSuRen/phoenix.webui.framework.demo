package org.suren.autotest.test;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.suren.autotest.test.page.BaiduHomePage;
import org.suren.autotest.web.framework.settings.SettingUtil;
import org.xml.sax.SAXException;

/**
 * 该demo主要演示如何在框架的基础上使用原生Selenium的API
 * @author suren
 * @date 2016年12月7日 下午1:31:59
 */
public class Test {

	/**
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
		baiduHomePage.open();
		baiduHomePage.getKeyword().setValue("selenium");
		baiduHomePage.getKeyword().fillValue();
		baiduHomePage.getSearchBut().click();
		
		//通过下面的方法可以获取Selenium的原生webdriver对象
		System.out.println(baiduHomePage.getEngine().getDriver());
		
		Thread.sleep(3000);
		
		util.close();
	}

}
