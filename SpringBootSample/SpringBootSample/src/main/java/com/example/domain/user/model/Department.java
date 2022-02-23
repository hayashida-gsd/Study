package com.example.domain.user.model;

import lombok.Data;
/**
 * 部署テーブル用のエンティティクラス
 */
@Data
public class Department {
	//部署ID
	private Integer departmentId;
	//部署名
	private String departmentName;
}
