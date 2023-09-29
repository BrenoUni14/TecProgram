package pck_control;

//Incluir a classe Model para que o objeto oPacienteModel possa ser criado 
import pck_model.PacienteModel;

public class PacienteControl {

	PacienteModel oPacienteModel = new PacienteModel();
	
	//M�todo de Inser��o
	public void inserirPaciente (String sNome) 
	{
		oPacienteModel.setA01_nome(sNome);
	}
	
	//M�todo de Atualiza��o
	public void atualizarPaciente(int iCodigo_01, String sNome)
	{
		oPacienteModel.setA01_codigo(iCodigo_01);
		oPacienteModel.setA01_nome(sNome);
		
	}
	
	//M�todo de Exclus�o
	public void excluirPaciente(int iCodigo_01)
	{
		oPacienteModel.setA01_codigo(iCodigo_01);
	}
	
	
	
	
	
	
}

