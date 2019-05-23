package com.ocr.edward.HomeShop;

public interface Writer {
    /**
     * Start writing process
     */
    public void start();

    /**
     * Write on line
     */
    public void writeLine(String line);

    /**
     * Stop writing the process
     */
    public void stop();
}
