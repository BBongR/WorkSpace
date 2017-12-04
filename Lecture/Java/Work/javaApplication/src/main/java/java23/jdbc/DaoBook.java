package java23.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoBook implements IBook {

	private java.sql.Connection conn = null;

	// 생성자
	public DaoBook(Connection conn) {
		super();
		this.conn = conn;
	}

	// Select count(*) from book; 을 실행하기 위한 메소드.
	@Override
	public int getCount(ModelBook book) throws /* java.sql. */SQLException {

		int result = -1;
		// SQL 문장
		String query = "SELECT count(*) as total from book where 1 = 1";
		try {
			// 문장 객체 생성
			/* java.sql. */PreparedStatement stmt = conn.prepareStatement(query);
			// SQL 문장 실행
			/* java.sql. */ResultSet rs = stmt.executeQuery(); // SQL문장을 실행하고 결과로 ResultSet을 반환한다.

			rs.next(); // 커서이동 ResultSet 에서 첫번째로 row로 이동.
			result = rs.getInt("total"); // total 컬럼의 값을 가져온다. rs.getInt(0);
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

	@Override
	public int getMaxBookid() throws /* java.sql. */SQLException {
		int result = -1;
		// SQL 문장
		String query = "select max(bookid) maxid from book";
		try {
			// 문장 객체 생성
			/* java.sql. */PreparedStatement stmt = conn.prepareStatement(query);
			// SQL 문장 실행
			/* java.sql. */ResultSet rs = stmt.executeQuery(); // SQL문장을 실행하고 결과로 ResultSet을 반환한다.

			rs.next(); // 커서이동 ResultSet 에서 첫번째로 row로 이동.
			result = rs.getInt("maxid"); // maxid 컬럼의 값을 가져온다. rs.getInt(0);
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ResultSet selectAll() throws SQLException {
		ResultSet rs = null;
		// SQL 문장 실행
		String query = "SELECT * FROM book ORDER BY bookid ASC ";
		try {
			// 문장 객체 생성
			PreparedStatement stmt = conn.prepareStatement(query);
			// SQL 문장 실행
			rs = stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet selectLike(ModelBook book) throws SQLException {
		java.sql.ResultSet rs = null;

		// SQL 문장 생성
		String query = " SELECT * FROM book where bookname like ? ";

		try {
			// 문장 객체 생성
			java.sql.PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, "%" + book.getBookname() + "%");

			// 문장 객체 실행
			rs = stmt.executeQuery();

		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet selectEqual(ModelBook book) throws SQLException {

		java.sql.ResultSet rs = null;

		// SQL 문장 생성
		String query = " SELECT * FROM book where bookname = ? ";
		try {

			// 문장 객체 생성
			java.sql.PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, book.getBookname());
			// 문장 객체 실행
			rs = stmt.executeQuery();
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}

		return rs;
	}

	@Override
	public ResultSet selectDynamic(ModelBook book) throws SQLException {
		java.sql.ResultSet result = null;

		try {

			// query 작성
			String query  = " select * from book \n";
	               query += " where 1 = 1 \n";

			if (book.getBookid() != null) 		query += " and bookid = ? \n";
			if (!book.getBookname().isEmpty()) 	query += " and bookname = ? \n";

			// 문장 객체 생성
			java.sql.PreparedStatement stmt = conn.prepareStatement(query);

			int c = 1;
			
			if (book.getBookid() != null)      stmt.setInt   (c++, book.getBookid());
			if (!book.getBookname().isEmpty()) stmt.setString(c++, book.getBookname());
			
			// query 실행
			result = stmt.executeQuery();
			
		} catch (java.sql.SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return result;
	}

	@Override
	public int insertBook(ModelBook book) throws SQLException {
		int rs = 0;
		try {
			String query = " INSERT INTO ";
			query += " BOOK( BOOKNAME, PUBLISHER, YEAR, PRICE, DTM, USE_YN, AUTHID) ";
			query += " VALUES( ?, ?, ?, ?, ?, ?, ? ) ";
			java.sql.PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, book.getBookname());
			stmt.setString(2, book.getPublisher());
			stmt.setString(3, book.getYear());
			stmt.setInt(4, book.getPrice());
			stmt.setDate(5, (java.sql.Date) book.getDtm());
			stmt.setBoolean(6, book.getUse_yn());
			stmt.setInt(7, book.getAuthid());
			rs = stmt.executeUpdate();
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public int updateBook(ModelBook wherebook, ModelBook setbook) throws SQLException {
		int rs = 0;
		try {
			// SQL 문장 생성
			String query = " UPDATE book                   \n";
			query += "   SET year     = ?, price = ? \n";
			query += " WHERE bookname = ?            \n";

			// 문장 객체 생성
			java.sql.PreparedStatement stmt = conn.prepareStatement(query);

			// ? 자리에 값 넣기
			stmt.setString(1, setbook.getYear());
			stmt.setInt(2, setbook.getPrice());
			stmt.setString(3, wherebook.getBookname());
			// 문장 객체 실행
			rs = stmt.executeUpdate();
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		return rs;

	}

	@Override
	public int deleteBook(ModelBook book) throws SQLException {
		int rs = 0;
		try {
			// SQL 문장 생성
			String query = " delete from book where bookname = ? ";
			// 문장 객체 생성
			java.sql.PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, book.getBookname());
			// 문장 객체 실행
			rs = stmt.executeUpdate();
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

}
