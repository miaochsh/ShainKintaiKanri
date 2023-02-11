package jp.co.bss.kintai.dao;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

/**
 * @author miaoc
 *
 */
@Data
@EntityListeners(AuditingEntityListener.class)
public class Kintai {
	
private Long  id;				
	
	@NotBlank(message="お名前を記入してください。")				
	private String name;				
					
	@NotBlank(message="常駐先を記入してください。")					
	private String jochu_saki;				
					
	@NotBlank(message="勤怠年は50文字を超えないでください。")				
	private String kintai_y;
	
	@NotBlank(message="勤怠月を記入してください。")	
	private String kintai_m;
	
	@NotBlank(message="勤務時間を記入してください。")	
	private String kinmu_data;
	
	@NotBlank(message="交通費を記入してください。")	
	private String kotsu_data;
	
	@NotBlank(message="勤務表ファイルをアップロードしてください。")	
	private String kinmu_file_data;
	
	@NotBlank(message="交通費ファイルをアップロードしてください。")	
	private String kotsu_file_data;
	
	@LastModifiedDate
	@Column(updatable = false) 
    private String update_date;


	@CreatedDate
    @Column(updatable = false) 
    private String create_date;
	



}
