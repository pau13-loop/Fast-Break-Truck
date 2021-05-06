# Fast Break Truck

> In this repository you'll find **Fast Break Truck Kata**. This kata is the perfect introduction to make your first pattern design to develop your application. The best goal of this kata is that you will have a wide range of knowledge of the creational design patterns. Is not really difficult to complete but you'll have to spend some time doing research about the creational design patterns and ask yourself for the kind of application that you want to make and the expected behaviour of this one wich of the popular creational patterns will fit better with the logic of your app.

> https://en.wikipedia.org/wiki/Prototype_pattern#:~:text=The%20prototype%20pattern%20is%20a,cloned%20to%20produce%20new%20objects.

## Table of Contents

1. [Motivation](#motivation)
1. [Used Technologies](#used-technologies)
1. [Why choose this pattern ?](#why-choose-this-pattern-?)
1. [Pros and Cons](#pros-and-cons)
1. [Reflections](#reflections)
1. [UML Diagram](#uml-diagram)
1. [License](#license)

---

## Motivation

The biggest motivation for this project has been actually having the chance to choose a design pattern by your criteria. I think this fact is really interesting, and you should keep it on mind for whenever you have to develop an application. Don't be afraid if you never have created anyone before. You'll find lots of examples on internet and material that will make you path so much easier. In my case I started creating the UML diagram from the description of the application I had to code, and I should say that first make a UML diagram of the application I supposed I had to develop has made my work so much easier and so much pleasant. Get into the architecture of the application it's something always I've found really interesting and now I've founded really useful too. 

---

**[⬆ back to top](#table-of-contents)**

## Used Technologies

- Java
- Junit
- Maven
- Jacoco
- MarkDown
- Github

---

**[⬆ back to top](#table-of-contents)**

## Why choose this pattern ?

In this section I'll enumerate the main reasons that made me choose this design pattern for a fast-food-truck chain and hopefully you'll understand what it makes this pattern really cool:

1. The Prototype pattern is a creational design pattern that allows you to copy existent objects without make the code dependent of their classes

2. The implementation of the clone() method is really similar between the different classes and make his application easier. The clone() method creates an object from the actual class and bring all the values from the old fields to the new ones. This method even allows you to copy private fields, because most of the programming languages allow the objects access to the private fields of other objects belonging to the same class

3. An object that support the cloning is called a **prototype**. When your objects have dozens of fields and thousand of possible configurations, the cloning gives you an alternative to create more subclasses

4. This is how it works, let's you create a group of objects configured by different ways. When you'll need an object like the one you just have configured, let's you clone a prototype instead to have to build a new object from nothing

5. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, return its clone on next request and update the database as and when needed this reducing database calls

6. **Prototype pattern refers to creating duplicate object while keeping performance in mind.**

---

**[⬆ back to top](#table-of-contents)**

## Pros and Cons

### Advantages

- You can clone objects without coupling it to its concrete class.
- Possibility to avoid initialization repeated code cloning created prototypes
- Allow you to create a complex object with more facility
- Alternative to the hierarchy because you can pre-config the object to obtain complex objects.


### Disadvantatges

- Clone complex objects with circular references can be a bit difficult
- How you must know the object class to make a duplicate from it, the code becomes dependent from this class

---

**[⬆ back to top](#table-of-contents)**

## Reflections

My opinion about this kata, I've founded so interesting the personal chance to create a UML Diagram by ourselves just by checking all the possible design patterns and choose one based in our criteria and our goals. I always like the freedom to try new things and how cool is when you discover something that you really like. In my case I've found so interesting the research that we had to do about the design patterns and about how they can influence on your app and the expected behaviour. Now I feel so much more confident of myself to build my own apps based on the architecture I thought could be the best one to the expected results. I think that even knowing that this kata is quite simple and advisable to everyone interested in code architecture, in my case I've found it really useful and so much profitable, for now and to my personal developer future. I really like thinking about the best possible architectures and how to build them from the design patterns of GoF.

---

**[⬆ back to top](#table-of-contents)**

## UML Diagram

![UML Diagram](./fastbreaktruck/doc/UMLDiagram.jpg "UML")

---

**[⬆ back to top](#table-of-contents)**

## License

MIT License

Copyright (c) 2020 AntoniPizarro and Pau Llinàs

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

---

**[⬆ back to top](#table-of-contents)**
