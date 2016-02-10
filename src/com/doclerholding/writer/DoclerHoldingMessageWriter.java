package com.doclerholding.writer;

import java.io.BufferedWriter;

public class DoclerHoldingMessageWriter {
	
	private BufferedWriter writer;
	private int mode;
	

	public static final int DOCLERHOLDING_CONSOLE_MODE = 1;
	
	public DoclerHoldingMessageWriter(BufferedWriter writer, int mode) {
		this.writer = writer;
		this.mode = mode;
	}
	
	public void writeMessage(String message) throws Exception {
		if (message.indexOf("DOCLERHOLDING") != -1) {
		System.out.println(message);
		}
			
	}

}
