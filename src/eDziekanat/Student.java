package eDziekanat;


import java.util.Scanner;


public class Student {

    public String name;
    private String surname;
    private long pesel;
    private int nr_indeksu;
    private String status;

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Michał";
        student1.surname = "Nowak";
        student1.pesel = 90022012345L;
        student1.nr_indeksu = 13579;
        student1.status = "aktywny";

        Student student2 = new Student();

        student2.name = "Marek";
        student2.surname = "Nowicki";
        student2.pesel = 88032012345L;
        student2.nr_indeksu = 24680;
        student2.status = "aktywny";

        System.out.println("Lista studentów \n");
        System.out.println("Wpisz imię, lub imiona odzielone przecinkiem oraz spacją, aby wyświetlić dane studenta: \n");

        Scanner sc = new Scanner(System.in);

        String studName = sc.nextLine();

        if (studName.equals("Michał")) {

            System.out.println("\n" + student1.name + " " + student1.surname + '\n' + student1.pesel + '\n' + student1.nr_indeksu + '\n' + student1.status);

        }

        else if (studName.equals("Marek")) {

            System.out.println("\n" + student2.name + " " + student2.surname + '\n' + student2.pesel + '\n' + student2.nr_indeksu + '\n' + student2.status);

        }

        else if (studName.equals("Michał, Marek")) {

            System.out.println("\n" + student1.name + " " + student1.surname + '\n' + student1.pesel + '\n' + student1.nr_indeksu + '\n' + student1.status + "\n"
                    + '\n' + student2.name + " " + student2.surname + '\n' + student2.pesel + '\n' + student2.nr_indeksu + '\n' + student2.status);

        }

        else {

            System.out.println("\n" + "Can't find this student/s, try again");

            String studName2try = sc.nextLine();

            if (studName2try.equals("Michał")) {

                System.out.println("\n" + student1.name + " " + student1.surname + '\n' + student1.pesel + '\n' + student1.nr_indeksu + '\n' + student1.status);

            }

            else if (studName2try.equals("Marek")) {

                System.out.println("\n" + student2.name + " " + student2.surname + '\n' + student2.pesel + '\n' + student2.nr_indeksu + '\n' + student2.status);
            }

            else {

                System.out.println("Can't find this student in our data base, sorry");



            }

        }


    }

}


