/*
 * package yedam0414;
 * 
 * import java.util.Scanner;
 * 
 * class Board { // 게시글번호, 제목, 내용 ,작성자, 조회수(조회 할때마다 증가)
 * 
 * private int boardNo;//게시글번호 private String title; //제목 private String
 * content; //내용 private String writer; // 작성자 private int searchCnt = 0; // 조회수
 * 
 * public Board() { // TODO Auto-generated constructor stub }
 * 
 * 
 * 
 * public Board(int boardNo, String title, String content, String writer ) {
 * this.boardNo = boardNo; this.title = title; this.content = content;
 * this.writer = writer;
 * 
 * }
 * 
 * 
 * 
 * public int getBoardNo() { return boardNo; } public void setBoardNo(int
 * boardNo) { this.boardNo = boardNo; } public String getTitle() { return title;
 * } public void setTitle(String title) { this.title = title; } public String
 * getContent() { return content; } public void setContent(String content) {
 * this.content = content; } public String getWriter() { return writer; } public
 * void setWriter(String writer) { this.writer = writer; } public int
 * getSearchCnt() { return searchCnt; } public void setSearchCnt(int searchCnt)
 * { this.searchCnt = searchCnt; }
 * 
 * @Override public String toString() { return "Board [boardNo=" + boardNo +
 * ", title=" + title + ", content=" + content + ", writer=" + writer +
 * ", searchCnt=" + searchCnt + "]"; }
 * 
 * 
 * }
 * 
 * class BoardList2 { private Board[] boards;
 * 
 * //배열 크기 초기화 public void init(int size) { boards = new Board[size]; } //배열에 한건
 * 입력 public void addBoard(Board board) { for(int i = 0 ; i < boards.length;
 * i++) { if(boards[i] == null) { boards[i] =board; break; } } }
 * 
 * //수정 // 게시글 번호 찾아서 내용, 제목 public void modifyBoard(Board board) { for(int i =
 * 0; i < boards.length; i++) { if(boards[i].getBoardNo() == board.getBoardNo())
 * { boards[i].setContent(board.getBoardNo());
 * boards[i].setTitle(board.getTitle()); } }
 * 
 * }
 * 
 * //게시글 목록 public Board[] boardList() {
 * 
 * }
 * 
 * }
 * 
 * 
 * public class BoardApp {
 * 
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * //boardList에 정의해 놓은 필드와 메소드를 활용해서 기능 BoardList board = new BoardList();
 * board.init(5);
 * 
 * while (true) { System.out.println("-----------------------------");
 * System.out.print("1.추가 2.수정 3.목록 9.종료 >>>"); int menu = sc.nextInt();
 * System.out.println("-----------------------------");
 * 
 * if(menu == 1) { System.out.print("글 번호 입력>>"); int bNo = sc.nextInt();
 * sc.nextLine(); System.out.print("제목 입력 >>"); String bTitle = sc.nextLine();
 * System.out.print("내용 입력 >>"); String bContent = sc.nextLine();
 * System.out.print("작성자 입력 >>"); String bWriter = sc.nextLine();
 * 
 * Board boards = new Board(bNo, bTitle, bContent, bWriter);
 * 
 * } else if(menu == 2) {
 * 
 * } else if(menu == 3) { Board[] boards = board.boardList(); for() } else
 * if(menu == 9) {
 * 
 * } else { System.out.println("정확한 메뉴 선택 하세"); }
 * 
 * 
 * }
 * 
 * 
 * }
 * 
 * }
 */