package schoo.service;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import schoo.entity.UserEntity;
import schoo.form.UserForm;

@SpringBootTest
public class UserServiceImpleTest {

	@Autowired
	UserService userService;

	@Test
	public void test001() {
		// テスト用ユーザの作成
		UserForm userForm = new UserForm();
		userForm.setUserName("スクー太郎");
		userForm.setAge(20);
		// FormからEntityへの変換
		UserEntity userEntity =
				userService.createUser(userForm);
		// 期待する値の準備
		UserEntity actualUserEntity = new UserEntity();
		actualUserEntity.setUserId(1);
		actualUserEntity.setUserName("スクー太郎");
		actualUserEntity.setAge(20);
		// 変換結果の検証
		assertThat(userEntity, is(samePropertyValuesAs(actualUserEntity)));
	}
}
