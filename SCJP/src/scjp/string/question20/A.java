package scjp.string.question20;

import java.io.IOException;

/**
 *Question 20. Choose the correct(s):
 */
public class A {
    private abstract interface Veloz{ Number metodo(int x);} //0
    
    abstract static class B { //1
        private abstract static interface Veloz {
            void metodo(long x) throws Exception;
        }
        
        public void metodo() {
            class Opa implements Veloz{
                public void metodo(long x) throws IOException{} //2
            }
        }
    }
    
    public void test() {
        class Opa2 implements Veloz {
            public Integer metodo(int x) throws RuntimeException { //3
                return (Integer) (int) .5f; //4
            }
        }
    }
}

abstract interface Veloz { void metodo(String x);}

/**
 * Please choose all the answers that apply:
 * 
 * a) Can not be used private abstract at // 0
 *    Can not be used abstract static at // 1
 * b) OK Compiles Fine !
 * c) The IOException can be changed to InterruptedException
 * d) Error at // 3
 * e) Error at // 4
 * 
 * R: b
 */