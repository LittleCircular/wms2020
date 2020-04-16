package p1.myschool.dao;

import p1.myschool.entity.Student;

public interface StudentDao {

	/**
	 * @Title: insertStudent
	 * @Description: 向student表添加数据
	 * @param @param addStu
	 * @param @return 参数
	 * @return int 返回类型
	 * @throws
	 */
	int insertStudent(Student addStu);
	
	/**
	 * @Title: updataStudent
	 * @Description: 修改student表数据
	 * @param @param sid
	 * @param @return 参数
	 * @return int 返回类型
	 * @throws
	 */
	int updataStudent(int sid);
	
	/**
	 * @Title: deleteStudent
	 * @Description: 删除student表数据
	 * @param @param sid
	 * @param @return 参数
	 * @return int 返回类型
	 * @throws
	 */
	int deleteStudent(int sid);
	
	/**
	 * @Title: queStudentAll
	 * @Description: 查询student表数据
	 * @param @param addStu
	 * @param @return 参数
	 * @return int 返回类型
	 * @throws
	 */
	int queStudentAll(Student addStu);
	
	/**
	 * @Title: queStudentOne
	 * @Description: 查询student表中某一条数据
	 * @param @param addStu
	 * @param @return 参数
	 * @return int 返回类型
	 * @throws
	 */
	int queStudentOne(Student addStu);
	
}
