
import java.util.Random;

import javax.swing.ImageIcon;

public class GameReset {
	public ImageIcon[] getImage() {
		return image;
	}
	public void setImage(ImageIcon[] image) {
		this.image = image;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	ImageIcon[] image;
	int [] arr;
	public GameReset() {
		// TODO Auto-generated constructor stub
		image=new ImageIcon[6];
		arr=new int[10];
	}
	public void imageFunction() {
		image[0]=new ImageIcon("images/01.png");
		image[1]=new ImageIcon("images/02.png");
		image[2]=new ImageIcon("images/03.png");
		image[3]=new ImageIcon("images/04.png");
		image[4]=new ImageIcon("images/05.png");
		image[5]=new ImageIcon("images/06.png");
	}
	public void randNumber()
	{
		int check=0;
		Random rand=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=rand.nextInt(5)+1;
			for(int x=0;x<i;x++)
			{
				if(arr[i]==arr[x])
					check++;
			}
			if(check==2)
			{
				check=0;
				i--;
				continue;
			}
			
			check=0;
		}
	}
	public int GetArr(int i) {
		return arr[i];
	}
	public ImageIcon GetImage(int i) {
		return image[i];
	}
}