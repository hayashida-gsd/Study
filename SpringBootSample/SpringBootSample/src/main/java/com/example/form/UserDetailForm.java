package com.example.form;

import java.util.Date;
import java.util.List;

import com.example.domain.user.model.Department;
import com.example.domain.user.model.Salary;

import lombok.Data;
/**
 * ユーザー詳細画面の属性クラス
 */
@Data
public class UserDetailForm {
	//ユーザーID
	private String userId;
	//パスワード
	private String password;
	//ユーザー名
	private String userName;
	//誕生日
	private Date birthday;
	//年齢
	private Integer age;
	//性別
	private Integer gender;
	//部署
	private Department department;
	//給料
	private List<Salary> salaryList;
}
