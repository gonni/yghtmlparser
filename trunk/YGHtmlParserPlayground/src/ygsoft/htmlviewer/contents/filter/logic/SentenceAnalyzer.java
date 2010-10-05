package ygsoft.htmlviewer.contents.filter.logic;

import java.util.ArrayList;
import java.util.List;

public class SentenceAnalyzer {
	
	public static List<String> getSeparatedSentence(String paragraph){
		ArrayList<String> lstSent = new ArrayList<String>();
		String[] split = paragraph.split("\n|\\D\\.\\D|\r");
		for(String s : split){
			s = s.trim();
			if(s.length() > 1){
				lstSent.add(s);
			}
		}
		return lstSent;
	}
	
	
	public static void main(String ... v){
		//..
		List<String> ss = getSeparatedSentence("�̰��� �����ΰ�\n���Ŀ��� ����� ������ ���� �ִ� �������� �������� 2.5�� L4 ������ ��������� ��ȭ�� ����� ���� ������ �� �پ ���� ������ �����Ѵ�... ������ 3210����~3690�����̴�.");
		for(String str : ss){
			System.out.println("--->" + str);
		}
	}
}
