package com.chatRobot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PageBean implements Serializable {

	private static final long serialVersionUID = -7376883092589241260L;
	private int page;
	private int rows;
	private int startRow;
	private int endRow;
	private Map<String, Object> map;// 封装参数
	private List<?> list = new ArrayList<>();
	private int rowCount;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getStartRow() {
		this.startRow = (page - 1) * rows + 1;
		return  startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = (page - 1) * rows + 1;
	}

	public int getEndRow() {
		this.endRow = page * rows;
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = page * rows;
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
	public void setPagein(int page, int rows) {
		setPage(page);
		setRows(rows);
		getStartRow();
		getEndRow();
	}
}
