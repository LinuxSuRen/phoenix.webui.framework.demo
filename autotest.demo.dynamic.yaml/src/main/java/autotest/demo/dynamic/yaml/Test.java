/**
 * http://surenpi.com
*/
package autotest.demo.dynamic.yaml;

import java.io.IOException;

import com.surenpi.autotest.utils.ThreadUtil;
import org.suren.autotest.test.page.HomePageWithData;
import org.suren.autotest.web.framework.annotation.AutoApplication;
import org.suren.autotest.web.framework.settings.Phoenix;

/**
 * AutoTest框架的一个简单示例</br>
 * @author suren
 * @date 2016年12月13日 下午7:52:06
 */
@AutoApplication
public class Test
{

	/**
	 * 入口函数
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		Phoenix phoenix = new Phoenix(Test.class);
		phoenix.initWithData();
		
		//获取Page类，然后获取对应的元素，再进行操作
		HomePageWithData page = phoenix.getPage(HomePageWithData.class);
        page.open();
        page.getUserName().fillValue();
        page.getPassword().fillValue();
        page.getLoginBut().click();
		
		ThreadUtil.silentSleep(3000);
		
		phoenix.close(); //关闭框架
	}

}
