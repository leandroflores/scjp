package scjp.inheritance.question07;

/**
 * Question 7. What is the output of compiling and running the following program?
 */
class Category {
    Category() {
        System.out.print("Category_");
    }
}

class SubCategory extends Category {
    SubCategory() {
        System.out.print("SubCategory_");
    }
}
 
class SubSubCategory extends SubCategory {
    SubSubCategory() {
        System.out.print("SubSubCategory_");
    }
}

public class Tester {
    public static void main(String[] args) {
        new SubSubCategory();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) SubSubCategory_SubCategory_Category_
 * b) SubSubCategory_
 * c) Category_SubCategory_SubSubCategory_
 * 
 * R: c
 */