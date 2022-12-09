package banco_exe;

import classes_contas.Conta;

public class Banco_exe {

	public static void main(String[] args) {

		Conta conta = new Conta();

		conta.contrutor();

		conta.setStatusConta(true);
		conta.setTipoConta("cp");

		conta.abriConta();

		conta.setNomeCliente("wellington");
		conta.setDataAbertura("21/07/1980");
		System.out.println(conta);

		conta.setOperacao(50);
		conta.Depositar();
		System.out.println(conta);

		conta.setOperacao(10);
		conta.Sacar();
		System.out.println(conta);

		conta.fecharConta();

		System.out.println(conta);

	}

}