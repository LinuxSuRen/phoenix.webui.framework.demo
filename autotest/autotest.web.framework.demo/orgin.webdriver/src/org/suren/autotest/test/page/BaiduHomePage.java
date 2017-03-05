package org.suren.autotest.test.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.suren.autotest.web.framework.core.ui.Button;
import org.suren.autotest.web.framework.core.ui.Text;
import org.suren.autotest.web.framework.page.Page;
import org.suren.autotest.web.framework.selenium.SeleniumEngine;

/**
 * @author suren
 * @date 2016年12月7日 下午1:30:51
 */
@Component
public class BaiduHomePage extends Page {
	@Autowired
	private Text keyword;
	@Autowired
	private Button searchBut;
	/** 通过这个对象可以获取Selenium的原生webdriver对象 */
	@Autowired
	private SeleniumEngine engine;
	public Text getKeyword() {
		return keyword;
	}
	public void setKeyword(Text keyword) {
		this.keyword = keyword;
	}
	public Button getSearchBut() {
		return searchBut;
	}
	public void setSearchBut(Button searchBut) {
		this.searchBut = searchBut;
	}
	public SeleniumEngine getEngine() {
		return engine;
	}
	public void setEngine(SeleniumEngine engine) {
		this.engine = engine;
	}
}
