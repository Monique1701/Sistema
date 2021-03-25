package sistema_de_agencia;



import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import sistema_de_agencia.util.ConstantesUtil;
import sistema_de_agencia_bancaria.gui.TelaPrincipal;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		JOptionPane.showMessageDialog(null, "DB Path:  "+ConstantesUtil.SISTEMA_DE_AGENCIA_DATABASE_PATH+":"+ConstantesUtil.SISTEMA_DE_AGENCIA_DATABASE_PORT+"/"+ConstantesUtil.SISTEMA_DE_AGENCIA_DATABASE_NAME);
		System.out.println(ConstantesUtil.contemChave("teste"));
		System.out.println(ConstantesUtil.contemChave("sistema_de_agencia_path"));
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new TelaPrincipal();
			}
		});
		
		
	}

}
