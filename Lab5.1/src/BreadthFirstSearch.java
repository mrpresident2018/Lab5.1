import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch 
{
	Node sn;
	Node gn;
	
	public BreadthFirstSearch (Node start, Node goalNode)
	{
		this.sn = start;
		this.gn = goalNode;
	}
	
	public boolean compute()
	{
		if (this.sn.equals (this.gn))
		{
			System.out.println ("Goal Node found!");
			System.out.println(this.sn);
		}
		
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Node> explored = new ArrayList<>();
		queue.add(this.sn);
		explored.add(sn);
		
		while(!queue.isEmpty())
		{
			Node current = queue.remove();
			if (current.equals(this.gn)) 
			{
				System.out.println(explored);
				return true;
			}
			else
			{
				if (current.getChildren().isEmpty())
				{
					return false;
				}
				else 
				{
					queue.addAll(current.getChildren());
				}
			}
			explored.add(current);
		}
		return false;
	}
}
