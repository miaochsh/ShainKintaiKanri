package jp.co.bss.kintai.dao;

import java.util.Date;

import lombok.Data;

/**
 * @author miaoc
 *
 */
@Data
public class Kintai {
	
	private String id;
	
	private String name;
	
	private String jochu_saki;
	
	private String kintai_y;
	
	private String kintai_m;
	
	private String kinmu_data;
	
	private String kotsu_data;
	
	private Byte kinmu_file_data;
	
	private Byte kotsu_file_data;
	
	private Date update_date;
	
	private Date create_date;

}
