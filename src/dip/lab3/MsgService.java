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
public class MsgService {
    private Reader reader;
    private Writer writer;

    public MsgService(Reader reader, Writer writer) {
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
    
    
    
    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
    
    
}
