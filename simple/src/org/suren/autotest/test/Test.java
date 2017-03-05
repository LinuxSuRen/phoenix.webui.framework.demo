/**
 * http://surenpi.com
*/
package org.suren.autotest.test;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.suren.autotest.test.page.BaiduHomePage;
import org.suren.autotest.web.framework.settings.SettingUtil;
import org.xml.sax.SAXException;

/**
 * AutoTest框架的一个简单示例</br>
 * baidu.xml主要包含元素定位信息的描述</br>
 * applicationContext.xml配置了Page类所在的包（package）</br>
 * Page类BaiduHomePage是一个逻辑的页面对象，包括页面中需要定位的元素
 * @author suren
 * @date 2016年12月13日 下午7:52:06
 */
public class Test {

	/**
	 * 入口函数
	 * @param args
	 * @throws IOException
	 * @throws DocumentException
	 * @throws SAXException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, DocumentException,
		SAXException, InterruptedException {
		SettingUtil util = new SettingUtil();
		util.readFromClassPath("baidu.xml"); //加载元素定位配置文件
		
		//获取Page类，然后获取对应的元素，再进行操作
		BaiduHomePage baiduHomePage = util.getPage(BaiduHomePage.class);
		baiduHomePage.open(); //打开baidu.xml配置文件中配置的页面地址
		baiduHomePage.getKeyword().setValue("selenium"); //告诉框架文本框要填充的值
		baiduHomePage.getKeyword().fillValue(); //向文本框中填充值
		baiduHomePage.getSearchBut().click(); //点击搜索按钮
		
		Thread.sleep(3000);
		
		util.close(); //关闭框架
	}

}
