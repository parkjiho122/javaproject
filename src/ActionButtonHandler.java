
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ActionButtonHandler implements ActionListener {
	int i;
	cardButton[] btn;
	int[] arr;
	int check;
	int [] iArr;
	int score=0;
	Program program;
	
	public ActionButtonHandler(cardButton[] button,Program program) {
		// TODO Auto-generated constructor stub
		btn=button;
		arr=new int[2];
		check=0;
		iArr=new int[2];
		this.program=program;
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public cardButton[] getBtn() {
		return btn;
	}

	public void setBtn(cardButton[] btn) {
		this.btn = btn;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public int[] getiArr() {
		return iArr;
	}

	public void setiArr(int[] iArr) {
		this.iArr = iArr;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		i=Integer.parseInt(e.getActionCommand());
		iArr[check]=i;
		arr[check]=btn[i].clickButton();
		
		if(arr[check]==-1) return;
		if(check==1)
		{
			if(arr[0]!=arr[1])
			{
				btn[iArr[0]].returnImage();
				btn[iArr[1]].returnImage();
			}
			else
			{
				score++;
				if(score==5)
				{
					int result=program.showPopUp();
					if(result==JOptionPane.YES_OPTION)
					{
						score=0;
						check=0;
						program.ReturnGame().randNumber();
						for(int i=0;i<10;i++)
						{
							btn[i].ChangeImage(program.ReturnGame().GetImage(program.ReturnGame().GetArr(i))
									,program.ReturnGame().GetArr(i));
							btn[i].returnImage();
						}
					}
					else
						System.exit(0);
				}
			}
			check=0;
			return;
			
		}
		check++;

	}
}
