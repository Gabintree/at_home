package ����JAVA;
import javax.swing.JOptionPane;
interface IGrade {
	String GetGrade();
}
public class StudentMission {
	public static void main(String[] args) {
	
		String kor = JOptionPane.showInputDialog("���� ������ �Է��ϼ���.");
		String eng = JOptionPane.showInputDialog("���� ������ �Է��ϼ���.");
		String math = JOptionPane.showInputDialog("���� ������ �Է��ϼ���.");
		
		Score se = new Score(Integer.valueOf(kor), Integer.valueOf(eng), Integer.valueOf(math));
																	//Integer�� ���ڿ��� ��Ʈ�� ��ȯ���ִ� ��.
		String score = se.GetGrade();
		JOptionPane.showMessageDialog(null, "����� ������ " + score + " �Դϴ�.", "Message", JOptionPane.DEFAULT_OPTION);
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
		return "��";
		}else if(avg >= 80) {
		return "��";
		}else if(avg >= 70) {
		return "��";
		}else if(avg >= 60) {
		return "��";
		}else {
		return "��";
		}
	}
}


/*
1) �л� ��ü�� ���� ���� ���� ������ ����, ������ ǥ���ϴ� ���α׷��̴�.
2) �Ʒ��� �������̽��� ����ϵ��� �Ͻÿ�
interface IGrade {
	String getGrade();
}
3) Test ��ü�� ������ main �Լ����� ����� �Է���
JOptionPane ���� �������� �Է¹޾�, ����̾簡�� 
����ϴ� ���α׷��� ��â�������� �˻縦 �����ÿ�.
*/

