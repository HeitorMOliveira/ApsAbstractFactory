package Tela;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import apsAbstractFactory.FabricaAndroid;
import apsAbstractFactory.FabricaWindows;

class TelaProjetoTest {

	@Test
	void test() {
		TelaProjeto T = new TelaProjeto();
		T.setFabrica(new FabricaWindows());
		T.montar();
		assertEquals("JanelaWindows { MenuWindows, BotaoWindows }", T.desenhar());
		
	}

	@Test
	void test2() {
		TelaProjeto T = new TelaProjeto();
		T.setFabrica(new FabricaAndroid());
		T.montar();
		assertEquals("JanelaAndroid { MenuAndroid, BotaoAndroid }", T.desenhar());
	}
}
