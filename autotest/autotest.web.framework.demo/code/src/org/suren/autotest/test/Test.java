package org.suren.autotest.test;

import org.suren.autotest.web.framework.code.DefaultXmlCodeGenerator;
import org.suren.autotest.web.framework.code.DefaultXmlDataSourceGenerator;
import org.suren.autotest.web.framework.code.DefaultXmlSuiteRunnerGenerator;
import org.suren.autotest.web.framework.code.Generator;

/**
 * 该示例用来演示如何通过框架来生成Java代码</br>
 * 生成的路径是（项目的根目录）org/suren/autotest/test/page/BaiduHomePage.java</>
 * 该例子执行完成后，刷新工程即可看到生成的文件
 * @author suren
 * @date 2016年12月9日 上午8:41:32
 */
public class Test {

	public static void main(String[] args) {
		//执行以后刷新当前工程就能看到生成的Page文件
		Generator generator = new DefaultXmlCodeGenerator();
		generator.generate("baidu.xml", "src"); //这里从类路径下读取

		//生成数据源文件
		generator = new DefaultXmlDataSourceGenerator();
		generator.generate("baidu_test_for_datasource.xml", "src"); //这里从类路径下读取

		//生成测试套件文件
		generator = new DefaultXmlSuiteRunnerGenerator();
		generator.generate("baidu.xml", "src"); //这里从类路径下读取
	}

}
