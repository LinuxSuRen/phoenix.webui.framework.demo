package autotest.web.framework.demo.runner;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.suren.autotest.web.framework.core.suite.SuiteRunner;
import org.xml.sax.SAXException;

/**
 * 用测试套件的方式来驱动自动化测试，可以做到完全不需要Java代码
 * @author suren
 * @date 2016年12月12日 下午12:13:47
 */
public class Test {

	/**
	 * @param args
	 * @throws SAXException
	 * @throws InterruptedException
	 * @throws DocumentException
	 * @throws IOException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 */
	public static void main(String[] args) throws NoSuchFieldException,
		SecurityException, IllegalArgumentException, IllegalAccessException, IOException,
			DocumentException, InterruptedException, SAXException {
		SuiteRunner.main(new String[] { "baidu_runner.xml" });
	}

}
