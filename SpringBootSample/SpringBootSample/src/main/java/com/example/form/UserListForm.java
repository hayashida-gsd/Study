package com.example.form;

import lombok.Data;
/**
 * ユーザー一覧画面の属性クラス
 */
@Data
public class UserListForm {
	//ユーザーID
	private String userId;
	//ユーザー名
	private String userName;
}
