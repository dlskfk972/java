
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileTest3 {

	public static void main(String[] args) throws IOException {
		//1.파일 객체
		//2.파일에 write
		String day=JOptionPane.showInputDialog("일기작성날짜");
		String title=JOptionPane.showInputDialog("일기제목");
		String content=JOptionPane.showInputDialog("일기내용");
		String etc=JOptionPane.showInputDialog("기타 입력");
		
		FileWriter file = new FileWriter("c:temp2/t2/"+day+".txt");
		
		file.write(day+"\r\n");
		file.write(title+"\r\n");
		file.write(content+"\r\n");
		file.write(etc+"\r\n");
		
		file.close();
		
	}
	

}
