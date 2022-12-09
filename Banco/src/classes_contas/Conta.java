package classes_contas;


public  class Conta implements Serviços {

	// Atributos Banco 
	
	protected String nomeBanco = "Santander";
	protected int numeroBanco = 035;
	protected String cnpj = "032.025.0001-27";
	protected String endereço = "RUA IMPERATRIZ";
	protected String cidade = "SANTA LUZIA / MG";

	// Atributos cliente

	String nomeCliente;
	String tipoConta;
	int numeroConta = 0000;
	Boolean statusConta;
	String dataAbertura;
	String dataFechamento;
	Double saldoConta;
	int operacao;

	// set e gets

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Boolean getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(Boolean statusConta) {
		this.statusConta = statusConta;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(String dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(Double saldoConta) {
		this.saldoConta = saldoConta;
	}

	@Override
	public String toString() {
		return "Conta [nomeBanco=" + nomeBanco + ", numeroBanco=" + numeroBanco + ", cnpj=" + cnpj + ", endereço="
				+ endereço + ", cidade=" + cidade + "\n nomeCliente=" + nomeCliente + ", tipoConta=" + tipoConta
				+ ", numeroConta=" + numeroConta + ", statusConta=" + statusConta + ", dataAbertura=" + dataAbertura
				+ ", dataFechamento=" + dataFechamento + ", saldoConta=" + saldoConta + "]\n============================================";
	}

	// Metodos

	public void contrutor() {
		setStatusConta(false);
		setSaldoConta(0.0);

	}

	public void Cadastro() {

		setNomeCliente("");
		setDataAbertura("");

	}

	public void abriConta() {

		if (statusConta == true & tipoConta == "cc") {

			numeroConta += 1;
			Cadastro();
			setSaldoConta(150.00);

		} else if (tipoConta == "cp") {

			numeroConta += 0001;
			Cadastro();
			setSaldoConta(50.00);
		} else {

			System.out.println("Favor Abrir conta");
		}

	}


	public void fecharConta() {

		if (statusConta == true) {

			if (saldoConta > 0) {

				System.out.println("Voce tem Saldo de: R$ " + getSaldoConta() + " Realize o saque?");

			} else if (saldoConta < 0) {

				System.out.println("Você possui débito favor regularizar.");
			} else {

				setStatusConta(false);
				setNomeCliente(null);
				setNumeroConta(-1);		
				System.out.println("Conta Encerrada com sucesso");
		

			}

		} else {
			System.out.println("Conta Não Existente! Abra a conta");
		}

	}

	@Override
	public void Sacar() {
		
		if(this.getStatusConta()== true & this.getSaldoConta()>0) {
			
			saldoConta-=operacao;
			
			System.out.println("Saque de"+ getOperacao() + "Realizado com sucesso!");
			
		}else {System.out.println("Operaçao nao realizada");}
		
	}

	@Override
	public void Depositar() {
		
		if(this.getStatusConta()==true) {
			
		
			saldoConta+=operacao;
			System.out.println("Deposito realizado com sucesso");
			
			
		}else {}
		
		
	}

	@Override
	public void VerSaldo() {
		
		System.out.println("Saldo : " + getSaldoConta());
		
	}



}
