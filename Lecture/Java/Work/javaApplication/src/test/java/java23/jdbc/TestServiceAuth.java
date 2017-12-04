package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestServiceAuth {

	private static ServiceAuth svr = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		svr = new ServiceAuth();

	}

	@Test
	public void testGetCount() throws SQLException {

		ModelAuth auth = null;
		int rscount = svr.getCount(auth);

		assertEquals(3, rscount);

	}

	@Test
	public void testGetMaxauthid() throws SQLException {

		int rs = svr.getMaxAuthid();
		assertEquals(7, rs);

	}

	@Test
	public void testSelectAll() throws SQLException {

		ResultSet rs = svr.selectAll();

		// 인스턴스 검증
		assertNotNull(rs);

		// 1.갯수로 검증
		ModelAuth auth = null;
		int count = svr.getCount(auth); // rscount == 3

		// ResultSet의 갯수 가져오기
		rs.last(); // 마지막 row로 커서를 이동하시오
		int countset = rs.getRow(); // 현재 커서의 index 값을 가져오기

		assertEquals(count, countset);

		// 2. row 값으로 검증
		rs.first(); // 커서를 첫번쨰 row로 이동
		int authid = rs.getInt("authid");
		assertEquals(1, authid);

	}

	@Test
	public void testSelectLike() throws SQLException {

		ModelAuth auth = new ModelAuth();
		auth.setName("bo");

		ResultSet rs = svr.selectLike(auth);

		assertNotNull(rs);

		rs.next();
		String name = rs.getString("name");
		// assertTrue(name.contains("bo"));
		assertTrue(name.contains(auth.getName()));
	}

	@Test
	public void testSelectEqual() throws SQLException {

		ModelAuth auth = new ModelAuth();
		auth.setBirth("2000.05.01");

		ResultSet rs = svr.selectEqual(auth);

		assertNotNull(rs);

		rs.last();
		String birth = rs.getString("birth");
		assertTrue(birth.contains(auth.getBirth()));

	}

	@Test
	public void testSelectDynamic() {

	}

	@Test
	public void testInsertauth() throws SQLException {

		ModelAuth auth = new ModelAuth();
		auth.setAuthid(5);
		auth.setName("hong");
		auth.setBirth("2017-11-15");

		int rs = svr.insertauth(auth);

		assertEquals(1, rs);

	}

	@Test
	public void testUpdateauth() throws SQLException {

		ModelAuth whereauth = new ModelAuth();
		whereauth.setAuthid(5);

		ModelAuth setauth = new ModelAuth();
		setauth.setName("soso");
		setauth.setBirth("2017.11.15");

		int rs = svr.updateauth(whereauth, setauth);
		assertTrue(rs >= 0);

	}

	@Test
	public void testDeleteauth() throws SQLException {

		ModelAuth auth = new ModelAuth();
		auth.setAuthid(5);

		int rs = svr.deleteauth(auth);

		assertTrue(rs >= 0);

	}

}
