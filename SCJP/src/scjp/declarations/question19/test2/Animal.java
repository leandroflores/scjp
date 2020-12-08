package scjp.declarations.question19.test2;
/*x3*/ import java.io.Serializable;

/*x1*/ abstract class /*x2*/ Animal implements Runnable {}



/*x4*/ abstract class Dog extends Animal implements /*x5*/ Serializable {
    void /*x6*/ doStuff(/*x7*/ int arg1, int /*x8*/ arg2) {} // wrong comments
}
class X{}
class Y{}