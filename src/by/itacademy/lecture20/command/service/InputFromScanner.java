package by.itacademy.lecture20.command.service;

import java.util.Scanner;

public class InputFromScanner {

    public String enterLogin(){

        return enterFromScanner("Enter your login:");
    }

    public String enterPassword(){

         return enterFromScanner("Enter your password:");
    }

    public String enterFromScanner(String msg){

        Scanner scanner = new Scanner(System.in);

        System.out.println(msg);
        return scanner.next();

    }
}
