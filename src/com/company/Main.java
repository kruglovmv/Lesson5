package com.company;

public class Main {

    public static void main(String[] args) {
	employee [] сolleagues = new employee[5];
        for (int i = 0; i < 5; i++) {
            сolleagues[i] = new employee("Name " +i, "Surname " + i, "Директор"+i,i+"@mail.er", "+70000"+i, i*120, i*10+15);
        }
        for (employee element: сolleagues) {
            if(element.getAge()>40)element.printClass();
            System.out.println();

        }
    }
}
