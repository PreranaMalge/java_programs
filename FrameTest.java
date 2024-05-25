import java.awt.*;
class FrameTest 
{
	FrameTest()
	{
		Frame t=new Frame();
		t.setSize(300,300);
		t.setVisible(true);
		t.setTitle("first window app");
	}
	public static void main(String args[])
	{
		new FrameTest();
	}
}