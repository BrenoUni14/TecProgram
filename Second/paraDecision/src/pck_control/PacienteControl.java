package pck_control;

//Incluir a classe Model para que o objeto oPacienteModel possa ser criado 
import pck_model.PacienteModel;

public class PacienteControl {

	PacienteModel oPacienteModel = new PacienteModel();
	
	//Método de Inserção
	public void inserirPaciente (String sNome) 
	{
		oPacienteModel.setA01_nome(sNome);
	}
	
	//Método de Atualização
	public void atualizarPaciente(int iCodigo_01, String sNome)
	{
		oPacienteModel.setA01_codigo(iCodigo_01);
		oPacienteModel.setA01_nome(sNome);
		
	}
	
	//Método de Exclusão
	public void excluirPaciente(int iCodigo_01)
	{
		oPacienteModel.setA01_codigo(iCodigo_01);
	}
	
	
	
	
	
	
}

