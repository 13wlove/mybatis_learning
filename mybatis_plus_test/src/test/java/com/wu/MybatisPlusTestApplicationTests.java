package com.wu;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wu.entity.Usera;
import com.wu.mapper.UseraMapper;

/**
 * @title selctById
 * @package com.wu
 * @author wlx
 * @version 0.1 2020年2月21日
 */
@SpringBootTest
class MybatisPlusTestApplicationTests {
	@Autowired
	private UseraMapper useramapper;

	/*		@Test
		public void selectById() {
			
			Usera user1=useramapper.selectById( 1087982257332887553L );	
			System.out.println(user1);
			}*/
	/*	@Test	
	public void selectBatchIds() {
		long [] a={1087982257332887553L,
				1088248166370832385L,1088250446457389058L};
	List asList=Arrays.asList(a);
		List<Usera> user2=useramapper.selectBatchIds(asList);
	user2.forEach(System.out::println);
		}*/

	/**//*	@Test
		public void selectByMap() {
			Map<String,Object>a=new HashMap<>();
			//a.put("name", "王天风");
			a.put("age", 25);
			List<Usera> user3 = useramapper.selectByMap(a);
			user3.forEach(System.out::println);
		}
		}*/
	/*1、名字中包含雨并且年龄小于40
	name like '%雨%' and age<40
	
	@Test
	public void selectByWrapper() {
		QueryWrapper<Usera> queryWrapper = new QueryWrapper<Usera>();
		queryWrapper.like("name", "雨").lt("age", 40);
		List<Usera> user4 = useramapper.selectList(queryWrapper);
		user4.forEach(System.out::println);
	
	}
	*/
	/*2、名字中包含雨年并且龄大于等于20且小于等于40并且email不为空
	name like '%雨%' and age between 20 and 40 and email is not null
	@Test
	public void selectByWrapper() {
		QueryWrapper<Usera> queryWrapper1 = new QueryWrapper<Usera>();
		queryWrapper1.like("name", "雨").between("age", 20, 40).isNotNull("email");
		List<Usera> list1 = useramapper.selectList(queryWrapper1);
		list1.forEach(System.out::println);
	
	}*/
	/*	3、名字为王姓或者年龄大于等于25，按照年龄降序排列，年龄相同按照id升序排列
		name like '王%' or age>=25 order by age desc,id asc
	@Test
	public void selectByWrapper2() {
	QueryWrapper<Usera> queryWrapper3 = new QueryWrapper<Usera>();
	queryWrapper3.likeRight("name","王").ge("age", 25).or().orderByDesc("age").orderByAsc("id");
	List<Usera> list2 = useramapper.selectList(queryWrapper3);
	list2.forEach(System.out::println);
	}*/
	/*4、创建日期为2019年2月14日并且直属上级为名字为王姓
	date_format(create_time,'%Y-%m-%d')='2019-02-14' and manager_id in (select id from user where name like '王%')
	*/
	/*	@Test
		public void selectByWrapper3() {
			QueryWrapper<Usera> qw4 = new QueryWrapper<Usera>();
			qw4.apply("date_format(create_time,'%Y-%m-%d') = {0}", "2019-02-14").inSql("manager_id", "select id from user_a where name like '王%'");
			List<Usera> list4 = useramapper.selectList(qw4);	
			list4.forEach(System.out::println);
		
		}*/
	/*name like '王%' and (age<40 or email is not null)*/
	/*@Test 
	public void selectWrapper3() {
	QueryWrapper<Usera> qw5 = new QueryWrapper<Usera>();
		qw5.likeRight("name", "王").and(wq->wq.lt("age", 40).isNotNull("email"));
		List<Usera> list5 = useramapper.selectList(qw5);
		list5.forEach(System.out::println);
	}*/
	/*名字为王姓或者（年龄小于40并且年龄大于20并且邮箱不为空）
	name like '王%' or (age<40 and age>20 and email is not null)*/
	/*@Test
	public void selectByQueryWrapper() {
		QueryWrapper<Usera> qw6 = new QueryWrapper<Usera> ();
		qw6.likeRight("name", "王").or(wq->wq.lt("age",40).gt("age", 20).isNotNull("email"));
		List<Usera> list6 = useramapper.selectList(qw6);
		list6.forEach(System.out::println);
		
		
	}*/
	/*7、（年龄小于40或邮箱不为空）并且名字为王姓
	(age<40 or email is not null) and name like '王%'*/
		@Test
		public void selectQueryWrapper7() {
			QueryWrapper<Usera> qw7 = new QueryWrapper<Usera> ();
			qw7.likeRight("name", "王").and(wq->wq.lt("age",40).or().isNotNull("email"));
			List<Usera> list7 = useramapper.selectList(qw7);
			list7.forEach(System.out::println);
			}
	/*	年龄为30、31、34、35
	age in (30、31、34、35)  */
	/*		@Test
			public void selectQueryWrapper8() {
				QueryWrapper<Usera> qw8 = new QueryWrapper<Usera>();
				int a[]= {32,31,34,35};
				qw8.in("age", Arrays.asList(a));
				List<Usera> list8 = useramapper.selectList(qw8);
				list8.forEach(System.out::println);
			}*/
	
	}