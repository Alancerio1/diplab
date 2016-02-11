/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author alancerio18
 */
public class MessageService {
    private MessageReader reader;
    private MessageWriter writer;

    public MessageService(MessageReader reader, MessageWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    public void sendMsg(){
    String line = reader.readln();
    writer.writeln(line);
    }
    
    public void readln(){
        reader.readln();
    }
    
    public void writeln(String string){
        writer.writeln(string);
    }
    
    
    
    public MessageReader getReader() {
        return reader;
    }

    public void setReader(MessageReader reader) {
        this.reader = reader;
    }

    public MessageWriter getWriter() {
        return writer;
    }

    public void setWriter(MessageWriter writer) {
        this.writer = writer;
    }
    
    
}
