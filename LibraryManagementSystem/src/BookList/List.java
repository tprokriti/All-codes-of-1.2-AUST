package BookList;

public class List extends Department {

    @Override
    public void CSE(String a) {
        String cse[] = {"1. Teach yourself C", "2. The ANSI C", "3. Let us C", "4. Head First:Java", "5. Java:The complete Reference"};
        System.out.println("The books available in CSE (Computer Science Engineering) department are as follow: ");

        for (int i = 0; i < cse.length; i++) {
            System.out.println(cse[i]);
        }
    }

    @Override
    public void EEE(String b) {
        String eee[] = {"1. Introductory Circuit Analysis", "2. Basic Engineering Circuit Analysis", "3. Fundamentals of Electric Circuits", "4. Electrical Power system", "5. Electronics"};
        System.out.println("The books available in EEE (Electrical and Electronics Engineering) department are as follow: ");

        for (int j = 0; j < eee.length; j++) {
            System.out.println(eee[j]);
        }
    }

    @Override
    public void ME(String c) {
        String me[] = {"1. Basic Mechanics", "2. Fundamental Mechanics", "3. Thermodynamics", "4. Basic Mechanical Drawing", "5. Kinetics"};
        System.out.println("The books available in ME (Mechanical Engineering) department are as follow: ");

        for (int k = 0; k < me.length; k++) {
            System.out.println(me[k]);
        }
    }

    @Override
    public void TEXTILE(String d) {
        String textile[] = {"1. Fundamental Textile", "2. Textile Raw Material", "3. General textile Process", "4. Fabric Manufacturing", "5. Wet Processing"};
        System.out.println("The books available in Textile department are as follow: ");

        for (int m = 0; m < textile.length; m++) {
            System.out.println(textile[m]);
        }
    }

    @Override
    public void ARCHITECTURE(String e) {
        String architecture[] = {"1. Calculus (Late Transcendentals)", "2. Compilers Principles Techniques and Tools", "3. Architectural Graphics", "4. Architectural Graphic Standards", "5. Architectural Drafting"};
        System.out.println("The books available in Architecture department are as follow: ");

        for (int n = 0; n < architecture.length; n++) {
            System.out.println(architecture[n]);
        }
    }

    @Override
    public void CIVIL(String f) {
        String civil[] = {"1. Civil Engineerind Drawing", "2. Civil Workshop Practice", "3. Construction Process", "4. Fundamental Civil Engineering", "5. Basic Civil Engineering"};
        System.out.println("The books available in Civil department are as follow: ");

        for (int o = 0; o < civil.length; o++) {
            System.out.println(civil[o]);
        }

    }

}
