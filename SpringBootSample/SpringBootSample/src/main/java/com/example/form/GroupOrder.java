package com.example.form;

import javax.validation.GroupSequence;
/**
 * バリデーションのチェックグループ、優先順位付けインターフェース
 */
@GroupSequence({ValidGroup1.class,ValidGroup2.class})
public interface GroupOrder {

}
