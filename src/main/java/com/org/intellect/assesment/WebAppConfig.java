package com.org.intellect.assesment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.org.intellect.assesment.model.User;

	@Configuration
    @EnableWebMvc
    @ComponentScan(basePackages = "com.org.intellect.assesment")
    public class WebAppConfig {

	}

