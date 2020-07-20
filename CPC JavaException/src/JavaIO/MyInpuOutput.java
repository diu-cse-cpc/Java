/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rktirtho
 */
public class MyInpuOutput {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Select file path
        File operation = new File("D:\\CPC\\RW\\operation.txt");

        try {
            operation.createNewFile(); // creating file

            //File Reader is ready to read file from given location.
            FileReader reader = new FileReader("D:\\CPC\\RW\\operation.txt");
            int c;

            //reading data from reader file until end of file.
            //(c=reader.read()) put a integer to c.
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException ex) {
            Logger.getLogger(MyInpuOutput.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
