package pck_view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import pck_control.PacienteControl;

public class PacienteView extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	JLabel		jl_texto;
	JTextField	jt_texto;
	JButton		jb_inserir;
	
	PacienteControl oPacienteControl = new PacienteControl();
	
	public PacienteView()
	{
		setTitle("Exemplo MVC + DAO Simplificado");
		setBounds(100, 100, 430, 300);
		
		jl_texto = new JLabel("Nome:");
		jl_texto.setBounds(20,20,100,20);
		
		jt_texto = new JTextField("");
		jt_texto.setBounds(130,20,100,20);
		
		jb_inserir = new JButton("Inserir");
		jb_inserir.setBounds(20,80,100,20);
		
		getContentPane().setLayout(null);
		getContentPane().add(jl_texto);
		getContentPane().add(jt_texto);
		getContentPane().add(jb_inserir);
		
		jb_inserir.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == jb_inserir)
			oPacienteControl.inserirPaciente(jt_texto.getText());
	}
	
	public static void main (String[] args)
	{
		PacienteView obj_interface = new PacienteView();
		obj_interface.setVisible(true);
	}
	
}
