package fcu.iecs.oop.tiida;

public class NissanTiida 
{
	int times=0;
	public void tiida()
	{
		int i,j;
		for(i=0;i<times;i++)
		{
			for(j=0;j<times;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
