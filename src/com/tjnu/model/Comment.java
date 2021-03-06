package com.tjnu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="comment")
public class Comment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GenericGenerator(name = "generator", strategy = "native")
	@GeneratedValue(generator = "generator")
	@Column(name = "commentId")
	private Integer commentId;//评论编号
	@Column(name = "resourceId")
	private Integer resourceId;//资源编号
	@Column(name = "username", length = 40)
	private String username;//用户名
	@Column(name = "resourceType", length = 2)
	private String resourceType;//资源类型，0表示文章，1表示图书
	@Column(name = "commentContent", length = 2000)
	private String commentContent;//评论内容
	@Column(name = "submitTime", length = 20)
	private String submitTime;//评论提交时间
	
	public synchronized Integer getCommentId() {
		return commentId;
	}
	public synchronized void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	public synchronized Integer getResourceId() {
		return resourceId;
	}
	public synchronized void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}
	public synchronized String getUsername() {
		return username;
	}
	public synchronized void setUsername(String username) {
		this.username = username;
	}
	public synchronized String getResourceType() {
		return resourceType;
	}
	public synchronized void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public synchronized String getCommentContent() {
		return commentContent;
	}
	public synchronized void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public synchronized String getSubmitTime() {
		return submitTime;
	}
	public synchronized void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	
}
