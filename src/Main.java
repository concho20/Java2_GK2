
public class Main {

	public static void main(String[] args) {
		View v = new View();
		v.setVisible(true);
	
		AddTable n = new AddTable();
		n.AddTable_BangLuong(v);
		n.AddTable_MucLuong(v);
	}
}
