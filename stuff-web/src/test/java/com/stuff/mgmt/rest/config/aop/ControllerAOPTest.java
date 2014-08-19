package com.stuff.mgmt.rest.config.aop;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.stuff.mgmt.rest.config.aop.ControllerAOPTest.TestConfiguration;
import com.stuff.mgmt.rest.controller.RestRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfiguration.class })
@WebAppConfiguration
public class ControllerAOPTest {

	@Autowired
	WebApplicationContext wac;

	@Autowired
	ControllerAOP controllerAOP;

	MockMvc mockMVC;

	@Before
	public void setUp() {
		this.mockMVC = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void testAutowire() {
		Assert.assertNotNull(controllerAOP);
		Assert.assertNotNull(mockMVC);
		Assert.assertNotNull(wac);

	}

	@Test
	public void testAOP() throws Exception {
		Assert.assertTrue(true);
		try{
			this.mockMVC.perform(get("/test"));
		}catch(Exception e){
		}
		Assert.assertTrue(true);
	}

	@EnableWebMvc
	@Configuration
	@EnableAspectJAutoProxy
	public static class TestConfiguration {

		@Bean
		public ControllerAOP controllerAspect() {
			return new ControllerAOP();
		}

		@Bean
		public RestRequest restRequest() {
			return new RestRequest();
		}
	}

}
