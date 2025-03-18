package org.test.CoreJava.java8.lambdaexpression.exception;
@FunctionalInterface
public interface CheckedExceptionHandlerConsumer <Target,ExObj extends Exception> {

    public void accept(Target target) throws ExObj;
}
