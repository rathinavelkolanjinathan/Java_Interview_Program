package org.test.coreJavaprogram.JDK17.Sealedclass;

//Sealed classes and interfaces offer a restriction whether classes/interfaces
// can extend/implement other classes/interfaces or not.

//In short, sealed classes gives you the control of which models, classes etc.
// that can implement or extend that class/interface.

//example
//public sealed interface MotherInterface permits ImplementationClass1 {}

//Has to be declared either as final or as sealed or as non-sealed
//public final class ImplementationClass1 implements MotherInterface {}

//public class ImplementationClass2 implements MotherInterface {}
//compiler error! It is not included in the permits of mother inteface


public sealed interface Shape permits Circle,Rectangle {
}
