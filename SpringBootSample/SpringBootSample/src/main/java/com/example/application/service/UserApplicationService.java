package com.example.application.service;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
/**
 * ユーザー登録画面での処理用のクラス
 */
@Service
public class UserApplicationService {
	@Autowired
	private MessageSource messageSource;

	/**
	 * 性別のMapを生成する
	 * @param locale ロケール情報
	 * @return　性別のMap
	 */
	public Map<String,Integer> getGenderMap(Locale locale){
		Map<String,Integer> genderMap = new LinkedHashMap<>();

		//messages.propertiesから性別の文言を取得する
		String male = messageSource.getMessage("male", null, locale);
		String female = messageSource.getMessage("female", null, locale);

		genderMap.put(male, 1);
		genderMap.put(female, 2);
		return genderMap;
	}
}
