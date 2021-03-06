package com.example.domain.user.service;

import java.util.List;

import com.example.domain.user.model.MUser;
/**
 * ユーザー処理用のインターフェース
 */
public interface UserService {

	/**
	 *  ユーザー登録
	 * @param user ユーザー情報
	 */
	public void signup(MUser user);

	/**
	 *  ユーザー取得
	 * @param user ユーザー情報
	 * @return  ユーザー情報を格納したリスト
	 */
	public List<MUser> getUsers(MUser user);

	/**
	 *  ユーザー取得（１件）
	 * @param userId ユーザーID
	 * @return　ユーザー情報
	 */
	public MUser getUserOne(String userId);

	/**
	 *  ユーザー更新（１件）
	 * @param userId ユーザーID
	 * @param password　パスワード
	 * @param userName　ユーザー名
	 */
	public void updateUserOne(String userId,String password,String userName);

	/**
	 *  ユーザー削除（１件）
	 * @param userId ユーザーID
	 */
	public void deleteUserOne(String userId);
}
