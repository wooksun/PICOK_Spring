package com.tjoeun.vo;

import java.util.ArrayList;


//1페이지 분량의 메인 글 목록과 페이징 작업에 사용할 8개의 변수를 기억하는 클래스 
//아래 생성자들은페이징작업 때문에.. 해놓는것 

public class MemberList {
	
	private ArrayList<MemberVO> list = new ArrayList<MemberVO>();

		private int pageSize = 10;
		private int totalCount = 0;
		private int totalPage = 0;
		private int currentPage = 1;
		private int startNo = 0;
		private int endNo = 0;
		private int startPage = 0;
		private int endPage = 0;
	
	public ArrayList<MemberVO> getList() {
			return list;
		}

		public void setList(ArrayList<MemberVO> list) {
			this.list = list;
		}

	public MemberList() {}	
	
	public MemberList(int pageSize, int totalCount, int currentPage) {
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.currentPage = currentPage;
		calculator();

	}

	private void calculator() {
		totalPage = (totalCount - 1) / pageSize + 1;
		currentPage = currentPage > totalPage ? totalPage : currentPage;
		startNo = (currentPage - 1) * pageSize+1;
		endNo = startNo+pageSize-1;
		endNo = endNo > totalCount?totalCount:endNo;
		startPage = (currentPage -1) /10 * 10 + 1;
		endPage = startPage +9;
		endPage = endPage > totalPage ? totalPage : endPage;
		
	}

	@Override
	public String toString() {
		return "BoardList [list=" + list + ", pageSize=" + pageSize + ", totalCount=" + totalCount + ", totalPage="
				+ totalPage + ", currentPage=" + currentPage + ", startNo=" + startNo + ", endNo=" + endNo
				+ ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getStartNo() {
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	public int getEndNo() {
		return endNo;
	}

	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

}
