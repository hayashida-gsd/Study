package com.example.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Bean登録用のクラス
 */
@Configuration
public class JavaConfig {

	/**
	 * ModelMapperインスタンスのBean登録
	 * @return　ModelMapperインスタンス
	 */
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
