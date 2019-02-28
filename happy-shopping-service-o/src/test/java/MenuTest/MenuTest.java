/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package MenuTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.happy.core.dto.MenuDTO;
import com.happy.service.main.AppServiceStart;
import com.happy.service.main.bl.MenuBL;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年12月4日 上午9:50:58
 */
@SpringBootTest(classes = AppServiceStart.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MenuTest {
	@Autowired
	private MenuBL menuBL;
	
	@Test
	public void testadd() {
		MenuDTO dto = new MenuDTO();
		dto.setPrivilegeType("Menu");
		dto.setIcon("fa fa-user");
		dto.setPrivilegeName("会员管理");
		menuBL.insertMenu(dto);
	}
}
