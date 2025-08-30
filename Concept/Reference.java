// class Demo{
//     String name = "Harshit"; // This is an instance variable

//     public static void main(String[] args) {
//         Demo d = new Demo();
//         System.out.println(d.name);
//     }
// }


class Person{
    String name;
}

class Real{
    static void modifyPrimitives(int a){
        a += 10;
    }

    static void modifyObject(Person p){
        p.name = "Harshit";
    }

   public static void main(String args[]){
      int a = 5;
      modifyPrimitives(a);
      System.out.println(a);

      Person p = new Person();
      p.name = "Abhishek";
      modifyObject(p);
      System.out.println("Java name: " + p.name); // Output: Updated
   }
}

// Feature	                C++	                              Java
// Primitive modification	int& x → modifies original	      int x → copy only (no change)

// Object modification	    Person& p → modifies object	      Person p → modifies object

// Reference syntax	        & operator needed	              No &, references handled by JVM

// Pointer control	        Yes (*, &)	                      No pointers exposed 