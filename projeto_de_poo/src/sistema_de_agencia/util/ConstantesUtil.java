package sistema_de_agencia.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConstantesUtil {

	public final static String SISTEMA_DE_AGENCIA_DATABASE_PATH;
	public final static String SISTEMA_DE_AGENCIA_DATABASE_PORT;
	public final static String SISTEMA_DE_AGENCIA_DATABASE_NAME;

	private static Properties prop = new Properties();
	private static FileInputStream fis;

	static {

		try {
			fis = new FileInputStream("propriedades");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SISTEMA_DE_AGENCIA_DATABASE_PATH = prop.getProperty("sistema_de_agencia_path");
		SISTEMA_DE_AGENCIA_DATABASE_PORT = prop.getProperty("sistema_de_agencia_port");
		SISTEMA_DE_AGENCIA_DATABASE_NAME = prop.getProperty("sistema_de_agencia_database_name");
	}

	public static boolean contemChave(String key) {
		return prop.containsKey(key);
	}

}
