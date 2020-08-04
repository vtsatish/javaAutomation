package CollectionsTests;

public class RunProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashClass hc = new HashClass();
		hc.addToMap();
		hc.addToMap();
		hc.iterateMap();
		hc.removeFromMap();
		hc.removeFromMap();
		hc.addToMap();
		hc.addToMap();
		hc.iterateMap();
		
		ArrayListClass acl = new ArrayListClass();
		try {
			acl.addHumans();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acl.sortHumans();
		acl.displayHumans();
		
		LinkedClass lc = new LinkedClass();
		lc.addLinkedList();
		lc.iterateLinkedList();
		lc.removeLinkedList();
		lc.addLinkedList();
		lc.addLinkedList();
		lc.iterateLinkedList();

	}

}
