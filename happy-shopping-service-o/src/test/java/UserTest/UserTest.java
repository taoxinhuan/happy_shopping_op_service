/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package UserTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.happy.core.dto.UserDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.UserQuery;
import com.happy.service.main.AppServiceStart;
import com.happy.service.main.bl.UserBL;

/**
 * @description:订单项单元测试
 * @author taoxinhuan
 * @date 2018年11月7日 下午12:44:50
 */
@SpringBootTest(classes = AppServiceStart.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {
	@Autowired
	private UserBL mapper;
	
	@Test
	public void testList() {
		UserQuery query = new UserQuery();
		query.setType(0);
		query.setPageIndex(1);
		query.setPageSize(20);
		PageList<UserDTO> listUser = mapper.listUser(query);
		List<UserDTO> dataList = listUser.getDataList();
		dataList.forEach(data -> {
			System.err.println(data);
		});
	}
}
