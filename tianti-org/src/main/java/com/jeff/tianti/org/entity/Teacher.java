package com.jeff.tianti.org.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jeff.tianti.common.entity.BaseEntity;



@Entity
@Table(name="teacher")

public class Teacher extends BaseEntity{
	private static final long serialVersionUID = -7510771121759944670L;
	@Id
	@GeneratedValue
	private long ID;
	
	private String name;
	
	private String info;
	
	private String content;
	
	private String pic_url;
	
	public void setID(Long id) {
		this.ID = id;
	}
	
	public long getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setPic(String pic) {
		this.pic_url = pic;
	}
	
	public String getPic() {
		return pic_url;
	}
}
