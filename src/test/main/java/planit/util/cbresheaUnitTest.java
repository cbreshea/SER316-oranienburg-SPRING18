package test.main.java.planit.util;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.memoranda.ui.AgendaPanel;

public class cbresheaUnitTest {
	AgendaPanel panelTest = new AgendaPanel(null);

	@Test
	public void test() throws Exception {
		panelTest.jbInit();
		System.out.println("Program has gone through the agenda panel");
	}

}
