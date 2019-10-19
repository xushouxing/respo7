package com.atguiju.springboot;

import com.atguiju.springboot.pojo.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.Cache;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCachApplicationTests {
	@Autowired
    RedisCacheManager manager;

	@Test
	public void contextLoads() {
        Cache emp = manager.getCache("emp");
        Cache.ValueWrapper valueWrapper = emp.get("emp::1");
        Object o1 = valueWrapper.get();
        System.out.println(o1);
	}

}
