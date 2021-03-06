package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.user.model.MUser;
/**
 * ユーザーマスタテーブル用のリポジトリインターフェース
 */
@Mapper
public interface UserMapper {
	/**
	 *  ユーザー登録
	 * @param user ユーザー情報
	 * @return insert成功件数
	 */
	public int insertOne(MUser user);

	/**
	 *  ユーザー取得
	 * @param user ユーザー情報
	 * @return　ユーザー情報を格納したリスト
	 */
	public List<MUser>  findMany(MUser user);

	/**
	 *  ユーザー取得（１件）
	 * @param userId ユーザーID
	 * @return ユーザー情報
	 */
	public MUser findOne(String userId);

	/**
	 *  ユーザー更新（１件）
	 * @param userId ユーザーID
	 * @param password パスワード
	 * @param userName ユーザー名
	 */
	public void updateOne(@Param("userId")String userId,@Param("password")String password,@Param("userName")String userName);

	/**
	 *  ユーザー削除（１件）
	 * @param userId ユーザーID
	 */
	public void deleteOne(@Param("userId")String userId);

}
