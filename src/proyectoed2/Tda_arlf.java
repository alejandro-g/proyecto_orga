package proyectoed2;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class Tda_arlf {

    Registro registro;
    private File file;
    private RandomAccessFile raf;
    private RandomAccessFile IndexFile;
    private RandomAccessFile AvailListFile;
    //private final int sizeOfRecord = Integer.BYTES + Character.BYTES + 40 + Character.BYTES + 10 + Double.BYTES;
    private final int sizeOfHeader = Integer.BYTES;
    private LinkedList availList = new LinkedList();
    ArrayList<Registro> Registros = new ArrayList();
    IndexList indexlist = new IndexList();
    private int header;

    public Tda_arlf(File file) throws FileNotFoundException, IOException {

        this.file = file;

        raf = new RandomAccessFile(file, "rw");//abierto para lectura y escritura
        IndexFile = new RandomAccessFile(new File("./IndexFile.in"), "rw");
        AvailListFile = new RandomAccessFile(new File(".Availist.al"), "rw");

        raf.seek(0);
        /*try{
           if(file.length() > 0){
               header = raf.readInt();
               if(header != -1){
                   availList.add(header);
                   registro = new Registro();
                   raf.seek(0 + sizeOfHeader);
                   while(true){
                       raf.seek((header-1) * registro.sizeOfRecord() + sizeOfHeader);
                       raf.readChar();
                       header = raf.readInt();
                       if(header != - 1){
                           availList.add(0, header);
                       }

                   }
               }else{
                   raf.writeInt(-1);
               }
           }
        
       }catch(Exception e){
           
       }
         */

    }

    public File getFile() {
        return file;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public ArrayList<Registro> getLista() {
        return Registros;
    }

    public void setLista(ArrayList<Registro> lista) {
        this.Registros = lista;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public RandomAccessFile getBuffer() {
        return raf;
    }

    public void setBuffer(RandomAccessFile raf) {
        this.raf = raf;
    }

    public LinkedList getAvailList() {
        return availList;
    }

    public void setAvailList(LinkedList availList) {
        this.availList = availList;
    }

    public void closeBuffer() {
        try {
            raf.close();
        } catch (Exception e) {

        }
    }

    public void ReadIndexFile() throws FileNotFoundException, IOException {
        indexlist.clearList();

        //todo arreglar lo de los indices que repiten
        IndexFile.seek(0);
        try {
            boolean terminar = true;
            while (terminar) {
                int rrn = IndexFile.readInt();
                int key = IndexFile.readInt();

                Indice index = new Indice(rrn, key);
                indexlist.AddIndex(index);

                if (IndexFile.getFilePointer() == IndexFile.length()) {
                    terminar = false;

                    System.out.println("Size: " + indexlist.GetSize());

                    for (int i = 0; i < indexlist.GetSize(); i++) {
                        System.out.println("Index: " + i + "\n" + "Key: " + indexlist.GetIndex(i).getKey() + "\n"
                                + "RRN: " + indexlist.GetIndex(i).getRRN() + "\n");
                    }

                }
            }
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WriteIndexFile() throws FileNotFoundException, IOException {

        int key;
        int rrn;

        IndexFile.seek(0);

        for (int i = 0; i < indexlist.GetSize(); i++) {
            rrn = indexlist.GetIndex(i).getRRN();

            key = indexlist.GetIndex(i).getKey();

            System.out.println("Index: " + i + "( " + rrn + ", " + key + " )");

            IndexFile.writeInt(rrn);
            IndexFile.writeInt(key);

        }

    }

    boolean insertRegistro(Registro registro) throws IOException {
        boolean bool = false;
        try {
            raf.seek(0);
            while (true) {
                if (availList.isEmpty()) {//revisa si el availList esta vacio 
                    bool = true;
                    raf.seek(file.length());
                    raf.writeChar(registro.getAsterisco());
                    raf.writeInt(0); //referencia
                    raf.writeInt(registro.getId());//escribe los 4 bytes en el file

                    raf.writeUTF(registro.getName());
                    raf.writeUTF(registro.getBirthdate());
                    raf.writeFloat(registro.getSalary());

                    Registros.add(registro); //agrega el registro nuevo al arraylist de registros
                    Indice index = new Indice(indexlist.GetSize(), registro.getId());
                    registro.setIndex(index); //index (rrn, key)
                    indexlist.AddIndex(index); //agregamos el indice nuevo al arraylist

                    indexlist.Sort(); //se ordena el indice

                    WriteIndexFile(); //se escribe en el archivo del indexfile con el current indexlist. 

                    break;
                } else {

                    raf.seek(0);
                    bool = true;
                    int posicion = (int) availList.remove(0); //inserta en la primera posicion
                    //int reference = 0;
                    raf.seek(registro.sizeOfRecord() * (posicion - 1) + sizeOfHeader);
                    /*raf.readChar();
                    reference = raf.readInt();
                    raf.seek(0);
                    raf.writeInt(reference);
                    raf.seek(registro.sizeOfRecord() * (posicion - 1) + sizeOfHeader);
                    raf.writeChar(registro.getAsterisco());
                    raf.writeInt(0);
                    raf.writeInt(registro.getId());
                    raf.writeUTF(registro.getName());
                    raf.writeUTF(registro.getBirthdate());
                    raf.writeDouble(registro.getSalary());
                     */
                    raf.writeChar(registro.getAsterisco());
                    raf.writeInt(0); //referencia
                    raf.writeInt(registro.getId());//escribe los 4 bytes en el file

                    raf.writeUTF(registro.getName());
                    raf.writeUTF(registro.getBirthdate());
                    raf.writeFloat(registro.getSalary());

                    Registros.add(registro); //agrega el registro nuevo al arraylist de registros
                    Indice index = new Indice(indexlist.GetSize(), registro.getId());
                    registro.setIndex(index); //index (rrn, key)
                    indexlist.AddIndex(index); //agregamos el indice nuevo al arraylist

                    indexlist.Sort(); //se ordena el indice

                    WriteIndexFile(); //se escribe en el archivo del indexfile con el current indexlist. 
                    break;
                }
            }
        } catch (EOFException e) {

        }
        return bool;
    }

    void listarRegistro() {
        openBuffer();
        Registros = new ArrayList();
        try {
            raf.seek(0);
            while (true) {
                if (raf.readChar() == '*') {

                }
                registro.setId(raf.readInt());
                registro.setName(raf.readUTF());
                registro.setBirthdate(raf.readUTF());
                registro.setSalary(raf.readFloat());
                Registros.add(registro);
                System.out.println(Registros.get(Registros.size() - 1).toString());
            }
        } catch (Exception e) {
        }
        closeBuffer();
    }

    public Registro Buscar(int key) throws IOException {

        raf.seek(indexlist.GetIndex(key).getRRN() * 68);

        char asterisco = raf.readChar();
        int ref = raf.readInt();
        int id = raf.readInt();
        String name = raf.readUTF();

        String bday = raf.readUTF();

        float sal = raf.readFloat();

        Registro reg = new Registro(name, bday, id, sal, asterisco, ref);
        
        return reg;

    }

    public void openBuffer() {
        try {
            raf = new RandomAccessFile(file, "rw");
        } catch (Exception e) {
            System.out.println("File not existant");
        }
    }

    public DefaultTableModel listarRegistros(DefaultTableModel model) {
        try {
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            raf.seek(0);

            boolean BoolSalvadorDeMundos = true;
            while (BoolSalvadorDeMundos) {

                char asterisco = raf.readChar();
                int ref = raf.readInt();
                int id = raf.readInt();
                String name = raf.readUTF();

                String bday = raf.readUTF();

                float sal = raf.readFloat();

                Registro reg = new Registro(name, bday, id, sal, asterisco, ref);

                System.out.println(name.length());

                if (reg.getAsterisco() != '*') {
                    Object[] row = {reg.getName(), reg.getBirthdate(), reg.getId(), reg.getSalary()};
                    model.addRow(row);
                }

                if (raf.getFilePointer() == raf.length()) {
                    BoolSalvadorDeMundos = false;

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
}
