package org.test.coreJavaprogram.exception;
@FunctionalInterface
public interface CheckedExceptionHandlerConsumer <Target,ExObj extends Exception> {

    public void accept(Target target) throws ExObj;
}
