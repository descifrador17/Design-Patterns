# Design Patterns
![design patterns](https://user-images.githubusercontent.com/35165993/119651970-2f43f080-be43-11eb-8333-25cb566a3429.png)

A **design pattern** systematically names, motivates and explains a general design that addresses a recurring design problem in object-oriented systems. **Design patterns** are needed to represent some of the best practices followed and adopted in software development.

### Types of Design Patterns
- [**Creational Design Patterns**](#Creational-Design-Patterns) are concerned with the method of creating Objects.
- [**Structural Design Patterns**](#Structural-Design-Patterns) deal with the composition of classes and objects which form larger structures.
- [**Behavioral Design Patterns**](#Behavioral-Design-Patterns) are concerned with the responsibility and interaction between the objects.

## Creational Design Patterns

#### 1. Factory Method Pattern  
A Factory Pattern or Factory Method Pattern says that just  **define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.**  In other words, subclasses are responsible to create the instance of the class. The Factory Method Pattern is also known as  **Virtual Constructor.**  
Java -  
Kotlin -  
Notes -  
#### 2. Abstract Factory Pattern  
Abstract Factory Pattern says that just  **define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.** That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern. An Abstract Factory Pattern is also known as  **Kit.**  
Java -  
Kotlin -  
Notes -  
#### 3. Singleton Pattern  
Singleton Pattern says that just **"define a class that has only one instance and provides a global point of access to it".** In other words, a class must ensure that only single instance should be created and single object can be used by all other classes. There are two forms of singleton design pattern
1. **Early Instantiation:**  creation of instance at load time.
2. **Lazy Instantiation:**  creation of instance when required.  
  
Java - https://github.com/descifrador17/Design-Patterns/tree/master/Java/SingletonPattern  
Kotlin - https://github.com/descifrador17/Design-Patterns/tree/master/Kotlin/SingletonPattern  
Notes - https://github.com/descifrador17/Design-Patterns/tree/master/Notes/Singleton-Pattern  

## Structural Design Patterns

#### 1. Decorator Pattern  
A Decorator Pattern says that just  **"attach a flexible additional responsibilities to an object dynamically".** In other words, The Decorator Pattern uses composition instead of inheritance to extend the functionality of an object at runtime.  
Java -  https://github.com/descifrador17/Design-Patterns/tree/master/Java/DecoratorPattern  
Kotlin -  https://github.com/descifrador17/Design-Patterns/tree/master/Kotlin/DecoratorPattern  
Notes -  https://github.com/descifrador17/Design-Patterns/tree/master/Notes/Decorator-Pattern  
#### 2. Adapter Pattern  
An Adapter Pattern says that just  **"converts the interface of a class into another interface that a client wants".** In other words, to provide the interface according to client requirement while using the services of a class with a different interface.  
Java -  https://github.com/descifrador17/Design-Patterns/tree/master/Java/AdapterPattern  
Kotlin -  https://github.com/descifrador17/Design-Patterns/tree/master/Kotlin/AdapterPattern  
Notes -  https://github.com/descifrador17/Design-Patterns/tree/master/Notes/Adapter-Pattern  
#### 3. Façade Pattern  
A Facade Pattern says that just  **"just provide a unified and simplified interface to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client".** In other words, Facade Pattern describes a higher-level interface that makes the sub-system easier to use.  
Java -  
Kotlin -  
Notes -  
#### 4. Proxy Pattern  
Simply, proxy means an object representing another object. According to GoF, a Proxy Pattern  **"provides the control for accessing the original object".** So, we can perform many operations like hiding the information of original object, on demand loading etc.  
Java -  
Kotlin -  
Notes -  
#### 5. Bridge Pattern  
A Bridge Pattern says that just **"decouple the functional abstraction from the implementation so that the two can vary independently".**  
Java -  
Kotlin -  
Notes -  
#### 6. Composite Pattern  
A Composite Pattern says that just **"allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects".**  
Java -  
Kotlin -  
Notes -  
#### 7. Null Object Pattern  
The Null object pattern is a design pattern that **simplifies the use of dependencies that can be undefined**. This is achieved by using instances of a concrete class that implements a known interface, instead of null references.  
Java -  
Kotlin -  
Notes -  

## Behavioral Design Patterns

#### 1. Strategy Pattern
A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable". This pattern is also known as Policy.  
Java - https://github.com/descifrador17/Design-Patterns/tree/master/Java/StrategyPattern  
Kotlin - https://github.com/descifrador17/Design-Patterns/tree/master/Kotlin/StrategyPattern  
Notes - https://github.com/descifrador17/Design-Patterns/tree/master/Notes/Strategy-Pattern  
#### 2. Observer Pattern
An Observer Pattern says that "just define a one-to-one dependency so that when one object changes state, all its dependents are notified and updated automatically".  
Java - https://github.com/descifrador17/Design-Patterns/tree/master/Java/ObserverPattern  
Kotlin - https://github.com/descifrador17/Design-Patterns/tree/master/Kotlin/ObserverPattern     
Notes - https://github.com/descifrador17/Design-Patterns/tree/master/Notes/Observer-Pattern  

#### 3. Command Pattern  
A Command Pattern says that "_encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command_". It is also known as  **Action or Transaction.**  
Java -  https://github.com/descifrador17/Design-Patterns/tree/master/Java/CommandPattern  
Kotlin -  https://github.com/descifrador17/Design-Patterns/tree/master/Kotlin/CommandPattern  
Notes -  https://github.com/descifrador17/Design-Patterns/tree/master/Notes/Command-Pattern  
#### 4. Template Pattern  
A Template Pattern says that **"just define the skeleton of a function in an operation, deferring some steps to its subclasses".**  
Java -  
Kotlin -  
Notes -  
#### 5. Iterator Pattern  
According to GoF, Iterator Pattern is used **"to access the elements of an aggregate object sequentially without exposing its underlying implementation".**  
Java -  
Kotlin -  
Notes -  
#### 6. State Pattern  
A State Pattern says that **"the class behavior changes based on its state".** In State Pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.  
Java -  
Kotlin -  
Notes -  

>Note 1: This Repo contains all the Patterns discussed in [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)  
>Note 2: Repo will be updated with the codes and notes for all the mentioned Design Patterns


