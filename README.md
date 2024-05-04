# Problem Solid Principle Dependency Inversion Principle (DIP)

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the __Student__ object has methods like __borrowBook()__, __borrowJournal()__ with a parameter of title, which directly depend on specific resource types.

To adhere to the __Dependency Inversion Principle (DIP)__ and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining __SOLID principles.__ The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

# UML Class Diagram
![Blank diagram (1)](https://github.com/Route0702/SolidPrinciple_DIP/assets/103111416/d90b2d2f-5bae-4da2-b71c-69f222bcd88a)

# Output
![image](https://github.com/Route0702/SolidPrinciple_DIP/assets/103111416/ab3563cb-22d1-42ee-9cce-51de28415107)

