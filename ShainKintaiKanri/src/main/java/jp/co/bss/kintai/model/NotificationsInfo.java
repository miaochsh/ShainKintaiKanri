package jp.co.bss.kintai.model;
import java.sql.Date;

/**
 * Notice情報
 *
 */
public class NotificationsInfo{
	/**
	 * ID
	 */
	private Integer id;
	/*
	 * 件名
	 */
	private String title;
	/*
	 * 内容
	 */
	private String content;
	/*
	 * 重要度
	 */
	private String status;
	/*
	 * ファイル
	 */
	private byte[] file_content;
	/*
	 * 掲載期間＿開始
	 */
	private Date start_time;
	/**
	 * 掲載期間＿終了
	 */
	private Date end_time;
	/**
	 * 投稿者
	 */
	private Integer posted_by;
	/**
	 * 登録日時
	 */
	private Date created_at;
	/*
	 * 更新日時
	 */
	private Date updated_at;
	/*
	 * 登録日
	 */
	private Date creation_date;	
	/*
	 * 作成者
	 */
	private Integer creator;
	/*
	 * 更新日
	 */
	private Date update_date;
	/*
	 * 更新者
	 */
	private Integer updater;
	/**
	 * ID
	 * 
	 * @param id
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
	 * 件名
	 * 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 件名
	 * 
	 * @param title 件名
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 内容
	 * 
	 * @return
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 内容
	 * 
	 * @param content 内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 重要度
	 * 
	 * @return
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 重要度
	 * 
	 * @param status 重要度
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * ファイル
	 * 
	 * @return
	 */
	public byte[] getFile_content() {
		return file_content;
	}
	/**
	 * ファイル
	 * 
	 * @param file_content ファイル
	 */
	public void setFile_content(byte[] file_content) {
		this.file_content = file_content;
	}
	/**
	 * 掲載期間＿開始
	 * 
	 * @return
	 */
	public Date getStart_time() {
		return start_time;
	}
	/**
	 * 掲載期間＿開始
	 * 
	 * @param start_time 掲載期間＿開始
	 */
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	/**
	 * 掲載期間＿終了
	 * 
	 * @return
	 */
	public Date getEnd_time() {
		return end_time;
	}
	/**
	 * 掲載期間＿終了
	 * 
	 * @param end_time 掲載期間＿終了
	 */
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	/**
	 * 投稿者
	 * 
	 * @return
	 */
	public Integer getPosted_by() {
		return posted_by;
	}
	/**
	 * 投稿者
	 * 
	 * @param posted_by 投稿者
	 */
	public void setPosted_by(Integer posted_by) {
		this.posted_by = posted_by;
	}
	/**
	 * 登録日時
	 * 
	 * @return
	 */
	public Date getCreated_at() {
		return created_at;
	}
	/**
	 * 登録日時
	 * 
	 * @param created_at 登録日時
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	/**
	 * 更新日時
	 * 
	 * @return
	 */
	public Date getUpdated_at() {
		return updated_at;
	}
	/**
	 * 更新日時
	 * 
	 * @param updated_at 更新日時
	 */
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	/**
	 * 登録日
	 * 
	 * @return
	 */
	public Date getCreation_date() {
		return creation_date;
	}
	/**
	 * 登録日
	 * 
	 * @param creation_date 登録日
	 */
	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}
	/**
	 * 作成者
	 * 
	 * @return
	 */
	public Integer getCreator() {
		return creator;
	}
	/**
	 * 作成者
	 * 
	 * @param creator 作成者
	 */
	public void setCreator(Integer creator) {
		this.creator = creator;
	}
	/**
	 * 更新日
	 * 
	 * @return
	 */
	public Date getUpdate_date() {
		return update_date;
	}
	/**
	 * 更新日
	 * 
	 * @param update_date 更新日
	 */
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	/**
	 * 更新者
	 * 
	 * @return
	 */
	public Integer getUpdater() {
		return updater;
	}
	/**
	 * 更新者
	 * 
	 * @param updater 更新者
	 */
	public void setUpdater(Integer updater) {
		this.updater = updater;
	}
}
