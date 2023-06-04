
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Load {
	static int error_load =0;
	public Pokemon[] load() {
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		Pokemon[] temp = null;
		try {
			in = new FileInputStream("src/saveFile/save1.txt");
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			temp = (Pokemon[])oin.readObject();
			System.out.println("불러오기 성공!!");
		} catch (FileNotFoundException e) {
			System.out.println("저장된 파일이 없습니다.");
			error_load=1;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
			} catch (IOException e) {
				
			} catch (NullPointerException e) {
				
			}
		}
		return temp;
		
	}
	
	public void load_badge() {
		InputStream in = null;
		int temp = 0;
		try {
			in = new FileInputStream("src/saveFile/save2.txt");
			temp = in.read();
		} catch (FileNotFoundException e) {
			error_load=1;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch(java.lang.NullPointerException e){
				
			}
		}
		View.badge = temp;
	}
}
