package week3.Assignment;

public class Desktop implements HardWare,SoftWare {
	
	public void desktopModel()
	{
		System.out.println("DesktopModel");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desk=new Desktop();
		desk.desktopModel();
		desk.hardwareResources();
		desk.softwareResources();
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware Resource method  from HardWare Interface");
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("softwareResources method  from SoftWare Interface");
	}


	
}
