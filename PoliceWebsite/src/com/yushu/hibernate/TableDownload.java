package com.yushu.hibernate;

/**
 * TableDownload entity. @author MyEclipse Persistence Tools
 */
public class TableDownload extends AbstractTableDownload implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TableDownload() {
	}

	/** minimal constructor */
	public TableDownload(String tableTitle, String tableUrl) {
		super(tableTitle, tableUrl);
	}

	/** full constructor */
	public TableDownload(String tableTitle, String tableUrl, String tableContent) {
		super(tableTitle, tableUrl, tableContent);
	}

}
