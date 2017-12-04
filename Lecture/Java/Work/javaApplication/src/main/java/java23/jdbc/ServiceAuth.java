package java23.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceAuth implements IAuth {

	private java.sql.Connection conn = null;

	public ServiceAuth() {
		super();
		this.conn = DBConnect.makeConnection();
		// hisql에서 접속할때 열기를 누르는거를 코드화한거
		// DB연결
	}

	@Override
	public int getCount(ModelAuth auth) throws SQLException {

		int rs = -1;

		try {

			// 트랜잭션 시작
			this.conn.setAutoCommit(false);

			// DAO의 SQL 메서드 실행
			DaoAuth dao = new DaoAuth(conn); // DB에 연결된 정보를 Dao에 넘겨줌
			rs = dao.getCount(auth);

			// 트랜잭션 커밋
			this.conn.commit();

		} catch (SQLException e) {

			e.printStackTrace();

			// 트랜잭션 롤백
			this.conn.rollback();

		}

		return rs;
	}

	@Override
	public int getMaxAuthid() throws SQLException {

		int rs = -1;

		try {

			// 트랜잭션 시작
			this.conn.setAutoCommit(false);

			// DAO의 SQL 메서드 실행
			DaoAuth dao = new DaoAuth(conn); // DB에 연결된 정보를 Dao에 넘겨줌
			rs = dao.getMaxAuthid();

			// 트랜잭션 커밋
			this.conn.commit();

		} catch (SQLException e) {

			e.printStackTrace();

			// 트랜잭션 롤백
			this.conn.rollback();

		}

		return rs;
	}

	@Override
	public ResultSet selectAll() throws SQLException {

		ResultSet rs = null;

		try {

			// 트랜잭션 시작
			this.conn.setAutoCommit(false);

			// DAO의 SQL 메서드 실행
			DaoAuth dao = new DaoAuth(conn); // DB에 연결된 정보를 Dao에 넘겨줌
			rs = dao.selectAll();

			// 트랜잭션 커밋
			this.conn.commit();

		} catch (SQLException e) {

			e.printStackTrace();

			// 트랜잭션 롤백
			this.conn.rollback();

		}

		return rs;
	}

	@Override
	public ResultSet selectLike(ModelAuth auth) throws SQLException {

		ResultSet rs = null;

		try {

			// 트랜잭션 시작
			this.conn.setAutoCommit(false);

			// DAO의 SQL 메서드 실행
			DaoAuth dao = new DaoAuth(conn); // DB에 연결된 정보를 Dao에 넘겨줌
			rs = dao.selectLike(auth);

			// 트랜잭션 커밋
			conn.commit();

		} catch (SQLException e) {

			e.printStackTrace();

			// 트랜잭션 롤백
			conn.rollback();

		}

		return rs;
	}

	@Override
	public ResultSet selectEqual(ModelAuth auth) throws SQLException {

		ResultSet rs = null;

		try {

			// 트랜잭션 시작
			conn.setAutoCommit(false);

			// DAO의 SQL 메서드 실행
			DaoAuth dao = new DaoAuth(conn); // DB에 연결된 정보를 Dao에 넘겨줌
			rs = dao.selectEqual(auth);

			// 트랜잭션 커밋
			conn.commit();

		} catch (SQLException e) {

			e.printStackTrace();

			// 트랜잭션 롤백
			conn.rollback();

		}

		return rs;
	}

	@Override
	public ResultSet selectDynamic(ModelAuth auth) throws SQLException {

		// 트랜잭션 시작

		// DAO의 SQL 메서드 실행

		// 트랜잭션 커밋

		// 트랜잭션 롤백

		return null;
	}

	@Override
	public int insertauth(ModelAuth auth) throws SQLException {

		int rs = -1;

		try {

			// 트랜잭션 시작
			conn.setAutoCommit(false);

			// DAO의 SQL 메서드 실행
			DaoAuth dao = new DaoAuth(conn);
			rs = dao.insertauth(auth);

			// 트랜잭션 커밋
			conn.commit();

		} catch (SQLException e) {

			e.printStackTrace();

			// 트랜잭션 롤백
			conn.rollback();

		}

		return rs;
	}

	@Override
	public int updateauth(ModelAuth whereauth, ModelAuth setauth) throws SQLException {

		int rs = -1;

		try {
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			// DAO의 SQL 메서드 실행
			DaoAuth dao = new DaoAuth(conn);
			rs = dao.updateauth(whereauth, setauth);

			// 트랜잭션 커밋
			conn.commit();

		} catch (SQLException e) {

			e.printStackTrace();

			// 트랜잭션 롤백
			conn.rollback();

		}

		return rs;
	}

	@Override
	public int deleteauth(ModelAuth auth) throws SQLException {

		int rs = -1;

		try {

			// 트랜잭션 시작
			conn.setAutoCommit(false);

			// DAO의 SQL 메서드 실행
			DaoAuth dao = new DaoAuth(conn);
			rs = dao.deleteauth(auth);

			// 트랜잭션 커밋
			conn.commit();

		} catch (SQLException e) {

			e.printStackTrace();

			// 트랜잭션 롤백
			conn.rollback();

		}

		return rs;
	}
}
