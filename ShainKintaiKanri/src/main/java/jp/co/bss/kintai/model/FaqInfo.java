package jp.co.bss.kintai.model;
import java.sql.Date;

/**
 * Faq情報
 *
 */
public class FaqInfo{
	/**
	 * ID
	 */
	private Integer id;
	/*
	 * 提出者
	 */
	private String claimer;
	/*
	 * 質問内容
	 */
	private String question;
	/*
	 * 回答者
	 */
	private String reponder;
	/*
	 * 回答内容
	 */
	private String answer;
	/*
	 * 回答状況
	 */
	private String answerflg;
	/**
	 * 更新日時
	 */
	private Date update_date;
	/**
	 * 登録日時
	 */
	private Date create_date;
	/**
	 * 削除日時
	 */
	private Date delete_date;
	/*
	 * ファイル
	 */
	private byte[] blob_data;
	/**
	 * ID
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * ID
	 * 
	 * @param id ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 提出者
	 * 
	 * @return claimer
	 */
	public String getClaimer() {
		return claimer;
	}
	/**
	 * 提出者
	 * 
	 * @param claimer 提出者
	 */
	public void setClaimer(String claimer) {
		this.claimer = claimer;
	}
	/**
	 * 質問内容
	 * 
	 * @return question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * 質問内容
	 * 
	 * @param question 質問内容
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * 回答者
	 * 
	 * @return reponder
	 */
	public String getReponder() {
		return reponder;
	}
	/**
	 * 回答者
	 * 
	 * @param reponder 回答者
	 */
	public void setReponder(String reponder) {
		this.reponder = reponder;
	}
	/**
	 * 回答内容
	 * 
	 * @return answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * 回答内容
	 * 
	 * @param answer 回答内容
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * 回答状況
	 * 
	 * @return answerflg
	 */
	public String getAnswerflg() {
		return answerflg;
	}
	/**
	 * 回答状況
	 * 
	 * @param answerflg 回答状況
	 */
	public void setAnswerflg(String answerflg) {
		this.answerflg = answerflg;
	}
	/**
	 * 更新日時
	 * 
	 * @return update_date
	 */
	public Date getUpdate_date() {
		return update_date;
	}
	/**
	 * 更新日時
	 * 
	 * @param update_date 更新日時
	 */
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	/**
	 * 登録日時
	 * 
	 * @return create_date
	 */
	public Date getCreate_date() {
		return create_date;
	}
	/**
	 * 登録日時
	 * 
	 * @param create_date 登録日時
	 */
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	/**
	 * 削除日時
	 * 
	 * @return delete_date
	 */
	public Date getDelete_date() {
		return delete_date;
	}
	/**
	 * 削除日時
	 * 
	 * @param delete_date 削除日時
	 */
	public void setDelete_date(Date delete_date) {
		this.delete_date = delete_date;
	}
	/*
	 * ファイル
	 * 
	 * @return fileData
	 */
	public byte[] getBlob_data() {
		return blob_data;
	}
	/*
	 * ファイル
	 * 
	 * @param fileData ファイル
	 */
	public void setBlob_data(byte[] blob_data) {
		this.blob_data = blob_data;
	}
    
}
