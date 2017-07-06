/**
 * http://surenpi.com
 */
package org.suren.autotest.test.page;

import org.suren.autotest.web.framework.annotation.AutoDataSource;
import org.suren.autotest.web.framework.annotation.AutoLocator;
import org.suren.autotest.web.framework.annotation.AutoPage;
import org.suren.autotest.web.framework.selenium.WebPage;

import com.surenpi.autotest.datasource.DataSourceConstants;
import com.surenpi.autotest.webui.core.LocatorType;
import com.surenpi.autotest.webui.ui.Button;
import com.surenpi.autotest.webui.ui.Text;

/**
 * 属性上必须添加注解@Autowired以及对应的getter和setter方法
 * @author suren
 * @date Jul 23, 2016 4:41:16 PM
 */
@AutoPage(url = "http://phoenix.surenpi.com",maximize = false)
@AutoDataSource(resource = "phoenix.data.yml", type = DataSourceConstants.DS_TYPE_YAML)
public class HomePage extends WebPage
{
	@AutoLocator(locator = LocatorType.BY_NAME, value = "username")
	private Text userName;
	@AutoLocator(locator = LocatorType.BY_NAME, value = "password")
	private Text password;
	@AutoLocator(locator = LocatorType.BY_XPATH, value = "//button[contains(text(),'登录')]")
	private Button loginBut;
	@AutoLocator(locator = LocatorType.BY_LINK_TEXT, value = "查看项目列表")
	private Button toProjectListBut;

	public Text getUserName() {
		return userName;
	}

	public void setUserName(Text userName) {
		this.userName = userName;
	}

	public Text getPassword() {
		return password;
	}

	public void setPassword(Text password) {
		this.password = password;
	}

	public Button getLoginBut() {
		return loginBut;
	}

	public void setLoginBut(Button loginBut) {
		this.loginBut = loginBut;
	}

	public Button getToProjectListBut() {
		return toProjectListBut;
	}

	public void setToProjectListBut(Button toProjectListBut) {
		this.toProjectListBut = toProjectListBut;
	}
}