package net.ourams.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.ourams.vo.PostVo;


@Repository
public class PostDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	/* 글전체리스트 가져오기 기본*/
	public List<PostVo> selectAll(int courseNo){
		List<PostVo> list = sqlSession.selectList("notice.selectAll",courseNo);
		System.out.println(list.toString());
		
		return list;
	}

	
	/* no로 글가져오기 */
	public PostVo selectNotice(int postNo) {
		return sqlSession.selectOne("notice.selectNotice", postNo);
	}
	
	/* 글저장 */
	public int insert(PostVo postVo) {
		return sqlSession.insert("notice.insert",postVo);
	}
	
	/* 글 삭제 */
	public int delete(PostVo postVo) {
		return sqlSession.delete("notice.delete", postVo);
	}

	public int update(PostVo postVo) {
		return sqlSession.update("notice.update", postVo);
	}


	public int updateHit(int postNo) {
		return sqlSession.update("notice.updateHit", postNo);
	}


	
}
