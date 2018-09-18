package com.acon.travelmaker.vo;

import org.apache.ibatis.type.Alias;

@Alias("Community")
public class Community {

	Integer idx;
	String memberId;
	String title;
	String content;
	String writeDate;
	String likeCnt;
	public Community() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Community(Integer idx, String memberId, String title, String content, String writeDate, String likeCnt) {
		super();
		this.idx = idx;
		this.memberId = memberId;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
		this.likeCnt = likeCnt;
	}
	public Integer getIdx() {
		return idx;
	}
	public void setIdx(Integer idx) {
		this.idx = idx;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getLikeCnt() {
		return likeCnt;
	}
	public void setLikeCnt(String likeCnt) {
		this.likeCnt = likeCnt;
	}
	@Override
	public String toString() {
		return "Community [idx=" + idx + ", memberId=" + memberId + ", title=" + title + ", content=" + content
				+ ", writeDate=" + writeDate + ", likeCnt=" + likeCnt + "]";
	}
	
	
	
}
