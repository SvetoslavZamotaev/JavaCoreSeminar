package server.server;

public interface Logger {

    String readFromData();

    void appendData(String string);

     String getHistory();

    void saveInLog(String text);




}
