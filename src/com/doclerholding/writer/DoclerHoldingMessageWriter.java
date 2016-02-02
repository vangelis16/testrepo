package com.doclerholding.writer;

import java.io.BufferedWriter;

public class DoclerHoldingMessageWriter {
	
	private BufferedWriter writer;
	private int mode;
	

	public static final int DOCLERHOLDING_CONSOLE_MODE = 1;
	public static final int DOCLERHOLDING_LOGFILE_MODE = 2;
	
	public DoclerHoldingMessageWriter(BufferedWriter writer, int mode) {
		this.writer = writer;
		this.mode = mode;
	}
	
	public void writeMessage(String message) throws Exception {
		if (mode == DOCLERHOLDING_LOGFILE_MODE) {
			writer.write(message + "\n");
			if (message.indexOf("LIFELOGGER") != -1) {
			}	
		} else {
			System.out.println(message);
		}
			
	}

}