package com.sqirt.na.lico;

import java.io.*;
import java.util.Scanner;

public class Togreatcoder {
    public static void main(String args[]) throws Exception {

//строго не судите,моя первая прога на Java =D
        // АААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА

String n,z1,z2;

File f = new File ("D:\\file.txt");

    if(!f.exists()) {
        f.createNewFile();
    }

    FileWriter fw = new FileWriter(f);
    BufferedWriter bw = new BufferedWriter(fw);

    Scanner scan = new Scanner(System.in);
    System.out.println("Ну чё, ёбана в рот, вводи чё хоч то: ");
    n = scan.nextLine();
    bw.write(n);
    bw.flush();


        System.out.print("Пошла ебатория, ёпта, чё заменить то хочешь, повелитель: ");
        z1 = scan.nextLine();
        System.out.print("И на что ты хочешь заменить то, а: ");
        z2 = scan.nextLine();

        bw = new BufferedWriter(new FileWriter(f));
        bw.write(n.replaceAll(z1,z2));
        bw.close();
        System.out.println("Изменённая фраза:");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

while(br.ready()){
    System.out.print(br.readLine());
}

        br.close();

    }
}
