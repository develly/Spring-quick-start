package com.springbook.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		process(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		request.setCharacterEncoding("EUC-KR");
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		// 1. 클라이언트의 요청 path 정보를 추출한다.
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		
		// 2. 클라이언트의 요청에 따라 분기처리한다.
		if(path.equals("/login.do")) {
			System.out.println("로그인 처리");
			
		} else if(path.equals("/logout.do")) {
			System.out.println("로그아웃 처리");
			
		} else if(path.equals("/insertBoard.do")) {
			System.out.println("글 등록 처리");
			
		} else if(path.equals("/updateBoard.do")) {
			System.out.println("글 수정 처리");
			
		} else if(path.equals("/deleteBoard.do")) {
			System.out.println("글 삭제 처리");
			
		} else if(path.equals("/getBoard.do")) {
			System.out.println("글 조회 처리");
			
		} else if(path.equals("/getBoardList.do")) {
			System.out.println("글 목록 조회 처리");
		} 
				
	}



}
