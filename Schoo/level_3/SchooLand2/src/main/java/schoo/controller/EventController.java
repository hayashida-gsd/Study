package schoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import schoo.form.EventEntryForm;
import schoo.form.EventForm;
import schoo.service.EventEntryService;
import schoo.service.EventService;

/**
 * イベントコントローラクラスです.
 */
@Controller
public class EventController {

	@Autowired
	EventService eventService;
	@Autowired
	EventEntryService eventEntryService;

	/**
	 * トップページ（イベント一覧画面）を表示します.
	 * @param model
	 * @return イベント一覧画面のパス
	 */
	@GetMapping("/")
	public String index(Model model) {
		// DBに登録されているイベントの一覧を取得

		// modelにイベントの一覧をセット

		// 次に表示する画面のパス（htmlファイルの名称）を返却
		return "";
	}

	/**
	 * イベントの登録画面を表示します.
	 * @param model
	 * @return イベント登録画面のパス
	 */
	@GetMapping("regist")
	public String regist(Model model) {
		// 次に表示する画面のパス（htmlファイルの名称）を返却
		return "";
	}

	/**
	 * 指定されたイベントIDの詳細画面を表示します.
	 * @param eventId イベントID
	 * @param model
	 * @return イベント詳細画面のパス
	 */
	@GetMapping("entry/{eventId}")
	public String entry(@PathVariable("eventId") Integer eventId,
						Model model) {
		// 引数で受け取ったイベントIDからイベントの情報を取得
		// イベントの情報は1件の前提で処理

		// modelに結果をセット

		// 引数で受け取ったイベントIDからイベントの参加者情報を取得

		// modelに結果をセット

		// 次に表示する画面のパス（htmlファイルの名称）を返却
		return "";
	}

	/**
	 * イベントの登録処理です.
	 * @param eventForm イベント情報
	 * @return	イベント一覧画面のパス（output.htmlへのリダイレクト）
	 */
	@PostMapping("eventregist")
	public String registrationEvent(@ModelAttribute EventForm eventForm) {
		// フォームから値を取得してデータベース登録処理へ

		// 次に表示する画面のパス（リダイレクト先のページ）を返却
		return "redirect:";
	}

	/**
	 * イベントの参加処理です.
	 * @param eventEntryForm イベント参加者情報
	 * @return	イベント詳細画面のパス
	 */
	@PostMapping("entry/add")
	public String entryEvent(
		@ModelAttribute EventEntryForm eventEntryForm) {
			// フォームから値を取得してデータベース登録処理へ

			// 次に表示する画面のパス（リダイレクト先のページ）を返却
			return "";
	}
}