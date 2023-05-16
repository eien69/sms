import java.util.*;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> prelim = new ArrayList<>();
        prelim.add(97);
        prelim.add(94);
        prelim.add(98);
        prelim.add(95);
        prelim.add(94);
        prelim.add(96);
        prelim.add(98);
        ArrayList<Integer> midterms = new ArrayList<>();
        midterms.add(95);
        midterms.add(94);
        midterms.add(94);
        midterms.add(90);
        midterms.add(92);
        midterms.add(97);
        midterms.add(96);
        ArrayList<Integer> finals = new ArrayList<>();
        finals.add(97);
        finals.add(99);
        finals.add(94);
        finals.add(95);
        finals.add(90);
        finals.add(97);
        finals.add(99);
        ArrayList<Integer> prelim2 = new ArrayList<>();
        prelim2.add(93);
        prelim2.add(96);
        prelim2.add(98);
        prelim2.add(95);
        prelim2.add(95);
        prelim2.add(99);
        prelim2.add(94);
        prelim2.add(95);
        ArrayList<Integer> midterms2 = new ArrayList<>();
        midterms2.add(93);
        midterms2.add(96);
        midterms2.add(97);
        midterms2.add(98);
        midterms2.add(99);
        midterms2.add(93);
        midterms2.add(96);
        midterms2.add(94);
        ArrayList<Integer> finals2 = new ArrayList<>();
        finals2.add(96);
        finals2.add(96);
        finals2.add(95);
        finals2.add(99);
        finals2.add(95);
        finals2.add(96);
        finals2.add(93);
        finals2.add(95);

        while (true) {
            System.out.print("Enter school ID: ");
            int id = sc.nextInt();
            System.out.println();

            switch (id) {
                case 20221011:
                    while (true){
                        System.out.println("Ian Paulo Melu");
                        System.out.println("BSCS - 1A");
                        System.out.println();
                        System.out.println("Please enter specific operation.");
                        System.out.println("R to access report card.");
                        System.out.println("S to access subject offerings.");
                        System.out.println("I to access ID card info.");
                        System.out.println("X to log out.");
                        System.out.print("Enter operation: ");
                        String op = sc.next().toUpperCase();
                        System.out.println();

                        switch (op) {
                            case "R":
                                System.out.println("Report Card.");
                                System.out.println();
                                System.out.print("Enter semester: ");
                                int sem = sc.nextInt();
                                System.out.print("Enter grading period: ");
                                String grade = sc.next();
                                if (sem == 1 && grade.equals("Prelim")) {
                                    System.out.println("GEMATH+ - Mathematics in the Modern World: " + prelim.get(0));
                                    System.out.println("ITECC02 - Computer Programming 1: " + prelim.get(1));
                                    System.out.println("NSTP100 - National Service Training Program: " + prelim.get(2));
                                    System.out.println("GECOMM+ - Purposive Communication: " + prelim.get(3));
                                    System.out.println("FAITH01 - Introduction to First Asia Culture and Tradition: " + prelim.get(4));
                                    System.out.println("PATH-F1 - Physical Education: " + prelim.get(5));
                                    System.out.println("ITECC03 - Introduction to Computing: " + prelim.get(6));
                                    System.out.println();
                                } else if (sem == 1 && grade.equals("Midterms")) {
                                    System.out.println("GEMATH+ - Mathematics in the Modern World: " + midterms.get(0));
                                    System.out.println("ITECC02 - Computer Programming 1: " + midterms.get(1));
                                    System.out.println("NSTP100 - National Service Training Program: " + midterms.get(2));
                                    System.out.println("GECOMM+ - Purposive Communication: " + midterms.get(3));
                                    System.out.println("FAITH01 - Introduction to First Asia Culture and Tradition: " + midterms.get(4));
                                    System.out.println("PATH-F1 - Physical Education: " + midterms.get(5));
                                    System.out.println("ITECC03 - Introduction to Computing: " + midterms.get(6));
                                    System.out.println();
                                } else if (sem == 1 && grade.equals("Finals")) {
                                    System.out.println("GEMATH+ - Mathematics in the Modern World: " + finals.get(0));
                                    System.out.println("ITECC02 - Computer Programming 1: " + finals.get(1));
                                    System.out.println("NSTP100 - National Service Training Program: " + finals.get(2));
                                    System.out.println("GECOMM+ - Purposive Communication: " + finals.get(3));
                                    System.out.println("FAITH01 - Introduction to First Asia Culture and Tradition: " + finals.get(4));
                                    System.out.println("PATH-F1 - Physical Education: " + finals.get(5));
                                    System.out.println("ITECC03 - Introduction to Computing: " + finals.get(6));
                                    System.out.println();
                                }else if (sem == 2 && grade.equals("Prelim")) {
                                    System.out.println("NSTP200 - National Service Training Program 2: " + prelim2.get(0));
                                    System.out.println("PATH-F2 - Physical Education 2: " + prelim2.get(1));
                                    System.out.println("GEEMIND - The Entrepreneurial Mind: " + prelim2.get(2));
                                    System.out.println("ITECC03 - Computer Programming 2: " + prelim2.get(3));
                                    System.out.println("CSSP101 - Social Issues and Professional Practice: " + prelim2.get(4));
                                    System.out.println("DIFCAL+ - Differential Calculus: " + prelim2.get(5));
                                    System.out.println("ITECC04 - Data Structures and Algorithms: " + prelim2.get(6));
                                    System.out.println("GEWORLD - The Contemporary World: " + prelim2.get(7));
                                    System.out.println();
                                } else if (sem == 2 && grade.equals("Midterms")) {
                                    System.out.println("NSTP200 - National Service Training Program 2: " + midterms2.get(0));
                                    System.out.println("PATH-F2 - Physical Education 2: " + midterms2.get(1));
                                    System.out.println("GEEMIND - The Entrepreneurial Mind: " + midterms2.get(2));
                                    System.out.println("ITECC03 - Computer Programming 2: " + midterms2.get(3));
                                    System.out.println("CSSP101 - Social Issues and Professional Practice: " + midterms2.get(4));
                                    System.out.println("DIFCAL+ - Differential Calculus: " + midterms2.get(5));
                                    System.out.println("ITECC04 - Data Structures and Algorithms: " + midterms2.get(6));
                                    System.out.println("GEWORLD - The Contemporary World: " + midterms2.get(7));
                                    System.out.println();
                                } else if (sem == 2 && grade.equals("Finals")) {
                                    System.out.println("NSTP200 - National Service Training Program 2: " + finals2.get(0));
                                    System.out.println("PATH-F2 - Physical Education 2: " + finals2.get(1));
                                    System.out.println("GEEMIND - The Entrepreneurial Mind: " + finals2.get(2));
                                    System.out.println("ITECC03 - Computer Programming 2: " + finals2.get(3));
                                    System.out.println("CSSP101 - Social Issues and Professional Practice: " + finals2.get(4));
                                    System.out.println("DIFCAL+ - Differential Calculus: " + finals2.get(5));
                                    System.out.println("ITECC04 - Data Structures and Algorithms: " + finals2.get(6));
                                    System.out.println("GEWORLD - The Contemporary World: " + finals2.get(7));
                                    System.out.println();
                                }else {
                                    System.out.println("Invalid output!");
                                }
                                break;
                            case "S":
                                System.out.println("Subject offerings.");
                                System.out.println();
                                System.out.print("Enter Course: ");
                                String subj = sc.next();
                                System.out.print("Enter year: ");
                                int yr = sc.nextInt();
                                if(yr == 1 && subj.equals("BSCS")){
                                    System.out.println("GEMATH+ - Mathematics in the Modern World");
                                    System.out.println("ITECC02 - Computer Programming 1");
                                    System.out.println("NSTP100 - National Service Training Program");
                                    System.out.println("GECOMM+ - Purposive Communication");
                                    System.out.println("FAITH01 - Introduction to First Asia Culture and Tradition");
                                    System.out.println("PATH-F1 - Physical Education");
                                    System.out.println("ITECC03 - Introduction to Computing");
                                    System.out.println();
                                }else if(yr == 2 && subj.equals("BSCS")){
                                    System.out.println("ANALGEO - Analytic Geometry");
                                    System.out.println("SPORTS+ - P.E. 3 - Individual/Dual Sports");
                                    System.out.println("GELIT02 - SineSosyedad/Pelikulang Panlipunan");
                                    System.out.println("GEFIL01 - Kontekstwalisadong Komunikasyon sa Filipino");
                                    System.out.println("ITECC05 - Information Management");
                                    System.out.println("JOSERIZ - The Life and Works of Rizal");
                                    System.out.println("DIFCAL+ - Differential Calculus");
                                    System.out.println();
                                }else if(yr == 3 && subj.equals("BSCS")){
                                    System.out.println("LINALGE - Linear Algebra");
                                    System.out.println("GEARTS+ - Art Appreciation");
                                    System.out.println("GEEMIND - The Entrepreneurial Mind");
                                    System.out.println("CSPL101 - Programming Languages");
                                    System.out.println("CALPH++ - Calculus-based Physics 2");
                                    System.out.println("ADVSTA+ - Advanced Probability and Statistics");
                                    System.out.println("CSHCI01 - Human Computer Interaction");
                                    System.out.println("CSOS101 - Operating Systems");
                                    System.out.println("CSDS102 - Discrete Structure 2");
                                    System.out.println();
                                }else if(yr == 4 && subj.equals("BSCS")){
                                    System.out.println("CS-THE1 - Computer Science Thesis Writing 1");
                                    System.out.println("CSELEC4 - Data Mining and Data Warehousing");
                                    System.out.println("CSSE102 - Software Engineering 2");
                                    System.out.println("CSELEC5 - Applied Deep Learning");
                                    System.out.println("CSPRAC1 - Computer Science Practicum 1");
                                    System.out.println();
                                }
                                break;
                            case "I":
                                System.out.println("Update ID card info.");
                                System.out.println();
                                System.out.print("Press X to upload new photo: ");
                                String  up = sc.next().toUpperCase();
                                System.out.println("Updating....");
                                System.out.println("ID successfully updated!");
                                System.out.println();
                                break;
                            case "B":
                                //back to menu
                                break;
                            case "X":
                                //logout
                                System.out.println("Logging out...");
                                return;
                        }
                    }
                case 20221012:
                    while (true){
                        System.out.println("Iynne Franzll Prenda");
                        System.out.println("BSCS - 1A");
                        System.out.println();
                        System.out.println("Please enter specific operation.");
                        System.out.println("R to access report card.");
                        System.out.println("S to access subject offerings.");
                        System.out.println("I to access ID card info.");
                        System.out.println("X to log out.");
                        System.out.print("Enter operation: ");
                        String op2 = sc.next().toUpperCase();
                        System.out.println();

                        switch (op2){
                            case "R":
                                System.out.println("Report Card.");
                                System.out.println();
                                System.out.print("Enter semester: ");
                                int sem = sc.nextInt();
                                System.out.print("Enter grading period: ");
                                String grade = sc.next();
                                if (sem == 1 && grade.equals("Prelim")) {
                                    System.out.println("GEMATH+ - Mathematics in the Modern World: " + prelim.get(0));
                                    System.out.println("ITECC02 - Computer Programming 1: " + prelim.get(1));
                                    System.out.println("NSTP100 - National Service Training Program: " + prelim.get(2));
                                    System.out.println("GECOMM+ - Purposive Communication: " + prelim.get(3));
                                    System.out.println("FAITH01 - Introduction to First Asia Culture and Tradition: " + prelim.get(4));
                                    System.out.println("PATH-F1 - Physical Education: " + prelim.get(5));
                                    System.out.println("ITECC03 - Introduction to Computing: " + prelim.get(6));
                                    System.out.println();
                                } else if (sem == 1 && grade.equals("Midterms")) {
                                    System.out.println("GEMATH+ - Mathematics in the Modern World: " + midterms.get(0));
                                    System.out.println("ITECC02 - Computer Programming 1: " + midterms.get(1));
                                    System.out.println("NSTP100 - National Service Training Program: " + midterms.get(2));
                                    System.out.println("GECOMM+ - Purposive Communication: " + midterms.get(3));
                                    System.out.println("FAITH01 - Introduction to First Asia Culture and Tradition: " + midterms.get(4));
                                    System.out.println("PATH-F1 - Physical Education: " + midterms.get(5));
                                    System.out.println("ITECC03 - Introduction to Computing: " + midterms.get(6));
                                    System.out.println();
                                } else if (sem == 1 && grade.equals("Finals")) {
                                    System.out.println("GEMATH+ - Mathematics in the Modern World: " + finals.get(0));
                                    System.out.println("ITECC02 - Computer Programming 1: " + finals.get(1));
                                    System.out.println("NSTP100 - National Service Training Program: " + finals.get(2));
                                    System.out.println("GECOMM+ - Purposive Communication: " + finals.get(3));
                                    System.out.println("FAITH01 - Introduction to First Asia Culture and Tradition: " + finals.get(4));
                                    System.out.println("PATH-F1 - Physical Education: " + finals.get(5));
                                    System.out.println("ITECC03 - Introduction to Computing: " + finals.get(6));
                                    System.out.println();
                                }else if (sem == 2 && grade.equals("Prelim")) {
                                    System.out.println("NSTP200 - National Service Training Program 2: " + prelim2.get(0));
                                    System.out.println("PATH-F2 - Physical Education 2: " + prelim2.get(1));
                                    System.out.println("GEEMIND - The Entrepreneurial Mind: " + prelim2.get(2));
                                    System.out.println("ITECC03 - Computer Programming 2: " + prelim2.get(3));
                                    System.out.println("CSSP101 - Social Issues and Professional Practice: " + prelim2.get(4));
                                    System.out.println("DIFCAL+ - Differential Calculus: " + prelim2.get(5));
                                    System.out.println("ITECC04 - Data Structures and Algorithms: " + prelim2.get(6));
                                    System.out.println("GEWORLD - The Contemporary World: " + prelim2.get(7));
                                    System.out.println();
                                } else if (sem == 2 && grade.equals("Midterms")) {
                                    System.out.println("NSTP200 - National Service Training Program 2: " + midterms2.get(0));
                                    System.out.println("PATH-F2 - Physical Education 2: " + midterms2.get(1));
                                    System.out.println("GEEMIND - The Entrepreneurial Mind: " + midterms2.get(2));
                                    System.out.println("ITECC03 - Computer Programming 2: " + midterms2.get(3));
                                    System.out.println("CSSP101 - Social Issues and Professional Practice: " + midterms2.get(4));
                                    System.out.println("DIFCAL+ - Differential Calculus: " + midterms2.get(5));
                                    System.out.println("ITECC04 - Data Structures and Algorithms: " + midterms2.get(6));
                                    System.out.println("GEWORLD - The Contemporary World: " + midterms2.get(7));
                                    System.out.println();
                                } else if (sem == 2 && grade.equals("Finals")) {
                                    System.out.println("NSTP200 - National Service Training Program 2: " + finals2.get(0));
                                    System.out.println("PATH-F2 - Physical Education 2: " + finals2.get(1));
                                    System.out.println("GEEMIND - The Entrepreneurial Mind: " + finals2.get(2));
                                    System.out.println("ITECC03 - Computer Programming 2: " + finals2.get(3));
                                    System.out.println("CSSP101 - Social Issues and Professional Practice: " + finals2.get(4));
                                    System.out.println("DIFCAL+ - Differential Calculus: " + finals2.get(5));
                                    System.out.println("ITECC04 - Data Structures and Algorithms: " + finals2.get(6));
                                    System.out.println("GEWORLD - The Contemporary World: " + finals2.get(7));
                                    System.out.println();
                                }else {
                                    System.out.println("Invalid output!");
                                }
                                break;
                            case "S":
                                System.out.println("Subject Offerings.");
                                System.out.println();
                                System.out.print("Enter Course: ");
                                String subj = sc.next();
                                System.out.print("Enter year: ");
                                int yr = sc.nextInt();
                                if(yr == 1 && subj.equals("BSCS")){
                                    System.out.println("GEMATH+ - Mathematics in the Modern World");
                                    System.out.println("ITECC02 - Computer Programming 1");
                                    System.out.println("NSTP100 - National Service Training Program");
                                    System.out.println("GECOMM+ - Purposive Communication");
                                    System.out.println("FAITH01 - Introduction to First Asia Culture and Tradition");
                                    System.out.println("PATH-F1 - Physical Education");
                                    System.out.println("ITECC03 - Introduction to Computing");
                                    System.out.println();
                                }else if(yr == 2 && subj.equals("BSCS")){
                                    System.out.println("ANALGEO - Analytic Geometry");
                                    System.out.println("SPORTS+ - P.E. 3 - Individual/Dual Sports");
                                    System.out.println("GELIT02 - SineSosyedad/Pelikulang Panlipunan");
                                    System.out.println("GEFIL01 - Kontekstwalisadong Komunikasyon sa Filipino");
                                    System.out.println("ITECC05 - Information Management");
                                    System.out.println("JOSERIZ - The Life and Works of Rizal");
                                    System.out.println("DIFCAL+ - Differential Calculus");
                                    System.out.println();
                                }else if(yr == 3 && subj.equals("BSCS")){
                                    System.out.println("LINALGE - Linear Algebra");
                                    System.out.println("GEARTS+ - Art Appreciation");
                                    System.out.println("GEEMIND - The Entrepreneurial Mind");
                                    System.out.println("CSPL101 - Programming Languages");
                                    System.out.println("CALPH++ - Calculus-based Physics 2");
                                    System.out.println("ADVSTA+ - Advanced Probability and Statistics");
                                    System.out.println("CSHCI01 - Human Computer Interaction");
                                    System.out.println("CSOS101 - Operating Systems");
                                    System.out.println("CSDS102 - Discrete Structure 2");
                                    System.out.println();
                                }else if(yr == 4 && subj.equals("BSCS")){
                                    System.out.println("CS-THE1 - Computer Science Thesis Writing 1");
                                    System.out.println("CSELEC4 - Data Mining and Data Warehousing");
                                    System.out.println("CSSE102 - Software Engineering 2");
                                    System.out.println("CSELEC5 - Applied Deep Learning");
                                    System.out.println("CSPRAC1 - Computer Science Practicum 1");
                                    System.out.println();
                                }
                                break;
                            case "I":
                                System.out.println("Update ID card info.");
                                System.out.println();
                                System.out.print("Press X to upload new photo: ");
                                String  up = sc.next().toUpperCase();
                                System.out.println("Updating....");
                                System.out.println("ID successfully updated!");
                                System.out.println();
                                break;
                            case "X":
                                //logout
                                System.out.println("Logging out...");
                                return;
                        }
                    }
                default:
                    System.out.println("Student not found :/");
                    break;
            }
        }
    }
}