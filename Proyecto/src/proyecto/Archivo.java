package proyecto;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {

    private File file = null;
    private String fileName;
    private boolean saved;
    private boolean opened;
    boolean first;
    private DatosRegistros data = new DatosRegistros();
    
    LinkedList avaiList = new LinkedList();
    ArrayList<Integer> auxiliaryList = new ArrayList();

    public Archivo() {
    }

    public Archivo(String path, String fileName) {
        file = new File(path);
        this.fileName = fileName;
    }
    
    public String metadata(){
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM 'del' YYYY hh:mm:ss aa", new Locale("es"));
        
        String acum = "";
        acum += "Modificado: " + dateFormat.format(new Date()) + "\n";
        acum += "Archivo: " + this.file.getAbsolutePath() + "\n";
        acum += "Nº de Campos:\n";
        acum += data.getFields().size() + "\n";
         
        for (Campo field : data.getFields()) {
            acum += field + "\n";
        }
        
        acum += "===========================================================\n";
        
        return acum;
    }
    
    public void createFile(String filePath, String fileName){
        File new_file = new File(filePath);
        this.setFile(new_file);
        System.out.println("Archivo: " + file.getAbsolutePath());
    }

    public void writeToFile(String content){
        System.out.println("\n" + content);
        try {
            FileWriter writer = new FileWriter(file.getAbsolutePath());
            writer.write(content);
            writer.close();
        } catch (IOException e) {}
    }
    
    public void readMetadata(){
        try {
            Scanner reader = null;
            reader = new Scanner(file);
            System.out.println(file.exists());
            if (file.exists()) {
                reader.useDelimiter("\n");
                System.out.println(reader.nextLine());
                System.out.println(reader.nextLine());
                System.out.println(reader.nextLine());
                int numFields = reader.nextInt();
                System.out.println(numFields);
                reader.useDelimiter(";");
                reader.skip("\n");
                for (int i = 0; i < numFields; i++) {
                    String fieldName = reader.next();
                    String dataType = reader.next();
                    boolean isKey = reader.nextBoolean();
                    int fieldSize = reader.nextInt();
                    reader.nextLine();
                    data.addCampo(new Campo(fieldName, dataType, isKey, fieldSize));
                }
                reader.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }
    public ArrayList<Integer> getAuxiliaryList() {
        return auxiliaryList;
    }

    public void setAuxiliaryList(ArrayList<Integer> auxiliaryList) {
        this.auxiliaryList = auxiliaryList;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public LinkedList getAvaiList() {
        return avaiList;
    }

    public void setAvaiList(LinkedList avaiList) {
        this.avaiList = avaiList;
    }
    
    public DatosRegistros getData() {
        return data;
    }

    public void setData(DatosRegistros data) {
        this.data = data;
    }
    
    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }
}