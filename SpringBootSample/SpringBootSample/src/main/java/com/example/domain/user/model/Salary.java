package com.example.domain.user.model;

import lombok.Data;
/**
 * 給料テーブル用のエンティティクラス
 */
@Data
public class Salary {
	//ユーザーID
	private String userId;
	//年月日
	private String yearMonth;
	//給料
	private Integer salary;
}
