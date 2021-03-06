package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/**
 * ログイン画面用のコントローラクラス
 */
@Controller
public class LoginController {
	/**
	 * トップページを表示
	 * @return ログイン画面へのパス
	 */
	@GetMapping("/")
	public String getTopPage() {
		return "redirect:login";
	}
	/**
	 * ログイン画面を表示
	 * @return ログイン画面へのパス
	 */
	@GetMapping("/login")
	public String getLogin() {
		return "login/login";
	}
	/**
	 * ユーザー一覧画面にリダイレクト
	 * @return ユーザー一覧画面へのパス
	 */
	@PostMapping("/login")
	public String postLogin() {
		return "redirect:/user/list";
	}
}
