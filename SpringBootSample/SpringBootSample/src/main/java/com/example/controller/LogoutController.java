package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
/**
 * ログアウト用のコントローラクラス
 */
@Controller
@Slf4j
public class LogoutController {
	/**
	 * ログイン画面にリダイレクト
	 * @return ログイン画面へのリダイレクトパス
	 */
	@PostMapping("/logout")
	public String postLogout() {
		log.info("ログアウト");
		return "redirect:/login";
	}
}
