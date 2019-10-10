package com.fracong.shardingjdbc.test.entity;

public class PageInfo {
	private Integer pageInfoNum;
	private Integer pageInfoRows;
	private Integer pageInfoBegin;
	private Integer pageInfoEnd;
	
	public Integer getPageInfoNum() {
		return pageInfoNum;
	}
	public void setPageInfoNum(Integer pageInfoNum) {
		this.pageInfoNum = pageInfoNum;
		this.setBeginAndEnd();
	}
	public Integer getPageInfoRows() {
		return pageInfoRows;
	}
	public void setPageInfoRows(Integer pageInfoRows) {
		this.pageInfoRows = pageInfoRows;
		this.setBeginAndEnd();
	}
	public Integer getPageInfoBegin() {
		return pageInfoBegin;
	}
	public void setPageInfoBegin() {
		this.pageInfoBegin = this.ifSetFlag()?(this.pageInfoNum-1)*this.pageInfoRows:0;
	}
	public Integer getPageInfoEnd() {
		return pageInfoEnd;
	}
	public void setPageInfoEnd() {
		this.pageInfoEnd = this.ifSetFlag()?this.pageInfoNum*this.pageInfoRows:10;
	}
	
	public void setBeginAndEnd() {
		if(ifSetFlag()) {
			this.setPageInfoBegin();
			this.setPageInfoEnd();
		}
	}
	
	public boolean ifSetFlag() {
		if(this.pageInfoNum != null && this.pageInfoRows != null) return true;
		return false;
	}
}
