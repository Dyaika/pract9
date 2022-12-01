package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void zd1() throws IncorrectINNException {
        HashMap<Long, String> client_base = new HashMap<>();
        client_base.put(1191000010L, "Shabalov");
        client_base.put(1191000028L, "Razshildyaev");
        client_base.put(1191000033L, "Rusakovsky");
        client_base.put(1191000043L, "Stepanov");
        client_base.put(1191000052L, "Shiroky");
        client_base.put(9909000011L, "Archipov");
        Scanner sc = new Scanner(System.in);
        String name;
        long inn;
        while (true){
            System.out.print("name=");
            name = sc.nextLine();
            System.out.print("inn=");
            inn = Long.parseLong(sc.nextLine());
            if (Objects.equals(client_base.get(inn), name)){
                System.out.println("Thanks for purchasing!");
            } else{
                throw new IncorrectINNException(
                        inn + " " + name + " is not in our database"
                );
            }
        }
    }

    public static void main(String[] args) throws IncorrectINNException, StudentNotFoundException {
        new App();
    }
}
