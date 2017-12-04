package java23.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceBook implements IServiceBook {

	private java.sql.Connection conn = null;

	public ServiceBook() {
		super();
		this.conn = DBConnect.makeConnection();
		// hisql에서 접속할때 열기를 누르는거를 코드화한거
	}

	@Override
	public int getCount(ModelBook book) throws SQLException {
		int rs = -1;

		try {
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			DaoBook dao = new DaoBook(conn);
			rs = dao.getCount(book);

			conn.commit();// 트랜잭션 종료
		} catch (SQLException e) {

			e.printStackTrace();
			conn.rollback(); // 트랜잭션 롤백

		}
		return rs;
	}

	@Override
	public int getMaxBookid() throws SQLException {
		int rs = -1;

		try {
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			DaoBook dao = new DaoBook(conn);
			rs = dao.getMaxBookid();

			conn.commit();// 트랜잭션 종료
		} catch (SQLException e) {

			e.printStackTrace();
			conn.rollback(); // 트랜잭션 롤백

		}
		return rs;
	}

	@Override
	public ResultSet selectAll() throws SQLException {
		ResultSet rs = null;

		try {
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			DaoBook dao = new DaoBook(conn);
			rs = dao.selectAll();

			conn.commit();// 트랜잭션 종료
		} catch (SQLException e) {

			e.printStackTrace();
			conn.rollback(); // 트랜잭션 롤백

		}
		return rs;
	}

	@Override
	public ResultSet selectLike(ModelBook book) throws SQLException {
		ResultSet rs = null;

		try {
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			DaoBook dao = new DaoBook(conn);
			rs = dao.selectLike(book);

			conn.commit();// 트랜잭션 종료
		} catch (SQLException e) {

			e.printStackTrace();
			conn.rollback(); // 트랜잭션 롤백

		}
		return rs;
	}

	@Override
	public ResultSet selectEqual(ModelBook book) throws SQLException {
		ResultSet rs = null;

		try {
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			DaoBook dao = new DaoBook(conn);
			rs = dao.selectEqual(book);

			conn.commit();// 트랜잭션 종료
		} catch (SQLException e) {

			e.printStackTrace();
			conn.rollback(); // 트랜잭션 롤백

		}
		return rs;
	}

	@Override
	public ResultSet selectDynamic(ModelBook book) throws SQLException {
		ResultSet rs = null;

		try {
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			DaoBook dao = new DaoBook(conn);
			rs = dao.selectDynamic(book);

			conn.commit();// 트랜잭션 종료
		} catch (SQLException e) {

			e.printStackTrace();
			conn.rollback(); // 트랜잭션 롤백

		}
		return rs;
	}

	@Override
	public int insertBook(ModelBook book) throws SQLException {
		int rs = -1;

		try {
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			DaoBook dao = new DaoBook(conn);
			rs = dao.insertBook(book);

			conn.commit();// 트랜잭션 종료
		} catch (SQLException e) {

			e.printStackTrace();
			conn.rollback(); // 트랜잭션 롤백

		}
		return rs;
	}

	@Override
	public int updateBook(ModelBook wherebook, ModelBook setbook) throws SQLException {
		int rs = -1;

		try {
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			DaoBook dao = new DaoBook(conn);
			rs = dao.updateBook(wherebook, setbook);

			conn.commit();// 트랜잭션 종료
		} catch (SQLException e) {

			e.printStackTrace();
			conn.rollback(); // 트랜잭션 롤백

		}
		return rs;
	}

	@Override
	public int deleteBook(ModelBook book) throws SQLException {
		int rs = -1;

		try {
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			DaoBook dao = new DaoBook(conn);
			rs = dao.deleteBook(book);

			conn.commit();// 트랜잭션 종료
		} catch (SQLException e) {

			e.printStackTrace();
			conn.rollback(); // 트랜잭션 롤백

		}
		return rs;
	}

	@Override
	public int transCommit(ModelBook b1, ModelBook b2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int transRollback(ModelBook b1, ModelBook b2) {
		// TODO Auto-generated method stub
		return 0;
	}

}