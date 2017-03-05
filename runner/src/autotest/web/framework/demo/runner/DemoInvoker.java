/**
 * http://surenpi.com
 */
package autotest.web.framework.demo.runner;

import org.suren.autotest.web.framework.settings.SettingUtil;

/**
 * 在测试套件中调用外部类的实例</br>
 * 方法必须是静态、public的
 * @author suren
 * @date 2016年12月12日 下午12:03:29
 */
public class DemoInvoker
{
	public static void execute(SettingUtil util)
	{
		System.out.println("I'am DemoInvoker, invoke execute method, SetingUtil is " + util);
	}
	
	public static void otherMethod(SettingUtil util)
	{
		System.out.println("I'am DemoInvoker, invoke otherMethod method, SetingUtil is " + util);
	}
}
