
package Read;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class docghi {
    public void ghi(List list,String fileName){
        try
                (FileOutputStream fos=new FileOutputStream(new File(fileName))){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        }
        catch (Exception e){
            System.out.println("Got an exception");
        }

    }
    public ArrayList doc(String fileName){
        ArrayList<Main> list;
        list = new ArrayList();
        try(FileInputStream fos=new FileInputStream(new File(fileName))){
            ObjectInputStream oos = new ObjectInputStream(fos);
            list = (ArrayList<Main>) oos.readObject();
        }catch (Exception e){
            System.out.println("Got an exception");
        }

        return list;
    }

}

