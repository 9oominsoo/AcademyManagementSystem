package net.ourams.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ourams.dao.CourseQnaDao;
import net.ourams.vo.PostVo;
import net.ourams.vo.SubjectVo;

@Service
public class CourseQnaService {

	@Autowired
	private CourseQnaDao courseQnaDao;
	

	public Map<String, Object> selectListPaging( int pageNo){
		int listSize = 10 ;
		int pageNo1 = 1+listSize*(pageNo-1);
		int pageNo2 = listSize*pageNo;
		int countPage = courseQnaDao.countPost();
		System.out.println("countPage"+countPage);
		int maxPage = (int)Math.ceil((double)countPage/listSize);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageNo1", pageNo1);
		map.put("pageNo2", pageNo2);
		List<PostVo> list = courseQnaDao.selectListPaging(map);
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("list", list);
		map2.put("maxPage", maxPage);
		return map2;
	}

	public List<PostVo> searchList(String postTitle){
		List<PostVo> list = courseQnaDao.searchList(postTitle);
		return list;
	}
	
	public PostVo read(int postNo) {
		courseQnaDao.updateHit(postNo);
		PostVo PostVo = courseQnaDao.selectNotice(postNo);
		return PostVo;
	}

	public int write(PostVo postVo) {
		System.out.println("#########################");
		System.out.println(postVo.toString());
		return courseQnaDao.insert(postVo);		
	}

	public List<SubjectVo> getsubjectList(int courseNo) {
		List<SubjectVo> subjectList = courseQnaDao.selectsubjectAll(courseNo);
		System.out.println("SSSSVVVICCCEE");
		System.out.println(subjectList.toString());
		return subjectList;
	}

	public int delete(PostVo postVo) {
		System.out.println(postVo.toString());
		
		int count1 = courseQnaDao.deletereply(postVo);
		System.out.println(count1);
		
		
		int count2 = courseQnaDao.delete(postVo);
		System.out.println(count2);
		return 0;
	}

	public PostVo modifyform(int postNo) {
		PostVo postVo = courseQnaDao.selectNotice(postNo);
		return postVo;
	}

	public int modify(PostVo postVo) {
		return courseQnaDao.update(postVo);
	}
	

	public int update(PostVo postVo) {
		System.out.println(postVo.toString());
		return courseQnaDao.update(postVo);
	}

	
	
}
