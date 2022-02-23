package com.example.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
/**
 * ユーザー登録画面の属性クラス
 */
@Data
public class SignupForm {
	//ユーザーID
	@NotBlank(groups=ValidGroup1.class)
	@Email(groups=ValidGroup2.class)
	private String userId;

	//パスワード
	@NotBlank(groups=ValidGroup1.class)
	@Length(min=4,max=100,groups=ValidGroup2.class)
	@Pattern(regexp="^[a-zA-A0-9]+$",groups=ValidGroup2.class)
	private String password;

	//ユーザー名
	@NotBlank(groups=ValidGroup1.class)
	private String userName;

	//誕生日
	@DateTimeFormat(pattern="yyyy/MM/dd")
	@NotNull(groups=ValidGroup1.class)
	private Date birthday;

	//年齢
	@Min(value=20,groups=ValidGroup2.class)
	@Max(value=100,groups=ValidGroup2.class)
	private Integer age;

	//性別
	@NotNull(groups=ValidGroup1.class)
	private Integer gender;
}
