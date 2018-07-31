package com.sqirt.na.lico;
import java.io.*;
import java.util.Scanner;

public class FileWork {

    String n,z1,z2;
    java.io.File file = new java.io.File("D:\\file.txt");
    public void fileCreate() throws Exception {

        if(!file.exists()) {
            file.createNewFile();
        }
    }

    public  void fileWriter() {

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the offer: ");
            n = scan.nextLine();
            bufferedWriter.write(n);
            bufferedWriter.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public void fileChange()  {

            Scanner scan = new Scanner(System.in);
            System.out.print("Which expression / word do you want to replace? : ");

        if(scan.hasNextLine()) {
            z1 = scan.nextLine();
        }
            System.out.print("And what do you want to replace? : ");

            if(scan.hasNextLine()){
                z2 = scan.nextLine();
            }

            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(n.replaceAll(z1, z2));
                bufferedWriter.close();
            }
        catch (IOException e){

            e.printStackTrace();
        }
        scan.close();
    }

    public void fileRead()  {
        try {

            System.out.println("Changed phrase:");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.ready()) {
                System.out.print(bufferedReader.readLine());
            }

            bufferedReader.close();

        }

        catch (IOException e){

            e.printStackTrace();
        }
    }
}