package 열혈JAVA;
import javax.swing.JOptionPane;
interface IGrade {
	String GetGrade();
}
public class StudentMission {
	public static void main(String[] args) {
	
		String kor = JOptionPane.showInputDialog("국어 점수를 입력하세요.");
		String eng = JOptionPane.showInputDialog("영어 점수를 입력하세요.");
		String math = JOptionPane.showInputDialog("수학 점수를 입력하세요.");
		
		Score se = new Score(Integer.valueOf(kor), Integer.valueOf(eng), Integer.valueOf(math));
																	//Integer는 문자열을 인트로 변환해주는 것.
		String score = se.GetGrade();
		JOptionPane.showMessageDialog(null, "당신의 성적은 " + score + " 입니다.", "Message", JOptionPane.DEFAULT_OPTION);
	}
}
class Score implements IGrade{
		
	private int kor;
	private int eng;
	private int math;
	
	public Score (int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public String GetGrade() {
		double sum = kor + eng + math;
		double avg = sum / 3;
		
		if(avg >= 90) {
		return "수";
		}else if(avg >= 80) {
		return "우";
		}else if(avg >= 70) {
		return "미";
		}else if(avg >= 60) {
		return "양";
		}else {
		return "가";
		}
	}
}


/*
1) 학생 객체에 국어 수학 영어 점수를 갖고, 성적을 표시하는 프로그램이다.
2) 아래의 인터페이스를 상속하도록 하시오
interface IGrade {
	String getGrade();
}
3) Test 객체를 생성후 main 함수에서 사용자 입력을
JOptionPane 으로 국영수를 입력받아, 수우미양가를 
출력하는 프로그램을 장창현씨에게 검사를 받으시오.
*/

