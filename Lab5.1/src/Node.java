import java.lang.reflect.Array;
import java.util.ArrayList;

public class Node 
{
	public String stationName;
	Node lc;
	Node rc;
	
	public Node (String stationName, Node fc, Node sc)
	{
		this.stationName = stationName;
		this.lc = fc;
		this.rc = sc;
	}
	public ArrayList<node> getChildren()
	{
		ArrayList<javax.xml.soap.Node> childNodes = new ArrayList<>();
		if (this.lc != null)
		{
			childNodes.add(rc);
		}
		if (this.rc != null)
		{
			childNodes.add(rc);
		}
		return childNodes;
	}
	
	public boolean removeChild (Node n)
	{
		return false;
	}
}
