package jp.co.bss.kintai.dao;

import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * @author miaoc
 *
 */
@Data
public class Kintai {
	
	@NotBlank(message="アカウントを記入してください。")
	private String accountId;
	
	@NotBlank(message="パスワードを記入してください。")
	private String password;

}
