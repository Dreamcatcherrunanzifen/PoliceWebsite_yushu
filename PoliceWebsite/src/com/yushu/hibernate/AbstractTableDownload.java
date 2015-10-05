package com.yushu.hibernate;

/**
 * AbstractTableDownload entity provides the base persistence definition of the
 * TableDownload entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTableDownload implements java.io.Serializable {

	// Fields

	private Integer tableId;
	private String tableTitle;
	private String tableUrl;
	private String tableContent;

	// Constructors

	/** default constructor */
	public AbstractTableDownload() {
	}

	/** minimal constructor */
	public AbstractTableDownload(String tableTitle, String tableUrl) {
		this.tableTitle = tableTitle;
		this.tableUrl = tableUrl;
	}

	/** full constructor */
	public AbstractTableDownload(String tableTitle, String tableUrl,
			String tableContent) {
		this.tableTitle = tableTitle;
		this.tableUrl = tableUrl;
		this.tableContent = tableContent;
	}

	// Property accessors

	public Integer getTableId() {
		return this.tableId;
	}

	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}

	public String getTableTitle() {
		return this.tableTitle;
	}

	public void setTableTitle(String tableTitle) {
		this.tableTitle = tableTitle;
	}

	public String getTableUrl() {
		return this.tableUrl;
	}

	public void setTableUrl(String tableUrl) {
		this.tableUrl = tableUrl;
	}

	public String getTableContent() {
		return this.tableContent;
	}

	public void setTableContent(String tableContent) {
		this.tableContent = tableContent;
	}

}