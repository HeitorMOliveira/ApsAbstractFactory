package Tela;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import apsAbstractFactory.FabricaWindows;

class TelaProjetoTest {

	@Test
	void test() {
		TelaProjeto T = new TelaProjeto();
		T.setFabrica(new FabricaWindows());
		T.Montar();
		assertEquals("JanelaWindows { MenuWindows, BotaoWindows }", T.Desenhar());
		
	}

}
