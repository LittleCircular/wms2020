package p1.day19;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question implements java.io.Serializable{

	private static final long serialVersionUID = -266815885864027089L;
	private List<Question> list = new ArrayList<>();
	private int mun;//题号
	private String subject;//题目
	private String option;//选项
	private String answer;//答案
	
	public Question() {
		super();
	}
	public Question(int mun, String subject, String option, String answer) {
		super();
		this.setMun(mun);
		this.setSubject(subject);
		this.setOption(option);
		this.setAnswer(answer);
	}

	public int getMun() {
		return mun;
	}
	public void setMun(int mun) {
		this.mun = mun;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public List<Question> getList() {
		return list;
	}
	public String getOptionMessage(){
		String[] str = getOption().split(",");
		return "a:" + str[0] + "\nb:" + str[1] + "\nc:" + str[2] + "\nd:" + str[3];
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode() + mun;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (mun != other.mun)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Question [mun=" + mun + ", subject=" + subject + ", option=" + option + ", answer=" + answer + "]";
	}
	
	public void updatalist(){
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream("E:/BJ_BaiLiBan/JavaSE/TeacherCodes/day19/test.txt")));
			for (; ; ) {
				String line = br.readLine();
				if (line == null) {
					break;
				}else{
					String[] str = line.split("\\$");
					Question stu = new Question(Integer.parseInt(str[0]),str[1],str[2],str[3]);
					list.add(stu);
				}
			}
			Collections.shuffle(list);//乱序
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getMessage() {
		return getSubject() + "\n" + getOptionMessage();
	}
}
