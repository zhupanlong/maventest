package com.chatRobot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PageBean implements Serializable {

	private static final long serialVersionUID = -7376883092589241260L;
	private int pageNumber;
	private int pageSize;
	private int startRow;
	private int endRow;
	private Map<String, Object> map;// 封装参数
	private List<?> list = new ArrayList<>();
	private int rowCount;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartRow() {
		this.startRow = (pageNumber - 1) * pageSize + 1;
		return  startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = (pageNumber - 1) * pageSize + 1;
	}

	public int getEndRow() {
		this.endRow = pageNumber * pageSize;
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = pageNumber * pageSize;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	// 设置分页统一方法
	public void setPagein(int pageNumber, int pagesize) {
		setPageNumber(pageNumber);
		setPageSize(pagesize);
		getStartRow();
		getEndRow();
	}
}
