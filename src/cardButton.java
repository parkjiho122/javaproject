

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class cardButton extends JButton {
	int num;
	ImageIcon image1,image2;
	boolean check;
	public cardButton(String str,int n,ImageIcon image,ImageIcon back) {
		// TODO Auto-generated constructor stub
		super(str,back);
		image1=image;
		image2=back;
		num=n;
		check=true;
	}
	public int clickButton() {
		if(check)
		{
			setIcon(image1);
			check=false;
			return num;
		}
		return -1;
	}
	public void  returnImage() {
		setIcon(image2);
		check=true;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public ImageIcon getImage1() {
		return image1;
	}
	public void setImage1(ImageIcon image1) {
		this.image1 = image1;
	}
	public ImageIcon getImage2() {
		return image2;
	}
	public void setImage2(ImageIcon image2) {
		this.image2 = image2;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public void ChangeImage(ImageIcon image,int n) {
		image1=image;
		num=n;
	}
}
