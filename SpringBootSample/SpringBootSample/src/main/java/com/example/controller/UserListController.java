package com.example.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.form.UserListForm;
/**
 * ユーザー一覧画面用のコントローラクラス
 */
@Controller
@RequestMapping("/user")
public class UserListController {
	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper modelMapper;

	/**
	 * ユーザ一覧画面を表示
	 * @param form 画面属性情報のインスタンス
	 * @param model 画面に受け渡しをする情報
	 * @return ユーザ一覧画面へのパス
	 */
	@GetMapping("/list")
	public String getUserList(@ModelAttribute UserListForm form,Model model) {
		//formをMUserクラスに変換
		MUser user=modelMapper.map(form, MUser.class);
		//ユーザー検索
		List<MUser> userList=userService.getUsers(user);
		//Modelに登録
		model.addAttribute("userList", userList);

		return "user/list";
	}

	/**
	 * ユーザー検索処理
	 * @param form 画面属性情報のインスタンス
	 * @param model 画面に受け渡しをする情報
	 * @return ユーザ一覧画面へのパス
	 */
	@PostMapping("/list")
	public String postUserList(@ModelAttribute UserListForm form,Model model) {
		//formをMUserクラスに変換
		MUser user=modelMapper.map(form, MUser.class);
		//ユーザー検索
		List<MUser> userList=userService.getUsers(user);
		//Modelに登録
		model.addAttribute("userList", userList);

		return "user/list";
	}
}
