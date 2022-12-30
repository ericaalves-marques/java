import java.util.Date;
import java.util.Locale;

public class IdiomaSistema {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		String idioma = loc.getDisplayLanguage();
		System.out.println("Seu sistema está em " + idioma);

	}

}
