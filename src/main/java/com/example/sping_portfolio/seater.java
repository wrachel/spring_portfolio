package com.example.sping_portfolio;

import java.util.ArrayList;
import java.util.Arrays;

/**
TO DO:
 figure out what to do if numTables/numStudents is not even
 */

public class seater {
    private ArrayList<String> names;
    private int numTables;
    private int numStudents;
    private int studentsPerTable;


//    public seater(int numTables, int numStudents, int studentsPerTable, String students) {
//        this.numTables = numTables;
//        this.numStudents = numStudents;
//        this.studentsPerTable = studentsPerTable;
//        //break string of students names
//        String[] split = students.split(",");
//        this.names = new ArrayList<String>(Arrays.asList(split));
//    }
//
//    public seater(String students, int numTables, int studentsPerTable){
//        String[] split = students.split(",");
//        this.names = new ArrayList<String>(Arrays.asList(split));
//        this.numStudents = names.size();
//        this.numTables=numTables;
//        this.studentsPerTable=studentsPerTable;
//    }
//
//    public seater(int numTables, int numStudents, String students) {
//        this.numTables = numTables;
//        this.numStudents = numStudents;
//
//        //break string of students names
//        String[] split = students.split(",");
//        this.names = new ArrayList<String>(Arrays.asList(split));
//    }

    public seater(int numTables, String students){
        this.numTables = numTables;
        String[] split = students.split(",");
        this.names = new ArrayList<String>(Arrays.asList(split));
        this.numStudents = names.size();
    }

    public ArrayList<String> getNames(){
        return names;
    }

    public ArrayList<Student> randomize() {
        ArrayList<Student> groups = new ArrayList<Student>();
        studentsPerTable = numStudents / numTables;

        for (int i = 0; i < numTables; i++) {
            for (int j = 0; j < studentsPerTable; j++) {
                int index = (int) (Math.random() * names.size());
                Student oneStudent = new Student(i, names.get(index));
                groups.add(oneStudent);
                names.remove(index);
            }
        }

        int i = 0;
            while(names.size() > 0 && i < numTables){
                int index = (int) (Math.random() * names.size());
                Student oneStudent = new Student(i, names.get(index));
                groups.add(oneStudent);
                names.remove(index);
                i++;
            }

        return groups;
    }

    public static void sort(ArrayList<Student> a){
        int n = a.size();

        for(int i =0;i < n-1; i++){
            int min_idx = i;
            for(int j = i+1; j < n; j++){
                if(a.get(j).getTableGroup() < a.get(min_idx).getTableGroup()){
                    min_idx = j;
                }
            }
            Student temp = a.get(min_idx);
            a.set(min_idx, a.get(i));
            a.set(i, temp);
        }
    }



    //tester method
    public static void main(String args[]){
        seater test = new seater(4, "Harry, Rachel, Calvin, Devam, Yajat, Harry2, Rachel2, Calvin2, Devam2, Yajat2, Harry3, Rachel3, Calvin3");

        System.out.print("All student names: ");
        for(String a : test.names){
            System.out.println(a + " ");
        }

        ArrayList<Student> newGroups = test.randomize();
        sort(newGroups);

        System.out.print("New groups: ");
        for(Student b : newGroups){
            System.out.println("Table: " + b.getTableGroup() + ", Name: " + b.getStudentName());
        }
    }
}



