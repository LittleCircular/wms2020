package p1.myschool.dao;

import p1.myschool.entity.Student;

public interface StudentDao {

	/**
	 * @Title: insertStudent
	 * @Description: ��student���������
	 * @param @param addStu
	 * @param @return ����
	 * @return int ��������
	 * @throws
	 */
	int insertStudent(Student addStu);
	
	/**
	 * @Title: updataStudent
	 * @Description: �޸�student������
	 * @param @param sid
	 * @param @return ����
	 * @return int ��������
	 * @throws
	 */
	int updataStudent(int sid);
	
	/**
	 * @Title: deleteStudent
	 * @Description: ɾ��student������
	 * @param @param sid
	 * @param @return ����
	 * @return int ��������
	 * @throws
	 */
	int deleteStudent(int sid);
	
	/**
	 * @Title: queStudentAll
	 * @Description: ��ѯstudent������
	 * @param @param addStu
	 * @param @return ����
	 * @return int ��������
	 * @throws
	 */
	int queStudentAll(Student addStu);
	
	/**
	 * @Title: queStudentOne
	 * @Description: ��ѯstudent����ĳһ������
	 * @param @param addStu
	 * @param @return ����
	 * @return int ��������
	 * @throws
	 */
	int queStudentOne(Student addStu);
	
}
