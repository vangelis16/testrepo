package com.doclerholding.writer;

public class DoclerHoldingMessageWriter {
	
	private int mode;
	

	public static final int DOCLERHOLDING_CONSOLE_MODE = 1;
	
	public DoclerHoldingMessageWriter(int mode) {
		this.mode = mode;
	}
	
	public void writeMessage(String message) throws Exception {
		if (message.indexOf("DOCLERHOLDING") != -1) {
		System.out.println(message);
		}
			
	}

}
