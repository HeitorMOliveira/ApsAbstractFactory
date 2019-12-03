package apsAbstractFactory;

public class FabricaAndroid implements FabricaAbstrata {

	@Override
	public Janela criarJanela() {
		return new JanelaAndroid();
	}

	@Override
	public Botao criarBotao() {
		return new BotaoAndroid();
	}

	@Override
	public Menu criarMenu() {
		return new MenuAndroid();
	}

}
