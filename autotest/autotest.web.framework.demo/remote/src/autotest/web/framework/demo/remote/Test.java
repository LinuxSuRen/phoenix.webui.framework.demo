package autotest.web.framework.demo.remote;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.suren.autotest.web.framework.core.suite.SuiteRunner;
import org.xml.sax.SAXException;

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
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, IOException,
			DocumentException, InterruptedException, SAXException {
		SuiteRunner.main(new String[] { "baidu_remote_runner.xml" });
	}

}
