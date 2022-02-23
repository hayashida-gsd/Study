package com.example.domain.user.model;

import java.util.Date;
import java.util.List;

import lombok.Data;
/**
 * ユーザーマスタ用のエンティティクラス
 */
@Data
public class MUser {
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
	//部署ID
	private Integer departmentId;
	//役職
	private String role;
	//部署
	private Department department;
	//給料
	private List<Salary> salaryList;
}
