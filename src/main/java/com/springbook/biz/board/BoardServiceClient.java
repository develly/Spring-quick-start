package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// 실행시 h2 서버 끈 상태로 run (터미널이 웹에 켜져있으면 실행 안됨)
// java application 모드로 run
public class BoardServiceClient {
	public static void main(String[] args) {
		// 1. spring 컨테이터 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup한다.
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		// 3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목");
		vo.setWriter("홍길동동이");
		vo.setContent("임시 내용이다아");
		boardService.insertBoard(vo);
		
		// 4. 글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		// 5. spring 컨테이너 종료
		container.close();
		
	}
}
