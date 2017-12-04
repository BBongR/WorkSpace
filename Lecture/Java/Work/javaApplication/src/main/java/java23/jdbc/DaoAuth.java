package java23.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAuth implements IAuth {

	private java.sql.Connection conn = null;

	public DaoAuth(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public int getCount(ModelAuth auth) throws SQLException {

		int result = -1;

		try {
			// SQL 문장
			String sql = " select count(*) total from auth ";

			// 문장 객체 생성
			PreparedStatement stmt = conn.prepareStatement(sql);

			// 문장 객체 실행
			ResultSet rs = stmt.executeQuery();

			// 값을 빼내기
			rs.next(); // 커서 이동
			result = rs.getInt("total");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int getMaxAuthid() throws SQLException {

		int result = -1;

		// SQL 문장
		String sql = " select max(authid) authid from auth ";

		try {

			// 문장 객체 생성
			PreparedStatement stmt = conn.prepareStatement(sql);

			// 문장 객체 실행
			ResultSet rs = stmt.executeQuery();

			// 커서를 첫번째 row 이동
			rs.next();

			// 값을 추출
			result = rs.getInt("authid");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public ResultSet selectAll() throws SQLException {

		ResultSet rs = null;

		// sql문장
		String sql = " select * from auth ";

		try {
			// 문장 객체 생성
			PreparedStatement stmt = this.conn.prepareStatement(sql);

			// 문장 객체 실행 executeQuery() or executeUpdate()
			rs = stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rs;
	}

	@Override
	public ResultSet selectLike(ModelAuth auth) throws SQLException {

		ResultSet rs = null;

		// " select * from auth where name like '%b%' ";
		// 찾고자 하는 값은 '%b%' ---> ? 로 바꾼다.
		String sql = " select * from auth where name like ? ";

		try {

			// 문장 객체 생성
			PreparedStatement stmt = this.conn.prepareStatement(sql);

			// ? 자리에 값을 넣기
			stmt.setString(1, "%" + auth.getName() + "%");

			rs = stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public ResultSet selectEqual(ModelAuth auth) throws SQLException {
		
		ResultSet rs = null;
		
		try {
			
		String sql  = " select * from auth \n";
			   sql += " where 1 = 1 \n";
		
	    if (!auth.getName().isEmpty())      sql+= " and  name = ? \n";
        if (!auth.getBirth().isEmpty())     sql+= " and birth = ? \n";

		PreparedStatement stmt = conn.prepareStatement(sql);

		int c = 1;
			
		if(!auth.getName() .isEmpty())      stmt.setString(c++, auth.getName());
		if(!auth.getBirth().isEmpty())      stmt.setString(c++, auth.getBirth());

			rs = stmt.executeQuery();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}

		return rs;
	}

	@Override
	public ResultSet selectDynamic(ModelAuth auth) throws SQLException {

		return null;
	}

	@Override
	public int insertauth(ModelAuth auth) throws SQLException {

		int rs = -1;
		try {
			// sqp 쿼리문 작성
			// insert into auth( authid, name, birth );
			// values( 20, 'test', '2017.01.01' );
			String sql = "";
			sql += " insert into auth( authid, name, birth ) \n";
			sql += "           values( ?     , ?   , ?     ) \n";

			// 문장 객체 생성
			PreparedStatement stmt = this.conn.prepareStatement(sql);

			// ? 자리에 값 넣기
			stmt.setInt(1, auth.getAuthid());
			stmt.setString(2, auth.getName());
			stmt.setString(3, auth.getBirth());

			// 문장 객체 실행 executeQuery() or executeUpdate()
			rs = stmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}

		return rs;
	}

	@Override
	public int updateauth(ModelAuth whereauth, ModelAuth setauth) throws SQLException {

		int rs = -1;
		try {

			// UPDATE auth
			// SET name= 'baby'
			// , birth='2001.01.01'
			// WHERE 1 = 1
			// and authid='bob;

			// select * from book where 1=1; <==> select * from book;
			// select * from book where 1=1 and name = 'abc';
			// select * from book where 1=1 and birth = 1;
			// select * from book where 1=1 and name = 'abc' and birth = 1;

			// SQL 문장 생성
			String sql = " update auth          \n";
			      sql += "   set name= ?        \n";
			      sql += "    , birth= ?        \n";
			      sql += "      where 1 = 1     \n";
		          sql += "        and authid= ? \n";

			// 문장 객체 생성
			PreparedStatement stmt = conn.prepareStatement(sql);

			// ? 자리에 값 넣기
			stmt.setString(1, setauth.getName());
			stmt.setString(2, setauth.getBirth());
			stmt.setInt(3, whereauth.getAuthid());

			// 문장 객체 실행 executeQuery() or executeUpdate()
			rs = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rs;
	}

	@Override
	public int deleteauth(ModelAuth auth) throws SQLException {

		int rs = -1;

		try {
			
			// delete from auth
			// where 1 = 1
			// and name = 'kim'
			// and birth = '1980.05.01';

			// SQL 문장 생성
			String sql = " delete from auth     \n";
			       sql += "   where 1 = 1        \n";
			if( auth.getAuthid() != null)   sql += "    and authid = ?     \n";
		    if(!auth.getName().isEmpty())   sql += "    and name = ?      \n";
		    if(!auth.getBirth().isEmpty())  sql += "    and birth = ?     \n";
		          
			// 문장 객체 생성
			PreparedStatement stmt = conn.prepareStatement(sql);

			// ? 자리에 값 넣기
			
			int c = 1;
			
			if( auth.getAuthid() != null)    stmt.setInt(c++, auth.getAuthid());
			if(!auth.getName().isEmpty())    stmt.setString(c++, auth.getName());
			if(!auth.getBirth().isEmpty())   stmt.setString(c++, auth.getBirth());

			// 문장 객체 실행
			rs = stmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}

		return rs;
	}

}
