package jp.ac.uryukyu.ie.e165711;

/**
 * Created by e165711 on 2016/12/20.
 */
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/e165711/IdeaProjects/prg2_3/src/Main/map.txt");
            BufferedReader Map = new BufferedReader(new FileReader(file));
            String map;
            int i = 0;
            while((map = Map.readLine()) != null){
                if(i < 2) {
                    System.out.println("s = " + map);
                } else {
                    System.out.println(map);
                }
                i ++;
            }
            Map.close();

        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}

        /*    FileReader filereader = new FileReader(file);

            int ch;
            while ((ch = filereader.read()) != -1) {
                System.out.print((char) ch);
            }

            filereader.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
*/