
import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

	public static void main(String[] args) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		System.out.println("Sua tela tem resolu��o " + d.width + " " +d.height);
		
		
	}

}
