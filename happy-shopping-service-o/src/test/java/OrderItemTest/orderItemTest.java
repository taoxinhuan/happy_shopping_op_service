/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package OrderItemTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.Page;
import com.happy.core.query.OrderItemQuery;
import com.happy.service.main.AppServiceStart;
import com.happy.service.main.dao.OrderItemMapper;
import com.happy.service.main.po.OrderItem;

/**
 * @description:订单项单元测试
 * @author taoxinhuan
 * @date 2018年11月7日 下午12:44:50
 */
@SpringBootTest(classes = AppServiceStart.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class orderItemTest {
	@Autowired
	private OrderItemMapper mapper;
	
	@Test
	public void addOne() {
		OrderItem o = new OrderItem();
		o.setOrderId(656L);
		o.setCreateTime(new Date());
		o.setLastUpdateTime(new Date());
		o.setCreateUserId(1L);
		o.setLastUpdateUserId(2L);
		o.setProductCount(5);
		o.setProductId(3333L);
		o.setProductSkuId(666L);
		mapper.insertOrderItem(o);
		System.out.println(o.getId());
	}
	
	@Test
	public void addSome() {
		OrderItem o1 = new OrderItem();
		o1.setOrderId(656L);
		o1.setCreateTime(new Date());
		o1.setLastUpdateTime(new Date());
		o1.setCreateUserId(1L);
		o1.setLastUpdateUserId(2L);
		o1.setProductCount(5);
		o1.setProductId(3333L);
		o1.setProductSkuId(666L);
		OrderItem o2 = new OrderItem();
		o2.setOrderId(656L);
		o2.setCreateTime(new Date());
		o2.setLastUpdateTime(new Date());
		o2.setCreateUserId(1L);
		o2.setLastUpdateUserId(2L);
		o2.setProductCount(5);
		o2.setProductId(3333L);
		o2.setProductSkuId(666L);
		List<OrderItem> list = new ArrayList<>();
		list.add(o1);
		list.add(o2);
		mapper.insertOrderItems(list);
	}
	
	@Test
	public void testQuery() {
		OrderItemQuery query = new OrderItemQuery();
		query.setOrderId(656L);
		Page<OrderItem> listOrderItem = mapper.listOrderItem(query);
		System.out.println(listOrderItem);
	}
}
